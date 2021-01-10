package mx.com.dmssoftware.menuMP;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import mx.com.dmssoftware.dependencias.TextPrompt;
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
        btnMedico.setBackground(new Color(0,67,97));
        btnUsuario.setBackground(new Color(0,67,97));
        btnInformacionNoticial.setBackground(new Color(0,67,97));
        btnSalir.setBackground(new Color(0,67,97));
       // btnMedico.setBackground(new Color(0,67,97));
      // btnMedico.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\Cuadernos Virtuales 6to Semestre\\IngenieriaDeSoftware\\ProyectoFinal_JAVA\\DMS_Software\\src\\main\\java\\Imagenes\\medico.png"));
      // btnMedico.setIcon(setIcono("C:\\Users\\dell\\Desktop\\Cuadernos Virtuales 6to Semestre\\IngenieriaDeSoftware\\ProyectoFinal_JAVA\\DMS_Software\\src\\main\\java\\Imagenes\\save.png",btnMedico));
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
        btnUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 67, 97));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(208, 247, 255), new java.awt.Color(208, 247, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(208, 247, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(208, 247, 255));
        jLabel2.setText("DMS-SOFTWARE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleName("INFORMACION GENERAL");

        btnMedico.setBackground(new java.awt.Color(0, 67, 97));
        btnMedico.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnMedico.setForeground(new java.awt.Color(208, 247, 255));
        btnMedico.setText("Médico");
        btnMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 234, 239), 3));
        btnMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 180, 110));

        btnInformacionNoticial.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnInformacionNoticial.setForeground(new java.awt.Color(208, 247, 255));
        btnInformacionNoticial.setText("Noticias");
        btnInformacionNoticial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 234, 239), 3));
        btnInformacionNoticial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionNoticialActionPerformed(evt);
            }
        });
        jPanel1.add(btnInformacionNoticial, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 150, 80));

        btnSalir.setBackground(new java.awt.Color(0, 67, 97));
        btnSalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(208, 247, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 234, 239), 3));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 80, 40));

        btnUsuario.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(208, 247, 255));
        btnUsuario.setText("Paciente");
        btnUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 234, 239), 3));
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 180, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
     *Método con evento para ir a la ventana de LoginMedico. 
     */
    private void btnMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicoActionPerformed
        ClaveLogin loginMedico = new ClaveLogin();
        loginMedico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMedicoActionPerformed
    /*
     *Método con evento para ir a la ventana de MenuPaciente. 
     */
    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        MenuPaciente menuPaciente = new MenuPaciente();
        menuPaciente.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInformacionNoticialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionNoticialActionPerformed
        Informacion info = new Informacion();
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInformacionNoticialActionPerformed

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
    
//    public final Icon setIcono(String url, JButton boton){
//       // ImageIcon icon = new ImageIcon(getClass().getResource(url));
//        //ImageIcon icon = new ImageIcon("src\\resources\\img\\fondo.jpg".replace("\\", "/"));
//        int ancho = boton.getWidth();
//        int alto = boton.getHeight();
//        
//        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
//        return icon;
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformacionNoticial;
    private javax.swing.JButton btnMedico;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
