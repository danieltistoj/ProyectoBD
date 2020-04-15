/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

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
    private DefaultTableModel  modelo;
    private JLabel labelNum,labelFecha;
    private ConexionMySQL conexion;
    private String localhost,puerto,baseDeDatos,
             usuario,contra, codigo;
    private String[] datosInsertar;
    public Modulo() {
        this.localhost = "localhost";
        this.puerto = "3305";
        this.baseDeDatos =  "proyectobd3";
        this.usuario = "root";
        this.contra = "xela2020";
        
        conexion = new ConexionMySQL(localhost,puerto,baseDeDatos,usuario,contra);
        
    }
    
    
    public void generarCodigo(JLabel label,String formaParametro, String tabla,String letra){
    int entero;
    String numero = "";
    String ultimoNum = "";
       try {
            conexion.EjecutarConsulta("SELECT MAX("+formaParametro+") FROM "+tabla);
            ResultSet rs = conexion.getResulSet();
           
            if(rs.next()){
                ultimoNum = rs.getString(1);
            }   
            if(ultimoNum == null){
                label.setText(letra+"0001");
            }
            else{
                char r1 = ultimoNum.charAt(2);
                 char r2 = ultimoNum.charAt(3);
                  char r3 = ultimoNum.charAt(4);
                   char r4 = ultimoNum.charAt(5);
                   String cadena = "";
                   cadena = ""+r1+r2+r3+r4;
                   
                   entero = Integer.parseInt(cadena);
                   Codigo codigo = new Codigo();
                   codigo.generarCodigo(entero);
                   label.setText(letra+codigo.getCodigo());
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
       
}
    public String fecha(){
    LocalDate fecha1 = LocalDate.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return fecha1.format(dtf);
    }
    public  boolean esEntero(String id){
    boolean entero = false;
    try {
        Integer.parseInt(id);
        entero = true;
    } catch (Exception e) {
    }
    return entero;
}
    public boolean esFlotante(String abono){
     boolean entero = false;
    try {
        Float.parseFloat(abono);
        entero = true;
    } catch (Exception e) {
    }
    return entero;
}
    public boolean existeRegistro(String parametro,String tabla, String formaParametro){
    boolean existe = false;
  
        try {
            conexion.EjecutarConsulta("SELECT COUNT(*) FROM "+tabla +" WHERE "+formaParametro+" = "+parametro+"");
            ResultSet rs = conexion.getResulSet();
            rs.next();
            if(rs.getInt(1)>0){
                existe = true;
            }   
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
        return existe;   
}
    public String getDato(String formaId, String id, String tabla, String parametro){
    String dato = "";
            conexion.EjecutarConsulta("SELECT * FROM "+tabla+" WHERE "+formaId+" = "+id);
            ResultSet rs = conexion.getResulSet();
            try {
                while(rs.next()){
                  dato = rs.getString(parametro);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
            }
    return dato; 
}
    private String getUltimoId(String formaId,String tabla){
    String id = "";
       try {
            conexion.EjecutarConsulta("SELECT MAX("+formaId+")As ultimo FROM "+tabla);
            ResultSet rs = conexion.getResulSet();
            while(rs.next()){
                id = rs.getString("ultimo");
            }
            
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
        return id;
}
    
    private void eliminarRegistroTabla(JTable tabla,DefaultTableModel modelo,JLabel labelTotal,int columna){
    int fila = tabla.getSelectedRow();
    float total = Float.parseFloat(labelTotal.getText()),subTotal;
        if(fila>=0){
            subTotal = Float.parseFloat(String.valueOf(tabla.getValueAt(fila,columna)));
            modelo.removeRow(fila);
            total = total - subTotal;
            labelTotal.setText(""+total);
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione un material","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
}
    private boolean existeEnTabla(String id,JTable tabla,int columna){
     boolean existe = false;
     int iD;
     iD = Integer.parseInt(id);
        for(int i = 0; i<tabla.getRowCount();i++){
            if(iD == Integer.parseInt(String.valueOf(tabla.getValueAt(i,columna))) ){
                existe = true;
            }
        }
        return existe;
}
private void limpiarTabla(DefaultTableModel modelo, JTable tabla){
    int fila = tabla.getRowCount();
    for(int i = fila-1;i>=0;i--){
        modelo.removeRow(i);
    }
}
 
private void insertarEnTabla(String [] datos, DefaultTableModel  modelo){
     this.modelo = modelo;
     this.modelo.addRow(datos);     
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
