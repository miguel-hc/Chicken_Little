
package View;
import Controller.AsignarRutaController;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AsignacionRutas extends javax.swing.JFrame {
   
    AsignarRutaController ruta = new AsignarRutaController();
    
    public AsignacionRutas(){
        initComponents();
        this.setLocationRelativeTo(this);
        try {
            getEmpleado();
            getRuta();
        } catch (SQLException ex) {
            Logger.getLogger(AsignacionRutas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsignacionRutas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AsignacionRutas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AsignacionRutas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void getEmpleado() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        jNombre.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        lista = ruta.ListarEmpleado();
        for (int i = 0; i<lista.size(); i ++){
            jNombre.addItem(lista.get(i));
        }
    }
    
    public void getRuta() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        jRuta.removeAllItems();
        ArrayList<String> listaRuta = new ArrayList<String>();
        listaRuta = ruta.ListarRuta();
        for (int i = 0; i<listaRuta.size(); i ++){
            jRuta.addItem(listaRuta.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jNombre = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRuta = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtGasto = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jfechaE = new com.toedter.calendar.JDateChooser();
        jFechaS = new com.toedter.calendar.JDateChooser();
        txtPrecio = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre Empleado:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete_64px.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 284, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 40));

        jNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, -1));

        jLabel2.setText("Ruta:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jRuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 120, -1));

        jLabel3.setText("Precio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel1.add(txtGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 120, -1));

        jLabel4.setText("Fecha Entrega:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel5.setText("Fecha salida:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel6.setText("Gasto total:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        btnSave.setBackground(new java.awt.Color(249, 168, 25));
        btnSave.setText("Agregar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));
        jPanel1.add(jfechaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));
        jPanel1.add(jFechaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        SimpleDateFormat fe = new SimpleDateFormat("yyy-MM-dd");
        SimpleDateFormat fs = new SimpleDateFormat("yyy-MM-dd");
        String nombre = (String) jNombre.getSelectedItem();
        String Ruta = (String) jRuta.getSelectedItem();
        int Precio = (int) txtPrecio.getPreviousValue() + 1;
        int Gasto = (int) txtGasto.getPreviousValue() + 1;
        String fe1 = fe.format(jfechaE.getDate());
        String fs1 = fs.format(jFechaS.getDate());
        if (!"".equals(fe1) && !"".equals(fs1)){
            try {
                ruta.AsignarRuta(nombre, Ruta, Precio, fe1, fs1, Gasto);
                JOptionPane.showMessageDialog(null, "Ruta asignada...");
            } catch (ClassNotFoundException ex) {
                //Logger.getLogger(AsignacionRutas.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("error1");
            } catch (InstantiationException ex) {
                //Logger.getLogger(AsignacionRutas.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("error2");
            } catch (IllegalAccessException ex) {
               //Logger.getLogger(AsignacionRutas.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println("error3");
            } catch (SQLException ex) {
                //Logger.getLogger(AsignacionRutas.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("error4");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No pueden quedar campos vacios...");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(AsignacionRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignacionRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignacionRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignacionRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignacionRutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSave;
    public com.toedter.calendar.JDateChooser jFechaS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JComboBox<String> jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JComboBox<String> jRuta;
    public com.toedter.calendar.JDateChooser jfechaE;
    public javax.swing.JSpinner txtGasto;
    public javax.swing.JSpinner txtPrecio;
    // End of variables declaration//GEN-END:variables
}
