
package windowsSystem;

import Classes.ConexionBDD;
import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RegisterUsers extends javax.swing.JFrame {
    
    ImageIcon image;
    Icon icon;
    int xMouse, yMouse;
    String pass, confirmPass, nombreUsuario, correo, ocupacion;
    public RegisterUsers() {
        
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Registrarse");
        
        
        setScaleLabel(lblPortada, "src/images/fondo_login_v3.jpg");
        setScaleLabel(lblImagenUsuario, "src/images/logo_v4.png");
        
        bgUsuarios.add(rbAdministrador);
        bgUsuarios.add(rbRecepcionista);
        
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

        bgUsuarios = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblPortada = new javax.swing.JLabel();
        lblImagenUsuario = new javax.swing.JLabel();
        lblRegistrar = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        lblConfirmContra = new javax.swing.JLabel();
        rbAdministrador = new javax.swing.JRadioButton();
        rbRecepcionista = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JPanel();
        lblRegistrarBtn = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        psfConfirmContra = new javax.swing.JPasswordField();
        psfContra = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPortada.setToolTipText("");
        jPanel1.add(lblPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 210));
        jPanel1.add(lblImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 80, 80));

        lblRegistrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar.setText("Registrar ");
        jPanel1.add(lblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 80, 20));

        lblNombreUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblNombreUsuario.setText("Nombre de Usuario");
        jPanel1.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblCorreo.setText("Correo electrónico");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        lblContra.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblContra.setText("Contraseña");
        jPanel1.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        lblConfirmContra.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblConfirmContra.setText("Confirmar contraseña");
        jPanel1.add(lblConfirmContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        rbAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        rbAdministrador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbAdministrador.setText("Administrador");
        rbAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(rbAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        rbRecepcionista.setBackground(new java.awt.Color(255, 255, 255));
        rbRecepcionista.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbRecepcionista.setText("Recepcionista");
        rbRecepcionista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRecepcionistaActionPerformed(evt);
            }
        });
        jPanel1.add(rbRecepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(200, 220, 247));

        lblRegistrarBtn.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblRegistrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarBtn.setText("Registrar");
        lblRegistrarBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblRegistrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistrarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistrarBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegistrarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegistrarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 110, 40));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre.setForeground(java.awt.Color.gray);
        txtNombre.setText("Nombre Usuario");
        txtNombre.setBorder(null);
        txtNombre.setEnabled(false);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNombreMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 200, -1));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCorreo.setForeground(java.awt.Color.gray);
        txtCorreo.setText("Correo");
        txtCorreo.setBorder(null);
        txtCorreo.setEnabled(false);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCorreoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 200, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 130, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 130, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 130, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 130, 10));

        psfConfirmContra.setBackground(new java.awt.Color(255, 255, 255));
        psfConfirmContra.setForeground(java.awt.Color.gray);
        psfConfirmContra.setText("Contraseña");
        psfConfirmContra.setBorder(null);
        psfConfirmContra.setEnabled(false);
        psfConfirmContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                psfConfirmContraMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                psfConfirmContraMousePressed(evt);
            }
        });
        jPanel1.add(psfConfirmContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 130, -1));

        psfContra.setBackground(new java.awt.Color(255, 255, 255));
        psfContra.setForeground(java.awt.Color.gray);
        psfContra.setText("Contraseña");
        psfContra.setBorder(null);
        psfContra.setEnabled(false);
        psfContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                psfContraMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                psfContraMousePressed(evt);
            }
        });
        jPanel1.add(psfContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 130, -1));

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 110, 40));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setForeground(java.awt.Color.gray);
        txtID.setText("Id");
        txtID.setBorder(null);
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 130, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 140, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRecepcionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRecepcionistaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void lblRegistrarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarBtnMouseEntered
        // TODO add your handling code here:
        lblRegistrarBtn.setForeground(new Color(200,220,247));
        btnRegistrar.setBackground(Color.white);
        
    }//GEN-LAST:event_lblRegistrarBtnMouseEntered

    private void txtNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseEntered
        // TODO add your handling code here:
        txtNombre.enable(true);
    }//GEN-LAST:event_txtNombreMouseEntered

    private void txtCorreoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseEntered
        // TODO add your handling code here:
        
        txtCorreo.enable(true);
    }//GEN-LAST:event_txtCorreoMouseEntered

    private void psfContraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psfContraMouseEntered
        // TODO add your handling code here:
        
        psfContra.enable(true);
    }//GEN-LAST:event_psfContraMouseEntered

    private void psfConfirmContraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psfConfirmContraMouseEntered
        // TODO add your handling code here:
        
        psfConfirmContra.enable(true);
    }//GEN-LAST:event_psfConfirmContraMouseEntered

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        // TODO add your handling code here:
        correo = txtCorreo.getText();
        pass = String.valueOf(psfContra.getPassword());
        confirmPass = String.valueOf(psfConfirmContra.getPassword());
        
        if(correo.equals("")){
            
            txtCorreo.setForeground(Color.gray);
            txtCorreo.setText("Correo");
            
        }
        if(pass.equals("")){
            
            psfContra.setForeground(Color.gray);
            psfContra.setText("Contraseña");
            
        }
        if(confirmPass.equals("")){
            
            psfConfirmContra.setForeground(Color.gray);
            psfConfirmContra.setText("Contraseña");
            
        }
        
        txtNombre.setText("");
        txtNombre.setForeground(Color.black);
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        // TODO add your handling code here:
        nombreUsuario = txtNombre.getText();
        pass = String.valueOf(psfContra.getPassword());
        confirmPass = String.valueOf(psfConfirmContra.getPassword());
        
        if(nombreUsuario.equals("")){
            
            txtNombre.setForeground(Color.gray);
            txtNombre.setText("Nombre Usuario");
            
        }
        if(pass.equals("")){
            
            psfContra.setForeground(Color.gray);
            psfContra.setText("Contraseña");
            
        }
        if(confirmPass.equals("")){
            
            psfConfirmContra.setForeground(Color.gray);
            psfConfirmContra.setText("Contraseña");
            
        }
        txtCorreo.setText("");
        txtCorreo.setForeground(Color.black);
    }//GEN-LAST:event_txtCorreoMousePressed

    private void psfContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psfContraMousePressed
        // TODO add your handling code here:
        correo = txtCorreo.getText();
        pass = String.valueOf(psfContra.getPassword());
        confirmPass = String.valueOf(psfConfirmContra.getPassword());
        
        if(correo.equals("")){
            
            txtCorreo.setForeground(Color.gray);
            txtCorreo.setText("Correo");
            
        }
        if(pass.equals("")){
            
            psfContra.setForeground(Color.gray);
            psfContra.setText("Contraseña");
            
        }
        if(confirmPass.equals("")){
            
            psfConfirmContra.setForeground(Color.gray);
            psfConfirmContra.setText("Contraseña");
            
        }
        psfContra.setText("");
        psfContra.setForeground(Color.black);
    }//GEN-LAST:event_psfContraMousePressed

    private void psfConfirmContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psfConfirmContraMousePressed
        // TODO add your handling code here:
        correo = txtCorreo.getText();
        pass = String.valueOf(psfContra.getPassword());
        confirmPass = String.valueOf(psfConfirmContra.getPassword());
        
        if(correo.equals("")){
            
            txtCorreo.setForeground(Color.gray);
            txtCorreo.setText("Correo");
            
        }
        if(pass.equals("")){
            
            psfContra.setForeground(Color.gray);
            psfContra.setText("Contraseña");
            
        }
        if(confirmPass.equals("")){
            
            psfConfirmContra.setForeground(Color.gray);
            psfConfirmContra.setText("Contraseña");
            
        }
        
        psfConfirmContra.setText("");
        psfConfirmContra.setForeground(Color.black);
    }//GEN-LAST:event_psfConfirmContraMousePressed

    private void lblRegistrarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarBtnMouseExited
        // TODO add your handling code here:
        lblRegistrarBtn.setForeground(Color.white);
        btnRegistrar.setBackground(new Color(200,220,247));
        
    }//GEN-LAST:event_lblRegistrarBtnMouseExited

    private void lblRegistrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarBtnMouseClicked
        // TODO add your handling code here:
        nombreUsuario= txtNombre.getText();
        correo=txtCorreo.getText();
        pass= String.valueOf(psfContra.getPassword());
        confirmPass= String.valueOf(psfConfirmContra.getPassword());
        
        if(nombreUsuario.equals("") || nombreUsuario.equalsIgnoreCase("nombre usuario") ||
           correo.equals("") || correo.equalsIgnoreCase("correo") ||
           pass.equals("") || pass.equalsIgnoreCase("contraseña") || 
           confirmPass.equals("") || confirmPass.equalsIgnoreCase("contraseña")
                
                )
        {
            
            JOptionPane.showMessageDialog(this, "Ingrese todos los campos del formulario =)");
            
            txtNombre.setForeground(Color.gray);
            txtNombre.setText("Nombre Usuario");
            
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
            
            psfContra.setText("Contraseña");
            psfContra.setForeground(Color.gray);
            
            psfConfirmContra.setForeground(Color.gray);
            psfConfirmContra.setText("Contraseña");
            
            rbAdministrador.setSelected(false);
            rbRecepcionista.setSelected(false);
            
        
        
        }
        else{
            if(rbRecepcionista.isSelected()){
                
                String sql= "INSERT INTO recepcionistas VALUES" + 
                        "('"+nombreUsuario+"','"+pass+"','"+correo+"')";

                try (PreparedStatement stm = ConexionBDD.conexion.prepareStatement(sql)){


                    stm.executeUpdate();
                    JOptionPane.showMessageDialog(this, "¡Excelente! Usuario registrado =D");
                    
                    txtNombre.setForeground(Color.gray);
                    txtNombre.setText("Nombre usuario");
                    
                    txtCorreo.setForeground(Color.gray);
                    txtCorreo.setText("Correo");
                    
                    psfContra.setForeground(Color.gray);
                    psfContra.setText("Contraseña");
                    
                    
                    psfConfirmContra.setForeground(Color.gray);
                    psfConfirmContra.setText("");
                    
                    stm.close();

                }catch(Exception e){

                    e.printStackTrace();
                }

            }
            else{
                
                String sql= "INSERT INTO administradores VALUES" + 
                        "('"+nombreUsuario+"','"+pass+"','"+correo+"')";

                try (PreparedStatement stm = ConexionBDD.conexion.prepareStatement(sql)){


                    stm.executeUpdate();
                    JOptionPane.showMessageDialog(this, "¡Excelente! Usuario registrado =D");
                    
                    txtNombre.setForeground(Color.gray);
                    txtNombre.setText("Nombre usuario");
                    
                    txtCorreo.setForeground(Color.gray);
                    txtCorreo.setText("Correo");
                    
                    psfContra.setForeground(Color.gray);
                    psfContra.setText("Contraseña");
                    
                    
                    psfConfirmContra.setForeground(Color.gray);
                    psfConfirmContra.setText("");
                    stm.close();

                }catch(Exception e){

                    e.printStackTrace();
                }
                
            }
            
        }
        
    }//GEN-LAST:event_lblRegistrarBtnMouseClicked

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

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        // TODO add your handling code here:
        txtID.setText("");
        txtID.setForeground(Color.black);
    }//GEN-LAST:event_txtIDMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgUsuarios;
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblConfirmContra;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblImagenUsuario;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPortada;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblRegistrarBtn;
    private javax.swing.JPasswordField psfConfirmContra;
    private javax.swing.JPasswordField psfContra;
    private javax.swing.JRadioButton rbAdministrador;
    private javax.swing.JRadioButton rbRecepcionista;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
