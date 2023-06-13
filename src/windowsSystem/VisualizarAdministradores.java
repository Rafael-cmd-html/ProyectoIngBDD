/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windowsSystem;

import Classes.ConexionBDD;
import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.Statement;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Rafael Castillejos
 */
public class VisualizarAdministradores extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarAdministradores
     */
    ImageIcon image;
    Icon icon;
    DefaultTableModel tableModel= new DefaultTableModel();
    public VisualizarAdministradores() {
        initComponents();
        
        this.setLocationRelativeTo(this);
        setScaleLabel(lblBuscar,"src/images/buscarIcon.png");
        mostrarDatosAdmin();
        
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

        jPanel2 = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        jscroll = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        lblEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JPanel();
        lblActualizar = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        jPanel2.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 50, 50));

        tblAdmin.setBackground(new java.awt.Color(255, 255, 255));
        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdminMouseClicked(evt);
            }
        });
        jscroll.setViewportView(tblAdmin);

        jPanel2.add(jscroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 122, -1, 290));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setBorder(null);
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 450, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 450, 20));

        jLabel1.setForeground(java.awt.Color.gray);
        jLabel1.setText("Buscar...");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        btnEditar.setBackground(new java.awt.Color(200, 220, 247));
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblEditar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditar.setText("Editar");
        lblEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEditarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, 30));

        btnEliminar.setBackground(new java.awt.Color(200, 220, 247));
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar.setText("Eliminar");
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 110, 30));

        btnActualizar.setBackground(new java.awt.Color(200, 220, 247));
        btnActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblActualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActualizar.setText("Actualizar");
        lblActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblActualizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnActualizarLayout = new javax.swing.GroupLayout(btnActualizar);
        btnActualizar.setLayout(btnActualizarLayout);
        btnActualizarLayout.setHorizontalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnActualizarLayout.setVerticalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, 30));

        btnRegresar.setBackground(new java.awt.Color(200, 220, 247));
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lblBuscarMouseClicked

    private void tblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdminMouseClicked
        // TODO add your handling code here:
        if(txtBuscar.getText().equals("")){

            txtBuscar.setText("Buscar...");
            txtBuscar.setForeground(Color.gray);

        }
    }//GEN-LAST:event_tblAdminMouseClicked

    private void lblEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseEntered
        // TODO add your handling code here:
        btnEditar.setBackground(Color.white);
        lblEditar.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_lblEditarMouseEntered

    private void lblEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseExited
        // TODO add your handling code here:
        btnEditar.setBackground(new Color(200,220,247));
        lblEditar.setForeground(Color.white);
    }//GEN-LAST:event_lblEditarMouseExited

    private void lblEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseEntered
        // TODO add your handling code here:
        btnEliminar.setBackground(Color.white);
        lblEliminar.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_lblEliminarMouseEntered

    private void lblEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseExited
        // TODO add your handling code here:
        btnEliminar.setBackground(new Color(200,220,247));
        lblEliminar.setForeground(Color.white);
    }//GEN-LAST:event_lblEliminarMouseExited

    private void lblActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseEntered
        // TODO add your handling code here:
        btnActualizar.setBackground(Color.white);
        lblActualizar.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_lblActualizarMouseEntered

    private void lblActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseExited
        // TODO add your handling code here:
        btnActualizar.setBackground(new Color(200,220,247));
        lblActualizar.setForeground(Color.white);
    }//GEN-LAST:event_lblActualizarMouseExited

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

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        // TODO add your handling code here:
        
        int fila= tblAdmin.getSelectedRow();
        
        try {
            
            String id= String.valueOf(tblAdmin.getValueAt(fila, 2));

            String nombre_usuario= String.valueOf(tblAdmin.getValueAt(fila, 0));
            String correo= String.valueOf(tblAdmin.getValueAt(fila, 1));
            
            System.out.println(id);
            PreparedStatement pps= ConexionBDD.conexion.prepareStatement("UPDATE administradores SET nombre_usuario= '"+nombre_usuario+"', correo= '"+correo+"' WHERE id='"+id+"';");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(this, "DATOS ACTUALIZADOS! =D");

       } 
       catch (SQLException ex) {
                
            JOptionPane.showMessageDialog(this, "No se pudieron editar los datos");
                
        }
    }//GEN-LAST:event_lblEditarMouseClicked

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
        // TODO add your handling code here:
        mostrarDatosAdmin();
    }//GEN-LAST:event_lblActualizarMouseClicked

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        // TODO add your handling code here:
        int fila= tblAdmin.getSelectedRow();
        String valor= String.valueOf(tblAdmin.getValueAt( fila, 0));
        
        if(fila>=0){
            
            try {
                
                PreparedStatement pps= ConexionBDD.conexion.prepareStatement("DELETE FROM administradores WHERE nombre_usuario= '"+valor+"';");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Administrador eliminado =(");
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(this, "No fue posible eliminar el registro");
                
            }
            
        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        VisualizarOptions vO= new VisualizarOptions();
        vO.setVisible(true);
    }//GEN-LAST:event_lblRegresarMouseClicked
public void mostrarDatosAdmin(){
        
        tableModel= null;
        
        tableModel=new DefaultTableModel();
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Correo");
        tableModel.addColumn("Id");
        
        tblAdmin.setModel(tableModel);
        
        String [] datosBDD= new String[3];
        
        try{
            
            Statement stm= ConexionBDD.conexion.createStatement();
            ResultSet rs= stm.executeQuery("SELECT * FROM administradores;");
            
            while(rs.next()){

                datosBDD[0]= rs.getString(1);
                datosBDD[1]= rs.getString(3);
                datosBDD[2]= rs.getString(4);
                
                tableModel.addRow(datosBDD);
                
                tblAdmin.setModel(tableModel);
                
            }
            
        }catch(Exception ev){
            
            JOptionPane.showMessageDialog(this, "LOS DATOS NO FUERON POSIBLES DE CARGAR");
            
        }
        
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VisualizarAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarAdministradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnActualizar;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
