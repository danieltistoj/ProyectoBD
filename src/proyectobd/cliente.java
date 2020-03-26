package proyectobd;

import com.sun.corba.se.spi.monitoring.StatisticsAccumulator;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USUARIO
 */
public class cliente extends javax.swing.JFrame {
    private String localhost = "localhost",puerto = "3307",baseDeDatos = "proyectobd3",usuario ="root",contra = "";

    public cliente() {
        initComponents();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("cliente");
       
        limpiar();
//       
//        bloquear();
////        cargar();
    }
    
    private void cargarTabla(String consulta, String id, String nombre, String apellido, String nit,String correo,String  Valor, String extra, JTable tabla, String[] titulo){
    
        String where = "SELECT * FROM cliente where nom_cli LIKE '%"+Valor+"%'";
               where = "WHERE "+id+ "= "+nombre+" "+apellido+" "+nit+" "+correo+" ";
        
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
//    void cargar (){
//    String [] titulos={"id","nombre","apellido","nit","telefono","correp"};
//    String [] registros = new String[6];
//    
//    String sql = "SELECT * FROM cliente";
//    
//    model = new DefaultTableModel(null, titulos);
//    
//    ConexionMySQL cc = new ConexionMySQL("localhost","3007", "proyectobd3", "root","");
//    Connection cn = cc.getConexion();
//   
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            
//            while (rs.next()) {
//                registros[0] = rs.getString("id");
//                registros[1] = rs.getString("nombre");
//                registros[2] = rs.getString("apellido");
//                registros[3] = rs.getString("nit");
//                registros[4] = rs.getString("telefono");
//                registros[5] = rs.getString("correo");
//                model.addRow(registros);
//                }
//                t_datos.setModel(model);
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//        
//    
//    }
//    
    void limpiar(){
        t_nom.setText("");
        t_ape.setText("");
        t_nit.setText("");
        t_tel.setText("");
        t_correo.setText("");
    }
    
    void bloquear(){
        t_nom.setEnabled(false);
        t_ape.setEnabled(false);
        t_nit.setEnabled(false);
        t_tel.setEnabled(false);
        t_correo.setEnabled(false);
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    }
    
    
     void desbloquear(){
        t_nom.setEnabled(true);
        t_ape.setEnabled(true);
        t_nit.setEnabled(true);
        t_tel.setEnabled(true);
        t_correo.setEnabled(true);
        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t_ape = new javax.swing.JTextField();
        t_nom = new javax.swing.JTextField();
        t_nit = new javax.swing.JTextField();
        t_tel = new javax.swing.JTextField();
        t_correo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        aux = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setForeground(new java.awt.Color(255, 204, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\tecni.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("    INGRESO DE CLIENTES");

        t_ape.setText("jTextField1");
        t_ape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_apeActionPerformed(evt);
            }
        });

        t_nom.setText("jTextField1");
        t_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nomActionPerformed(evt);
            }
        });

        t_nit.setText("jTextField1");
        t_nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nitActionPerformed(evt);
            }
        });

        t_tel.setText("jTextField1");
        t_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_telActionPerformed(evt);
            }
        });

        t_correo.setText("jTextField1");
        t_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_correoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("          APELLIDO");

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("                 NIT");

        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("          TELEFONO");

        jLabel6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("          CORREO");

        jLabel7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("          NOMBRE");

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setFont(new java.awt.Font("Cooper Black", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 102));
        jButton2.setFont(new java.awt.Font("Cooper Black", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("GUARDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 102));
        jButton4.setFont(new java.awt.Font("Cooper Black", 0, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 102));
        jButton4.setText("SALIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 102));
        jButton3.setFont(new java.awt.Font("Cooper Black", 0, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setText("CANCELAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(t_datos);

        jLabel8.setBackground(new java.awt.Color(255, 102, 0));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("  BUSCAR");

        aux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auxActionPerformed(evt);
            }
        });
        aux.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                auxKeyReleased(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setText("MOSTRAR TODO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_ape, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_nit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_tel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_correo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_nom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        desbloquear();
        t_nom.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        bloquear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void t_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nomActionPerformed
        t_nom.transferFocus();
    }//GEN-LAST:event_t_nomActionPerformed

    private void t_apeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_apeActionPerformed
        t_ape.transferFocus();
    }//GEN-LAST:event_t_apeActionPerformed

    private void t_nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nitActionPerformed
        t_nit.transferFocus();
    }//GEN-LAST:event_t_nitActionPerformed

    private void t_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_telActionPerformed
        t_tel.transferFocus();
    }//GEN-LAST:event_t_telActionPerformed

    private void t_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_correoActionPerformed
        t_correo.transferFocus();
    }//GEN-LAST:event_t_correoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ConexionMySQL cc = new ConexionMySQL(localhost,puerto,baseDeDatos,usuario,contra);
        Connection cn = cc.getConexion();
        String nom, ape, nit, tel, correo;
        String sql = ""; // variable sentencia sql
        nom = t_nom.getText();
        ape = t_ape.getText();
        nit = t_nit.getText();
        tel = t_tel.getText();
        correo = t_correo.getText();
        sql = "INSERT INTO cliente (nom_cli, ape_cli, nit_cli, tel_cli, correo_cli) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, nom);
            pst.setString(2, ape);
            pst.setString(3, nit);
            pst.setString(4, tel);
            pst.setString(5, correo);
            int n=pst.executeUpdate();//hacer que una variable se guarde los registros el resultado de los registros 
            if(n > 0){
                JOptionPane.showMessageDialog(null, "Registros Guardados con Exito");
                bloquear();
            }          
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void auxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_auxActionPerformed

    private void auxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxKeyReleased
       //cargarTabla (aux.getText());
               
    }//GEN-LAST:event_auxKeyReleased

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
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aux;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_ape;
    private javax.swing.JTextField t_correo;
    private javax.swing.JTable t_datos;
    private javax.swing.JTextField t_nit;
    private javax.swing.JTextField t_nom;
    private javax.swing.JTextField t_tel;
    // End of variables declaration//GEN-END:variables
}
