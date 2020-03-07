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

/**
 *
 * @author Usuario
 */
public class ProyectoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        try {
            ConexionMySQL conexion = new ConexionMySQL("localhost","3305","databrevista","root","xela2020");
            conexion.EjecutarConsulta("select * from Estudiante");
            ResultSet rs = conexion.getResulSet();
            while(rs.next()){
                System.out.println(rs.getString("Nombre"));
            }
            
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }
    
}
