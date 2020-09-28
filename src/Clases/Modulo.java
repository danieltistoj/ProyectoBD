/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.ConexionMySQL;
import Clases.Bitacoratxt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Modulo {

    private JTable tabla;
    private Bitacoratxt escribir;
    private DefaultTableModel modelo;
    private JLabel labelNum, labelFecha;
    // private ConexionMySQL conexion;
    public VariableGlobal conexion;
    /*
    private String localhost,puerto,baseDeDatos,
             usuario,contra, codigo;
     */
    private String[] datosInsertar;

    public Modulo() {
        conexion = new VariableGlobal();
        escribir = new Bitacoratxt();
    }
    public Modulo(boolean sinBase) {
        conexion = new VariableGlobal("");
        escribir = new Bitacoratxt();
    }

    public String generarCodigo(String formaParametro, String tabla, String letra) {
        int entero;
        String numero = "";
        String ultimoNum = "";
        String nuevoCodigo = "";
        try {
            conexion.conexionMySQL.EjecutarConsulta("SELECT MAX(" + formaParametro + ") FROM " + tabla);
            ResultSet rs = conexion.conexionMySQL.getResulSet();

            if (rs.next()) {
                ultimoNum = rs.getString(1);
            }
            if (ultimoNum == null) {
                nuevoCodigo = letra + "0001";
            } else {
                char r1 = ultimoNum.charAt(2);
                char r2 = ultimoNum.charAt(3);
                char r3 = ultimoNum.charAt(4);
                char r4 = ultimoNum.charAt(5);
                String cadena = "";
                cadena = "" + r1 + r2 + r3 + r4;

                entero = Integer.parseInt(cadena);
                Codigo codigo = new Codigo();
                codigo.generarCodigo(entero);
                nuevoCodigo = letra + codigo.getCodigo();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return nuevoCodigo;
    }

    public String fecha() {
        LocalDate fecha1 = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return fecha1.format(dtf);
    }

    public boolean esEntero(String id) {
        boolean entero = false;
        try {
            Integer.parseInt(id);
            entero = true;
        } catch (Exception e) {
        }
        return entero;
    }

    public boolean esFlotante(String abono) {
        boolean entero = false;
        try {
            Float.parseFloat(abono);
            entero = true;
        } catch (Exception e) {
        }
        return entero;
    }

    public boolean existeRegistro(String parametro, String tabla, String formaParametro) {
        boolean existe = false;

        try {
            conexion.conexionMySQL.EjecutarConsulta("SELECT COUNT(*) FROM " + tabla + " WHERE " + formaParametro + " = " + parametro + "");
            ResultSet rs = conexion.conexionMySQL.getResulSet();
            rs.next();
            if (rs.getInt(1) > 0) {
                existe = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return existe;
    }

    public int cantidadDeRegistros(String formaId, String tabla) {
        int numid = 0;
        try {
            conexion.conexionMySQL.EjecutarConsulta("select count(" + formaId + ")num from " + tabla);
            ResultSet rs = conexion.conexionMySQL.getResulSet();
            while (rs.next()) {
                numid = Integer.parseInt(rs.getString("num"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modulo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return numid;
    }

    public void nuevoRegistro(String colummnas, String parametro, String tabla) {//insertar un registro en cualquier tabla 
        conexion.conexionMySQL.EjecutarInstruccion("insert into " + tabla + " (" + colummnas + ")\n"
                + "values(" + parametro + ")");

    }

    public void modificarRegistro(String tabla, String datosModificar, String formaId, String id) {
        conexion.conexionMySQL.EjecutarInstruccion("UPDATE " + tabla + " SET " + datosModificar + " WHERE " + formaId + " = " + id);
    }

    public String getDato(String formaId, String id, String tabla, String parametro) {
        String dato = "";
        conexion.conexionMySQL.EjecutarConsulta("SELECT * FROM " + tabla + " WHERE " + formaId + " = " + id);
        ResultSet rs = conexion.conexionMySQL.getResulSet();
        try {
            while (rs.next()) {
                dato = rs.getString(parametro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modulo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dato;
    }

    public void eliminarRegistro(String idRegistro, String tabla, String formaId) {
        conexion.conexionMySQL.EjecutarInstruccion("DELETE FROM " + tabla + " WHERE " + formaId + " = " + idRegistro);
    }

    public String getUltimoId(String formaId, String tabla) {
        String id = "";
        try {
            conexion.conexionMySQL.EjecutarConsulta("SELECT MAX(" + formaId + ")As ultimo FROM " + tabla);
            ResultSet rs = conexion.conexionMySQL.getResulSet();
            while (rs.next()) {
                id = rs.getString("ultimo");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }

    public boolean existeEnTabla(String id, JTable tabla, int columna) {
        boolean existe = false;
        int iD;
        iD = Integer.parseInt(id);
        for (int i = 0; i < tabla.getRowCount(); i++) {
            if (iD == Integer.parseInt(String.valueOf(tabla.getValueAt(i, columna)))) {
                existe = true;
            }
        }
        return existe;
    }

    public void limpiarTabla(DefaultTableModel modelo, JTable tabla) {
        int fila = tabla.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    //Verifica que la base de datos que esta en el fichero es existe en el gestor de base de datos
    public boolean existeLaBase(){
        boolean existe = false;
        try {
            String baseDatos = "";
            Fichero fichero = new Fichero();
            baseDatos = fichero.obterBase();
            conexion.conexionMySQL.EjecutarConsulta("show databases");
            ResultSet rs = conexion.conexionMySQL.getResulSet();
            while(rs.next()){
                if(baseDatos.equals(rs.getString("Database"))){
                    existe = true;
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Modulo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }
    public boolean existeLaBase(String nombreBase){
        boolean existe = false;
        try {
            conexion.conexionMySQL.EjecutarConsulta("show databases");
            ResultSet rs = conexion.conexionMySQL.getResulSet();
            while(rs.next()){
                if(nombreBase.equals(rs.getString("Database"))){
                    existe = true;
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Modulo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }

    public void insertarEnTabla(String[] datos, DefaultTableModel modelo) {
        this.modelo = modelo;
        this.modelo.addRow(datos);
    }

    public void quitarFila(int fila, DefaultTableModel modelo) {
        modelo.removeRow(fila);
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public JLabel getLabelNum() {
        return labelNum;
    }

    public void setLabelNum(JLabel labelNum) {
        this.labelNum = labelNum;
    }

    public JLabel getLabelFecha() {
        return labelFecha;
    }

    public void setLabelFecha(JLabel labelFecha) {
        this.labelFecha = labelFecha;
    }

}
