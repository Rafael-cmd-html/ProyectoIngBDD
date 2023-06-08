package windowsSystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Login extends javax.swing.JFrame {
    
    ImageIcon image;
    Icon icon;

    int xMouse, yMouse;
    Register paginaRegistro = new Register();
    
    public Login() {
        
        initComponents();
        this.setLocationRelativeTo(this);
        
        bgUsuarios.add(rbAdministrador);
        bgUsuarios.add(rbRecepcionista);
        
        setScaleLabel(logo, "src/images/logo_v4.png");
        setScaleLabel(lblLogoLogin, "src/images/loginUsuario_v2.png");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgUsuarios = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();
        rbRecepcionista = new javax.swing.JRadioButton();
        rbAdministrador = new javax.swing.JRadioButton();
        logo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        lblLogoLogin = new javax.swing.JLabel();
        nombreEmpresa = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        spContra = new javax.swing.JSeparator();
        txtNombreUsuario = new javax.swing.JTextField();
        lblContrasenia = new javax.swing.JLabel();
        psfContra = new javax.swing.JPasswordField();
        spNombre = new javax.swing.JSeparator();
        btnAcceder = new javax.swing.JPanel();
        lblAcceder = new javax.swing.JLabel();
        cabecera = new javax.swing.JPanel();
        closePanel = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegister.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblRegister.setText("¿No estás registrado? ¡Registrate aquí!");
        lblRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegister.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblRegisterMouseMoved(evt);
            }
        });
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterMouseExited(evt);
            }
        });
        jPanel1.add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        rbRecepcionista.setBackground(new java.awt.Color(255, 255, 255));
        rbRecepcionista.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbRecepcionista.setText("Recepcionista");
        rbRecepcionista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(rbRecepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        rbAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        rbAdministrador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbAdministrador.setText("Administrador");
        rbAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(rbAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 70, 70));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo_login_v3.jpg"))); // NOI18N
        fondo.setToolTipText("");
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 590));
        fondo.getAccessibleContext().setAccessibleName("fondo");

        jPanel1.add(lblLogoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 70, 70));

        nombreEmpresa.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEmpresa.setText("Hospital Nueva Salvación");
        jPanel1.add(nombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, 30));

        lblLogin.setBackground(new java.awt.Color(204, 204, 204));
        lblLogin.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 0, 0));
        lblLogin.setText("Iniciar sesión");
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        lblUsuario.setBackground(new java.awt.Color(204, 204, 204));
        lblUsuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("Contraseña");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        spContra.setBackground(new java.awt.Color(0, 0, 0));
        spContra.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(spContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 180, 10));

        txtNombreUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreUsuario.setText("Ingrese su nombre de usuario");
        txtNombreUsuario.setBorder(null);
        txtNombreUsuario.setEnabled(false);
        txtNombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNombreUsuarioMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreUsuarioMousePressed(evt);
            }
        });
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 270, -1));

        lblContrasenia.setBackground(new java.awt.Color(204, 204, 204));
        lblContrasenia.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        lblContrasenia.setText("Usuario");
        jPanel1.add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        psfContra.setBackground(new java.awt.Color(255, 255, 255));
        psfContra.setForeground(new java.awt.Color(153, 153, 153));
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
        jPanel1.add(psfContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 180, -1));

        spNombre.setBackground(new java.awt.Color(0, 0, 0));
        spNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(spNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 180, 10));

        btnAcceder.setBackground(new java.awt.Color(200, 220, 247));
        btnAcceder.setForeground(new java.awt.Color(200, 220, 247));

        lblAcceder.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblAcceder.setForeground(new java.awt.Color(255, 255, 255));
        lblAcceder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcceder.setText("Acceder");
        lblAcceder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAccederMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAccederMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAccederMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnAccederLayout = new javax.swing.GroupLayout(btnAcceder);
        btnAcceder.setLayout(btnAccederLayout);
        btnAccederLayout.setHorizontalGroup(
            btnAccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAcceder, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btnAccederLayout.setVerticalGroup(
            btnAccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAcceder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 120, 40));

        cabecera.setBackground(new java.awt.Color(255, 255, 255));
        cabecera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cabecera.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cabeceraMouseDragged(evt);
            }
        });
        cabecera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cabeceraMousePressed(evt);
            }
        });

        closePanel.setBackground(new java.awt.Color(255, 255, 255));

        lblX.setBackground(new java.awt.Color(0, 0, 0));
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblX.setText("X");
        lblX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblXMouseExited(evt);
            }
        });

        javax.swing.GroupLayout closePanelLayout = new javax.swing.GroupLayout(closePanel);
        closePanel.setLayout(closePanelLayout);
        closePanelLayout.setHorizontalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, closePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        closePanelLayout.setVerticalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closePanelLayout.createSequentialGroup()
                .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cabeceraLayout = new javax.swing.GroupLayout(cabecera);
        cabecera.setLayout(cabeceraLayout);
        cabeceraLayout.setHorizontalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabeceraLayout.createSequentialGroup()
                .addGap(0, 610, Short.MAX_VALUE)
                .addComponent(closePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cabeceraLayout.setVerticalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addComponent(closePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 30));

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

    private void cabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabeceraMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_cabeceraMousePressed

    private void cabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabeceraMouseDragged
        // TODO add your handling code here:
        
        int xScreen=evt.getXOnScreen();
        int yScreen= evt.getYOnScreen();
        this.setLocation(xScreen-xMouse, yScreen-yMouse);
    }//GEN-LAST:event_cabeceraMouseDragged

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_lblXMouseClicked

    private void lblXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseEntered
        // TODO add your handling code here:
        closePanel.setBackground(Color.red);
        lblX.setForeground(Color.white);
        
    }//GEN-LAST:event_lblXMouseEntered

    private void lblXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseExited
        // TODO add your handling code here:
        closePanel.setBackground(Color.white);
        lblX.setForeground(Color.black);
    }//GEN-LAST:event_lblXMouseExited

    private void lblAccederMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccederMouseEntered
        // TODO add your handling code here:
        btnAcceder.setBackground(Color.white);
        lblAcceder.setForeground( new Color (200,220,247));
    }//GEN-LAST:event_lblAccederMouseEntered

    private void lblAccederMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccederMouseExited
        // TODO add your handling code here:
        btnAcceder.setBackground(new Color (200,220,247));
        lblAcceder.setForeground( Color.white );
    }//GEN-LAST:event_lblAccederMouseExited

    private void txtNombreUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreUsuarioMousePressed

        if(String.valueOf(psfContra.getPassword()).equals("")){
           
            psfContra.setText("Contraseña");
            psfContra.setForeground(Color.gray);
            
        }
        txtNombreUsuario.setText("");
        txtNombreUsuario.setForeground(Color.black);
        
    }//GEN-LAST:event_txtNombreUsuarioMousePressed

    private void psfContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psfContraMousePressed
        // TODO add your handling code here:
        
        if(txtNombreUsuario.getText().equals("")){
            
            txtNombreUsuario.setText("Ingrese su nombre de usuario");
            txtNombreUsuario.setForeground(Color.gray);
            
        }
        psfContra.setText("");
        psfContra.setForeground(Color.black);
    }//GEN-LAST:event_psfContraMousePressed

    private void lblRegisterMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseMoved
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_lblRegisterMouseMoved

    private void lblRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseEntered
        // TODO add your handling code here:
        
        
        lblRegister.setText("<html><u>" + lblRegister.getText() + "</html></u>");
        
    }//GEN-LAST:event_lblRegisterMouseEntered

    private void lblRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseExited
        // TODO add your handling code here:
        lblRegister.setText("¿No estás registrado? ¡Registrate aquí!");
    }//GEN-LAST:event_lblRegisterMouseExited

    private void txtNombreUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreUsuarioMouseEntered
        // TODO add your handling code here:
        txtNombreUsuario.enable(true);
    }//GEN-LAST:event_txtNombreUsuarioMouseEntered

    private void psfContraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psfContraMouseEntered
        // TODO add your handling code here:
        psfContra.enable(true);
    }//GEN-LAST:event_psfContraMouseEntered

    private void lblAccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccederMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_lblAccederMouseClicked

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        paginaRegistro.setVisible(true);
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    public void setScaleLabel(JLabel lbl, String route){
        
        
        image= new ImageIcon(route);
        icon= new ImageIcon(image.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        
        lbl.setIcon(icon);
        this.repaint();
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgUsuarios;
    private javax.swing.JPanel btnAcceder;
    private javax.swing.JPanel cabecera;
    private javax.swing.JPanel closePanel;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAcceder;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogoLogin;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombreEmpresa;
    private javax.swing.JPasswordField psfContra;
    private javax.swing.JRadioButton rbAdministrador;
    private javax.swing.JRadioButton rbRecepcionista;
    private javax.swing.JSeparator spContra;
    private javax.swing.JSeparator spNombre;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
