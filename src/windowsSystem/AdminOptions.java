
package windowsSystem;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class AdminOptions extends javax.swing.JFrame {

    ImageIcon image;
    Icon icon;
    RegisterOptions ventanaOpcionesRegistro= new RegisterOptions();
    public AdminOptions() {
        
        initComponents();
        setScaleLabel(lblProfile, "src/images/adminIcon_v5.png");
        setScaleLabel(lblImageRegister, "src/images/registerIcon_v1.png");
        setScaleLabel(lblImageVisualizar1, "src/images/visualizarIcon_v1.png");
        setScaleLabel(lblImageEditar1, "src/images/editIcon_v1.png");
        setScaleLabel(lblImageDelete, "src/images/deleteIcon_v1.png");
        
        lblRegisterDescription.setText("<html><body>Puedes registrar pacientes, recepcionistas, médicos, <br>"
                + "medicamentos, consultas e incluso a otro compañero <br> administrador. <br></html></body>");
        
        lblVisualizarDescription1.setText("<html><body>Puedes vizualizar los datos de <br> pacientes, recepcionistas, médicos, <br>"
                + "medicamentos, consultas, nuestro dasboard <br> e incluso a otro compañero <br> administrador. <br></html></body>");
        
        lblEditarDescription.setText("<html><body>Puedes editar los datos de <br> pacientes, recepcionistas, médicos, <br>"
                + "medicamentos, consultas e incluso a otro compañero <br> administrador. <br></html></body>");
        
        lblDeleteDescription.setText("<html><body>Puedes eliminar pacientes, recepcionistas, médicos, <br>"
                + "medicamentos, consultas e incluso a otro compañero <br> administrador. <br></html></body>");
        
        this.setLocationRelativeTo(this);
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
        pnlAdmin = new javax.swing.JPanel();
        lblProfile = new javax.swing.JLabel();
        pnlVisualizar = new javax.swing.JPanel();
        lblVisualizar1 = new javax.swing.JLabel();
        lblVisualizarDescription1 = new javax.swing.JLabel();
        lblImageVisualizar1 = new javax.swing.JLabel();
        btnIr2 = new javax.swing.JPanel();
        lblIr2 = new javax.swing.JLabel();
        pnlOpcionesRegistro = new javax.swing.JPanel();
        lblRegisterDescription = new javax.swing.JLabel();
        lblImageRegister = new javax.swing.JLabel();
        lblRegisterOptions1 = new javax.swing.JLabel();
        btnIr = new javax.swing.JPanel();
        lblIr = new javax.swing.JLabel();
        pnlOpcionesDelete = new javax.swing.JPanel();
        lblDelete = new javax.swing.JLabel();
        lblDeleteDescription = new javax.swing.JLabel();
        lblImageDelete = new javax.swing.JLabel();
        pnlIr4 = new javax.swing.JPanel();
        lblIr4 = new javax.swing.JLabel();
        pnlEditar = new javax.swing.JPanel();
        lblVisualizar = new javax.swing.JLabel();
        lblEditarDescription = new javax.swing.JLabel();
        lblImageEditar1 = new javax.swing.JLabel();
        pnlIr3 = new javax.swing.JPanel();
        lblIr3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAdmin.setBackground(new java.awt.Color(200, 220, 247));
        pnlAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlAdmin.add(lblProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 74, 77));

        jPanel1.add(pnlAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 570));

        pnlVisualizar.setBackground(new java.awt.Color(255, 255, 255));
        pnlVisualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlVisualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlVisualizarMouseExited(evt);
            }
        });
        pnlVisualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVisualizar1.setBackground(new java.awt.Color(255, 255, 255));
        lblVisualizar1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblVisualizar1.setText("Visualizar");
        pnlVisualizar.add(lblVisualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        pnlVisualizar.add(lblVisualizarDescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 370, 80));

        lblImageVisualizar1.setForeground(new java.awt.Color(255, 255, 255));
        pnlVisualizar.add(lblImageVisualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 40, 40));

        btnIr2.setBackground(new java.awt.Color(200, 220, 247));
        btnIr2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIr2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblIr2.setForeground(new java.awt.Color(255, 255, 255));
        lblIr2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIr2.setText("Ir");
        lblIr2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIr2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIr2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIr2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnIr2Layout = new javax.swing.GroupLayout(btnIr2);
        btnIr2.setLayout(btnIr2Layout);
        btnIr2Layout.setHorizontalGroup(
            btnIr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIr2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        btnIr2Layout.setVerticalGroup(
            btnIr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnIr2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIr2))
        );

        pnlVisualizar.add(btnIr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 70, 20));

        jPanel1.add(pnlVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 390, 150));

        pnlOpcionesRegistro.setBackground(new java.awt.Color(255, 255, 255));
        pnlOpcionesRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlOpcionesRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlOpcionesRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlOpcionesRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlOpcionesRegistroMouseExited(evt);
            }
        });
        pnlOpcionesRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlOpcionesRegistro.add(lblRegisterDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 350, 50));
        pnlOpcionesRegistro.add(lblImageRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 40, 40));

        lblRegisterOptions1.setBackground(new java.awt.Color(255, 255, 255));
        lblRegisterOptions1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblRegisterOptions1.setText("Registrar");
        pnlOpcionesRegistro.add(lblRegisterOptions1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnIr.setBackground(new java.awt.Color(200, 220, 247));
        btnIr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIr.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblIr.setForeground(new java.awt.Color(255, 255, 255));
        lblIr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIr.setText("Ir");
        lblIr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIrMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnIrLayout = new javax.swing.GroupLayout(btnIr);
        btnIr.setLayout(btnIrLayout);
        btnIrLayout.setHorizontalGroup(
            btnIrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnIrLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIr, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        btnIrLayout.setVerticalGroup(
            btnIrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIrLayout.createSequentialGroup()
                .addComponent(lblIr)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pnlOpcionesRegistro.add(btnIr, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 70, 20));

        jPanel1.add(pnlOpcionesRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 390, 160));

        pnlOpcionesDelete.setBackground(new java.awt.Color(255, 255, 255));
        pnlOpcionesDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlOpcionesDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlOpcionesDelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDelete.setBackground(new java.awt.Color(255, 255, 255));
        lblDelete.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblDelete.setText("Eliminar");
        pnlOpcionesDelete.add(lblDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        pnlOpcionesDelete.add(lblDeleteDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 370, 70));

        lblImageDelete.setForeground(new java.awt.Color(255, 255, 255));
        pnlOpcionesDelete.add(lblImageDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 30, 30));

        pnlIr4.setBackground(new java.awt.Color(200, 220, 247));
        pnlIr4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIr4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblIr4.setForeground(new java.awt.Color(255, 255, 255));
        lblIr4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIr4.setText("Ir");
        lblIr4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIr4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIr4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIr4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlIr4Layout = new javax.swing.GroupLayout(pnlIr4);
        pnlIr4.setLayout(pnlIr4Layout);
        pnlIr4Layout.setHorizontalGroup(
            pnlIr4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIr4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        pnlIr4Layout.setVerticalGroup(
            pnlIr4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIr4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIr4))
        );

        pnlOpcionesDelete.add(pnlIr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jPanel1.add(pnlOpcionesDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 390, 130));

        pnlEditar.setBackground(new java.awt.Color(255, 255, 255));
        pnlEditar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVisualizar.setBackground(new java.awt.Color(255, 255, 255));
        lblVisualizar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblVisualizar.setText("Editar");
        pnlEditar.add(lblVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        pnlEditar.add(lblEditarDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 370, 70));

        lblImageEditar1.setForeground(new java.awt.Color(255, 255, 255));
        pnlEditar.add(lblImageEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 30, 30));

        pnlIr3.setBackground(new java.awt.Color(200, 220, 247));
        pnlIr3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIr3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblIr3.setForeground(new java.awt.Color(255, 255, 255));
        lblIr3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIr3.setText("Ir");
        lblIr3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIr3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIr3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIr3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlIr3Layout = new javax.swing.GroupLayout(pnlIr3);
        pnlIr3.setLayout(pnlIr3Layout);
        pnlIr3Layout.setHorizontalGroup(
            pnlIr3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIr3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        pnlIr3Layout.setVerticalGroup(
            pnlIr3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIr3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIr3))
        );

        pnlEditar.add(pnlIr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 70, 20));

        jPanel1.add(pnlEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 390, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlOpcionesRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOpcionesRegistroMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlOpcionesRegistroMouseEntered

    private void pnlOpcionesRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOpcionesRegistroMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pnlOpcionesRegistroMouseExited

    private void pnlVisualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVisualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlVisualizarMouseEntered

    private void pnlVisualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVisualizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlVisualizarMouseExited

    private void lblIrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIrMouseEntered
        // TODO add your handling code here:
        btnIr.setBackground(Color.white);
        lblIr.setForeground(new Color(200,220,247));
        
    }//GEN-LAST:event_lblIrMouseEntered

    private void lblIrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIrMouseExited
        // TODO add your handling code here:
        btnIr.setBackground(new Color(200,220,247));
        lblIr.setForeground(Color.white);
    }//GEN-LAST:event_lblIrMouseExited

    private void lblIr2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIr2MouseEntered
        // TODO add your handling code here:        
        btnIr2.setBackground(Color.white);
        lblIr2.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_lblIr2MouseEntered

    private void lblIr2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIr2MouseExited
        // TODO add your handling code here:
        btnIr2.setBackground(new Color(200,220,247));
        lblIr2.setForeground(Color.white);
    }//GEN-LAST:event_lblIr2MouseExited

    private void lblIr3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIr3MouseEntered
        // TODO add your handling code here:
        pnlIr3.setBackground(Color.white);
        lblIr3.setForeground(new Color(200,220,247));
        
    }//GEN-LAST:event_lblIr3MouseEntered

    private void lblIr3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIr3MouseExited
        // TODO add your handling code here:
        pnlIr3.setBackground(new Color(200,220,247));
        lblIr3.setForeground(Color.white);
        
    }//GEN-LAST:event_lblIr3MouseExited

    private void lblIr4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIr4MouseEntered
        // TODO add your handling code here:
        pnlIr4.setBackground(Color.white);
        lblIr4.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_lblIr4MouseEntered

    private void lblIr4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIr4MouseExited
        // TODO add your handling code here:
        pnlIr4.setBackground(new Color(200,220,247));
        lblIr4.setForeground(Color.white);
        
    }//GEN-LAST:event_lblIr4MouseExited

    private void lblIrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIrMouseClicked
        // TODO add your handling code here:
        this.dispose();
        ventanaOpcionesRegistro.setVisible(true);
        
    }//GEN-LAST:event_lblIrMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnIr;
    private javax.swing.JPanel btnIr2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblDeleteDescription;
    private javax.swing.JLabel lblEditarDescription;
    private javax.swing.JLabel lblImageDelete;
    private javax.swing.JLabel lblImageEditar1;
    private javax.swing.JLabel lblImageRegister;
    private javax.swing.JLabel lblImageVisualizar1;
    private javax.swing.JLabel lblIr;
    private javax.swing.JLabel lblIr2;
    private javax.swing.JLabel lblIr3;
    private javax.swing.JLabel lblIr4;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JLabel lblRegisterDescription;
    private javax.swing.JLabel lblRegisterOptions1;
    private javax.swing.JLabel lblVisualizar;
    private javax.swing.JLabel lblVisualizar1;
    private javax.swing.JLabel lblVisualizarDescription1;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JPanel pnlEditar;
    private javax.swing.JPanel pnlIr3;
    private javax.swing.JPanel pnlIr4;
    private javax.swing.JPanel pnlOpcionesDelete;
    private javax.swing.JPanel pnlOpcionesRegistro;
    private javax.swing.JPanel pnlVisualizar;
    // End of variables declaration//GEN-END:variables
}
