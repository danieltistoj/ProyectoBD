/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class TablaId {
    private JTable tabla;
    private VariableGlobal conexion;
    
    public TablaId(JTable tabla) {
        this.tabla = tabla;
        conexion = new VariableGlobal();
    }
    public void llenarTable(String consulta, String parametroEntrada, String formaParametro, String formaId, String extra,String entrada, String[] titulo){
        String campo = parametroEntrada;
        String where = "";
        if(!"".equals(campo)){
            where =" " +entrada+" "+formaId+ "= "+campo+" or "+formaParametro+" = '"+campo+"'";
           // System.out.println(where);
        }
         try {
         DefaultTableModel modelo = new DefaultTableModel(null,titulo);
         tabla.setModel(modelo);
         conexion.conexionMySQL.EjecutarConsulta(consulta+where+" "+extra);
            
            ResultSet rs = conexion.conexionMySQL.getResulSet();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
              
            while(rs.next()){
                Object[] fila = new Object[cantidadColumnas];
                for(int i=0; i <cantidadColumnas ; i++){
                    fila[i]=rs.getObject(i+1);
                }
                modelo.addRow(fila);
            }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error de conexion","Error",JOptionPane.ERROR_MESSAGE);
         System.out.println(ex.getMessage());
        
    }
    }
    public float sumaFlotanteColumna(int columna){
        int filas = tabla.getRowCount();
        float total;
        total = 0;
        for(int i=0;i<filas;i++){
            total =  total + Float.parseFloat(String.valueOf(tabla.getValueAt(i,columna)));
        }
        return total;
    }

    public JTable getTabla() {
        return tabla;
    }
    
    
}
