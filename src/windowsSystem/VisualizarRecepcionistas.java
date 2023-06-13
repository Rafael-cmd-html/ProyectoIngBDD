
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
public class VisualizarRecepcionistas extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarRecepcionistas
     */
    ImageIcon image;
    Icon icon;
    
        
    DefaultTableModel tableModel= new DefaultTableModel();
    public VisualizarRecepcionistas() {
        initComponents();
        this.setLocationRelativeTo(this);
        setScaleLabel(lblBuscar,"src/images/buscarIcon.png");
        mostrarDatosCliente();
    }
    public void setScaleLabel(JLabel lbl, String route){
        
        
        image= new ImageIcon(route);
        icon= new ImageIcon(image.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        
        lbl.setIcon(icon);
        this.repaint();
       
        
    }
    public void mostrarDatosCliente(){
        
        tableModel= null;
        
        tableModel=new DefaultTableModel();
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Correo");
        tableModel.addColumn("ID");
        
        tblRecep.setModel(tableModel);
        
        String [] datosBDD= new String[3];
        
        try{
            
            Statement stm= ConexionBDD.conexion.createStatement();
            ResultSet rs= stm.executeQuery("SELECT * FROM recepcionistas;");
            
            while(rs.next()){

                datosBDD[0]= rs.getString(1);
                datosBDD[1]= rs.getString(2);
                datosBDD[2]= rs.getString(4);
                
                tableModel.addRow(datosBDD);
                
                tblRecep.setModel(tableModel);
                
            }
            
        }catch(Exception ev){
            
            JOptionPane.showMessageDialog(this, "LOS DATOS NO FUERON POSIBLES DE CARGAR");
            
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JPanel();
        lblEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecep = new javax.swing.JTable();
        btnActualizar = new javax.swing.JPanel();
        lblActualizar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addComponent(lblEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 30));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, 30));

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

        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, 30));

        tblRecep.setBackground(new java.awt.Color(255, 255, 255));
        tblRecep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblRecep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRecepMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRecep);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 122, -1, 290));

        btnActualizar.setBackground(new java.awt.Color(200, 220, 247));
        btnActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N

        lblActualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActualizar.setText("Actualizar");
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

        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, 30));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtBuscar.setForeground(java.awt.Color.gray);
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 410, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 410, 10));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        btnBuscar.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 50, 50));

        jLabel1.setText("Buscar...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        // TODO add your handling code here:
        int fila= tblRecep.getSelectedRow();
        String valor= String.valueOf(tblRecep.getValueAt( fila, 0));
        
        if(fila>=0){
            
            try {
                
                PreparedStatement pps= ConexionBDD.conexion.prepareStatement("DELETE FROM recepcionistas WHERE nombre_usuario= '"+valor+"';");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Recepcionista eliminado =(");
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(this, "No fue posible eliminar el registro");
                
            }
            
        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
        // TODO add your handling code here:
        mostrarDatosCliente();
    }//GEN-LAST:event_lblActualizarMouseClicked

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        // TODO add your handling code here:
        
        int fila= tblRecep.getSelectedRow();
        String id= String.valueOf(tblRecep.getValueAt(fila, 2));
        
        try {

            String nombre_usuario= String.valueOf(tblRecep.getValueAt(fila, 0));
            String correo= String.valueOf(tblRecep.getValueAt(fila, 1));
         
            PreparedStatement pps= ConexionBDD.conexion.prepareStatement("UPDATE recepcionistas SET nombre_usuario= '"+nombre_usuario+"', correo= '"+correo+"' WHERE id='"+id+"';");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(this, "DATOS ACTUALIZADOS! =D");

       } 
       catch (SQLException ex) {
                
            JOptionPane.showMessageDialog(this, "No se pudieron editar los datos");
                
        }
        
    }//GEN-LAST:event_lblEditarMouseClicked

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

    private void lblRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseExited
        // TODO add your handling code here:
        btnRegresar.setBackground(new Color(200,220,247));
        lblRegresar.setForeground(Color.white);
    }//GEN-LAST:event_lblRegresarMouseExited

    private void lblRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseEntered
        // TODO add your handling code here:
        btnRegresar.setBackground(Color.white);
        lblRegresar.setForeground(new Color(200,220,247));
    }//GEN-LAST:event_lblRegresarMouseEntered

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        VisualizarOptions vO= new VisualizarOptions();
        vO.setVisible(true);
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        // TODO add your handling code here:
        txtBuscar.setText("");
        txtBuscar.setForeground(Color.black);
    }//GEN-LAST:event_txtBuscarMouseClicked

    private void tblRecepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecepMouseClicked
        // TODO add your handling code here:
        if(txtBuscar.getText().equals("")){
            
            txtBuscar.setText("Buscar...");
            txtBuscar.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_tblRecepMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
        String [] registros= new String[200];
        String [] titulos= {"Nombre","Correo","ID"};
        String sql;
        if(txtBuscar.getText().equals("")){
            
            
            sql= "SELECT * FROM recepcionistas;";
            
        }else{
            
            
             sql= "SELECT * FROM recepcionistas WHERE nombre_usuario LIKE '%"+txtBuscar.getText()+"%';";
            
        }
        DefaultTableModel tM= new DefaultTableModel(null, titulos);
        try{
            
            Statement st= ConexionBDD.conexion.createStatement();
            ResultSet rs= st.executeQuery(sql);
            
            while(rs.next()){
                
                
                registros[0]=rs.getString(1);
                registros[1]=rs.getString(2);
                registros[2]=rs.getString(4);
                tM.addRow(registros);
                
            }
            tblRecep.setModel(tM);
            
        } catch (SQLException ex) {
            
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se encontró el dato");
            
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarRecepcionistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnActualizar;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JTable tblRecep;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
