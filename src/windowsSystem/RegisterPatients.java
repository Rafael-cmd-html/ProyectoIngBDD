
package windowsSystem;

import Classes.ConexionBDD;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Castillejos
 */
public class RegisterPatients extends javax.swing.JFrame {

            
    ImageIcon image;
    Icon icon;
    String nombre, edad, fechaNacimiento, fechaAfiliacion, telefono, numeroControl, estadoActual;
    public RegisterPatients() {
        
        
        initComponents();
        this.setLocationRelativeTo(this);
        setScaleLabel(lblImage, "src/images/patientIcon_v1.png");
        setScaleLabel(lblPortada, "src/images/portadaPatients_v1.jpg");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JPanel();
        lblBtn = new javax.swing.JLabel();
        lblPortada = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblFechaAfi = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblControl = new javax.swing.JLabel();
        lblEstadoActual = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtAfi = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNumeroControl = new javax.swing.JTextField();
        cbEstadoActual = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnRegresar = new javax.swing.JPanel();
        lblBtn2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(java.awt.Color.gray);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 80));

        btnRegistrar.setBackground(new java.awt.Color(200, 220, 247));
        btnRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtn.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblBtn.setForeground(new java.awt.Color(255, 255, 255));
        lblBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtn.setText("Registrar");
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
        btnRegistrar.add(lblBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 20));

        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 100, 20));
        jPanel1.add(lblPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 200));

        lblNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblNombre.setText("Nombre del paciente");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre.setForeground(java.awt.Color.gray);
        txtNombre.setText("Nombre");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 150, 20));

        lblEdad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblEdad.setText("Edad");
        jPanel1.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtEdad.setForeground(java.awt.Color.gray);
        txtEdad.setText("Edad");
        txtEdad.setBorder(null);
        txtEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEdadMousePressed(evt);
            }
        });
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 150, 20));

        lblFechaNacimiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblFechaNacimiento.setText("Fecha de nacimiento");
        jPanel1.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        lblFechaAfi.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblFechaAfi.setText("Fecha de afiliación");
        jPanel1.add(lblFechaAfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblTelefono.setText("Número de teléfono");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        lblControl.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblControl.setText("Número de control");
        jPanel1.add(lblControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        lblEstadoActual.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblEstadoActual.setText("Estado actual del paciente");
        jPanel1.add(lblEstadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        txtFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtFechaNacimiento.setForeground(java.awt.Color.gray);
        txtFechaNacimiento.setText("Fecha nacimiento");
        txtFechaNacimiento.setBorder(null);
        txtFechaNacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaNacimientoMousePressed(evt);
            }
        });
        jPanel1.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 150, 20));

        txtAfi.setBackground(new java.awt.Color(255, 255, 255));
        txtAfi.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtAfi.setForeground(java.awt.Color.gray);
        txtAfi.setText("Afilicación");
        txtAfi.setBorder(null);
        txtAfi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAfiMousePressed(evt);
            }
        });
        jPanel1.add(txtAfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 150, 20));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtTelefono.setForeground(java.awt.Color.gray);
        txtTelefono.setText("Teléfono");
        txtTelefono.setBorder(null);
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 150, 20));

        txtNumeroControl.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroControl.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNumeroControl.setForeground(java.awt.Color.gray);
        txtNumeroControl.setText("Número control");
        txtNumeroControl.setBorder(null);
        txtNumeroControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroControlMousePressed(evt);
            }
        });
        jPanel1.add(txtNumeroControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 140, 20));

        cbEstadoActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En tratamiento", "De alta" }));
        jPanel1.add(cbEstadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 140, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 150, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 150, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 140, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 140, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 140, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 130, 10));

        btnRegresar.setBackground(new java.awt.Color(200, 220, 247));
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblBtn2.setBackground(new java.awt.Color(255, 255, 255));
        lblBtn2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblBtn2.setForeground(new java.awt.Color(255, 255, 255));
        lblBtn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtn2.setText("Regresar");
        lblBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtn2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtn2))
        );

        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
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
        lblBtn.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_lblBtnMouseExited

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void lblBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtn2MouseEntered
        // TODO add your handling code here:
        btnRegresar.setBackground(Color.white);
        lblBtn2.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_lblBtn2MouseEntered

    private void lblBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtn2MouseExited
        // TODO add your handling code here:
        btnRegresar.setBackground(new Color(200,220,247));
        lblBtn2.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblBtn2MouseExited

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtNombre.setForeground(Color.black);
        
        edad= txtEdad.getText();
        fechaNacimiento= txtFechaNacimiento.getText();
        fechaAfiliacion= txtAfi.getText();
        telefono= txtTelefono.getText();
        numeroControl= txtNumeroControl.getText();
        
        if(edad.equals("")){
            
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
            
        }
        if(fechaNacimiento.equals("")){
            
            txtFechaNacimiento.setText("Fecha nacimiento");
            txtFechaNacimiento.setForeground(Color.gray);
            
        }
        if(fechaAfiliacion.equals("")){
            
            txtAfi.setText("Afiliación");
            txtAfi.setForeground(Color.gray);
            
        }
        if(telefono.equals("")){
            
            txtTelefono.setText("Teléfono");
            txtTelefono.setForeground(Color.gray);
            
        }
        if(numeroControl.equals("")){
            
            txtNumeroControl.setText("Número control");
            txtNumeroControl.setForeground(Color.gray);
            
        }
        
        
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtEdadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEdadMousePressed
        // TODO add your handling code here:
        txtEdad.setText("");
        txtEdad.setForeground(Color.black);
        
        nombre= txtNombre.getText();
        fechaNacimiento= txtFechaNacimiento.getText();
        fechaAfiliacion= txtAfi.getText();
        telefono= txtTelefono.getText();
        numeroControl= txtNumeroControl.getText();
        
        if(nombre.equals("")){
            
            txtNombre.setText("Nombre");
            txtNombre.setForeground(Color.gray);
            
        }
        if(fechaNacimiento.equals("")){
            
            txtFechaNacimiento.setText("Fecha nacimiento");
            txtFechaNacimiento.setForeground(Color.gray);
            
        }
        if(fechaAfiliacion.equals("")){
            
            txtAfi.setText("Afiliación");
            txtAfi.setForeground(Color.gray);
            
        }
        if(telefono.equals("")){
            
            txtTelefono.setText("Teléfono");
            txtTelefono.setForeground(Color.gray);
            
        }
        if(numeroControl.equals("")){
            
            txtNumeroControl.setText("Número control");
            txtNumeroControl.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtEdadMousePressed

    private void txtFechaNacimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaNacimientoMousePressed
        // TODO add your handling code here:
        txtFechaNacimiento.setText("");
        txtFechaNacimiento.setForeground(Color.black);
        
        edad= txtEdad.getText();
        nombre= txtNombre.getText();
        fechaAfiliacion= txtAfi.getText();
        telefono= txtTelefono.getText();
        numeroControl= txtNumeroControl.getText();
        
        if(edad.equals("")){
            
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
            
        }
        if(nombre.equals("")){
            
            txtNombre.setText("Nombre");
            txtNombre.setForeground(Color.gray);
            
        }
        if(fechaAfiliacion.equals("")){
            
            txtAfi.setText("Afiliación");
            txtAfi.setForeground(Color.gray);
            
        }
        if(telefono.equals("")){
            
            txtTelefono.setText("Teléfono");
            txtTelefono.setForeground(Color.gray);
            
        }
        if(numeroControl.equals("")){
            
            txtNumeroControl.setText("Número control");
            txtNumeroControl.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtFechaNacimientoMousePressed

    private void txtAfiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAfiMousePressed
        // TODO add your handling code here:
        txtAfi.setText("");
        txtAfi.setForeground(Color.black);
        
        edad= txtEdad.getText();
        fechaNacimiento= txtFechaNacimiento.getText();
        nombre= txtNombre.getText();
        telefono= txtTelefono.getText();
        numeroControl= txtNumeroControl.getText();
        
        if(edad.equals("")){
            
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
            
        }
        if(fechaNacimiento.equals("")){
            
            txtFechaNacimiento.setText("Fecha nacimiento");
            txtFechaNacimiento.setForeground(Color.gray);
            
        }
        if(nombre.equals("")){
            
            txtNombre.setText("Nombre");
            txtNombre.setForeground(Color.gray);
            
        }
        if(telefono.equals("")){
            
            txtTelefono.setText("Teléfono");
            txtTelefono.setForeground(Color.gray);
            
        }
        if(numeroControl.equals("")){
            
            txtNumeroControl.setText("Número control");
            txtNumeroControl.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtAfiMousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed
        // TODO add your handling code here:
        txtTelefono.setText("");
        txtTelefono.setForeground(Color.black);
        
        edad= txtEdad.getText();
        fechaNacimiento= txtFechaNacimiento.getText();
        fechaAfiliacion= txtAfi.getText();
        nombre= txtNombre.getText();
        numeroControl= txtNumeroControl.getText();
        
        if(edad.equals("")){
            
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
            
        }
        if(fechaNacimiento.equals("")){
            
            txtFechaNacimiento.setText("Fecha nacimiento");
            txtFechaNacimiento.setForeground(Color.gray);
            
        }
        if(fechaAfiliacion.equals("")){
            
            txtAfi.setText("Afiliación");
            txtAfi.setForeground(Color.gray);
            
        }
        if(nombre.equals("")){
            
            txtNombre.setText("Nombre");
            txtNombre.setForeground(Color.gray);
            
        }
        if(numeroControl.equals("")){
            
            txtNumeroControl.setText("Número control");
            txtNumeroControl.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtNumeroControlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroControlMousePressed
        // TODO add your handling code here:
        txtNumeroControl.setText("");
        txtNumeroControl.setForeground(Color.black);
        
        edad= txtEdad.getText();
        fechaNacimiento= txtFechaNacimiento.getText();
        fechaAfiliacion= txtAfi.getText();
        telefono= txtTelefono.getText();
        nombre= txtNombre.getText();
        
        if(edad.equals("")){
            
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
            
        }
        if(fechaNacimiento.equals("")){
            
            txtFechaNacimiento.setText("Fecha nacimiento");
            txtFechaNacimiento.setForeground(Color.gray);
            
        }
        if(fechaAfiliacion.equals("")){
            
            txtAfi.setText("Afiliación");
            txtAfi.setForeground(Color.gray);
            
        }
        if(telefono.equals("")){
            
            txtTelefono.setText("Teléfono");
            txtTelefono.setForeground(Color.gray);
            
        }
        if(nombre.equals("")){
            
            txtNombre.setText("Nombre");
            txtNombre.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtNumeroControlMousePressed

    private void lblBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnMouseClicked
        // TODO add your handling code here:                            
        // TODO add your handling code here:
        
        edad= txtEdad.getText();
        fechaNacimiento= txtFechaNacimiento.getText();
        fechaAfiliacion= txtAfi.getText();
        telefono= txtTelefono.getText();
        nombre= txtNombre.getText();
        numeroControl= txtNumeroControl.getText();
        estadoActual= String.valueOf(cbEstadoActual.getSelectedItem());
        
        String sql= "INSERT INTO pacientes VALUES" + 
                "('"+nombre+"','"+edad+"','"+fechaNacimiento+"','"+fechaAfiliacion+"','"+telefono+"','"+numeroControl+"','"+estadoActual+"')";
        
        
        
        try (PreparedStatement stm = ConexionBDD.conexion.prepareStatement(sql)){
            
            stm.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "¡Excelente! Paciente registrado =D");
            
            txtEdad.setForeground(Color.gray);
            txtEdad.setText("Edad");
            
            txtFechaNacimiento.setForeground(Color.gray);
            txtFechaNacimiento.setText("Fecha de nacimiento");
            
            txtNombre.setForeground(Color.gray);
            txtNombre.setText("Nombre");
            
            txtTelefono.setForeground(Color.gray);
            txtTelefono.setText("Télefono");
            
            txtAfi.setForeground(Color.gray);
            txtAfi.setText("Afiliación");
            
            txtNumeroControl.setForeground(Color.gray);
            txtNumeroControl.setText("Número control");
            stm.close();
            
        }catch(Exception e){
            
            e.printStackTrace();
        }
    }//GEN-LAST:event_lblBtnMouseClicked

    private void lblBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtn2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        RegisterOptions rO= new RegisterOptions();
        rO.setVisible(true);
        
        
    }//GEN-LAST:event_lblBtn2MouseClicked

    
    public void setScaleLabel(JLabel lbl, String route){
        
        
        image= new ImageIcon(route);
        icon= new ImageIcon(image.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        
        lbl.setIcon(icon);
        this.repaint();
       
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPatients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JComboBox<String> cbEstadoActual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblBtn;
    private javax.swing.JLabel lblBtn2;
    private javax.swing.JLabel lblControl;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEstadoActual;
    private javax.swing.JLabel lblFechaAfi;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPortada;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtAfi;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroControl;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
