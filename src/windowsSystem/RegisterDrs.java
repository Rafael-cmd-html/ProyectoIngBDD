
package windowsSystem;

import Classes.ConexionBDD;
import Classes.Main;
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
public class RegisterDrs extends javax.swing.JFrame {

        
    ImageIcon image;
    Icon icon;
    String nombre, especialidad, fechaIngreso, cedula, numeroTel, correo, idMedico;
    public RegisterDrs() {
        
        initComponents();
        this.setTitle("Registro doctor");
        this.setLocationRelativeTo(this); 
        setScaleLabel(lbl1,"src/images/docIcon_v2.png");
        setScaleLabel(lbl2,"src/images/header_v3.jpg");
        setScaleLabel(lbl9,"src/images/logo_v4.png");
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
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtEspecialidad = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        lbl9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 80, 80));
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 240));

        jPanel2.setBackground(new java.awt.Color(200, 220, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Registrar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -2, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 100, 30));

        jLabel1.setText("Nombre médico");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel2.setText("Especialidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        jLabel3.setText("Fecha de ingreso");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        jLabel4.setText("Número de cédula");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jLabel5.setText("Número telefónico");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jLabel6.setText("Correo electrónico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        jLabel7.setText("Número médico");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre.setForeground(java.awt.Color.gray);
        txtNombre.setText("Nombre");
        txtNombre.setBorder(null);
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
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 140, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 140, 10));

        txtEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtEspecialidad.setForeground(java.awt.Color.gray);
        txtEspecialidad.setText("Especialidad");
        txtEspecialidad.setBorder(null);
        txtEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEspecialidadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEspecialidadMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEspecialidadMousePressed(evt);
            }
        });
        txtEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecialidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 140, 20));

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtFecha.setForeground(java.awt.Color.gray);
        txtFecha.setText("Fecha");
        txtFecha.setBorder(null);
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFechaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaMousePressed(evt);
            }
        });
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 140, 20));

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCedula.setForeground(java.awt.Color.gray);
        txtCedula.setText("Cédula");
        txtCedula.setBorder(null);
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCedulaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCedulaMouseEntered(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 140, 20));

        txtNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtNumero.setForeground(java.awt.Color.gray);
        txtNumero.setText("Número");
        txtNumero.setBorder(null);
        txtNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNumeroMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroMousePressed(evt);
            }
        });
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 140, 20));

        txtCorreo.setEditable(false);
        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setForeground(java.awt.Color.gray);
        txtCorreo.setText("Correo");
        txtCorreo.setBorder(null);
        txtCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorreoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCorreoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 140, 20));

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setForeground(java.awt.Color.gray);
        txtId.setText("Id");
        txtId.setBorder(null);
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtIdMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdMousePressed(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 140, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 140, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 140, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 140, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 140, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 140, 20));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 150, 10));
        jPanel1.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 80, 80));

        jPanel3.setBackground(new java.awt.Color(200, 220, 247));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Regresar");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecialidadActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMouseEntered

    private void txtEspecialidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEspecialidadMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecialidadMouseEntered

    private void txtFechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaMouseEntered

    private void txtCedulaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMouseEntered

    private void txtNumeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroMouseEntered

    private void txtCorreoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMouseEntered

    private void txtIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMouseEntered

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEspecialidadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecialidadMouseClicked

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        // TODO add your handling code here:s
        txtNombre.setText("");
        txtNombre.setForeground(Color.black);
        
        especialidad=txtEspecialidad.getText();
        fechaIngreso=txtFecha.getText();
        cedula=txtCedula.getText();
        numeroTel= txtNumero.getText();
        correo= txtCorreo.getText();
        idMedico= txtId.getText();
        
        if(especialidad.equals("")){
            
            txtEspecialidad.setText("Especialidad");
            txtEspecialidad.setForeground(Color.gray);
            
        }
        if(fechaIngreso.equals("")){
            
            txtFecha.setText("Fecha");
            txtFecha.setForeground(Color.gray);
            
        
        }
        if(cedula.equals("")){
            
            txtCedula.setText("Cédula");
            txtCedula.setForeground(Color.gray);
            
        }
        if(numeroTel.equals("")){
            
            txtNumero.setText("Número");
            txtNumero.setForeground(Color.gray);
        }
        if(correo.equals("")){
            
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
            
        }
        if(idMedico.equals("")){
            
            txtId.setText("Id");
            txtId.setForeground(Color.gray);
            
        }
     
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtEspecialidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEspecialidadMousePressed
        // TODO add your handling code here:
        
        txtEspecialidad.setText("");
        txtEspecialidad.setForeground(Color.black);
        
        nombre=txtNombre.getText();
        fechaIngreso=txtFecha.getText();
        cedula=txtCedula.getText();
        numeroTel= txtNumero.getText();
        correo= txtCorreo.getText();
        idMedico= txtId.getText();
        
        if(nombre.equals("")){
            
            txtNombre.setText("Nombre");
            txtNombre.setForeground(Color.gray);
            
        }
        if(fechaIngreso.equals("")){
            
            txtFecha.setText("Fecha");
            txtFecha.setForeground(Color.gray);
            
        
        }
        if(cedula.equals("")){
            
            txtCedula.setText("Cédula");
            txtCedula.setForeground(Color.gray);
            
        }
        if(numeroTel.equals("")){
            
            txtNumero.setText("Número");
            txtNumero.setForeground(Color.gray);
        }
        if(correo.equals("")){
            
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
            
        }
        if(idMedico.equals("")){
            
            txtId.setText("Id");
            txtId.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtEspecialidadMousePressed

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        // TODO add your handling code here:
        txtFecha.setText("");
        txtFecha.setForeground(Color.black);
    }//GEN-LAST:event_txtFechaMouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        jPanel2.setBackground(Color.white);
        jLabel9.setForeground(new Color(200,220,247));
        
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(200,220,247));
        jLabel9.setForeground(Color.black);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(Color.white);
        jLabel8.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(200,220,247));
        jLabel8.setForeground(Color.black);
    }//GEN-LAST:event_jLabel8MouseExited

    private void txtCedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMouseClicked
        // TODO add your handling code here:
        txtCedula.setText("");
        txtCedula.setForeground(Color.black);
        
        especialidad=txtEspecialidad.getText();
        fechaIngreso=txtFecha.getText();
        nombre=txtNombre.getText();
        numeroTel= txtNumero.getText();
        correo= txtCorreo.getText();
        idMedico= txtId.getText();
        
        if(especialidad.equals("")){
            
            txtEspecialidad.setText("Especialidad");
            txtEspecialidad.setForeground(Color.gray);
            
        }
        if(fechaIngreso.equals("")){
            
            txtFecha.setText("Fecha");
            txtFecha.setForeground(Color.gray);
            
        
        }
        if(nombre.equals("")){
            
            txtNombre.setText("Nombre");
            txtNombre.setForeground(Color.gray);
            
        }
        if(numeroTel.equals("")){
            
            txtNumero.setText("Número");
            txtNumero.setForeground(Color.gray);
        }
        if(correo.equals("")){
            
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
            
        }
        if(idMedico.equals("")){
            
            txtId.setText("Id");
            txtId.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtCedulaMouseClicked

    private void txtNumeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroMousePressed
        // TODO add your handling code here:
        txtNumero.setText("");
        txtNumero.setForeground(Color.black);
        
        especialidad=txtEspecialidad.getText();
        fechaIngreso=txtFecha.getText();
        cedula=txtCedula.getText();
        nombre= txtNombre.getText();
        correo= txtCorreo.getText();
        idMedico= txtId.getText();
        
        if(especialidad.equals("")){
            
            txtEspecialidad.setText("Especialidad");
            txtEspecialidad.setForeground(Color.gray);
            
        }
        if(fechaIngreso.equals("")){
            
            txtFecha.setText("Fecha");
            txtFecha.setForeground(Color.gray);
            
        
        }
        if(cedula.equals("")){
            
            txtCedula.setText("Cédula");
            txtCedula.setForeground(Color.gray);
            
        }
        if(nombre.equals("")){
            
            txtNombre.setText("Nombre");
            txtNombre.setForeground(Color.gray);
        }
        if(correo.equals("")){
            
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
            
        }
        if(idMedico.equals("")){
            
            txtId.setText("Id");
            txtId.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtNumeroMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        // TODO add your handling code here:
        txtCorreo.setText("");
        txtCorreo.setForeground(Color.black);
        txtCorreo.setEditable(true);
        
        especialidad=txtEspecialidad.getText();
        fechaIngreso=txtFecha.getText();
        cedula=txtCedula.getText();
        numeroTel= txtNumero.getText();
        nombre= txtNombre.getText();
        idMedico= txtId.getText();
        
        if(especialidad.equals("")){
            
            txtEspecialidad.setText("Especialidad");
            txtEspecialidad.setForeground(Color.gray);
            
        }
        if(fechaIngreso.equals("")){
            
            txtFecha.setText("Fecha");
            txtFecha.setForeground(Color.gray);
            
        
        }
        if(cedula.equals("")){
            
            txtCedula.setText("Cédula");
            txtCedula.setForeground(Color.gray);
            
        }
        if(numeroTel.equals("")){
            
            txtNumero.setText("Número");
            txtNumero.setForeground(Color.gray);
        }
        if(nombre.equals("")){
            
            txtNombre.setText("Nombre");
            txtNombre.setForeground(Color.gray);
            
        }
        if(idMedico.equals("")){
            
            txtId.setText("Id");
            txtId.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMousePressed
        // TODO add your handling code here:
        txtId.setText("");
        txtId.setForeground(Color.black);
        
        nombre=txtNombre.getText();
        fechaIngreso=txtFecha.getText();
        cedula=txtCedula.getText();
        numeroTel= txtNumero.getText();
        correo= txtCorreo.getText();
        idMedico= txtId.getText();
        especialidad= txtEspecialidad.getText();
        
        if(especialidad.equals("")){
            
            txtEspecialidad.setText("Especialidad");
            txtEspecialidad.setForeground(Color.gray);
            
        }
        if(fechaIngreso.equals("")){
            
            txtFecha.setText("Fecha");
            txtFecha.setForeground(Color.gray);
            
        
        }
        if(cedula.equals("")){
            
            txtCedula.setText("Cédula");
            txtCedula.setForeground(Color.gray);
            
        }
        if(numeroTel.equals("")){
            
            txtNumero.setText("Número");
            txtNumero.setForeground(Color.gray);
        }
        if(correo.equals("")){
            
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
            
        }
        if(nombre.equals("")){
            
            txtNombre.setText("Nombre");
            txtNombre.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtIdMousePressed

    private void txtFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMousePressed
        // TODO add your handling code here:
        
        especialidad=txtEspecialidad.getText();
        nombre=txtNombre.getText();
        cedula=txtCedula.getText();
        numeroTel= txtNumero.getText();
        correo= txtCorreo.getText();
        idMedico= txtId.getText();
        
        if(especialidad.equals("")){
            
            txtEspecialidad.setText("Especialidad");
            txtEspecialidad.setForeground(Color.gray);
            
        }
        if(nombre.equals("")){
            
            txtNombre.setText("Nombre");
            txtNombre.setForeground(Color.gray);
            
        
        }
        if(cedula.equals("")){
            
            txtCedula.setText("Cédula");
            txtCedula.setForeground(Color.gray);
            
        }
        if(numeroTel.equals("")){
            
            txtNumero.setText("Número");
            txtNumero.setForeground(Color.gray);
        }
        if(correo.equals("")){
            
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
            
        }
        if(idMedico.equals("")){
            
            txtId.setText("Id");
            txtId.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtFechaMousePressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        
        especialidad=txtEspecialidad.getText();
        fechaIngreso=txtFecha.getText();
        nombre=txtNombre.getText();
        numeroTel= txtNumero.getText();
        correo= txtCorreo.getText();
        idMedico= txtId.getText();
        cedula= txtCedula.getText();
        
        String sql= "INSERT INTO medicos VALUES" + 
                "('"+nombre+"','"+especialidad+"','"+fechaIngreso+"','"+cedula+"','"+numeroTel+"','"+correo+"','"+idMedico+"')";
        
        
        
        try (PreparedStatement stm = ConexionBDD.conexion.prepareStatement(sql)){
            
            
            stm.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "¡Excelente! Doctor registrado =D");
            
            txtEspecialidad.setForeground(Color.gray);
            txtEspecialidad.setText("Especialidad");
            
            txtFecha.setForeground(Color.gray);
            txtFecha.setText("Fecha");
            
            txtNombre.setForeground(Color.gray);
            txtNombre.setText("Nombre");
            
            txtNumero.setForeground(Color.gray);
            txtNumero.setText("Número");
            
            txtCorreo.setForeground(Color.gray);
            txtCorreo.setText("Correo");
            
            txtId.setForeground(Color.gray);
            txtId.setText("Id");
            
            txtCedula.setForeground(Color.gray);
            txtCedula.setText("Cédula");
            
            stm.close();
            
        }catch(Exception e){
            
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void txtCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        
        this.dispose();
        RegisterOptions ro= new RegisterOptions();
        
        ro.setVisible(true);
        
    }//GEN-LAST:event_jLabel8MouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDrs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl9;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
