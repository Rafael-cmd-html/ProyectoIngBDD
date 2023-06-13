/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windowsSystem;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VisualizarOptions extends javax.swing.JFrame {

    ImageIcon image;
    Icon icon;
    public VisualizarOptions() {
        
        initComponents();
        
        
        this.setLocationRelativeTo(this);
        setScaleLabel(lblImagen, "src/images/visuIcon.png");
        
        
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
        lblTitulo = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        cbVisualizar = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JPanel();
        lblContinuar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(270, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(270, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblTitulo.setText("¿Que datos deseas visualizar?");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 50, 210, -1));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 60, 60));

        cbVisualizar.setBackground(new java.awt.Color(255, 255, 255));
        cbVisualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cbVisualizar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visualizar pacientes", "Visualizar médicos", "Visualizar medicamentos", "Visualizar administradores", "Visualizar recepcionistas", "Visualizar consultas", "Visualizar dashboard" }));
        cbVisualizar.setBorder(null);
        jPanel1.add(cbVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 190, -1));

        btnRegresar.setBackground(new java.awt.Color(200, 220, 247));
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblRegresar.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 30));

        btnContinuar.setBackground(new java.awt.Color(200, 220, 247));
        btnContinuar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N

        lblContinuar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblContinuar.setForeground(new java.awt.Color(255, 255, 255));
        lblContinuar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContinuar.setText("Continuar");
        lblContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblContinuarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblContinuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblContinuarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnContinuarLayout = new javax.swing.GroupLayout(btnContinuar);
        btnContinuar.setLayout(btnContinuarLayout);
        btnContinuarLayout.setHorizontalGroup(
            btnContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnContinuarLayout.setVerticalGroup(
            btnContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void lblContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContinuarMouseEntered
        // TODO add your handling code here:
        btnContinuar.setBackground(Color.white);
        lblContinuar.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_lblContinuarMouseEntered

    private void lblContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContinuarMouseExited
        // TODO add your handling code here:
        btnContinuar.setBackground(new Color(200,220,247));
        lblContinuar.setForeground(Color.white);
    }//GEN-LAST:event_lblContinuarMouseExited

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        AdminOptions aO= new AdminOptions();
        aO.setVisible(true);
        
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContinuarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        String opcion= String.valueOf(cbVisualizar.getSelectedItem());
        if(opcion.equalsIgnoreCase("visualizar recepcionistas")){
            
            VisualizarRecepcionistas vR= new VisualizarRecepcionistas();
            vR.setVisible(true);
            
        }
        if(opcion.equalsIgnoreCase("visualizar administradores")){
            
            VisualizarAdministradores vA= new VisualizarAdministradores();
            vA.setVisible(true);
            
        }
        if(opcion.equalsIgnoreCase("Visualizar consultas")){
            
            VisualizarConsultas vC= new VisualizarConsultas();
            vC.setVisible(true);
            
        }
        if(opcion.equalsIgnoreCase("Visualizar pacientes")){
            
            VisualizarPacientes vP= new VisualizarPacientes();
            vP.setVisible(true);
            
        }
    }//GEN-LAST:event_lblContinuarMouseClicked

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
            java.util.logging.Logger.getLogger(VisualizarOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnContinuar;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JComboBox<String> cbVisualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContinuar;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
