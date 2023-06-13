/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windowsSystem;

import Classes.ConexionBDD;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Castillejos
 */
public class RegisterMeds extends javax.swing.JFrame {


            
    ImageIcon image;
    Icon icon;
    String nombre, presentacion, cantidad, descripcion;
    public RegisterMeds() {
        
        initComponents();
        this.setLocationRelativeTo(this);
        setScaleLabel(lblPortada, "src/images/portadaMeds.jpg");
        
        setScaleLabel(lblIcon, "src/images/medIcon.png");
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
        lblNombre = new javax.swing.JLabel();
        lblPresentacion = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JPanel();
        lblRegistrar = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cbPresentacion = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescripcion = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 220));
        jPanel1.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 80, 80));

        lblNombre.setText("Nombre medicamento");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        lblPresentacion.setText("Presentación");
        jPanel1.add(lblPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        lblCantidad.setText("Cantidad del medicamento");
        jPanel1.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        lblDescripcion.setText("Descripción");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(200, 220, 247));
        btnRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblRegistrar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar.setText("Registrar");
        lblRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 30));

        btnRegresar.setBackground(new java.awt.Color(200, 220, 247));
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblRegresar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegresar.setText("Regresar");
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, -1, 30));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre.setForeground(java.awt.Color.gray);
        txtNombre.setText("Nombre");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 150, 20));

        cbPresentacion.setBackground(new java.awt.Color(255, 255, 255));
        cbPresentacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbPresentacion.setForeground(new java.awt.Color(0, 0, 0));
        cbPresentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capsulas", "Pastillas", "Jarabe" }));
        cbPresentacion.setBorder(null);
        jPanel1.add(cbPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 150, -1));

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCantidad.setForeground(java.awt.Color.gray);
        txtCantidad.setText("Cantidad");
        txtCantidad.setBorder(null);
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCantidadMouseClicked(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 150, 20));

        txtaDescripcion.setColumns(20);
        txtaDescripcion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtaDescripcion.setRows(5);
        txtaDescripcion.setBorder(null);
        txtaDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaDescripcionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtaDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 210, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 120, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 140, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void lblRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseEntered
        // TODO add your handling code here:
        btnRegresar.setBackground(Color.white);
        lblRegresar.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_lblRegresarMouseEntered

    private void lblRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseExited
        // TODO add your handling code here:
        btnRegresar.setBackground(new Color(200,220,247));
        lblRegresar.setForeground(Color.white);
    }//GEN-LAST:event_lblRegresarMouseExited

    private void lblRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseEntered
        // TODO add your handling code here:
        btnRegistrar.setBackground(Color.white);
        lblRegistrar.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_lblRegistrarMouseEntered

    private void lblRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseExited
        // TODO add your handling code here:
        btnRegistrar.setBackground(new Color(200,220,247));
        lblRegistrar.setForeground(Color.white);
    }//GEN-LAST:event_lblRegistrarMouseExited

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        RegisterOptions rO= new RegisterOptions();
        
        rO.setVisible(true);
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        // TODO add your handling code here:
        txtNombre.setText("");
        txtNombre.setForeground(Color.black);
        
        presentacion= String.valueOf(cbPresentacion.getSelectedItem());
        cantidad= txtCantidad.getText();
        descripcion= txtaDescripcion.getText();
        
        if(cantidad.equals("")){
            
            txtCantidad.setForeground(Color.gray);
            txtCantidad.setText("Cantidad");
            
        }
        
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMouseClicked
        // TODO add your handling code here:
        txtCantidad.setText("");
        txtCantidad.setForeground(Color.black);
        
        presentacion= String.valueOf(cbPresentacion.getSelectedItem());
        nombre= txtNombre.getText();
        descripcion= txtaDescripcion.getText();
        
        if(nombre.equals("")){
            
            txtNombre.setForeground(Color.gray);
            txtNombre.setText("Nombre");
            
        }
    }//GEN-LAST:event_txtCantidadMouseClicked

    private void txtaDescripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaDescripcionMouseClicked
        // TODO add your handling code here:
        
        nombre=txtNombre.getText();
        cantidad= txtCantidad.getText();
        
        if(nombre.equals("")){
            
            txtNombre.setForeground(Color.gray);
            txtNombre.setText("Nombre");
            
        }
        
        if(cantidad.equals("")){
            
            txtCantidad.setForeground(Color.gray);
            txtCantidad.setText("Cantidad");
            
        }
    }//GEN-LAST:event_txtaDescripcionMouseClicked

    private void lblRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseClicked
        // TODO add your handling code here:
        
        nombre= txtNombre.getText();
        presentacion= String.valueOf(cbPresentacion.getSelectedItem());
        cantidad= txtCantidad.getText();
        descripcion= txtaDescripcion.getText();
        
        String sql= "INSERT INTO medicamentos VALUES" + 
                "('"+nombre+"','"+presentacion+"','"+cantidad+"','"+descripcion+"')";
        
        
        
        try (PreparedStatement stm = ConexionBDD.conexion.prepareStatement(sql)){
            
            
            stm.executeUpdate();
            JOptionPane.showMessageDialog(this, "¡Excelente! Medicamento registrado =D");
            
            txtNombre.setForeground(Color.gray);
            txtNombre.setText("Nombre");
            
            txtCantidad.setForeground(Color.gray);
            txtCantidad.setText("Cantidad");
            
            txtaDescripcion.setText("");
            stm.close();
            
        }catch(Exception e){
            
            e.printStackTrace();
        }
    }//GEN-LAST:event_lblRegistrarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterMeds().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JComboBox<String> cbPresentacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPortada;
    private javax.swing.JLabel lblPresentacion;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtaDescripcion;
    // End of variables declaration//GEN-END:variables
}
