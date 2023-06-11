
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        lblTelefono.setText("Teléfono paciente");
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
        txtTelefono.setText("Telefono");
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
        
        telefono= txtTelefono.getText();
        medico=txtMedico.getText();
        folio= txtFolio.getText();
        fecha= txtFecha.getText();
        motivo= txtMotivo.getText();
        paciente= txtPaciente.getText();
        
        String sql= "INSERT INTO consultas VALUES" + 
                "('"+fecha+"','"+medico+"','"+paciente+"','"+folio+"','"+motivo+"','"+telefono+"')";
        
        try (PreparedStatement stm = ConexionBDD.conexion.prepareStatement(sql)){
            
            stm.executeUpdate();
            stm.close();
            
        }catch(Exception e){
            
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_lblBtnMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterConsults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
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
