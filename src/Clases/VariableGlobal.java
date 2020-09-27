/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VariableGlobal {

    public ConexionMySQL conexionMySQL;
    private Fichero fichero;
    private String host, puerto, usuario, contra;

    public VariableGlobal() {
        
        host = "localhost";
        puerto = "3310";
        usuario = "root";
        contra = "hacker.net";
        fichero = new Fichero();
<<<<<<< HEAD
        /*
        host = "localhost";
=======
        */
        /*host = "localhost";
>>>>>>> b5f3a789ae3bb8e8faf40ec9d5fd7d112c8a1373
        puerto = "3305";
        usuario = "root";
        contra = "xela2020";
        */
        host = "localhost";
        puerto = "3306";
        usuario = "root";
        contra = "master502";
        
        
        fichero = new Fichero();
        */
        this.conexionMySQL = new ConexionMySQL(host, puerto, fichero.obterBase(), usuario, contra);
    }

    public VariableGlobal(String base) {
        
        host = "localhost";
        puerto = "3310";
        usuario = "root";
        contra = "hacker.net";
        fichero = new Fichero();
<<<<<<< HEAD
/*
        host = "localhost";
=======
*/
        /*host = "localhost";
>>>>>>> b5f3a789ae3bb8e8faf40ec9d5fd7d112c8a1373
        puerto = "3306";
        usuario = "root";
        contra = "xela2020";
        */
        host = "localhost";
        puerto = "3306";
        usuario = "root";
        contra = "master502";
        
        fichero = new Fichero();
        */
        this.conexionMySQL = new ConexionMySQL(host, puerto, base, usuario, contra);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContra() {
        return contra;
    }

}
