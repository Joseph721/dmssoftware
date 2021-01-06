package mx.com.dmssoftware.menuMP;

import mx.com.dmssoftware.formularioMedico.LoginMedico;
import mx.com.dmssoftware.ventanasPacientes.MenuPaciente;

/**
 *
 * @author Joseph
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuInformacion
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnMedico = new javax.swing.JButton();
        btnInformacionNoticial = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnUsuario2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 67, 97));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(208, 247, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(208, 247, 255));
        jLabel2.setText("DMS-SOFTWARE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleName("INFORMACION GENERAL");

        btnMedico.setText("Médico");
        btnMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, 80));

        btnInformacionNoticial.setText("Noticias");
        jPanel1.add(btnInformacionNoticial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 140, 80));

        btnSalir.setText("Salir");
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        btnUsuario2.setText("Usuario");
        btnUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 140, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
     *Método con evento para ir a la ventana de LoginMedico. 
     */
    private void btnMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicoActionPerformed
        LoginMedico loginMedico = new LoginMedico();
        loginMedico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMedicoActionPerformed
    /*
     *Método con evento para ir a la ventana de MenuPaciente. 
     */
    private void btnUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario2ActionPerformed
        MenuPaciente menuPaciente = new MenuPaciente();
        menuPaciente.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnUsuario2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformacionNoticial;
    private javax.swing.JButton btnMedico;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuario2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
