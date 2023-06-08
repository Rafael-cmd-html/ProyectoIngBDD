
package windowsSystem;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Register extends javax.swing.JFrame {
    
    ImageIcon image;
    Icon icon;
    String pass, confirmPass, nombreUsuario, correo;
    public Register() {
        
        initComponents();
        this.setLocationRelativeTo(this);
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPortada.setToolTipText("");
        jPanel1.add(lblPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 210));
        jPanel1.add(lblImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 80, 80));

        lblRegistrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar.setText("Registrar ");
        jPanel1.add(lblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 80, 20));

        lblNombreUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblNombreUsuario.setText("Nombre de Usuario");
        jPanel1.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblCorreo.setText("Correo electrónico");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        lblContra.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblContra.setText("Contraseña");
        jPanel1.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        lblConfirmContra.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblConfirmContra.setText("Confirmar contraseña");
        jPanel1.add(lblConfirmContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        rbAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        rbAdministrador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbAdministrador.setText("Administrador");
        rbAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(rbAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        rbRecepcionista.setBackground(new java.awt.Color(255, 255, 255));
        rbRecepcionista.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbRecepcionista.setText("Recepcionista");
        rbRecepcionista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRecepcionistaActionPerformed(evt);
            }
        });
        jPanel1.add(rbRecepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(200, 220, 247));

        lblRegistrarBtn.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblRegistrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarBtn.setText("Registrar");
        lblRegistrarBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblRegistrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 200, -1));

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
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 200, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 130, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 130, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 130, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 130, 10));

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
        jPanel1.add(psfConfirmContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 130, -1));

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
        jPanel1.add(psfContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgUsuarios;
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
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
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
