package mx.com.dmssoftware.ventanasPacientes;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Random;

import javax.swing.JOptionPane;
import mx.com.dmssoftware.conexionBD.CerrarVentana;
import mx.com.dmssoftware.conexionBD.ConexionBD;
import mx.com.dmssoftware.dependencias.TextPrompt;
import mx.com.dmssoftware.menuMP.MenuPrincipal;

/**
 *
 * @author Joseph
 */
public class MenuPaciente extends javax.swing.JFrame {

    ConexionBD cc = new ConexionBD();
    Connection conn = cc.conexion();

    /**
     * Creates new form MenuPaciente
     */
    public MenuPaciente() {
        initComponents();
        
        btnSalir.setBackground(new Color(0,67,97));
        btnMenuPrincipal.setBackground(new Color(0,67,97));
        btnRegistroPaciente.setBackground(new Color(0,67,97));
        btnSolicitarCita.setBackground(new Color(0,67,97));
      //JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente");
        aceptarOpcion();
        agregarTextoPrompt();

        this.setLocationRelativeTo(null);
    }

    private void aceptarOpcion() {
        jComboBoxGenero.addItem("Masculino");
        jComboBoxGenero.addItem("Femenino");

        jComboBoxTipoSangre.addItem("A+");
        jComboBoxTipoSangre.addItem("A-");
        jComboBoxTipoSangre.addItem("B+");
        jComboBoxTipoSangre.addItem("B-");
        jComboBoxTipoSangre.addItem("AB+");
        jComboBoxTipoSangre.addItem("AB-");
        jComboBoxTipoSangre.addItem("O+");
        jComboBoxTipoSangre.addItem("O-");

        jComboBoxAlergias.addItem("Si");
        jComboBoxAlergias.addItem("No");

        jComboBoxMotivoCita.addItem("Dolor de (Garganta*, Musculos*, Cabeza*, Estómago, Oído*)");
        jComboBoxMotivoCita.addItem("Suturas");
        jComboBoxMotivoCita.addItem("Checado de presión");
        jComboBoxMotivoCita.addItem("Consulta general");
        jComboBoxMotivoCita.addItem("Inyección");
        jComboBoxMotivoCita.addItem("Planificación familiar");
        jComboBoxMotivoCita.addItem("Nebulizaciones");
        jComboBoxMotivoCita.addItem("Curaciones");
        jComboBoxMotivoCita.addItem("Lavado óptico");
        jComboBoxMotivoCita.addItem("Prueba de nivel de azúcar (Glucosa)");

    }

    private void agregarTextoPrompt() {
        TextPrompt nombreP = new TextPrompt("Ingrese su nombres...", txtNombresPaciente);
        TextPrompt apellidoPP = new TextPrompt("Ingrese su apellido paterno...", txtApPaternoPaciente);
        TextPrompt apellidoMP = new TextPrompt("Ingrese su apellido materno...", txtApMaternoPaciente);
        TextPrompt fechaNacP = new TextPrompt("Año-Mes-Dia (Sin comillas)", txtFechaNacPaciente);
        TextPrompt lugarNacP = new TextPrompt("Ingrese su lugar de nacimineto...", txtLugarNacPaciente);
        // TextPrompt tipoSangreP  = new TextPrompt("Ingrese su tipo de sangre...", txtTipoSangrePaciente);
        // TextPrompt alergiaP  = new TextPrompt("Ingrese sus alergias separadas por coma...", txtAlergiaPaciente);

        TextPrompt nombrePCita = new TextPrompt("Ingrese un nombre...", txtNombresPCita);
        TextPrompt apellidoPCita = new TextPrompt("Ingrese un apellido...", txtApellidoPCita);
        TextPrompt idCita = new TextPrompt("Número de cita", txtIDCita);

    }

    private void registrarPaciente() {

        String genero = jComboBoxGenero.getSelectedItem().toString();
        String tipoSangre = jComboBoxTipoSangre.getSelectedItem().toString();
        String alergia = jComboBoxAlergias.getSelectedItem().toString();

        String sql = "INSERT INTO registro_pacientes (nombrePaciente,apellidoPaternoP,apellidoMaternoP,fechaNacPaciente,lugarNacPaciente,generoPaciente,tipoSangrePaciente,alergiaPaciente) VALUES (?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, txtNombresPaciente.getText());
            pst.setString(2, txtApPaternoPaciente.getText());
            pst.setString(3, txtApMaternoPaciente.getText());
            pst.setString(4, txtFechaNacPaciente.getText());
            pst.setString(5, txtLugarNacPaciente.getText());
            pst.setString(6, genero);
            pst.setString(7, tipoSangre);
            pst.setString(8, alergia);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha registrado al paciente...");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de registro" + ex.getMessage());
        }
    }

    private void registrarCitaMedica() {
        String fechaCita = jDateChooser1.getDate().toString();
        String motivoCita = jComboBoxMotivoCita.getSelectedItem().toString();

        Random random = new Random(System.currentTimeMillis());
        Integer numAleatorio = random.nextInt(300);

        String idCita = numAleatorio.toString();

        String sql = "INSERT INTO citas_medicas (nombrePaciente,apellidoPaciente,motivoCita,fechaCita,numCita) VALUES (?,?,?,?,?);";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, txtNombresPCita.getText());
            pst.setString(2, txtApellidoPCita.getText());
            //pst.setString(3, txtIDCita.getText());
            pst.setString(3, motivoCita);
            pst.setString(4, fechaCita);
            pst.setString(5, idCita);

            txtIDCita.setText(idCita);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha registrado al paciente...");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de cita" + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanelRegistroPaciente = new javax.swing.JPanel();
        jPanelRegistroPaciente1 = new javax.swing.JPanel();
        jComboBoxTipoSangre = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxAlergias = new javax.swing.JComboBox<>();
        btnRegistroPaciente = new javax.swing.JButton();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtLugarNacPaciente = new javax.swing.JTextField();
        txtNombresPaciente = new javax.swing.JTextField();
        txtApPaternoPaciente = new javax.swing.JTextField();
        txtApMaternoPaciente = new javax.swing.JTextField();
        txtFechaNacPaciente = new javax.swing.JTextField();
        jPanelCitaPaciente = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnSolicitarCita = new javax.swing.JButton();
        jComboBoxMotivoCita = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtNombresPCita = new javax.swing.JTextField();
        txtIDCita = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtApellidoPCita = new javax.swing.JTextField();
        btnMenuPrincipal = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 67, 97));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 67, 97));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(47, 205, 255), 3));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(208, 247, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(208, 247, 255));
        jLabel2.setText("PACIENTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(208, 247, 255), new java.awt.Color(208, 247, 255)));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setToolTipText("");
        jTabbedPane2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        jPanelRegistroPaciente.setBackground(new java.awt.Color(133, 221, 246));
        jPanelRegistroPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(133, 221, 246)));

        jPanelRegistroPaciente1.setBackground(new java.awt.Color(133, 221, 246));
        jPanelRegistroPaciente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(47, 205, 255), 3));
        jPanelRegistroPaciente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxTipoSangre.setBackground(new java.awt.Color(208, 247, 255));
        jComboBoxTipoSangre.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jComboBoxTipoSangre.setForeground(new java.awt.Color(0, 154, 148));
        jComboBoxTipoSangre.setToolTipText("");
        jComboBoxTipoSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoSangreActionPerformed(evt);
            }
        });
        jPanelRegistroPaciente1.add(jComboBoxTipoSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 170, 29));
        jPanelRegistroPaciente1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 422, 116, -1));

        jComboBoxAlergias.setBackground(new java.awt.Color(208, 247, 255));
        jComboBoxAlergias.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jComboBoxAlergias.setForeground(new java.awt.Color(0, 154, 148));
        jComboBoxAlergias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlergiasActionPerformed(evt);
            }
        });
        jPanelRegistroPaciente1.add(jComboBoxAlergias, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 170, 31));

        btnRegistroPaciente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRegistroPaciente.setForeground(new java.awt.Color(208, 247, 255));
        btnRegistroPaciente.setText("Registrarse");
        btnRegistroPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 234, 239), 3));
        btnRegistroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroPacienteActionPerformed(evt);
            }
        });
        jPanelRegistroPaciente1.add(btnRegistroPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 140, 40));

        jComboBoxGenero.setBackground(new java.awt.Color(208, 247, 255));
        jComboBoxGenero.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jComboBoxGenero.setForeground(new java.awt.Color(0, 154, 148));
        jComboBoxGenero.setToolTipText("");
        jComboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGeneroActionPerformed(evt);
            }
        });
        jPanelRegistroPaciente1.add(jComboBoxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 170, 29));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 154, 148));
        jLabel7.setText("Nombre(s):");
        jLabel7.setToolTipText("");
        jPanelRegistroPaciente1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 183, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 154, 148));
        jLabel20.setText("Apellido Materno");
        jLabel20.setToolTipText("");
        jPanelRegistroPaciente1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 154, 148));
        jLabel21.setText("Fec. Nac.");
        jLabel21.setToolTipText("");
        jPanelRegistroPaciente1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 183, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 154, 148));
        jLabel22.setText("Apellido Paterno");
        jLabel22.setToolTipText("");
        jPanelRegistroPaciente1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 183, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 154, 148));
        jLabel23.setText("Género");
        jLabel23.setToolTipText("");
        jPanelRegistroPaciente1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 96, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 154, 148));
        jLabel24.setText("Tipo de sangre");
        jLabel24.setToolTipText("");
        jPanelRegistroPaciente1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 170, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 154, 148));
        jLabel25.setText("Ciudad");
        jLabel25.setToolTipText("");
        jPanelRegistroPaciente1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 183, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 154, 148));
        jLabel26.setText("¿Padece alergias?");
        jLabel26.setToolTipText("");
        jPanelRegistroPaciente1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 194, -1));

        txtLugarNacPaciente.setBackground(new java.awt.Color(208, 247, 255));
        txtLugarNacPaciente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtLugarNacPaciente.setForeground(new java.awt.Color(0, 154, 148));
        txtLugarNacPaciente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLugarNacPaciente.setToolTipText("");
        txtLugarNacPaciente.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(208, 247, 255), new java.awt.Color(208, 247, 255)));
        txtLugarNacPaciente.setCaretColor(new java.awt.Color(0, 154, 148));
        txtLugarNacPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLugarNacPaciente.setName(""); // NOI18N
        txtLugarNacPaciente.setOpaque(false);
        jPanelRegistroPaciente1.add(txtLugarNacPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 260, 30));

        txtNombresPaciente.setBackground(new java.awt.Color(208, 247, 255));
        txtNombresPaciente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtNombresPaciente.setForeground(new java.awt.Color(0, 154, 148));
        txtNombresPaciente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombresPaciente.setToolTipText("");
        txtNombresPaciente.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(208, 247, 255), new java.awt.Color(208, 247, 255)));
        txtNombresPaciente.setCaretColor(new java.awt.Color(0, 154, 148));
        txtNombresPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombresPaciente.setName(""); // NOI18N
        txtNombresPaciente.setOpaque(false);
        jPanelRegistroPaciente1.add(txtNombresPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 260, 30));

        txtApPaternoPaciente.setBackground(new java.awt.Color(208, 247, 255));
        txtApPaternoPaciente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtApPaternoPaciente.setForeground(new java.awt.Color(0, 154, 148));
        txtApPaternoPaciente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApPaternoPaciente.setToolTipText("");
        txtApPaternoPaciente.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(208, 247, 255), new java.awt.Color(208, 247, 255)));
        txtApPaternoPaciente.setCaretColor(new java.awt.Color(0, 154, 148));
        txtApPaternoPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtApPaternoPaciente.setName(""); // NOI18N
        txtApPaternoPaciente.setOpaque(false);
        jPanelRegistroPaciente1.add(txtApPaternoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 260, 30));

        txtApMaternoPaciente.setBackground(new java.awt.Color(208, 247, 255));
        txtApMaternoPaciente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtApMaternoPaciente.setForeground(new java.awt.Color(0, 154, 148));
        txtApMaternoPaciente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApMaternoPaciente.setToolTipText("");
        txtApMaternoPaciente.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(208, 247, 255), new java.awt.Color(208, 247, 255)));
        txtApMaternoPaciente.setCaretColor(new java.awt.Color(0, 154, 148));
        txtApMaternoPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtApMaternoPaciente.setName(""); // NOI18N
        txtApMaternoPaciente.setOpaque(false);
        jPanelRegistroPaciente1.add(txtApMaternoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 260, 30));

        txtFechaNacPaciente.setBackground(new java.awt.Color(208, 247, 255));
        txtFechaNacPaciente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtFechaNacPaciente.setForeground(new java.awt.Color(0, 154, 148));
        txtFechaNacPaciente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFechaNacPaciente.setToolTipText("");
        txtFechaNacPaciente.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(208, 247, 255), new java.awt.Color(208, 247, 255)));
        txtFechaNacPaciente.setCaretColor(new java.awt.Color(0, 154, 148));
        txtFechaNacPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFechaNacPaciente.setName(""); // NOI18N
        txtFechaNacPaciente.setOpaque(false);
        jPanelRegistroPaciente1.add(txtFechaNacPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 260, 30));

        javax.swing.GroupLayout jPanelRegistroPacienteLayout = new javax.swing.GroupLayout(jPanelRegistroPaciente);
        jPanelRegistroPaciente.setLayout(jPanelRegistroPacienteLayout);
        jPanelRegistroPacienteLayout.setHorizontalGroup(
            jPanelRegistroPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRegistroPaciente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelRegistroPacienteLayout.setVerticalGroup(
            jPanelRegistroPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRegistroPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Registrarse", jPanelRegistroPaciente);

        jPanelCitaPaciente.setBackground(new java.awt.Color(133, 221, 246));
        jPanelCitaPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDateChooser1.setBackground(new java.awt.Color(208, 247, 255));
        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 148), 3));
        jPanelCitaPaciente.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 260, 40));

        btnSolicitarCita.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSolicitarCita.setForeground(new java.awt.Color(208, 247, 255));
        btnSolicitarCita.setText("Solicitar");
        btnSolicitarCita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 234, 239), 3));
        btnSolicitarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarCitaActionPerformed(evt);
            }
        });
        jPanelCitaPaciente.add(btnSolicitarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 90, 30));

        jComboBoxMotivoCita.setBackground(new java.awt.Color(208, 247, 255));
        jComboBoxMotivoCita.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jComboBoxMotivoCita.setForeground(new java.awt.Color(0, 154, 148));
        jPanelCitaPaciente.add(jComboBoxMotivoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 410, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 154, 148));
        jLabel8.setText("Nombre(s):");
        jLabel8.setToolTipText("");
        jPanelCitaPaciente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 140, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 154, 148));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel27.setText("Id. Cita");
        jLabel27.setToolTipText("");
        jPanelCitaPaciente.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 80, -1));

        txtNombresPCita.setBackground(new java.awt.Color(208, 247, 255));
        txtNombresPCita.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtNombresPCita.setForeground(new java.awt.Color(0, 154, 148));
        txtNombresPCita.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombresPCita.setToolTipText("");
        txtNombresPCita.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(208, 247, 255), new java.awt.Color(208, 247, 255)));
        txtNombresPCita.setCaretColor(new java.awt.Color(0, 154, 148));
        txtNombresPCita.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombresPCita.setName(""); // NOI18N
        txtNombresPCita.setOpaque(false);
        jPanelCitaPaciente.add(txtNombresPCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 260, 30));

        txtIDCita.setBackground(new java.awt.Color(208, 247, 255));
        txtIDCita.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtIDCita.setForeground(new java.awt.Color(0, 154, 148));
        txtIDCita.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIDCita.setToolTipText("");
        txtIDCita.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(208, 247, 255), new java.awt.Color(208, 247, 255)));
        txtIDCita.setCaretColor(new java.awt.Color(0, 154, 148));
        txtIDCita.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtIDCita.setEnabled(false);
        txtIDCita.setName(""); // NOI18N
        txtIDCita.setOpaque(false);
        jPanelCitaPaciente.add(txtIDCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 150, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 154, 148));
        jLabel9.setText("Ingresa una fecha de cita");
        jLabel9.setToolTipText("");
        jPanelCitaPaciente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 260, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 154, 148));
        jLabel10.setText("Motivo de cita:");
        jLabel10.setToolTipText("");
        jPanelCitaPaciente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 200, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 154, 148));
        jLabel28.setText("Apellido:");
        jLabel28.setToolTipText("");
        jPanelCitaPaciente.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, -1));

        txtApellidoPCita.setBackground(new java.awt.Color(208, 247, 255));
        txtApellidoPCita.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtApellidoPCita.setForeground(new java.awt.Color(0, 154, 148));
        txtApellidoPCita.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoPCita.setToolTipText("");
        txtApellidoPCita.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(208, 247, 255), new java.awt.Color(208, 247, 255)));
        txtApellidoPCita.setCaretColor(new java.awt.Color(0, 154, 148));
        txtApellidoPCita.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtApellidoPCita.setName(""); // NOI18N
        txtApellidoPCita.setOpaque(false);
        jPanelCitaPaciente.add(txtApellidoPCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 260, 30));

        jTabbedPane2.addTab("Solicitar cita", jPanelCitaPaciente);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 710, 410));

        btnMenuPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnMenuPrincipal.setForeground(new java.awt.Color(208, 247, 255));
        btnMenuPrincipal.setText("Menú");
        btnMenuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 234, 239), 3));
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 100, 40));

        btnSalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(208, 247, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 234, 239), 3));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        CerrarVentana cerrar = new CerrarVentana();
        cerrar.cerrarVentana();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jComboBoxTipoSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoSangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoSangreActionPerformed

    private void jComboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGeneroActionPerformed

    private void btnRegistroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroPacienteActionPerformed

        validarCamposRegistro();
    }//GEN-LAST:event_btnRegistroPacienteActionPerformed

    private void btnSolicitarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarCitaActionPerformed
        
        validarCamposCita();
    }//GEN-LAST:event_btnSolicitarCitaActionPerformed

    private void jComboBoxAlergiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlergiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAlergiasActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        MenuPrincipal menuP = new MenuPrincipal();
        menuP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnRegistroPaciente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSolicitarCita;
    private javax.swing.JComboBox<String> jComboBoxAlergias;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JComboBox<String> jComboBoxMotivoCita;
    private javax.swing.JComboBox<String> jComboBoxTipoSangre;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCitaPaciente;
    private javax.swing.JPanel jPanelRegistroPaciente;
    private javax.swing.JPanel jPanelRegistroPaciente1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField txtApMaternoPaciente;
    private javax.swing.JTextField txtApPaternoPaciente;
    private javax.swing.JTextField txtApellidoPCita;
    private javax.swing.JTextField txtFechaNacPaciente;
    private javax.swing.JTextField txtIDCita;
    private javax.swing.JTextField txtLugarNacPaciente;
    private javax.swing.JTextField txtNombresPCita;
    private javax.swing.JTextField txtNombresPaciente;
    // End of variables declaration//GEN-END:variables

    private void validarCamposRegistro() {
        if (txtNombresPaciente.getText().isEmpty() || txtApPaternoPaciente.getText().isEmpty() || txtApMaternoPaciente.getText().isEmpty()
                || txtFechaNacPaciente.getText().isEmpty() || txtLugarNacPaciente.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "No puede dejar campos sin completar");

        } else {
            
            registrarPaciente();
            limpiarCampos();
            
        }
    }

    private void limpiarCampos() {
        txtNombresPaciente.setText("");
        txtApPaternoPaciente.setText("");
        txtApMaternoPaciente.setText("");
        txtFechaNacPaciente.setText("");

    }

    private void validarCamposCita() {
        if (txtNombresPCita.getText().isEmpty() || txtApellidoPCita.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No puede dejar campos sin completar");
        }else{
           
            registrarCitaMedica();
             limpiarCamposCitas();
            
        }
      
    }

    private void limpiarCamposCitas() {
       txtNombresPCita.setText("");
       txtApellidoPCita.setText("");
    }
}
