/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import Frame.Cargador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.digest.DigestUtils;
import Clases.Bitacoratxt;

/**
 *
 * @author Usuario
 */
public class ProyectoBD {

    public static void main(String[] args) {
         Bitacoratxt n = new Bitacoratxt();
         Cargador cargar = new Cargador();
         cargar.setVisible(true);
    } 
}
