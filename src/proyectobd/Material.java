/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import java.awt.event.WindowEvent;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Usuario
 */
public class Material extends javax.swing.JFrame {
     
     private  String[]  titulos = {"Id","Nombre","Alto","Ancho","Cantidad","Color","Tipo"};
     private String ID = "";
     
     public Material() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Material");
         
        ventanaNuevo.setTitle("Nuevo Material");
        ventanaNuevo.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       // setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaNuevo = new javax.swing.JDialog();
        panelNuevo = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botonAceptarD = new javax.swing.JButton();
        botonCancelarD = new javax.swing.JButton();
        comboTipo = new javax.swing.JComboBox<>();
        botonRadio = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelMaterial = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMateriales = new javax.swing.JTable();
        botonNuevo = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        cuadroTexto = new javax.swing.JTextField();
        botonCargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonReporte = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        ventanaNuevo.setSize(new java.awt.Dimension(404, 522));

        panelNuevo.setPreferredSize(new java.awt.Dimension(404, 522));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel5.setText("Cantidad");

        jLabel6.setText("Color");

        botonAceptarD.setText("Aceptar");
        botonAceptarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarDActionPerformed(evt);
            }
        });

        botonCancelarD.setText("Cancelar ");
        botonCancelarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarDActionPerformed(evt);
            }
        });

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carta", "Oficio" }));

        botonRadio.setText("Tipo");

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Obligatorio");

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Obligatorio");

        javax.swing.GroupLayout panelNuevoLayout = new javax.swing.GroupLayout(panelNuevo);
        panelNuevo.setLayout(panelNuevoLayout);
        panelNuevoLayout.setHorizontalGroup(
            panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevoLayout.createSequentialGroup()
                .addGroup(panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNuevoLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(botonAceptarD)
                        .addGap(54, 54, 54)
                        .addComponent(botonCancelarD)
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(panelNuevoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelNuevoLayout.createSequentialGroup()
                                .addGroup(panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(31, 31, 31)
                                .addGroup(panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(botonRadio)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addGroup(panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtColor)
                            .addComponent(txtNombre)
                            .addComponent(txtCantidad)
                            .addComponent(comboTipo, 0, 158, Short.MAX_VALUE))))
                .addGap(43, 43, 43))
        );
        panelNuevoLayout.setVerticalGroup(
            panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45)
                .addGroup(panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(46, 46, 46)
                .addGroup(panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptarD)
                    .addComponent(botonCancelarD))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout ventanaNuevoLayout = new javax.swing.GroupLayout(ventanaNuevo.getContentPane());
        ventanaNuevo.getContentPane().setLayout(ventanaNuevoLayout);
        ventanaNuevoLayout.setHorizontalGroup(
            ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaNuevoLayout.setVerticalGroup(
            ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaMateriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaMateriales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMaterialesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMateriales);

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        cuadroTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cuadroTextoKeyPressed(evt);
            }
        });

        botonCargar.setText("Cargar");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        jLabel1.setText("Id / Nombre");

        botonReporte.setText("Reporte");
        botonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Editar");

        javax.swing.GroupLayout panelMaterialLayout = new javax.swing.GroupLayout(panelMaterial);
        panelMaterial.setLayout(panelMaterialLayout);
        panelMaterialLayout.setHorizontalGroup(
            panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMaterialLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(botonCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMaterialLayout.createSequentialGroup()
                                .addComponent(cuadroTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(botonNuevo)
                                .addGap(27, 27, 27)
                                .addComponent(jToggleButton1)
                                .addGap(18, 18, 18)
                                .addComponent(botonEliminar))
                            .addGroup(panelMaterialLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonReporte)))))
                .addContainerGap())
        );
        panelMaterialLayout.setVerticalGroup(
            panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaterialLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMaterialLayout.createSequentialGroup()
                        .addComponent(botonReporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMaterialLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)))
                .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar)
                    .addComponent(botonNuevo)
                    .addComponent(botonCargar)
                    .addComponent(cuadroTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Boton ingresar un nuevo material
    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        ventanaNuevo.setVisible(true);
        ventanaNuevo.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void cuadroTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuadroTextoKeyPressed

    }//GEN-LAST:event_cuadroTextoKeyPressed
//Cargar la base de datos en la tabla de la ventana. 
    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
       String campo = cuadroTexto.getText();
        String where = "";
        if(!"".equals(campo)){
            where = "WHERE id = '"+campo+"' OR nombre = '"+campo+"'";
        }
         try {
         DefaultTableModel modelo = new DefaultTableModel(null,titulos);
         tablaMateriales.setModel(modelo);
         ConexionMySQL conexion = new ConexionMySQL("localhost","3305","proyectobd3","root","xela2020");
         conexion.EjecutarConsulta("SELECT id, nombre, alto, ancho, cantidad, color, tipo FROM material "+where+" "+"ORDER BY cantidad");
            
            ResultSet rs = conexion.getResulSet();
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
        JOptionPane.showMessageDialog(rootPane,"Error de conexion","Error",JOptionPane.ERROR_MESSAGE);
         System.out.println(ex.getMessage());
        
    }
    }//GEN-LAST:event_botonCargarActionPerformed
private void cerrarDialogNuevo(){
     ventanaNuevo.setVisible(false);
      txtNombre.setText("");
      txtCantidad.setText("");
      txtColor.setText("");
      ventanaNuevo.dispose();
}
//boton cancelar dialog
    private void botonCancelarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarDActionPerformed
      cerrarDialogNuevo();
    }//GEN-LAST:event_botonCancelarDActionPerformed
//Haceptar solo numeros 
    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
      char validar = evt.getKeyChar();
      if(Character.isLetter(validar)){
          getToolkit().beep();
          evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Solo ingrese numeros","Error",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_txtCantidadKeyTyped
//Boton aceptar de la ventana nuevo
    private void botonAceptarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarDActionPerformed
        float alto, ancho; 
        String tipo, nombre = "";
        
            if(txtNombre.getText().length() == 0 || txtCantidad.getText().length() == 0){ // ver si los campos nombre y cantidad estan llenos 
                JOptionPane.showMessageDialog(rootPane,"Llene los campos obligatorios","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{//si los campos obligatorios estan llenos.  
            //se hace la consulta para ver si el nombre del producto que estan ingresando ya existe
            ConexionMySQL conexion1 = new ConexionMySQL("localhost","3305","proyectobd3","root","xela2020");
            conexion1.EjecutarConsulta("SELECT * FROM material WHERE nombre ="+"'"+txtNombre.getText()+"'");
            ResultSet rs = conexion1.getResulSet();
            try {
                while(rs.next()){
                  nombre = rs.getString("nombre");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
            }
                if(nombre == ""){//si el nombre del material no existe
                  if(botonRadio.isSelected()){//Si la opcion tipo est habilitada
                   if(comboTipo.getSelectedIndex() == 0){// si es carta 
                       alto = (float) 27.94;
                       ancho = (float) 21.59;
                       tipo = "Carta";
                   } 
                   else{// si es oficio
                       alto = (float) 33;
                       ancho = (float) 21.64;
                       tipo = "Oficio";     
                   }
                   //se pregunta si esta deacuerdo con los datos del material
                   int res = JOptionPane.showConfirmDialog(rootPane,"¿Esta deacuerdo con el material? \n"+"Nombre: "+txtNombre.getText()
                    +"\nCantidad: "+txtCantidad.getText()+"\nColor: "+txtColor.getText()+"\nTipo: "+tipo+"\nDimensiones: "+alto+"cm x "+ancho+"cm","Advertencia",
                    JOptionPane.YES_NO_OPTION);
                   if(res == 0){//si esta deacuerdo con los datos del material 
                     //se inserta el material en la base de datos.
                     ConexionMySQL conexion = new ConexionMySQL("localhost","3305","proyectobd3","root","xela2020");
                     conexion.EjecutarInstruccion("INSERT INTO material(nombre,alto,ancho,cantidad,color,tipo)"  
                             + "VALUES ('"+txtNombre.getText()+"',"+alto+","+ancho+","+txtCantidad.getText()+",'"+txtColor.getText()+"' ,'"+tipo+"')"); 
                
                //Mensaje que describe que el material ingreso en el sistema      
                JOptionPane.showMessageDialog(rootPane,"Material Ingresado","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                cerrarDialogNuevo(); 
                   }
                    
                }
                else{// si la opcion tipo, no esta habilitada 
                    //se pregunta si esta deacuerdo con los datos del material  
                    int res = JOptionPane.showConfirmDialog(rootPane,"¿Esta deacuerdo con el material? \n"+"Nombre: "+txtNombre.getText()
                    +"\nCantidad: "+txtCantidad.getText()+"\nColor: "+txtColor.getText(),"Advertencia",
                    JOptionPane.YES_NO_OPTION);
                     if(res == 0){ // si esta deacuerdo con los datos del material 
                     //se inserta el material en la base de datos 
                     ConexionMySQL conexion = new ConexionMySQL("localhost","3305","proyectobd3","root","xela2020");
                     conexion.EjecutarInstruccion("INSERT INTO material(nombre,alto,ancho,cantidad,color,tipo)" 
                             + "VALUES ('"+txtNombre.getText()+"',"+"NULL"+","+"NULL"+","+txtCantidad.getText()+",'"+txtColor.getText()+"' ,'"+"NULL"+"')"); 
               //Mensaje que describe que el material ingreso en el sistema 
                JOptionPane.showMessageDialog(rootPane,"Material Ingresado","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                cerrarDialogNuevo();
                     }
                   
                }  
                }//fin del if(nombre == "")
                else{
                    JOptionPane.showMessageDialog(rootPane,"El nombre del producto ya existe","Error",JOptionPane.ERROR_MESSAGE);
                }
                    
            }        
    }//GEN-LAST:event_botonAceptarDActionPerformed
//Se hace el reporte de la tabla del modulo de material
    private void botonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteActionPerformed
        
         try {
              ConexionMySQL conexion = new ConexionMySQL("localhost","3305","proyectobd3","root","xela2020");
              Connection con = conexion.getConexion();
             InputStream archivo=getClass().getResourceAsStream("/Reporte/Material.jrxml");
             JasperDesign dise = JRXmlLoader.load(archivo);
             JasperReport jr = JasperCompileManager.compileReport(dise);
             JasperPrint jp = JasperFillManager.fillReport(jr,null,con);
             JasperViewer.viewReport(jp); 
         } catch (JRException ex) {
             Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_botonReporteActionPerformed
//boton eliminar 
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
           if(ID == ""){
            JOptionPane.showMessageDialog(rootPane,"Seleccione un producto","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            String nombre="",alto="",ancho="", cantidad="",color="",tipo="", id="";
        ConexionMySQL conexion = new ConexionMySQL("localhost","3305","proyectobd3","root","xela2020");
        conexion.EjecutarConsulta("SELECT * FROM material WHERE id = "+ID);
        ResultSet rs = conexion.getResulSet();
         try {
             
             while(rs.next()){
                 id = rs.getString("id");
                 nombre = rs.getString("nombre");
                 alto = rs.getString("alto");
                 ancho = rs.getString("ancho");
                 cantidad = rs.getString("cantidad");
                 color = rs.getString("color");
                 tipo = rs.getString("tipo");
             }
             
               int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar? \n"+"Nombre: "+nombre+"\n"
             +"Alto: "+alto+"\n"+"Ancho: "+ancho+"\n"+"Cantidad: "+cantidad+"\n"+"Color: "+color+"\n"+"Tipo: "+tipo,"Advertencia",JOptionPane.YES_NO_OPTION);   
             if(resp == 0){// si acepta que se elimine el material
                 conexion.EjecutarInstruccion("DELETE FROM material WHERE id = "+id);
                 JOptionPane.showMessageDialog(rootPane,"El producto se elimino","Mensaje",JOptionPane.INFORMATION_MESSAGE);    
             }
              ID = ""; 
         } catch (SQLException ex) {
             Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
         }
        }// fin del elese principal
    }//GEN-LAST:event_botonEliminarActionPerformed

//accion boton aceptar de la ventana de dialogo eliminar 
    private void tablaMaterialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMaterialesMouseClicked
      ID = "";
      int seleccion = tablaMateriales.rowAtPoint(evt.getPoint());
      ID = String.valueOf(tablaMateriales.getValueAt(seleccion,0));
    }//GEN-LAST:event_tablaMaterialesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Material().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarD;
    private javax.swing.JButton botonCancelarD;
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JRadioButton botonRadio;
    private javax.swing.JButton botonReporte;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JTextField cuadroTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel panelMaterial;
    private javax.swing.JPanel panelNuevo;
    private javax.swing.JTable tablaMateriales;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JDialog ventanaNuevo;
    // End of variables declaration//GEN-END:variables
}
