
package windowsSystem;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Rafael Castillejos
 */
public class RegisterDrs extends javax.swing.JFrame {

        
    ImageIcon image;
    Icon icon;
    public RegisterDrs() {
        
        initComponents();
        this.setTitle("Registro doctor");
        this.setLocationRelativeTo(this); 
        setScaleLabel(lbl1,"src/images/docIcon_v2.png");
        setScaleLabel(lbl2,"src/images/header_v3.jpg");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 80, 80));

        lbl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 250));

        jPanel2.setBackground(new java.awt.Color(200, 220, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 100, 30));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, -1, -1));

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 140, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 140, 10));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField2.setText("jTextField2");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 140, -1));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField3.setText("jTextField3");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 140, -1));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField4.setText("jTextField4");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 140, -1));

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("jTextField5");
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 140, -1));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("jTextField6");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 140, -1));

        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setText("jTextField7");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 140, -1));

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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    // End of variables declaration//GEN-END:variables
}
