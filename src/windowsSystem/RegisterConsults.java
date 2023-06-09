
package windowsSystem;

import Classes.ConexionBDD;
import Classes.Main;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.awt.Image;
import java.beans.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Castillejos
 */
public class RegisterConsults extends javax.swing.JFrame {

        
    ImageIcon image;
    Icon icon;
    
    String fecha, medico, paciente, motivo, telefono, folio;
    public RegisterConsults() {
        
        initComponents();
        this.setLocationRelativeTo(this);
        setScaleLabel(lblPortada, "src/images/consultasHeader.jpg");
        setScaleLabel(lblIcon, "src/images/consultIcon.png");
    }
    
    public void setScaleLabel(JLabel lbl, String route){
        
        
        image= new ImageIcon(route);
        icon= new ImageIcon(image.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        
        lbl.setIcon(icon);
        this.repaint();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPortada = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblMedico = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        lblMotivo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtMedico = new javax.swing.JTextField();
        txtPaciente = new javax.swing.JTextField();
        txtFolio = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JPanel();
        lblBtn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(java.awt.Color.gray);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 210));
        jPanel1.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 100, 100));

        lblFecha.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblFecha.setText("Fecha de consulta");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        lblMedico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblMedico.setText("Médico");
        jPanel1.add(lblMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        lblPaciente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblPaciente.setText("Paciente");
        jPanel1.add(lblPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        lblMotivo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblMotivo.setText("Motivo");
        jPanel1.add(lblMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblTelefono.setText("Diagnostico");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, -1, -1));

        lblFolio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblFolio.setText("Folio");
        jPanel1.add(lblFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtFecha.setForeground(java.awt.Color.gray);
        txtFecha.setText("Fecha");
        txtFecha.setBorder(null);
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
        });
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 130, 20));

        txtMedico.setBackground(new java.awt.Color(255, 255, 255));
        txtMedico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtMedico.setForeground(java.awt.Color.gray);
        txtMedico.setText("Doctor");
        txtMedico.setBorder(null);
        txtMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMedicoMouseClicked(evt);
            }
        });
        txtMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 130, 20));

        txtPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtPaciente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtPaciente.setForeground(java.awt.Color.gray);
        txtPaciente.setText("Paciente");
        txtPaciente.setBorder(null);
        txtPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPacienteMouseClicked(evt);
            }
        });
        jPanel1.add(txtPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 130, 20));

        txtFolio.setBackground(new java.awt.Color(255, 255, 255));
        txtFolio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtFolio.setForeground(java.awt.Color.gray);
        txtFolio.setText("Folio");
        txtFolio.setBorder(null);
        txtFolio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFolioMouseClicked(evt);
            }
        });
        jPanel1.add(txtFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 130, 20));

        txtMotivo.setBackground(new java.awt.Color(255, 255, 255));
        txtMotivo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtMotivo.setForeground(java.awt.Color.gray);
        txtMotivo.setText("Motivo");
        txtMotivo.setBorder(null);
        txtMotivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMotivoMouseClicked(evt);
            }
        });
        jPanel1.add(txtMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 130, 20));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtTelefono.setForeground(java.awt.Color.gray);
        txtTelefono.setText("Diagnóstico");
        txtTelefono.setBorder(null);
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefonoMouseClicked(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 580, 130, 20));

        btnRegistrar.setBackground(new java.awt.Color(200, 220, 247));
        btnRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblBtn.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblBtn.setForeground(new java.awt.Color(255, 255, 255));
        lblBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtn.setText("Registrar");
        lblBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtn))
        );

        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 120, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 110, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 110, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 110, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 110, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 110, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, 110, 10));

        jPanel2.setBackground(new java.awt.Color(200, 220, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Regresar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 120, 20));

        jLabel2.setText("Receta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jLabel3.setText("Estudio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 40, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 100, 20));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 100, 10));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(java.awt.Color.gray);
        jTextField1.setText("Receta");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 100, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setForeground(java.awt.Color.gray);
        jTextField2.setText("Estudio");
        jTextField2.setBorder(null);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnMouseEntered
        // TODO add your handling code here:
        btnRegistrar.setBackground(Color.white);
        lblBtn.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_lblBtnMouseEntered

    private void lblBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnMouseExited
        // TODO add your handling code here:
        btnRegistrar.setBackground(new Color(200,220,247));
        lblBtn.setForeground(Color.white);
    }//GEN-LAST:event_lblBtnMouseExited

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicoActionPerformed

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        // TODO add your handling code here:
        txtFecha.setText("");
        txtFecha.setForeground(Color.black);
        
        medico=txtMedico.getText();
        folio= txtFolio.getText();
        telefono= txtTelefono.getText();
        motivo= txtMotivo.getText();
        paciente= txtPaciente.getText();
        
        
        if(medico.equals("")){
            
            txtMedico.setText("Medico");
            txtMedico.setForeground(Color.gray);
        }
        if(folio.equals("")){
            
            txtFolio.setText("Folio");
            txtFolio.setForeground(Color.gray);
        }
        if(telefono.equals("")){
            
            txtTelefono.setText("Telefono");
            txtTelefono.setForeground(Color.gray);
        }
        if(motivo.equals("")){
            
            txtMotivo.setText("Motivo");
            txtMotivo.setForeground(Color.gray);
        }
        if(paciente.equals("")){
            
            txtPaciente.setText("Paciente");
            txtPaciente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtFechaMouseClicked

    private void txtMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMedicoMouseClicked
        // TODO add your handling code here:
        txtMedico.setText("");
        txtMedico.setForeground(Color.black);
        
        fecha=txtFecha.getText();
        folio= txtFolio.getText();
        telefono= txtTelefono.getText();
        motivo= txtMotivo.getText();
        paciente= txtPaciente.getText();
        
        
        if(fecha.equals("")){
            
            txtFecha.setText("Fecha");
            txtFecha.setForeground(Color.gray);
        }
        if(folio.equals("")){
            
            txtFolio.setText("Folio");
            txtFolio.setForeground(Color.gray);
        }
        if(telefono.equals("")){
            
            txtTelefono.setText("Telefono");
            txtTelefono.setForeground(Color.gray);
        }
        if(motivo.equals("")){
            
            txtMotivo.setText("Motivo");
            txtMotivo.setForeground(Color.gray);
        }
        if(paciente.equals("")){
            
            txtPaciente.setText("Paciente");
            txtPaciente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtMedicoMouseClicked

    private void txtPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPacienteMouseClicked
        // TODO add your handling code here:
        txtPaciente.setText("");
        txtPaciente.setForeground(Color.black);
        
        medico=txtMedico.getText();
        folio= txtFolio.getText();
        telefono= txtTelefono.getText();
        motivo= txtMotivo.getText();
        fecha= txtFecha.getText();
        
        
        if(medico.equals("")){
            
            txtMedico.setText("Medico");
            txtMedico.setForeground(Color.gray);
        }
        if(folio.equals("")){
            
            txtFolio.setText("Folio");
            txtFolio.setForeground(Color.gray);
        }
        if(telefono.equals("")){
            
            txtTelefono.setText("Telefono");
            txtTelefono.setForeground(Color.gray);
        }
        if(motivo.equals("")){
            
            txtMotivo.setText("Motivo");
            txtMotivo.setForeground(Color.gray);
        }
        if(fecha.equals("")){
            
            txtFecha.setText("Fecha");
            txtFecha.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPacienteMouseClicked

    private void txtFolioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFolioMouseClicked
        // TODO add your handling code here:
        txtFolio.setText("");
        txtFolio.setForeground(Color.black);
        
        medico=txtMedico.getText();
        fecha= txtFecha.getText();
        telefono= txtTelefono.getText();
        motivo= txtMotivo.getText();
        paciente= txtPaciente.getText();
        
        
        if(medico.equals("")){
            
            txtMedico.setText("Medico");
            txtMedico.setForeground(Color.gray);
        }
        if(fecha.equals("")){
            
            txtFecha.setText("Fecha");
            txtFecha.setForeground(Color.gray);
        }
        if(telefono.equals("")){
            
            txtTelefono.setText("Telefono");
            txtTelefono.setForeground(Color.gray);
        }
        if(motivo.equals("")){
            
            txtMotivo.setText("Motivo");
            txtMotivo.setForeground(Color.gray);
        }
        if(paciente.equals("")){
            
            txtPaciente.setText("Paciente");
            txtPaciente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtFolioMouseClicked

    private void txtMotivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMotivoMouseClicked
        // TODO add your handling code here:
        txtMotivo.setText("");
        txtMotivo.setForeground(Color.black);
        
        medico=txtMedico.getText();
        folio= txtFolio.getText();
        telefono= txtTelefono.getText();
        fecha= txtFecha.getText();
        paciente= txtPaciente.getText();
        
        
        if(medico.equals("")){
            
            txtMedico.setText("Medico");
            txtMedico.setForeground(Color.gray);
        }
        if(folio.equals("")){
            
            txtFolio.setText("Folio");
            txtFolio.setForeground(Color.gray);
        }
        if(telefono.equals("")){
            
            txtTelefono.setText("Telefono");
            txtTelefono.setForeground(Color.gray);
        }
        if(fecha.equals("")){
            
            txtFecha.setText("Fecha");
            txtFecha.setForeground(Color.gray);
        }
        if(paciente.equals("")){
            
            txtPaciente.setText("Paciente");
            txtPaciente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtMotivoMouseClicked

    private void txtTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMouseClicked
        // TODO add your handling code here:
        txtTelefono.setText("");
        txtTelefono.setForeground(Color.black);
        
        medico=txtMedico.getText();
        folio= txtFolio.getText();
        fecha= txtFecha.getText();
        motivo= txtMotivo.getText();
        paciente= txtPaciente.getText();
        
        
        if(medico.equals("")){
            
            txtMedico.setText("Medico");
            txtMedico.setForeground(Color.gray);
        }
        if(folio.equals("")){
            
            txtFolio.setText("Folio");
            txtFolio.setForeground(Color.gray);
        }
        if(fecha.equals("")){
            
            txtFecha.setText("Fecha");
            txtFecha.setForeground(Color.gray);
        }
        if(motivo.equals("")){
            
            txtMotivo.setText("Motivo");
            txtMotivo.setForeground(Color.gray);
        }
        if(paciente.equals("")){
            
            txtPaciente.setText("Paciente");
            txtPaciente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtTelefonoMouseClicked

    private void lblBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnMouseClicked
        // TODO add your handling code here:
        String diagnostico,receta, estudio;
        
        diagnostico=txtTelefono.getText();
        receta= jTextField1.getText();
        estudio= jTextField2.getText();
        medico=txtMedico.getText();
        folio= txtFolio.getText();
        fecha= txtFecha.getText();
        motivo= txtMotivo.getText();
        paciente= txtPaciente.getText();
        
        String sql= "INSERT INTO consultas VALUES" + 
                "('"+fecha+"','"+medico+"','"+paciente+"','"+folio+"','"+motivo+"','"+diagnostico+"','"+receta+"', '"+estudio+"')";
        
        try (PreparedStatement stm = ConexionBDD.conexion.prepareStatement(sql)){
            
            stm.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "¡Excelente! Consulta registrada =D");
            stm.close();
            
        }catch(Exception e){
            
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_lblBtnMouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jPanel2.setBackground(Color.white);
        jLabel1.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(200,220,247));
        jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        RegisterOptions rO= new RegisterOptions();
        rO.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField1.setForeground(Color.black);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        // TODO add your handling code here:
        jTextField2.setText("");
        jTextField2.setForeground(Color.black);
    }//GEN-LAST:event_jTextField2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterConsults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblBtn;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblPortada;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
