/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Venta2 extends javax.swing.JInternalFrame {

    private String localhost = "localhost",puerto = "3305",baseDeDatos = "proyectobd3",
             usuario ="root",contra = "xela2020", nombreAnterior, idProveedor;
    private  String[]  titulos = {"Id","Nombre","Precio","Costo de produccion","Cantidad","Total"},datosInsertar;
    private ConexionMySQL conexion;
    private DefaultTableModel  modelo;
    private Modulo venta;
    public Venta2() {
        initComponents();
        venta = new Modulo();
        conexion = new ConexionMySQL(localhost,puerto,baseDeDatos,usuario,contra);
        
        venta.generarCodigo(labelNo, "numFactura","factura","CD");
        labelFecha.setText(venta.fecha());
        
        botonAnadir.setEnabled(false);
        botonCancelar.setEnabled(false);
        botonCargarClie.setEnabled(false);
        botonCargarPro.setEnabled(false);
        botonGuardar.setEnabled(false);
        botonQuitar.setEnabled(false);
        botonRemoverClie.setEnabled(false);
        botonRemoverPro.setEnabled(false);
        
        txtAreaDescripcion.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtIDproducto.setEnabled(false);
        txtNit.setEnabled(false);
        
        labelApellido.setText("");
        labelNombreClie.setText("");
        labelNombrePro.setText("");
        labelPrecio.setText("");
        labelId.setText("");
        labelPrecio.setText("");
        labelSubTotal.setText("");
        labelTotal.setText("");
       // labelFecha.setText(fecha());
        
        modelo = new DefaultTableModel(null,titulos);
        this.tablaProducto.setModel(modelo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelSubTotal = new javax.swing.JLabel();
        botonAnadir = new javax.swing.JButton();
        botonQuitar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIDproducto = new javax.swing.JTextField();
        botonCargarPro = new javax.swing.JButton();
        botonRemoverPro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        labelPrecio = new javax.swing.JLabel();
        labelNombrePro = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonCargarClie = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelNombreClie = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        botonRemoverClie = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        botonNuevo = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelNo = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Venta");
        setPreferredSize(new java.awt.Dimension(600, 766));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProducto);

        jLabel20.setText("TOTAL:");

        labelTotal.setBackground(new java.awt.Color(0, 0, 0));
        labelTotal.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(0, 0, 0));
        labelTotal.setText("jLabel19");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(labelTotal)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(labelTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel14.setText("CANTIDAD:");

        jLabel15.setText("SUBTOTAL:");

        labelSubTotal.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelSubTotal.setText("jLabel16");

        botonAnadir.setText("Añadir");

        botonQuitar.setText("Quitar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSubTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonQuitar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAnadir)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAnadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(botonQuitar)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(labelSubTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Producto");

        botonCargarPro.setText("Cargar");
        botonCargarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarProActionPerformed(evt);
            }
        });

        botonRemoverPro.setText("Remover");
        botonRemoverPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRemoverProActionPerformed(evt);
            }
        });

        jLabel10.setText("ID PRODUCTO:");

        jLabel11.setText("NOMBRE:");

        jLabel12.setText("PRECIO:");

        jLabel13.setText("DESCRIPCION:");

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtAreaDescripcion);

        labelPrecio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelPrecio.setText("jLabel17");

        labelNombrePro.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelNombrePro.setText("jLabel18");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(117, 117, 117)
                                .addComponent(botonRemoverPro)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel11))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtIDproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombrePro)
                            .addComponent(labelPrecio))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonRemoverPro)
                        .addComponent(jLabel11)
                        .addComponent(labelNombrePro)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCargarPro)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Cliente");

        jLabel3.setText("NIT:");

        botonCargarClie.setText("Cargar");
        botonCargarClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarClieActionPerformed(evt);
            }
        });

        jLabel4.setText("NOMBRE:");

        jLabel5.setText("APELLIDO:");

        jLabel6.setText("ID:");

        labelNombreClie.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelNombreClie.setText("jLabel7");

        labelApellido.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelApellido.setText("jLabel8");

        labelId.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelId.setText("jLabel9");

        botonRemoverClie.setText("Remover");
        botonRemoverClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRemoverClieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(botonRemoverClie))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarClie, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelApellido)
                    .addComponent(labelNombreClie)
                    .addComponent(labelId))
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labelNombreClie)
                            .addComponent(botonRemoverClie))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(labelApellido))))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelId)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCargarClie))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");

        botonGuardar.setText("Guardar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(botonNuevo)
                .addGap(63, 63, 63)
                .addComponent(botonGuardar)
                .addGap(64, 64, 64)
                .addComponent(botonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("No. Factura:");

        jLabel8.setText("FECHA:");

        labelNo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelNo.setText("jLabel9");

        labelFecha.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelFecha.setText("jLabel16");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNo)
                .addGap(169, 169, 169)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFecha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(labelNo)
                    .addComponent(labelFecha))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Comprobar que el pedido con el producto se puede realizar
 private boolean comprabarExistenciasM(int cantidad,int id,String consulta){
    boolean existencia = true;
    int cantiRequerida, existenciasM;// cantidad que se requiere para hacer un producto / numero de existencias del material
    try {
            conexion.EjecutarConsulta(consulta+id);
            ResultSet rs = conexion.getResulSet();
            while(rs.next()){
                cantiRequerida = Integer.parseInt(rs.getString("contidad_requerida"));//cantidad de un producto para hacer cierto material
               
                existenciasM = Integer.parseInt(rs.getString("num_existencias"));//cantidad del material (lo que tenemos en existencia de ese material)
                System.out.println("cantidad requerida: "+cantiRequerida+"cantidad existencia: "+existenciasM);
                /*
                si la cantidad de un material para hacer un producto multiplicado por la cantidad de productos que se solicitan, 
                es mayor a los productos en existencia, el pedido no podra realizarce
                */
                if(existenciasM<(cantiRequerida*cantidad)){
                    existencia = false;
                }
                
            }
            
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    return existencia;
}
    private void botonCargarClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarClieActionPerformed
        if(txtNit.getText().length()>0){
            if(venta.existeRegistro("'"+txtNit.getText()+"'","cliente","nit")){
                  labelNombreClie.setText(venta.getDato("nit","'"+txtNit.getText()+"'","cliente","nombre"));
                  labelApellido.setText(venta.getDato("nit","'"+txtNit.getText()+"'","cliente","apellido"));
                  labelId.setText(venta.getDato("nit","'"+txtNit.getText()+"'","cliente","id"));
                  
                  botonCargarClie.setEnabled(false);
                  botonRemoverClie.setEnabled(true);
                  txtNit.setEnabled(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"El cliente no existe","Advertencia",JOptionPane.WARNING_MESSAGE);
                txtNit.setText("");
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Llene el campo correspondiente","Advertencia",JOptionPane.WARNING_MESSAGE);
        
        }
    }//GEN-LAST:event_botonCargarClieActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
       botonCargarClie.setEnabled(true);
       botonCargarPro.setEnabled(true);
      
       
       txtNit.setEnabled(true);
       txtIDproducto.setEnabled(true);
       
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonRemoverClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRemoverClieActionPerformed
        txtNit.setEnabled(true);
        txtNit.setText("");
        
        labelApellido.setText("");
        labelNombreClie.setText("");
        labelId.setText("");
        
        botonCargarClie.setEnabled(true);
        botonRemoverClie.setEnabled(false);
    }//GEN-LAST:event_botonRemoverClieActionPerformed

    private void botonCargarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarProActionPerformed
        if(txtIDproducto.getText().length()>0){
            if(venta.esEntero(txtIDproducto.getText())){
                 if(venta.existeRegistro(txtIDproducto.getText(),"producto","id")){
                 labelNombrePro.setText(venta.getDato("id",txtIDproducto.getText(),"producto","nombre"));
                 labelPrecio.setText(venta.getDato("id",txtIDproducto.getText(),"producto","precio"));
                 txtAreaDescripcion.setText(venta.getDato("id",txtIDproducto.getText(),"producto","descripcion"));
                 
                 txtIDproducto.setEnabled(false);
                 botonCargarPro.setEnabled(false);
                 botonRemoverPro.setEnabled(true);
                 botonAnadir.setEnabled(true);
                 txtCantidad.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"El producto no existe","Advertencia",JOptionPane.WARNING_MESSAGE);
                txtNit.setText("");
            }
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Ingrese solo digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
            } 
        }
        else{
            JOptionPane.showMessageDialog(null,"Llene el campo correspondiente","Advertencia",JOptionPane.WARNING_MESSAGE);
        
        }
    }//GEN-LAST:event_botonCargarProActionPerformed

    private void botonRemoverProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRemoverProActionPerformed
        botonCargarPro.setEnabled(true);
        botonRemoverPro.setEnabled(false);
        txtIDproducto.setEnabled(true);
        txtIDproducto.setText("");
        
        labelNombrePro.setText("");
        labelPrecio.setText("");
        txtAreaDescripcion.setText("");
        botonAnadir.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtCantidad.setText("");
    }//GEN-LAST:event_botonRemoverProActionPerformed

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
       float total;
        if(txtCantidad.getText().equals("")==false){
            if(venta.esEntero(txtCantidad.getText())){
            total= Float.parseFloat(txtCantidad.getText())*Float.parseFloat(labelPrecio.getText());
            labelSubTotal.setText(total+"");
            }
            else{
                JOptionPane.showMessageDialog(null,"Ingrese solo valores enteros","Advertencia",JOptionPane.WARNING_MESSAGE);
                txtCantidad.setText("");
            }
        }
        else{
            labelSubTotal.setText("");
        }
    }//GEN-LAST:event_txtCantidadKeyReleased

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char validar = evt.getKeyChar();
      if(Character.isLetter(validar)){
          getToolkit().beep();
          evt.consume();
          JOptionPane.showMessageDialog(null,"Solo ingrese solo digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
      }
    }//GEN-LAST:event_txtCantidadKeyTyped





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnadir;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCargarClie;
    private javax.swing.JButton botonCargarPro;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonQuitar;
    private javax.swing.JButton botonRemoverClie;
    private javax.swing.JButton botonRemoverPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelNo;
    private javax.swing.JLabel labelNombreClie;
    private javax.swing.JLabel labelNombrePro;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelSubTotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIDproducto;
    private javax.swing.JTextField txtNit;
    // End of variables declaration//GEN-END:variables
}
