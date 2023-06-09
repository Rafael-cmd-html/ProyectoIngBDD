package windowsSystem;

import Classes.ConexionBDD;
import Classes.Main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Login extends javax.swing.JFrame {
    
    ImageIcon image;
    Icon icon;

    int xMouse, yMouse;
    
    String nombre, contrasenia;
    
    RegisterUsers paginaRegistro = new RegisterUsers();        
    AdminOptions ventanaAdmin= new AdminOptions();
    
    public Login() {
        
        initComponents();
        
        this.setLocationRelativeTo(this);
        this.setTitle("Inicio de sesión");
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 270, 20));

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
        
       if(txtNombreUsuario.getText().equals("") || txtNombreUsuario.getText().equalsIgnoreCase("Ingrese su nombre usuario") ||
              String.valueOf(psfContra.getPassword()).equalsIgnoreCase("") ||
              String.valueOf(psfContra.getPassword()).equalsIgnoreCase("Contraseña"))
       {
           
           txtNombreUsuario.setText("Ingrese su nombre de usuario");
           txtNombreUsuario.setForeground(Color.gray);
           
           psfContra.setText("Contraseña");
           psfContra.setForeground(Color.gray);
           
           JOptionPane.showMessageDialog(this,"Rellena todos los campos antes de continuar =)");
           
       }
       else{
           
           
           int existe=0;
           nombre= txtNombreUsuario.getText();
           contrasenia= String.valueOf(psfContra.getPassword());
           
           if(rbAdministrador.isSelected()){
               
               try(Statement stm = ConexionBDD.conexion.createStatement()){
   
                   String sql= "SELECT * FROM  administradores WHERE nombre_usuario= '"+nombre+"' AND contrasenia= '"+contrasenia+"'";
                   
                   ResultSet rs= stm.executeQuery(sql);
                   if(rs.next()){
                       
                       existe=1;
                       if(existe==1){
                            this.dispose();
                            ventanaAdmin.setVisible(true);
                       }
                       
                   }
                   else{
                       
                      JOptionPane.showMessageDialog(this, "Parece que no estás registrado, prueba de nuevo o pide registro");
                      
                    }
                   
               }catch(Exception e){
                   
                   e.printStackTrace();
                   
               }

            }
           
           else if(rbRecepcionista.isSelected()){
               
               try(Statement stm = ConexionBDD.conexion.createStatement()){
   
                   String sql= "SELECT * FROM  recepcionistas WHERE nombre_usuario= '"+nombre+"' AND contrasenia= '"+contrasenia+"'";
                   
                   ResultSet rs= stm.executeQuery(sql);
                   if(rs.next()){
                       
                       existe=1;
                       if(existe==1){
                            this.dispose();
                       }
                       
                   }
                   else{
                       
                      JOptionPane.showMessageDialog(this, "Parece que no estás registrado, prueba de nuevo o pide registro");
                      
                    }
                   
               }catch(Exception e){
                   
                   e.printStackTrace();
                   
               }

            }
           else{
               
               JOptionPane.showMessageDialog(this, "Selecciona tu ocupación: Administrador || Recepcionista");
               
           }
       }
    }//GEN-LAST:event_lblAccederMouseClicked

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
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAcceder;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogoLogin;
    private javax.swing.JLabel lblUsuario;
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
