
package windowsSystem;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Rafael Castillejos
 */
public class RegisterOptions extends javax.swing.JFrame {

    
    ImageIcon image;
    Icon icon;
    RegisterUsers ventanaRegistro= new RegisterUsers();
    AdminOptions opciones= new AdminOptions();
    RegisterDrs registroDrs= new RegisterDrs();
    public RegisterOptions() {
        
        initComponents();
        this.setLocationRelativeTo(this);
        ((JLabel)comboOpciones.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        setScaleLabel(img,"src/images/registerIcon_v1.png");
        this.setTitle("Opciones");
        
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
        lblTitle = new javax.swing.JLabel();
        comboOpciones = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JPanel();
        lblContinuar = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        lblTitle.setText("¿Qué es lo que desea registrar?");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        comboOpciones.setBackground(new java.awt.Color(255, 255, 255));
        comboOpciones.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        comboOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrar paciente", "Registrar recepcionista", "Registrar médico", "Registrar medicamento", "Registrar consulta", "Registrar administrador" }));
        comboOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOpcionesActionPerformed(evt);
            }
        });
        jPanel1.add(comboOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 180, -1));

        btnRegresar.setBackground(new java.awt.Color(200, 220, 247));
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegresar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegresar.setText("Regresar");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnRegresar.add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, 100, 20));

        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, 30));

        btnContinuar.setBackground(new java.awt.Color(200, 220, 247));
        btnContinuar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnContinuar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContinuar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblContinuar.setForeground(new java.awt.Color(255, 255, 255));
        lblContinuar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContinuar.setText("Continuar");
        lblContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnContinuar.add(lblContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 110, 20));

        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 110, 30));
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboOpcionesActionPerformed

    private void lblContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContinuarMouseEntered
        // TODO add your handling code here:
        btnContinuar.setBackground(Color.white);
        lblContinuar.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_lblContinuarMouseEntered

    private void lblContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContinuarMouseExited
        // TODO add your handling code here:
        btnContinuar.setBackground(new Color (200,220,247));
        lblContinuar.setForeground(Color.white);
    }//GEN-LAST:event_lblContinuarMouseExited

    private void lblRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseEntered
        // TODO add your handling code here:
        btnRegresar.setBackground(Color.white);
        lblRegresar.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_lblRegresarMouseEntered

    private void lblRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseExited
        // TODO add your handling code here:
        btnRegresar.setBackground(new Color (200,220,247));
        lblRegresar.setForeground(Color.white);
        
    }//GEN-LAST:event_lblRegresarMouseExited

    private void lblContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContinuarMouseClicked
        // TODO add your handling code here:
        String opcionSeleccionada=String.valueOf(comboOpciones.getSelectedItem());
        
        if(opcionSeleccionada.equalsIgnoreCase("Registrar administrador") || opcionSeleccionada.equals("Registrar recepcionista")){
            
            this.setVisible(false);
            ventanaRegistro.setVisible(true);
            
        }
        else if(opcionSeleccionada.equalsIgnoreCase("Registrar médico")){
            
            this.setVisible(false);
            registroDrs.setVisible(true);
            
        }
    }//GEN-LAST:event_lblContinuarMouseClicked

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        opciones.setVisible(true);
    }//GEN-LAST:event_lblRegresarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new RegisterOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnContinuar;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JComboBox<String> comboOpciones;
    private javax.swing.JLabel img;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContinuar;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
