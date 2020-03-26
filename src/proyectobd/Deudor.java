/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Deudor extends javax.swing.JFrame {

    private String localhost = "localhost",puerto = "3305",baseDeDatos = "proyectobd3",usuario ="root",contra = "xela2020";
    ButtonGroup grupoDeRadio;
    public Deudor() {
        initComponents();
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Deudores");
        grupoDeRadio = new ButtonGroup();
        grupoDeRadio.add(radioSaldado);
        grupoDeRadio.add(radioDeudor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogDetalle = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAbonos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        botonCargar = new javax.swing.JToggleButton();
        txtCargar = new javax.swing.JTextField();
        botonAbono = new javax.swing.JButton();
        botonDetalle = new javax.swing.JButton();
        radioDeudor = new javax.swing.JRadioButton();
        radioSaldado = new javax.swing.JRadioButton();

        dialogDetalle.setSize(new java.awt.Dimension(775, 430));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaAbonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaAbonos);

        jLabel1.setText("Abonos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaProductos);

        jLabel2.setText("Productos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel2)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dialogDetalleLayout = new javax.swing.GroupLayout(dialogDetalle.getContentPane());
        dialogDetalle.getContentPane().setLayout(dialogDetalleLayout);
        dialogDetalleLayout.setHorizontalGroup(
            dialogDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogDetalleLayout.setVerticalGroup(
            dialogDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogDetalleLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(dialogDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaHistorial);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botonCargar.setText("Cargar");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        botonAbono.setText("Abono");
        botonAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbonoActionPerformed(evt);
            }
        });

        botonDetalle.setText("Detalle");
        botonDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDetalleActionPerformed(evt);
            }
        });

        radioDeudor.setText("Deudores");

        radioSaldado.setText("Saldado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioDeudor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSaldado, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonDetalle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAbono, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAbono)
                    .addComponent(radioDeudor))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonDetalle)
                            .addComponent(radioSaldado))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private String fecha(){
    LocalDate fecha1 = LocalDate.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return fecha1.format(dtf);
    }
    private void cargarTabla(String consulta, String txt, String nombre, String id, String extra, JTable tabla, String[] titulo){
    String campo = txt;
        String where = "";
        if(!"".equals(campo)){
            System.out.println(campo);
            where = "WHERE "+id+ "= "+campo+" OR "+nombre+"= '"+campo+"'";
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
private void cargarTablaDialog( String consulta, String[]titulo,JTable tabla){
     try {
         DefaultTableModel modelo = new DefaultTableModel(null,titulo);
         tabla.setModel(modelo);
         ConexionMySQL conexion = new ConexionMySQL(localhost,puerto,baseDeDatos,usuario,contra);
         conexion.EjecutarConsulta(consulta);
            
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
 private String getIdPago(){//retorna el id del ultimo pago
        String id = "";
       try {
            ConexionMySQL conexion = new ConexionMySQL(localhost,puerto,baseDeDatos,usuario,contra);
            conexion.EjecutarConsulta("SELECT MAX(id)As ultimo FROM pago");
            ResultSet rs = conexion.getResulSet();
            while(rs.next()){
                id = rs.getString("ultimo");
            }
            
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
        return id;
    }
private void nuevoPago(String id_cliente,float abono){
        ConexionMySQL conexion = new ConexionMySQL(localhost,puerto,baseDeDatos,usuario,contra);
       conexion.EjecutarInstruccion("INSERT INTO pago(abono,cliente_id, fecha)\n" +
       "VALUES ("+abono+","+id_cliente+",'"+fecha()+"')");
        
    }
private void relacionPagoFactura(String id_factura,String id_Pago){
        ConexionMySQL conexion = new ConexionMySQL(localhost,puerto,baseDeDatos,usuario,contra);
       conexion.EjecutarInstruccion("INSERT INTO factura_has_pago(factura_id,pago_id)\n" +
       "VALUES ("+id_factura+","+id_Pago+")");
    }
    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
      String[] titulo = {"Id Factura","Id cliente","Fecha","Total","Pagos","Importe"};
      String consulta;
      consulta = "SELECT F.id AS idFactura,C.id As cliente1,F.fecha,F.total As total, COUNT(P.id) AS numBonos,SUM(P.abono)suma FROM factura_has_pago FP\n" +
"INNER JOIN factura F ON FP.factura_id = F.id\n" +
"INNER JOIN pago P ON FP.pago_id = P.id   \n" +
"INNER JOIN cliente C ON F.cliente_id = C.id ";
        if(radioDeudor.isSelected()){
      cargarTabla(consulta, txtCargar.getText(),"C.nit","C.id","GROUP BY F.id HAVING total > suma", tablaHistorial, titulo); 
      botonAbono.setEnabled(true);
      }
      if(radioSaldado.isSelected()){
          cargarTabla(consulta,txtCargar.getText(),"C.nit","C.id" , "GROUP BY F.id HAVING total <= suma", tablaHistorial, titulo);
          botonAbono.setEnabled(false);
      }
        
    }//GEN-LAST:event_botonCargarActionPerformed

    private void botonDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDetalleActionPerformed
        int fila = tablaHistorial.getSelectedRow();
        if(fila>=0){
            String idFactura = String.valueOf(tablaHistorial.getValueAt(fila,0)), consulta1, consulta2;
           String[] tituloAbonos = {"Id","Abono","Fecha"}, tituloProducto = {"Id","Nombre","Cantidad","Precio","Total"};
        consulta1 = "SELECT P.id,P.abono,P.fecha  FROM factura_has_pago FP\n" +
"INNER JOIN factura F ON FP.factura_id = F.id\n" +
"INNER JOIN pago P ON FP.pago_id = P.id   \n" +
"INNER JOIN cliente C ON F.cliente_id = C.id WHERE F.id ="+ idFactura+"\n" +
"GROUP BY P.id";
            cargarTablaDialog(consulta1, tituloAbonos, tablaAbonos);
            consulta2 = "SELECT P.id, P.nombre,D.cantidad,D.precio,D.total FROM detalle_pro D\n" +
"INNER JOIN factura F ON D.factura_id = F.id\n" +
"INNER JOIN producto P ON D.producto_id = P.id WHERE F.id = "+idFactura;
            cargarTablaDialog(consulta2, tituloProducto, tablaProductos);
            dialogDetalle.setVisible(true);
            dialogDetalle.setLocationRelativeTo(null);
            dialogDetalle.setTitle("Detalle Factura");
        
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione un registro","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_botonDetalleActionPerformed

    private void botonAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbonoActionPerformed
        int fila = tablaHistorial.getSelectedRow();
        float abono1,totalPagado, total, cambio = 0;
        String idCliente, idFactura, idPago;
        if(fila>=0){
            String abono = JOptionPane.showInputDialog("Ingrese cuanto se abonara");
            if(abono!=null){
                try {
                abono1 =  Float.parseFloat(abono);
                
                idFactura = String.valueOf(tablaHistorial.getValueAt(fila,0));
                idCliente = String.valueOf(tablaHistorial.getValueAt(fila,1));
                totalPagado = Float.parseFloat(String.valueOf(tablaHistorial.getValueAt(fila,5)));
                total = Float.parseFloat(String.valueOf(tablaHistorial.getValueAt(fila,3)));
                if(total<=(abono1+totalPagado)){
                    cambio = (abono1+totalPagado)-total;
                }
                nuevoPago(idCliente, abono1);//hacemos un nuevo pago
                idPago = getIdPago();//obtenemos el id del ultimo pago
                relacionPagoFactura(idFactura, idPago);//relacionamos el pago con la factura 
                JOptionPane.showMessageDialog(rootPane,"El abono se aplico a la factura\n"+"Cambio: "+cambio);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Ingrese solo digitos","Alerta",JOptionPane.WARNING_MESSAGE);
            }
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Ingrese un digito","Alerta",JOptionPane.WARNING_MESSAGE);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Seleccione un registro","Mensaje",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonAbonoActionPerformed

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
            java.util.logging.Logger.getLogger(Deudor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deudor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deudor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deudor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deudor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAbono;
    private javax.swing.JToggleButton botonCargar;
    private javax.swing.JButton botonDetalle;
    private javax.swing.JDialog dialogDetalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton radioDeudor;
    private javax.swing.JRadioButton radioSaldado;
    private javax.swing.JTable tablaAbonos;
    private javax.swing.JTable tablaHistorial;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCargar;
    // End of variables declaration//GEN-END:variables
}
