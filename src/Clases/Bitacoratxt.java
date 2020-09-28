/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author YADI
 */
public class Bitacoratxt {

    File archivo;
    FileWriter escribir;
    PrintWriter linea;

    public Bitacoratxt() {
        archivo = new File("bitacora.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                //CrearEncabezado
                linea.println("BITACORA");
                linea.println("Transacciones:");
                linea.println("Fomato: Accion-Fecha");
                linea.close();
                escribir.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Bitacoratxt.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("ERROR");
            }
        }
    }

    public void Escribirtxt(String accion, String fecha) {
        archivo = new File("bitacora.txt");
        try {
            archivo.createNewFile();
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            //CrearEncabezado
            linea.println(accion+" " + fecha);
            linea.close();
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(Bitacoratxt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void abrirBitacora(){
        String cadena="";
        int caracter;
         try {  
            FileReader fr = new FileReader("bitacora.txt");
            caracter = fr.read();
            while (caracter != -1) {
               cadena+=(char)caracter;
               
                 
                 caracter = fr.read();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bitacoratxt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bitacoratxt.class.getName()).log(Level.SEVERE, null, ex);
        }
         JOptionPane.showMessageDialog(null,cadena,"Bitacora",JOptionPane.INFORMATION_MESSAGE);
    }
}
