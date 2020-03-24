/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Producto extends javax.swing.JFrame {

    private  String[]  titulos = {"Id","Nombre","Descripcion","Productos a utilizar"}, tituloMaterial ={"Id","Nombre","Cantidad","Tipo"}, tituloMaterialUtil = {"Id","Nombre","Tipo","Cantidad"};
    private DefaultTableModel  modeloTabla;
    private String iD = "",nombre1 =  "",tipo1 = "",localhost = "localhost",puerto = "3305",baseDeDatos = "proyectobd3",
             usuario ="root",contra = "xela2020";
    public Producto() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Producto");
        dialogNuevoPro.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        modeloTabla = new DefaultTableModel(null,tituloMaterialUtil);
        this.tablaMaterialProduc.setModel(modeloTabla);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogNuevoPro = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        txtNombreNuevo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaDescrip = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        botonAdanir = new javax.swing.JToggleButton();
        botonEliminarNue = new javax.swing.JToggleButton();
        txtCargarNuevoPro = new javax.swing.JTextField();
        botonCargarNue = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMaterial = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaMaterialProduc = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtCargar = new javax.swing.JTextField();
        botonNuevo = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonDetalle = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonReporte = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrincipal = new javax.swing.JTable();

        dialogNuevoPro.setSize(new java.awt.Dimension(695, 580));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombreNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreNuevoActionPerformed(evt);
            }
        });

        areaDescrip.setColumns(20);
        areaDescrip.setRows(5);
        jScrollPane2.setViewportView(areaDescrip);

        jLabel1.setText("Nombre");

        jLabel2.setText("Descripcion");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("(Obligatorio)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(txtNombreNuevo))
                .addGap(182, 182, 182))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botonAdanir.setText("Añadir");
        botonAdanir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdanirActionPerformed(evt);
            }
        });

        botonEliminarNue.setText("Eliminar ");
        botonEliminarNue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarNueActionPerformed(evt);
            }
        });

        botonCargarNue.setText("Cargar");
        botonCargarNue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarNueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonCargarNue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargarNuevoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAdanir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(botonEliminarNue)
                .addGap(44, 44, 44))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAdanir)
                    .addComponent(botonEliminarNue)
                    .addComponent(txtCargarNuevoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCargarNue))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMaterialMouseClicked(evt);
            }
        });
        tablaMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablaMaterialKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(tablaMaterial);

        tablaMaterialProduc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaMaterialProduc);

        jLabel3.setText("Materiales del producto");

        jLabel4.setText("Materiales");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("(Obligatorio)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(botonAceptar)
                .addGap(55, 55, 55)
                .addComponent(botonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogNuevoProLayout = new javax.swing.GroupLayout(dialogNuevoPro.getContentPane());
        dialogNuevoPro.getContentPane().setLayout(dialogNuevoProLayout);
        dialogNuevoProLayout.setHorizontalGroup(
            dialogNuevoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogNuevoProLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogNuevoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogNuevoProLayout.setVerticalGroup(
            dialogNuevoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogNuevoProLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonEditar.setText("Editar");

        botonDetalle.setText("Detalle");

        botonEliminar.setText("Eliminar");

        botonReporte.setText("Reporte");
        botonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteActionPerformed(evt);
            }
        });

        botonCargar.setText("Cargar");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(botonCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(botonNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(botonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(botonDetalle)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonReporte)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonNuevo)
                        .addComponent(botonEditar)
                        .addComponent(botonDetalle)
                        .addComponent(botonEliminar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonCargar)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPrincipal);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReporteActionPerformed

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
      String consulta = "SELECT PM.producto_id As id_Producto,P.nombre As nombre_Producto,P.descripcion,COUNT(*) Total_Materiales FROM producto_has_material PM\n" +
"INNER JOIN producto P ON PM.producto_id = P.id\n" +
"INNER JOIN material M ON PM.material_id = M.id ";
        cargarTabla(consulta, txtCargar.getText(),"P.nombre","P.id","GROUP BY P.id", tablaPrincipal, titulos);
    }//GEN-LAST:event_botonCargarActionPerformed

    private void txtNombreNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreNuevoActionPerformed
private void cargarTabla(String consulta, String txt, String nombre, String id, String extra, JTable tabla, String[] titulo){
    String campo = txt;
        String where = "";
        if(!"".equals(campo)){
            where = "WHERE "+id+ "= '"+campo+"' OR "+nombre+"= '"+campo+"'";
        }
         try {
         DefaultTableModel modelo = new DefaultTableModel(null,titulo);
         tabla.setModel(modelo);
         ConexionMySQL conexion = new ConexionMySQL(localhost,puerto,baseDeDatos,usuario,contra);
         conexion.EjecutarConsulta(consulta+where+" "+extra);
            
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
}
//Nuevo producto 
    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
    String consulta =  "SELECT id,nombre,cantidad,tipo FROM material ";
     dialogNuevoPro.setVisible(true);
     dialogNuevoPro.setLocationRelativeTo(null);
     dialogNuevoPro.setTitle("Nuevo Producto");
     cargarTabla(consulta,txtCargarNuevoPro.getText(),"nombre","id","ORDER BY cantidad",tablaMaterial,tituloMaterial);
    }//GEN-LAST:event_botonNuevoActionPerformed
private void limpiarDialogNuevo(){
    txtCargarNuevoPro.setText("");
    txtNombreNuevo.setText("");
    areaDescrip.setText("");
    int fila = tablaMaterialProduc.getRowCount();
    for(int i = fila-1;i>=0;i--){
        modeloTabla.removeRow(i);
    }
}
//Cancelar dialog nuevo material
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dialogNuevoPro.setVisible(false);
        dialogNuevoPro.dispose();
        limpiarDialogNuevo();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void tablaMaterialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaMaterialKeyTyped
        
    }//GEN-LAST:event_tablaMaterialKeyTyped

    private void tablaMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMaterialMouseClicked
       int seleccion = tablaMaterial.rowAtPoint(evt.getPoint());
       iD = String.valueOf(tablaMaterial.getValueAt(seleccion,0));
       nombre1 = String.valueOf(tablaMaterial.getValueAt(seleccion, 1));
       tipo1 = String.valueOf(tablaMaterial.getValueAt(seleccion, 3));
        //System.out.println(iD);
    }//GEN-LAST:event_tablaMaterialMouseClicked
    //ve si existe ya el material en la tabla de materiales destinada al producto nuevo
    private boolean buscarMaterial(int id){
        boolean existe = false;
        
        for(int i = 0; i<tablaMaterialProduc.getRowCount();i++){
            if(id == Integer.parseInt(String.valueOf(tablaMaterialProduc.getValueAt(i,0))) ){
                existe = true;
            }
        }
        return existe;
    }
    private void insertarEnTabla(String id, String nombre, String tipo){
        String []info =new String[4];
        try {
             String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad que necesita:");
                   if(cantidad.length() == 0){
                       JOptionPane.showMessageDialog(null,"Ingrese un valor","Error",JOptionPane.ERROR_MESSAGE);
                   }
                   else{
                       int numCanti = Integer.parseInt(cantidad);
                        info[0] = id;
                        info[1] = nombre;
                        info[2] = tipo;
                        info[3] = Integer.toString(numCanti);
                        modeloTabla.addRow(info);
                   }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ingrese solo digitos","Error",JOptionPane.ERROR_MESSAGE);
        }
             
    }
    //boton anadir material a la tabla, para los productos que necesita el producto 
    private void botonAdanirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdanirActionPerformed
        if(iD != ""){
           if(tablaMaterialProduc.getRowCount() == 0){
               insertarEnTabla(iD, nombre1, tipo1);
           }
           else{
               
               if(!buscarMaterial(Integer.parseInt(iD))){
                   insertarEnTabla(iD, nombre1, tipo1);
               }
               else{
                   JOptionPane.showMessageDialog(null,"Ya tiene añadido el material","Error",JOptionPane.ERROR_MESSAGE);
               }
               
           }
       }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione un material","Error",JOptionPane.ERROR_MESSAGE);
        }
        iD = "";
    }//GEN-LAST:event_botonAdanirActionPerformed
//para cargar la tabla de materiales o buscar un material
    private void botonCargarNueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarNueActionPerformed
         String consulta =  "SELECT id,nombre,cantidad,tipo FROM material ";
        cargarTabla(consulta,txtCargarNuevoPro.getText(),"nombre","id","ORDER BY cantidad",tablaMaterial,tituloMaterial);
    }//GEN-LAST:event_botonCargarNueActionPerformed
//eliminar un material de la tabla derecha
    private void botonEliminarNueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarNueActionPerformed
        int fila = tablaMaterialProduc.getSelectedRow();
        if(fila>=0){
            modeloTabla.removeRow(fila);
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione una fila","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarNueActionPerformed
private int buscarPorNombre(String nombre){
    int id = -1;
    ConexionMySQL conexion1 = new ConexionMySQL(localhost,puerto,baseDeDatos,usuario,contra);
            conexion1.EjecutarConsulta("SELECT * FROM producto WHERE nombre ="+"'"+nombre+"'");
            ResultSet rs = conexion1.getResulSet();
            try {
                while(rs.next()){
                  id = Integer.parseInt(rs.getString("id"));
                  iD = rs.getString("id");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    return id;
}
private boolean insertarProducto(String nombre, String descripcion){
    boolean ingresado = false;
    int res = JOptionPane.showConfirmDialog(rootPane,"¿Esta seguro de ingresar un producto nuevo?","Advertencia",JOptionPane.YES_NO_OPTION);//verificamos que el usuario esta de acuerdo con los datos ingresados para el material
    if(res == 0){// si dice que si, ingresamos el prducto, y se retorna un true 
        ConexionMySQL conexion = new ConexionMySQL(localhost,puerto,baseDeDatos,usuario,contra);
                     conexion.EjecutarInstruccion("INSERT INTO producto(descripcion,nombre)"  
                             + "VALUES ('"+descripcion+"' ,'"+nombre+"')"); 
            ingresado = true;
            buscarPorNombre(nombre);//buscamos el nombre recien ingresado para utilizarlo en la relacion de productos 
    }
    return ingresado;
}
//relacion de material con producto tabla: producto_has_material
private void relacionMaterialProducto(String idProducto,int fila){
    String idMaterial,cantidad;
    idMaterial = String.valueOf(tablaMaterialProduc.getValueAt(fila,0));
    cantidad = String.valueOf(tablaMaterialProduc.getValueAt(fila,3));
    ConexionMySQL conexion = new ConexionMySQL(localhost,puerto,baseDeDatos,usuario,contra);
    conexion.EjecutarInstruccion("INSERT INTO producto_has_material(producto_id,material_id,Cantidad)"  
                             + "VALUES ("+idProducto+" ,"+idMaterial+" ,"+cantidad+")"); 
}
//boton haceptar 
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
      if(txtNombreNuevo.getText() != "" && tablaMaterialProduc.getRowCount() > 0){//vemos que los compos obligatorios esten llenos 
          if(buscarPorNombre(txtNombreNuevo.getText())<0){//verificamos que el nombre del producto a ingresar no este en la base de datos 
              if(insertarProducto(txtNombreNuevo.getText(),areaDescrip.getText())){//ingresamos el porducto en la base de datos, pero verificando que el usuario esta deacuerdo, ya que la funcion retorna un boolean
                  for(int i = 0; i<tablaMaterialProduc.getRowCount();i++){//relacionamos los materiales con el producto. 
                      relacionMaterialProducto(iD,i);
                  }
                  JOptionPane.showMessageDialog(null,"Producto ingresado correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
              }
             
          }
          else{
              JOptionPane.showMessageDialog(null,"El nombre del producto ya existe","Error",JOptionPane.ERROR_MESSAGE);
          }
          
      }
      else{
          JOptionPane.showMessageDialog(null,"Llene los campos obligatorios","Error",JOptionPane.ERROR_MESSAGE);
      }
      iD = "";
    }//GEN-LAST:event_botonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDescrip;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JToggleButton botonAdanir;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonCargarNue;
    private javax.swing.JButton botonDetalle;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JToggleButton botonEliminarNue;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonReporte;
    private javax.swing.JDialog dialogNuevoPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tablaMaterial;
    private javax.swing.JTable tablaMaterialProduc;
    private javax.swing.JTable tablaPrincipal;
    private javax.swing.JTextField txtCargar;
    private javax.swing.JTextField txtCargarNuevoPro;
    private javax.swing.JTextField txtNombreNuevo;
    // End of variables declaration//GEN-END:variables
}
