/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ConexionMySQL extends ConexionDB {
    
    public ConexionMySQL(String host, String puerto,String baseDatos,String usuario,String password){
     super("com:mysql.cj.jdbc.Driver","jdbc:mysql://"+host+":"+puerto+"/"+baseDatos,usuario,password);  
    }
    
    
}
