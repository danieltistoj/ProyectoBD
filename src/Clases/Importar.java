/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Importar {
 private String  comando, usuario,contra;
        
    public Importar(String contra,String usuario) {
        this.usuario = usuario;
        this.contra = contra;
        
    }
    public void ImportarBase(String ruta,String baseDeDatos){
        if(ruta.length()!=0){
            try {
                comando = "cmd /c mysql -u "+usuario+" -p"+contra+" "+baseDeDatos+" < "+"\""+ ruta+"\"";
                System.out.println(comando);
                Runtime rt = Runtime.getRuntime();
                rt.exec(comando);
                JOptionPane.showMessageDialog(null,"Se importo la base de datos","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error al importar","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    public void abrirBitacora(){
        String cadena;
        try
        { 
            // create a process and execute google-chrome 
            Process process = Runtime.getRuntime().exec("google-chrome"); 
            System.out.println("Google Chrome successfully started"); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
    }
   
}
