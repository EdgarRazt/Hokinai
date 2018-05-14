/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Bus.Coneccion;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author EdgarMoncloa
 */
public class JP_Inicio extends javax.swing.JPanel {

    private final ImageIcon II_IniciarTest,II_IniciarTest_Seleccion,II_Estadisticas,II_Estadisticas_Seleccion;
    //private final JP_Preguntas JPO_Preguntas;
    private final Coneccion con;
    public JP_Inicio(Coneccion con,boolean bol_Estadisticas) throws IOException {
       this.con=con;
       
       //URL Url=this.getClass().getResource("/Interfaz/inicio1080/Bot_IniciarTest.png");
       //BI_IniciarTest = ImageIO.read(new File("src/Interfaz/inicio1080/Bot_IniciarTest.png"));  
       II_IniciarTest = new ImageIcon(getClass().getResource("/Interfaz/inicio1080/Bot_IniciarTest.png"));  
       II_IniciarTest_Seleccion=new ImageIcon(getClass().getResource("/Interfaz/inicio1080/Bot_IniciarTest_Seleccion.png"));
       II_Estadisticas=new ImageIcon(getClass().getResource("/Interfaz/inicio1080/Bot_Estadisticas.png"));
       II_Estadisticas_Seleccion=new ImageIcon(getClass().getResource("/Interfaz/inicio1080/Bot_Estadisticas_Seleccion.png"));         
       initComponents();          
       JB_Estadisticas.setVisible(bol_Estadisticas);
       this.setBounds(0, 0, 1080, 720);           
       this.setVisible(true);        
    }
    public JPanel getPanel(){
        return this;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_IniciarTest = new javax.swing.JButton();
        Cho_Carrera = new java.awt.Choice();
        JL_Carrera = new javax.swing.JLabel();
        JB_Estadisticas = new javax.swing.JButton();
        JL_Fondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1080, 720));
        setLayout(null);

        JB_IniciarTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/inicio1080/Bot_IniciarTest.png"))); // NOI18N
        JB_IniciarTest.setBorderPainted(false);
        JB_IniciarTest.setContentAreaFilled(false);
        JB_IniciarTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JB_IniciarTestJBE_PasarMouse(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JB_IniciarTestJBE_SalirMouse(evt);
            }
        });
        JB_IniciarTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_IniciarTestActionPerformed(evt);
            }
        });
        add(JB_IniciarTest);
        JB_IniciarTest.setBounds(140, 190, 300, 270);

        Cho_Carrera.setBackground(new java.awt.Color(255, 242, 216));
        Cho_Carrera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cho_Carrera.setFocusable(false);
        add(Cho_Carrera);
        Cho_Carrera.setBounds(830, 160, 110, 20);
        Cho_Carrera.addItem("Ing en Sistemas");

        JL_Carrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/inicio1080/Lis_Carrera.png"))); // NOI18N
        JL_Carrera.setText("jLabel2");
        add(JL_Carrera);
        JL_Carrera.setBounds(660, 130, 300, 100);

        JB_Estadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/inicio1080/Bot_Estadisticas.png"))); // NOI18N
        JB_Estadisticas.setBorderPainted(false);
        JB_Estadisticas.setContentAreaFilled(false);
        JB_Estadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JB_EstadisticasEstadisticasEntra(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JB_EstadisticasEstadisticasMouseSale(evt);
            }
        });
        JB_Estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_EstadisticasActionPerformed(evt);
            }
        });
        add(JB_Estadisticas);
        JB_Estadisticas.setBounds(140, 500, 300, 140);

        JL_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/inicio1080/Fon_inicio1080.png"))); // NOI18N
        add(JL_Fondo);
        JL_Fondo.setBounds(0, 0, 1080, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void JB_IniciarTestJBE_PasarMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_IniciarTestJBE_PasarMouse
        JB_IniciarTest.setIcon((II_IniciarTest_Seleccion));
    }//GEN-LAST:event_JB_IniciarTestJBE_PasarMouse

    private void JB_IniciarTestJBE_SalirMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_IniciarTestJBE_SalirMouse
        JB_IniciarTest.setIcon((II_IniciarTest));
    }//GEN-LAST:event_JB_IniciarTestJBE_SalirMouse

    private void JB_IniciarTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_IniciarTestActionPerformed
        try {
            con.cambiarPreguntas();
        } catch (IOException ex) {
            Logger.getLogger(JP_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JB_IniciarTestActionPerformed

    private void JB_EstadisticasEstadisticasEntra(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_EstadisticasEstadisticasEntra
        JB_Estadisticas.setIcon((II_Estadisticas_Seleccion));
    }//GEN-LAST:event_JB_EstadisticasEstadisticasEntra

    private void JB_EstadisticasEstadisticasMouseSale(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_EstadisticasEstadisticasMouseSale
        JB_Estadisticas.setIcon((II_Estadisticas));
    }//GEN-LAST:event_JB_EstadisticasEstadisticasMouseSale

    private void JB_EstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_EstadisticasActionPerformed
        con.cambiarEstadisticas();
    }//GEN-LAST:event_JB_EstadisticasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice Cho_Carrera;
    public javax.swing.JButton JB_Estadisticas;
    public javax.swing.JButton JB_IniciarTest;
    private javax.swing.JLabel JL_Carrera;
    private javax.swing.JLabel JL_Fondo;
    // End of variables declaration//GEN-END:variables
}
