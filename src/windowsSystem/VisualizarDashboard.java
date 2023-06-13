/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windowsSystem;

import Classes.ConexionBDD;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.Statement;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Rafael Castillejos
 */
public class VisualizarDashboard extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarDashboard
     */
    public VisualizarDashboard() {
        initComponents();
        
        this.setLocationRelativeTo(this);
        int medicosNeuro=0;
        int medicosPediatras=0;
        int medicosCardiologos=0;
        int medicosPlasticos=0;
        
        int pacientesDeAlta=0;
        int pacientesTratamiento=0;
        
        int pacientesTotales=0;
        int medicosTotales=0;
        
        try(Statement stm = ConexionBDD.conexion.createStatement()){

            String sql1 = "SELECT * FROM medicos WHERE especialidad= 'Neuro';";
            String sql2 = "SELECT * FROM medicos WHERE especialidad= 'Pediatra';";
            String sql3 = "SELECT * FROM medicos WHERE especialidad= 'Cardio';";
            String sql4 = "SELECT * FROM medicos WHERE especialidad= 'Plastica';";
            
            String sql5 = "SELECT * FROM pacientes WHERE estado_actual= 'De alta';";
            String sql6 = "SELECT * FROM pacientes WHERE estado_actual= 'En tratamiento';";


            ResultSet resultSet = stm.executeQuery(sql1);

            
            while(resultSet.next()){

                medicosNeuro++;

            }
            resultSet= stm.executeQuery(sql2);
            while(resultSet.next()){
                
                medicosPediatras++;
                
            }
            resultSet= stm.executeQuery(sql3);
            while(resultSet.next()){
                
                medicosCardiologos++;
                
            }
            resultSet= stm.executeQuery(sql4);
            while(resultSet.next()){
                
                medicosPlasticos++;
                
            }
            
            resultSet=stm.executeQuery(sql5);
            while(resultSet.next()){
                
                pacientesDeAlta++;
                
            }
            
            resultSet=stm.executeQuery(sql6);
            while(resultSet.next()){
                
                pacientesTratamiento++;
                
            }
            
            resultSet=stm.executeQuery("SELECT * FROM pacientes");
            while(resultSet.next()){
                
                pacientesTotales++;
                
            }
            
            resultSet=stm.executeQuery("SELECT * FROM medicos");
            while(resultSet.next()){
                
                medicosTotales++;
                
            }
            
            DefaultPieDataset datosPastel= new DefaultPieDataset();
            datosPastel.setValue("Pacientes",  pacientesTotales);
            datosPastel.setValue("Médicos",  medicosTotales);
            
            JFreeChart grafico_circular= ChartFactory.createPieChart(
                    "Relación médicos-pacientes",
                    datosPastel,
                    true,
                    true,
                    false
            );
            
            ChartPanel circular= new ChartPanel(grafico_circular);
            circular.setMouseWheelEnabled(true);
            circular.setPreferredSize(new Dimension(200,250));
            
            pnlCirculo.add(circular, BorderLayout.NORTH);
            
            
            
            
            DefaultCategoryDataset datos= new DefaultCategoryDataset();
            datos.setValue(medicosNeuro,  "Especialidad", "Neuro");
            datos.setValue(medicosPediatras,  "Especialidad", "Pediatra");
            datos.setValue(medicosCardiologos,  "Especialidad", "Cardio");
            datos.setValue(medicosPlasticos,  "Especialidad", "Plastica");
            
            
            DefaultCategoryDataset datos2= new DefaultCategoryDataset();
            datos2.setValue(pacientesDeAlta,  "Estado actual", "De alta");
            datos2.setValue(pacientesTratamiento,  "Estado actual", "En tratamiento");
            
            JFreeChart grafica_barras1 = ChartFactory.createBarChart3D (
            "Médicos por especialidad",
             "Doctores",
             "Especialidad",
             datos,
             PlotOrientation.VERTICAL,
             true,
             true,
             false
            );
            JFreeChart grafica_barras2 = ChartFactory.createBarChart3D (
            "Estado actual de los pacientes",
             "Pacientes",
             "Estado actual",
             datos2,
             PlotOrientation.VERTICAL,
             true,
             true,
             false
            );
            
            ChartPanel graficas= new ChartPanel(grafica_barras1);
            graficas.setMouseWheelEnabled(true);
            graficas.setPreferredSize(new Dimension(0, 206));
            pnlGraficaBarras.add(graficas,BorderLayout.NORTH);
            
            ChartPanel graficas2= new ChartPanel(grafica_barras2);
            graficas2.setMouseWheelEnabled(true);
            graficas2.setPreferredSize(new Dimension(250, 200));
            pnlGrafica2.add(graficas2,BorderLayout.NORTH);
            
            
            this.repaint();
            stm.close();

        }catch (Exception ev){

            ev.printStackTrace();

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGraficaBarras = new javax.swing.JPanel();
        pnlGrafica2 = new javax.swing.JPanel();
        pnlCirculo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlGraficaBarras.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlGraficaBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 211));

        pnlGrafica2.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlGrafica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 214, 390, 270));

        pnlCirculo.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlCirculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 350, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VisualizarDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlCirculo;
    private javax.swing.JPanel pnlGrafica2;
    private javax.swing.JPanel pnlGraficaBarras;
    // End of variables declaration//GEN-END:variables
}
