package mx.com.dmssoftware.ventanasPacientes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Random;

import javax.swing.JOptionPane;
import mx.com.dmssoftware.conexionBD.ConexionBD;
import mx.com.dmssoftware.dependencias.TextPrompt;




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
        
        aceptarOpcion();
        agregarTextoPrompt();
        
        
        
        this.setLocationRelativeTo(null);
    }
    
    private void aceptarOpcion(){
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
    
    
    
    private void agregarTextoPrompt(){
        TextPrompt nombreP  = new TextPrompt("Ingrese su nombres...", txtNombresPaciente);
        TextPrompt apellidoPP  = new TextPrompt("Ingrese su apellido paterno...", txtApPaternoPaciente);
        TextPrompt apellidoMP  = new TextPrompt("Ingrese su apellido materno...", txtApMaternoPaciente);
        TextPrompt fechaNacP  = new TextPrompt("Ingrese en formato dd/mm/aa...", txtFechaNacPaciente);
        TextPrompt lugarNacP  = new TextPrompt("Ingrese su lugar de nacimineto...", txtLugarNacPaciente);
        TextPrompt tipoSangreP  = new TextPrompt("Ingrese su tipo de sangre...", txtTipoSangrePaciente);
        TextPrompt alergiaP  = new TextPrompt("Ingrese sus alergias separadas por coma...", txtAlergiaPaciente);
        
        TextPrompt nombrePCita  = new TextPrompt("Ingrese un nombre...", txtNombresPCita);
        TextPrompt apellidoPCita  = new TextPrompt("Ingrese un apellido...", txtApellidoPCita);
        TextPrompt idCita  = new TextPrompt("Número de cita", txtNombresPCita);
        
        
    }
    
    private void registrarPaciente(){
      
        String genero = jComboBoxGenero.getSelectedItem().toString();
        String tipoSangre = jComboBoxTipoSangre.getSelectedItem().toString();
        String alergia = jComboBoxAlergias.getSelectedItem().toString();
        
        String sql = "INSERT INTO registropaciente (nombrePaciente,apellidoPaternoP,apellidoMaternoP,fechaNacPaciente,lugarNacPaciente,generoPaciente,tipoSangrePaciente,alergiaPaciente) VALUES (?,?,?,?,?,?,?,?);";
        
        try{
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
    private void registrarCitaMedica(){
        String fechaCita = jDateChooser1.getDate().toString();
        String motivoCita = jComboBoxMotivoCita.getSelectedItem().toString();
        
        Random random= new Random(System.currentTimeMillis());
        Integer numAleatorio = random.nextInt(150);
        
        String idCita = numAleatorio.toString();
        
        String sql = "INSERT INTO citasmedicas (nombrePaciente,apellidoPaciente,motivoCita,fechaCita,numCita) VALUES (?,?,?,?,?);";
        
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, txtNombresPCita.getText());
            pst.setString(2, txtApellidoPCita.getText());
            pst.setString(3, motivoCita);
            pst.setString(4, fechaCita);
            pst.setString(5, idCita);
            
            txtIDCita.setText(idCita);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha registrado al paciente...");
            
            
            
        }catch (Exception ex){
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxTipoSangre = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxAlergias = new javax.swing.JComboBox<>();
        btnRegistroPaciente = new javax.swing.JButton();
        txtNombresPaciente = new javax.swing.JTextField();
        txtApPaternoPaciente = new javax.swing.JTextField();
        txtApMaternoPaciente = new javax.swing.JTextField();
        txtFechaNacPaciente = new javax.swing.JTextField();
        txtLugarNacPaciente = new javax.swing.JTextField();
        txtAlergiaPaciente = new javax.swing.JTextField();
        txtTipoSangrePaciente = new javax.swing.JTextField();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jPanelCitaPaciente = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        txtNombresPCita = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtIDCita = new javax.swing.JTextField();
        btnSolicitarCita = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxMotivoCita = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtApellidoPCita = new javax.swing.JTextField();
        btnMenuPrincipal = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 67, 97));

        jPanel1.setBackground(new java.awt.Color(0, 67, 97));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(208, 247, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(208, 247, 255));
        jLabel2.setText("PACIENTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setToolTipText("");

        jPanelRegistroPaciente.setBackground(new java.awt.Color(133, 221, 246));
        jPanelRegistroPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(133, 221, 246)));

        jPanelRegistroPaciente1.setBackground(new java.awt.Color(133, 221, 246));
        jPanelRegistroPaciente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(133, 221, 246)));

        jLabel8.setText("Nombre(s)*");

        jLabel9.setText("Apellido Paterno*");

        jLabel10.setText("Apellido Materno*");

        jLabel11.setText("Fecha de nacimineto*");

        jLabel12.setText("Lugar de nacimiento*");

        jLabel13.setText("Género*");

        jComboBoxTipoSangre.setToolTipText("");
        jComboBoxTipoSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoSangreActionPerformed(evt);
            }
        });

        jLabel14.setText("Tipo de sangre");

        jLabel15.setText("¿Padece de alergias?*");

        btnRegistroPaciente.setText("Registrarse");
        btnRegistroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroPacienteActionPerformed(evt);
            }
        });

        jComboBoxGenero.setToolTipText("");
        jComboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistroPaciente1Layout = new javax.swing.GroupLayout(jPanelRegistroPaciente1);
        jPanelRegistroPaciente1.setLayout(jPanelRegistroPaciente1Layout);
        jPanelRegistroPaciente1Layout.setHorizontalGroup(
            jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroPaciente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelRegistroPaciente1Layout.createSequentialGroup()
                        .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelRegistroPaciente1Layout.createSequentialGroup()
                                    .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                    .addGap(106, 106, 106))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroPaciente1Layout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)))
                            .addGroup(jPanelRegistroPaciente1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)))
                        .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlergiaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApPaternoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombresPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApMaternoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaNacPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLugarNacPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoSangrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelRegistroPaciente1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanelRegistroPaciente1Layout.setVerticalGroup(
            jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroPaciente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombresPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtApPaternoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtApMaternoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtFechaNacPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtLugarNacPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTipoSangrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroPaciente1Layout.createSequentialGroup()
                        .addComponent(txtAlergiaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroPaciente1Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addGroup(jPanelRegistroPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jComboBoxAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(btnRegistroPaciente)
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout jPanelRegistroPacienteLayout = new javax.swing.GroupLayout(jPanelRegistroPaciente);
        jPanelRegistroPaciente.setLayout(jPanelRegistroPacienteLayout);
        jPanelRegistroPacienteLayout.setHorizontalGroup(
            jPanelRegistroPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRegistroPaciente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelRegistroPacienteLayout.setVerticalGroup(
            jPanelRegistroPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRegistroPaciente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Registrarse", jPanelRegistroPaciente);

        jPanelCitaPaciente.setBackground(new java.awt.Color(133, 221, 246));
        jPanelCitaPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setText("Nombre*");

        jLabel17.setText("ID de Cita:");

        txtIDCita.setEnabled(false);

        btnSolicitarCita.setText("Solicitar");
        btnSolicitarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarCitaActionPerformed(evt);
            }
        });

        jLabel18.setText("Motivo de cita*");

        jLabel19.setText("Apellido*");

        javax.swing.GroupLayout jPanelCitaPacienteLayout = new javax.swing.GroupLayout(jPanelCitaPaciente);
        jPanelCitaPaciente.setLayout(jPanelCitaPacienteLayout);
        jPanelCitaPacienteLayout.setHorizontalGroup(
            jPanelCitaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCitaPacienteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelCitaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCitaPacienteLayout.createSequentialGroup()
                        .addComponent(btnSolicitarCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelCitaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCitaPacienteLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIDCita, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(jPanelCitaPacienteLayout.createSequentialGroup()
                        .addGroup(jPanelCitaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCitaPacienteLayout.createSequentialGroup()
                                .addGroup(jPanelCitaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanelCitaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombresPCita, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxMotivoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelCitaPacienteLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtApellidoPCita, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 153, Short.MAX_VALUE))))
        );
        jPanelCitaPacienteLayout.setVerticalGroup(
            jPanelCitaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCitaPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCitaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCitaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombresPCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCitaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoPCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelCitaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMotivoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanelCitaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitarCita)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );

        jTabbedPane2.addTab("Solicitar cita", jPanelCitaPaciente);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 710, 340));

        btnMenuPrincipal.setText("Menú Principal");
        jPanel1.add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jComboBoxTipoSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoSangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoSangreActionPerformed

    private void jComboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGeneroActionPerformed

    private void btnRegistroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroPacienteActionPerformed
        registrarPaciente();
    }//GEN-LAST:event_btnRegistroPacienteActionPerformed

    private void btnSolicitarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarCitaActionPerformed
        registrarCitaMedica();
    }//GEN-LAST:event_btnSolicitarCitaActionPerformed

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCitaPaciente;
    private javax.swing.JPanel jPanelRegistroPaciente;
    private javax.swing.JPanel jPanelRegistroPaciente1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField txtAlergiaPaciente;
    private javax.swing.JTextField txtApMaternoPaciente;
    private javax.swing.JTextField txtApPaternoPaciente;
    private javax.swing.JTextField txtApellidoPCita;
    private javax.swing.JTextField txtFechaNacPaciente;
    private javax.swing.JTextField txtIDCita;
    private javax.swing.JTextField txtLugarNacPaciente;
    private javax.swing.JTextField txtNombresPCita;
    private javax.swing.JTextField txtNombresPaciente;
    private javax.swing.JTextField txtTipoSangrePaciente;
    // End of variables declaration//GEN-END:variables
}
