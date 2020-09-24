/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import Frame.VentanaImportar;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexionDB {

    protected Connection conexion;
    protected Statement sentencia;
    protected ResultSet resulSet;
    
    public ConexionDB(String claseNombre, String cadenaConexion, String usuario, String pass) {
        try {
            Class.forName(claseNombre);
            conexion = DriverManager.getConnection(cadenaConexion, usuario, pass);
            //conexion.setAutoCommit(false);
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            int resp = JOptionPane.showConfirmDialog(null, "¿Desea importar una base de datos", "", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                VentanaImportar ventana = new VentanaImportar();
                ventana.setVisible(true);
            }
            //System.out.println("error");
            //System.out.println(ex.getMessage());
            
        }
    }
    
    public ConexionDB(String claseNombre, String cadenaConexion) {
        try {
            Class.forName(claseNombre);
            conexion = DriverManager.getConnection(cadenaConexion);
            //conexion.setAutoCommit(false);
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("error");
            System.out.println(ex.getMessage());
            
        }
    }
    
    public void EjecutarConsulta(String consulta) {
        try {
            sentencia = conexion.createStatement();
            resulSet = sentencia.executeQuery(consulta);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }        
    }
    
    public void EjecutarInstruccion(String Instruccion) {
        int filas = 0;
        try {
            sentencia = conexion.createStatement();
            filas = sentencia.executeUpdate(Instruccion);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
    }
    
    public Connection getConexion() {
        return conexion;
    }
    
    public Statement getSentencia() {
        return sentencia;
    }
    
    public ResultSet getResulSet() {
        return resulSet;
    }
    
}
