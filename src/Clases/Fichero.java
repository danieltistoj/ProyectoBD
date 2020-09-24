/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Fichero {

    private String baseDatos;

    public Fichero() {
        this.baseDatos = "BaseDatos.txt";
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public String obterBase() {
        String cadena = "";
        int caracter;
        try {
            FileReader fr = new FileReader("src\\Fichero\\" + baseDatos);
            caracter = fr.read();
            while (caracter != -1) {
                cadena += (char) caracter;
                caracter = fr.read();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.baseDatos = cadena;
        return this.baseDatos;
    }

    public void setFicheroBase(String nuevoNombreBase) {
        try {
            //FileWriter fw = new FileWriter("D:\\test\\holamundo.txt"); //Rura obsoluta.
            FileWriter fw = new FileWriter("src\\Fichero\\" + baseDatos);//ruta relativa, el true añade texto, si se le quita sobreescribe
            fw.write(nuevoNombreBase);
            fw.close();
            JOptionPane.showMessageDialog(null, "El nombre de la base de datos fue cammbiada", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
