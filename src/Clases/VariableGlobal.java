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
   public  ConexionMySQL conexionMySQL;
   private Fichero fichero;
    public VariableGlobal() {
        fichero = new Fichero();
        this.conexionMySQL =  new ConexionMySQL("localhost","3305",fichero.obterBase(),"root","xela2020");
    }
}
