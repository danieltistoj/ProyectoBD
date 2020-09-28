/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Frame.InicioSesion;
import Clases.Bitacoratxt;
import Clases.VariableGlobal;
import InternalFrame.deudaHistoria;
import InternalFrame.Venta2;
import InternalFrame.Usuario;
import InternalFrame.Proveedor;
import InternalFrame.Producto2;
import InternalFrame.Material_Interno;
import InternalFrame.Deudor2;
import InternalFrame.Compra;
import InternalFrame.Cliente2;
import InternalFrame.CambioContra;
import InternalFrame.ExportarBD;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Menu2 extends javax.swing.JFrame {
    private int tipo;    
    private VariableGlobal conexion;
    private String idUsuario;
    private Bitacoratxt escribir;
    private Date fecha;
    public Menu2() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        conexion = new VariableGlobal();
        escribir = new Bitacoratxt();
        itemIniciarSesion.setEnabled(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        panelEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemIniciarSesion = new javax.swing.JMenuItem();
        itemCerrarSesion = new javax.swing.JMenuItem();
        menuAlmacen = new javax.swing.JMenu();
        itemMaterial = new javax.swing.JMenuItem();
        itemProducto = new javax.swing.JMenuItem();
        menunCompras = new javax.swing.JMenu();
        itemCompra = new javax.swing.JMenuItem();
        itemProveedor = new javax.swing.JMenuItem();
        itemDeudas = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        itemVenta = new javax.swing.JMenuItem();
        itemDeudores = new javax.swing.JMenuItem();
        itemCliente = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        itemUsuario = new javax.swing.JMenuItem();
        itemEditContra = new javax.swing.JMenuItem();
        jMenuExportar = new javax.swing.JMenu();
        jMenuItemExportar = new javax.swing.JMenuItem();
        MenuBitacora = new javax.swing.JMenu();
        MenuItemBitacora = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelEscritorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51), 3));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/WhatsApp Image 2020-03-15 at 17_opt (4).jpg"))); // NOI18N
        jLabel1.setText(" ");

        panelEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelEscritorioLayout = new javax.swing.GroupLayout(panelEscritorio);
        panelEscritorio.setLayout(panelEscritorioLayout);
        panelEscritorioLayout.setHorizontalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEscritorioLayout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(379, 379, 379))
        );
        panelEscritorioLayout.setVerticalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscritorioLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        menuArchivo.setText("Archivo");

        itemIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login_37128 (1).png"))); // NOI18N
        itemIniciarSesion.setText("Iniciar Sesion");
        itemIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIniciarSesionActionPerformed(evt);
            }
        });
        menuArchivo.add(itemIniciarSesion);

        itemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logout_37127 (2).png"))); // NOI18N
        itemCerrarSesion.setText("Cerrar Sesion");
        itemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarSesionActionPerformed(evt);
            }
        });
        menuArchivo.add(itemCerrarSesion);

        barraMenu.add(menuArchivo);

        menuAlmacen.setText("Almacen");

        itemMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/_123034.png"))); // NOI18N
        itemMaterial.setText("Material");
        itemMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMaterialActionPerformed(evt);
            }
        });
        menuAlmacen.add(itemMaterial);

        itemProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/business_inventory_maintenance_product_box_boxes_2326 (1).png"))); // NOI18N
        itemProducto.setText("Producto");
        itemProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductoActionPerformed(evt);
            }
        });
        menuAlmacen.add(itemProducto);

        barraMenu.add(menuAlmacen);

        menunCompras.setText("Compras");

        itemCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ic_shopping_cart_128_28698.png"))); // NOI18N
        itemCompra.setText("Compra");
        itemCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCompraActionPerformed(evt);
            }
        });
        menunCompras.add(itemCompra);

        itemProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/business-color_business-contact-86_icon-icons.com_53469.png"))); // NOI18N
        itemProveedor.setText("Proveedor ");
        itemProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProveedorActionPerformed(evt);
            }
        });
        menunCompras.add(itemProveedor);

        itemDeudas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/shoppaymentorderbuy-27_icon-icons.com_73879.png"))); // NOI18N
        itemDeudas.setText("Deuda / Historial");
        itemDeudas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeudasActionPerformed(evt);
            }
        });
        menunCompras.add(itemDeudas);

        barraMenu.add(menunCompras);

        menuVentas.setText("Ventas ");

        itemVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cashier2_118191.png"))); // NOI18N
        itemVenta.setText("Venta");
        itemVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVentaActionPerformed(evt);
            }
        });
        menuVentas.add(itemVenta);

        itemDeudores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Sales-report_25411.png"))); // NOI18N
        itemDeudores.setText("Deudores");
        itemDeudores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeudoresActionPerformed(evt);
            }
        });
        menuVentas.add(itemDeudores);

        itemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Distributor-report_25402.png"))); // NOI18N
        itemCliente.setText("Cliente");
        itemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClienteActionPerformed(evt);
            }
        });
        menuVentas.add(itemCliente);

        barraMenu.add(menuVentas);

        menuUsuario.setText("Usuario");

        itemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/contact_icon-icons.com_52354.png"))); // NOI18N
        itemUsuario.setText("Usuarios");
        itemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(itemUsuario);

        itemEditContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/businessregistration_signpen_negocio_inscripcio_2358.png"))); // NOI18N
        itemEditContra.setText("Cambiar contraseña");
        itemEditContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditContraActionPerformed(evt);
            }
        });
        menuUsuario.add(itemEditContra);

        barraMenu.add(menuUsuario);

        jMenuExportar.setText("Exportar");

        jMenuItemExportar.setText("Exporta Base de Datos");
        jMenuItemExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExportarActionPerformed(evt);
            }
        });
        jMenuExportar.add(jMenuItemExportar);

        barraMenu.add(jMenuExportar);

        MenuBitacora.setText("Bitacora");

        MenuItemBitacora.setText("Ver bitacora");
        MenuItemBitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemBitacoraActionPerformed(evt);
            }
        });
        MenuBitacora.add(MenuItemBitacora);

        barraMenu.add(MenuBitacora);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private boolean verificarVentanasAbiertas(){
    boolean cerrado = true;
    JInternalFrame[] activos = this.panelEscritorio.getAllFrames();
           if(activos.length>0){
               JOptionPane.showMessageDialog(null,"Tiene ventanas abiertas, para salir cierrelas","Advertencia",JOptionPane.WARNING_MESSAGE);
           }
           else{
               System.exit(0);
           }
    return cerrado;
}
public void setTipo(int tipo){
    this.tipo = tipo;
    if(this.tipo == 0){
        menunCompras.setEnabled(false);
        itemUsuario.setEnabled(false);
        jMenuExportar.setEnabled(false);
        MenuBitacora.setEnabled(false);
    }
}
public void setIdUsuario(String id){
    this.idUsuario = id;
}
    private void itemMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMaterialActionPerformed
       Material_Interno material = new Material_Interno(tipo);
       
       
       this.panelEscritorio.add(material);
       material.show();
    }//GEN-LAST:event_itemMaterialActionPerformed

    private void itemCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCompraActionPerformed
     Compra compra = new Compra();
     this.panelEscritorio.add(compra);
     compra.show();
    }//GEN-LAST:event_itemCompraActionPerformed

    private void itemProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProveedorActionPerformed
        Proveedor proveedor = new Proveedor(tipo);
        this.panelEscritorio.add(proveedor);
        proveedor.show();
    }//GEN-LAST:event_itemProveedorActionPerformed

    private void itemDeudasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeudasActionPerformed
      deudaHistoria deuda = new deudaHistoria();
      this.panelEscritorio.add(deuda);
      deuda.show();
    }//GEN-LAST:event_itemDeudasActionPerformed

    private void itemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClienteActionPerformed
      Cliente2 cliente = new Cliente2(tipo);
      this.panelEscritorio.add(cliente);
      cliente.show();
    }//GEN-LAST:event_itemClienteActionPerformed

    private void itemProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductoActionPerformed
        Producto2 producto = new Producto2(tipo);
        this.panelEscritorio.add(producto);
        producto.show();
    }//GEN-LAST:event_itemProductoActionPerformed

    private void itemVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVentaActionPerformed
       Venta2 venta = new Venta2();
       this.panelEscritorio.add(venta);
       venta.show();
    }//GEN-LAST:event_itemVentaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       verificarVentanasAbiertas();
    }//GEN-LAST:event_formWindowClosing

    private void itemDeudoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeudoresActionPerformed
         Deudor2 deudor = new Deudor2();
         this.panelEscritorio.add(deudor);
         deudor.show();
    }//GEN-LAST:event_itemDeudoresActionPerformed

    private void itemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUsuarioActionPerformed
       Usuario usuario = new Usuario();
       this.panelEscritorio.add(usuario);
       usuario.show();
    }//GEN-LAST:event_itemUsuarioActionPerformed

    private void itemEditContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditContraActionPerformed
       CambioContra contra = new CambioContra(idUsuario);
       contra.setVisible(true);
       this.panelEscritorio.add(contra);
       contra.show();
    }//GEN-LAST:event_itemEditContraActionPerformed

    private void itemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSesionActionPerformed
       menuAlmacen.setEnabled(false);
       menuUsuario.setEnabled(false);
       menuVentas.setEnabled(false);
       menunCompras.setEnabled(false);
       MenuBitacora.setEnabled(false);
       jMenuExportar.setEnabled(false);
       
       itemCerrarSesion.setEnabled(false);
       itemIniciarSesion.setEnabled(true);
    }//GEN-LAST:event_itemCerrarSesionActionPerformed

    private void itemIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIniciarSesionActionPerformed
       InicioSesion inicio = new InicioSesion();
       inicio.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_itemIniciarSesionActionPerformed

    private void jMenuItemExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExportarActionPerformed
       ExportarBD exportar = new ExportarBD();
       exportar.setVisible(true);
       this.panelEscritorio.add(exportar);
       exportar.show();
        
        
    }//GEN-LAST:event_jMenuItemExportarActionPerformed

    private void MenuItemBitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemBitacoraActionPerformed
       Bitacoratxt bitacora = new Bitacoratxt();
       bitacora.abrirBitacora();
    }//GEN-LAST:event_MenuItemBitacoraActionPerformed

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
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuBitacora;
    private javax.swing.JMenuItem MenuItemBitacora;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem itemCerrarSesion;
    private javax.swing.JMenuItem itemCliente;
    private javax.swing.JMenuItem itemCompra;
    private javax.swing.JMenuItem itemDeudas;
    private javax.swing.JMenuItem itemDeudores;
    private javax.swing.JMenuItem itemEditContra;
    private javax.swing.JMenuItem itemIniciarSesion;
    private javax.swing.JMenuItem itemMaterial;
    private javax.swing.JMenuItem itemProducto;
    private javax.swing.JMenuItem itemProveedor;
    private javax.swing.JMenuItem itemUsuario;
    private javax.swing.JMenuItem itemVenta;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuExportar;
    private javax.swing.JMenuItem jMenuItemExportar;
    private javax.swing.JMenu menuAlmacen;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenu menuVentas;
    private javax.swing.JMenu menunCompras;
    private javax.swing.JDesktopPane panelEscritorio;
    // End of variables declaration//GEN-END:variables
}
