/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ProyectoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Material material = new Material();
        material.setVisible(true);
        /*
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3305/databrevista","root","xela2020");
            
            Statement sentencia = conexion.createStatement();
            ResultSet resultSet = sentencia.executeQuery("select * from Estudiante");
            
            while(resultSet.next()){
                System.out.println(resultSet.getString("Telefono")+" "+resultSet.getString("Nombre"));
               
            }
            resultSet.close();
            sentencia.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
 */
        
        /*
        try {
            ConexionMySQL conexion = new ConexionMySQL("localhost","3305","proyectobd2","root","xela2020");
            conexion.EjecutarConsulta("SELECT * FROM material");
            ResultSet rs = conexion.getResulSet();
            while(rs.next()){
                System.out.println(rs.getString("tipo"));
            }
            
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
        */

        /*
        
             ConexionMySQL conexion = new ConexionMySQL("localhost","3305","databrevista","root","xela2020");
             conexion.EjecutarInstruccion("INSERT INTO estudiante(Nombre,Telefono, Facultad, Carrera, Edad, Carnet, Admi) "+
                     "VALUES ('Estudiante6','11111111','Ingenieria','Sistemas',20,'99989',0)");
           */
        /*
                  ConexionMySQL conexion1 = new ConexionMySQL("localhost","3305","proyectobd3","root","xela2020");
            conexion1.EjecutarConsulta("SELECT * FROM material WHERE nombre ="+"'Periodico'");
            ResultSet rs = conexion1.getResulSet();
            try {
                while(rs.next()){
                    System.out.println( rs.getString("nombre"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
            }
        */
    }
    
}
