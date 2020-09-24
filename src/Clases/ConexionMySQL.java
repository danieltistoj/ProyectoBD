/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.ConexionDB;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ConexionMySQL extends ConexionDB {
    
    public ConexionMySQL(String host, String puerto,String baseDatos,String usuario,String password){
     super("com.mysql.cj.jdbc.Driver","jdbc:mysql://"+host+":"+puerto+"/"+baseDatos,usuario,password);  
    }
   
    public ConexionMySQL (String host, String baseDatos, String usuario, String password){
        super("com.mysql.cj.jdbDriver","jdbc:mysql://"+host+"/"+baseDatos,usuario,password);
    }
    
} 
