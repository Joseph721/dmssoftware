package mx.com.dmssoftware.formularioMedico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import mx.com.dmssoftware.conexionBD.ConexionBD;

/**
 *
 * @author dell
 */
public class RegistroMedico extends javax.swing.JFrame {

    ConexionBD cc = new ConexionBD();
    Connection con = cc.conexion();

    /**
     * Creates new form RegistroMedico
     */
    public RegistroMedico() {
        initComponents();
        // miImagen2.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\Cuadernos Virtuales 6to Semestre\\IngenieriaDeSoftware\\ProyectoFinal_JAVA\\DMS_Software\\src\\main\\java\\Imagenes\\dms.png"));
     this.setLocationRelativeTo(null);
        //  btnRegistrar.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\Cuadernos Virtuales 6to Semestre\\IngenieriaDeSoftware\\ProyectoFinal_JAVA\\DMS_Software\\src\\main\\java\\Imagenes\\folder.png"));
    }

    public void agregarMedico() {
        
        
        String pass = String.valueOf(txtPassword.getPassword());
        String sql = "INSERT INTO registro_medicos (NombreMedico, ApellidoPaterno, ApellidoMaterno, DireccionMedico, TelefonoMedico, EmailMedico, PassMedico, EspecialidadMedico,Alergia) values(?,?,?,?,?,?,?,?,?);";

        
        try {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, txtNombres.getText());
            pst.setString(2, txtApellidoMaternoM.getText());
            pst.setString(3, txtApellidoMaternoM.getText());
            pst.setString(4, txtDireccion.getText());
            pst.setString(5, txtTelefono.getText());
            pst.setString(6, txtEmail.getText());
            pst.setString(7, pass);
            pst.setString(8, txtAreaEspecialidad.getText());
            pst.setString(9, txtAlergia.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha registrado al médico en la base de datos");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de registro" + ex.getMessage());
        }


//        if(txtNombres.getText().length()==0 && txtApellidos.getText().length()==0 && txtDireccion.getText().length()==0 &&  txtTelefono.getText().length()==0 &&
//                txtEmail.getText().length()==0 && txtPassword.getText().length()==0 && txtAreaEspecialidad.getText().length()==0 && txtAlergia.getText().length()==0){
//          
//            insertM();
//            
//        }else{
//            JOptionPane.showMessageDialog(null, "No puedes dejar campos vacíos.");
//        }
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidoMaternoM = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtAlergia = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtAreaEspecialidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtApellidoPaternoM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 67, 97));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(208, 247, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(208, 247, 255));
        jLabel2.setText("REGISTRO DE MÉDICO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(208, 247, 255));
        jLabel5.setText("Contraseña:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(208, 247, 255));
        jLabel6.setText("Apellido Materno:");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(208, 247, 255));
        jLabel7.setText("Nombre(s):");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(208, 247, 255));
        jLabel8.setText("Dirección:");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(208, 247, 255));
        jLabel9.setText("Alergia:");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(208, 247, 255));
        jLabel10.setText("Email:");
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        txtEmail.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 154, 148));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setToolTipText("Introduce tu email sin el dominio");
        txtEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEmail.setCaretColor(new java.awt.Color(0, 154, 148));
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.setName(""); // NOI18N
        txtEmail.setOpaque(false);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 190, 30));

        txtNombres.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 154, 148));
        txtNombres.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombres.setToolTipText("Introduce tu email sin el dominio");
        txtNombres.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombres.setCaretColor(new java.awt.Color(0, 154, 148));
        txtNombres.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombres.setName(""); // NOI18N
        txtNombres.setOpaque(false);
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 300, 30));

        txtApellidoMaternoM.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtApellidoMaternoM.setForeground(new java.awt.Color(0, 154, 148));
        txtApellidoMaternoM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoMaternoM.setToolTipText("Introduce tu email sin el dominio");
        txtApellidoMaternoM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellidoMaternoM.setCaretColor(new java.awt.Color(0, 154, 148));
        txtApellidoMaternoM.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtApellidoMaternoM.setName(""); // NOI18N
        txtApellidoMaternoM.setOpaque(false);
        jPanel1.add(txtApellidoMaternoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 300, 30));

        txtDireccion.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 154, 148));
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccion.setToolTipText("Introduce tu email sin el dominio");
        txtDireccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDireccion.setCaretColor(new java.awt.Color(0, 154, 148));
        txtDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDireccion.setName(""); // NOI18N
        txtDireccion.setOpaque(false);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 300, 30));

        txtAlergia.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtAlergia.setForeground(new java.awt.Color(0, 154, 148));
        txtAlergia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAlergia.setToolTipText("Introduce tu email sin el dominio");
        txtAlergia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAlergia.setCaretColor(new java.awt.Color(0, 154, 148));
        txtAlergia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAlergia.setName(""); // NOI18N
        txtAlergia.setOpaque(false);
        jPanel1.add(txtAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 300, 30));

        txtPassword.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 154, 148));
        txtPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPassword.setCaretColor(new java.awt.Color(0, 154, 148));
        txtPassword.setOpaque(false);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 190, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(208, 247, 255));
        jLabel11.setText("Teléfono:");
        jLabel11.setToolTipText("");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 154, 148));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefono.setToolTipText("Introduce tu email sin el dominio");
        txtTelefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTelefono.setCaretColor(new java.awt.Color(0, 154, 148));
        txtTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTelefono.setName(""); // NOI18N
        txtTelefono.setOpaque(false);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 300, 30));

        btnRegistrar.setBackground(new java.awt.Color(94, 215, 250));
        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 100, 30));

        btnRegresar.setBackground(new java.awt.Color(94, 215, 250));
        btnRegresar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnRegresar.setText("Regresar");
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 100, 30));

        btnSalir.setBackground(new java.awt.Color(94, 215, 250));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 100, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(208, 247, 255));
        jLabel12.setText("Especialidad:");
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        txtAreaEspecialidad.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtAreaEspecialidad.setForeground(new java.awt.Color(0, 154, 148));
        txtAreaEspecialidad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAreaEspecialidad.setToolTipText("Introduce tu email sin el dominio");
        txtAreaEspecialidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAreaEspecialidad.setCaretColor(new java.awt.Color(0, 154, 148));
        txtAreaEspecialidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAreaEspecialidad.setName(""); // NOI18N
        txtAreaEspecialidad.setOpaque(false);
        jPanel1.add(txtAreaEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 300, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(208, 247, 255));
        jLabel4.setText("@dmssoftware.com.mx");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(208, 247, 255));
        jLabel13.setText("Apellido Paterno:");
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtApellidoPaternoM.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtApellidoPaternoM.setForeground(new java.awt.Color(0, 154, 148));
        txtApellidoPaternoM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoPaternoM.setToolTipText("Introduce tu email sin el dominio");
        txtApellidoPaternoM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellidoPaternoM.setCaretColor(new java.awt.Color(0, 154, 148));
        txtApellidoPaternoM.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtApellidoPaternoM.setName(""); // NOI18N
        txtApellidoPaternoM.setOpaque(false);
        jPanel1.add(txtApellidoPaternoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        agregarMedico();
        LoginMedico login = new LoginMedico();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAlergia;
    private javax.swing.JTextField txtApellidoMaternoM;
    private javax.swing.JTextField txtApellidoPaternoM;
    private javax.swing.JTextField txtAreaEspecialidad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
