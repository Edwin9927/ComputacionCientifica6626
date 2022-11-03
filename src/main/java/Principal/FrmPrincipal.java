/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import Entidades.Circunferencia;
import Entidades.Epicicloide;
import Entidades.Hipocicloide;
import Entidades.Lazo;
import Entidades.Margarita;
import Entidades.Segmento;
import Entidades.Vector;
import Utilidades.Util;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edwinmanzano
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        viewPort = new ViewPort();
        canvas = viewPort.getCanvas();
        
        initComponents();
        
        JViewPort.add(viewPort);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        JViewPort = new javax.swing.JPanel();
        btnLimpiar0 = new javax.swing.JButton();
        BtnPintar2Colores1 = new javax.swing.JButton();
        btnInterpolarColores1 = new javax.swing.JButton();
        btnPintarPixel = new javax.swing.JButton();
        btnSecuenciaPixceles = new javax.swing.JButton();
        btnSegmento = new javax.swing.JButton();
        btnCircunferencia = new javax.swing.JButton();
        btnLazo = new javax.swing.JButton();
        btnMargarita = new javax.swing.JButton();
        btnPuntos = new javax.swing.JButton();
        btnEjes = new javax.swing.JButton();
        btnFigurasBasicas = new javax.swing.JButton();
        btnBorrarSeg = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmParcial1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmColores = new javax.swing.JMenu();
        BtnPintar2Colores = new javax.swing.JMenuItem();
        btnInterpolarColores = new javax.swing.JMenuItem();
        jMPixcel = new javax.swing.JMenu();
        jMSegmento = new javax.swing.JMenu();
        btnEncSegmento = new javax.swing.JMenuItem();
        btnApaSegmento = new javax.swing.JMenuItem();
        jMCircunferencia = new javax.swing.JMenu();
        btnPrueba = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gráficos 2D - 6626");
        setPreferredSize(new java.awt.Dimension(920, 620));

        JViewPort.setAlignmentX(0.0F);
        JViewPort.setAlignmentY(0.0F);
        JViewPort.setMaximumSize(new java.awt.Dimension(710, 510));
        JViewPort.setMinimumSize(new java.awt.Dimension(710, 510));
        JViewPort.setPreferredSize(new java.awt.Dimension(710, 510));

        btnLimpiar0.setText("Limpiar");
        btnLimpiar0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar0ActionPerformed(evt);
            }
        });

        BtnPintar2Colores1.setText("Pintar 2 Colores");
        BtnPintar2Colores1.setPreferredSize(new java.awt.Dimension(157, 29));
        BtnPintar2Colores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPintar2Colores1ActionPerformed(evt);
            }
        });

        btnInterpolarColores1.setText("Interpolar Colores");
        btnInterpolarColores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterpolarColores1ActionPerformed(evt);
            }
        });

        btnPintarPixel.setText("Encender Pixcel");
        btnPintarPixel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPintarPixelActionPerformed(evt);
            }
        });

        btnSecuenciaPixceles.setText("Secuencia de Pixceles");
        btnSecuenciaPixceles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecuenciaPixcelesActionPerformed(evt);
            }
        });

        btnSegmento.setText("Segmento");
        btnSegmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegmentoActionPerformed(evt);
            }
        });

        btnCircunferencia.setText("Circunferencia");
        btnCircunferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircunferenciaActionPerformed(evt);
            }
        });

        btnLazo.setText("Lazo");
        btnLazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLazoActionPerformed(evt);
            }
        });

        btnMargarita.setText("Margarita");
        btnMargarita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMargaritaActionPerformed(evt);
            }
        });

        btnPuntos.setText("Puntos");
        btnPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntosActionPerformed(evt);
            }
        });

        btnEjes.setText("Ejes");
        btnEjes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjesActionPerformed(evt);
            }
        });

        btnFigurasBasicas.setText("Figuras Basicas");
        btnFigurasBasicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFigurasBasicasActionPerformed(evt);
            }
        });

        btnBorrarSeg.setText("Animacion");
        btnBorrarSeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarSegActionPerformed(evt);
            }
        });

        jmParcial1.setText("Parcial I");
        jmParcial1.add(jSeparator1);

        jmColores.setText("Colores");

        BtnPintar2Colores.setText("Pintar 2 Colores");
        jmColores.add(BtnPintar2Colores);

        btnInterpolarColores.setText("Interpolar Colores");
        jmColores.add(btnInterpolarColores);

        jmParcial1.add(jmColores);

        jMPixcel.setText("Pixcel");
        jmParcial1.add(jMPixcel);

        jMSegmento.setText("Segmento");

        btnEncSegmento.setText("Encender");
        jMSegmento.add(btnEncSegmento);

        btnApaSegmento.setText("Apagar");
        btnApaSegmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApaSegmentoActionPerformed(evt);
            }
        });
        jMSegmento.add(btnApaSegmento);

        jmParcial1.add(jMSegmento);

        jMCircunferencia.setText("Circunferencia");
        jmParcial1.add(jMCircunferencia);

        btnPrueba.setText("Prueba");
        btnPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaActionPerformed(evt);
            }
        });
        jmParcial1.add(btnPrueba);

        jMenuBar1.add(jmParcial1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JViewPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(btnLimpiar0, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSecuenciaPixceles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(btnPintarPixel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInterpolarColores1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnPintar2Colores1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSegmento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCircunferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMargarita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPuntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEjes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFigurasBasicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrarSeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JViewPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(BtnPintar2Colores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInterpolarColores1)
                        .addGap(18, 18, 18)
                        .addComponent(btnPintarPixel)
                        .addGap(18, 18, 18)
                        .addComponent(btnSecuenciaPixceles)
                        .addGap(18, 18, 18)
                        .addComponent(btnSegmento)
                        .addGap(18, 18, 18)
                        .addComponent(btnCircunferencia)
                        .addGap(18, 18, 18)
                        .addComponent(btnLazo)
                        .addGap(18, 18, 18)
                        .addComponent(btnMargarita)
                        .addGap(18, 18, 18)
                        .addComponent(btnPuntos)
                        .addGap(18, 18, 18)
                        .addComponent(btnEjes)
                        .addGap(18, 18, 18)
                        .addComponent(btnFigurasBasicas)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarSeg)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPintar2Colores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPintar2Colores1ActionPerformed
        for(int i = 0; i<700; i++){
            for(int j = 0; j < 500; j++){
                if(i<350)
                    viewPort.pintarPixelCanvas(i, j, Color.RED, canvas);
                else
                    viewPort.pintarPixelCanvas(i, j, Color.BLUE, canvas);
            }
        }
        viewPort.Pintar(canvas);
    }//GEN-LAST:event_BtnPintar2Colores1ActionPerformed

    private void btnLimpiar0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar0ActionPerformed
        viewPort.limpiar();
    }//GEN-LAST:event_btnLimpiar0ActionPerformed

    private void btnInterpolarColores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterpolarColores1ActionPerformed
        for(int i = 0; i < 700; i++){
            for(int j = 0; j < 500; j++){
                    int c1 = (int) Util.interpolar3Puntos(i, 0.0, 0.0, 349.0, 255.0, 699.0, 0.0);
                    int c2 = (int) Util.interpolar3Puntos(i, 0.0, 0.0, 349.0, 255.0, 699.0, 0.0);
                    int c3 = (int) Util.interpolar3Puntos(i, 0.0, 255.0, 349.0, 255.0, 699.0, 255.0);
                    Color color = new Color (c1, c2, c3);
                    viewPort.pintarPixelCanvas(i, j, color, canvas);
                
                
            }
        }
        viewPort.Pintar(canvas);
    }//GEN-LAST:event_btnInterpolarColores1ActionPerformed

    private void btnPintarPixelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPintarPixelActionPerformed
        Vector v = new Vector ();
        
        v.setX0(2.0);
        v.setY0(3.0);
        v.setColor(Color.RED);
        
        v.encender(canvas);
        
        viewPort.Pintar(canvas);
    }//GEN-LAST:event_btnPintarPixelActionPerformed

    private void btnSecuenciaPixcelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecuenciaPixcelesActionPerformed
        Vector v = new Vector ();
        
        double x = -2.0;
        
        do{
            v.setX0(x);
            v.setY0(x * x - 5);
            v.setColor(Color.RED);

            v.encender(canvas);
            
            x += 0.05;
        }while(x<=3);
        
        viewPort.Pintar(canvas);
    }//GEN-LAST:event_btnSecuenciaPixcelesActionPerformed

    private void btnSegmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegmentoActionPerformed
        // TODO add your handling code here:
        Segmento s1 = new Segmento();
        s1.setX0(-7.0);
        s1.setY0(-5.0);
        
        s1.setXf(5.0);
        s1.setYf(4.0);
        
        //s1.setColor(Color.BLACK);
        
        s1.encender(canvas);
        /*
        Segmento s2 = new Segmento();
        s2.setX0(-4.0);
        s2.setY0(4.0);
        
        s2.setXf(5.0);
        s2.setYf(-5.0);
        
        s2.setColor(Color.RED);
        
        s2.encender(canvas);
        
        Segmento s3 = new Segmento();
        s3.setX0(-3.0);
        s3.setY0(4.0);
        
        s3.setXf(-4.5);
        s3.setYf(-5.0);
        
        s3.setColor(Color.BLUE);
        
        s3.encender(canvas);
        */
        
        
        viewPort.Pintar(canvas);
        
    }//GEN-LAST:event_btnSegmentoActionPerformed

    private void btnCircunferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircunferenciaActionPerformed
        // TODO add your handling code here:
        
        Circunferencia c = new Circunferencia();
        c.setX0(0.0);
        c.setY0(0.0);
        
        c.setRadio(4);
        
        c.setColor(Color.BLACK);
        
        c.encender(canvas);
        
        /*Circunferencia c1 = new Circunferencia();
        c1.setX0(-2.5);
        c1.setY0(.5);
        
        c1.setRadio(1);
        
        c1.setColor(Color.MAGENTA);
        
        c1.encender(canvas);
        
        Circunferencia c2 = new Circunferencia();
        c2.setX0(0.0);
        c2.setY0(2.3);
        
        c2.setRadio(1.5);
        
        c2.setColor(Color.CYAN);
        
        c2.encender(canvas);
        
        Circunferencia c3 = new Circunferencia();
        c3.setX0(3.0);
        c3.setY0(.0);
        
        c3.setRadio(1.5);
        
        c3.setColor(Color.ORANGE);
        
        c3.encender(canvas);*/
        viewPort.Pintar(canvas);
    }//GEN-LAST:event_btnCircunferenciaActionPerformed

    private void btnLazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLazoActionPerformed
        Lazo l = new Lazo();
        l.setX0(1.0);
        l.setY0(1.0);
        l.setRadio(4.0);
        l.setColor(Color.black);
        l.encender(canvas);
        
        viewPort.Pintar(canvas);
        
    }//GEN-LAST:event_btnLazoActionPerformed

    private void btnMargaritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMargaritaActionPerformed
        Margarita m = new Margarita();
        
        m.setX0(1.0);
        m.setY0(1.0);
        m.setRadio(4.0);
        m.setColor(Color.BLUE);
        m.encender(canvas);
        
        viewPort.Pintar(canvas);
        
    }//GEN-LAST:event_btnMargaritaActionPerformed

    private void btnPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntosActionPerformed
        // TODO add your handling code here:
        Vector v = new Vector ();
        
        double t = -5.0;
        double dt = 0.001;
        
        do{
            v.setX0(t);
            v.setY0(t * t - 3);
            
            int r = (int) Util.interpolar2Puntos(t, -3.0, 255.0, 5, 0.0);
            int g = (int) Util.interpolar2Puntos(t, -3.0, 255.0, 5, 0.0);
            int b = (int) Util.interpolar2Puntos(t, -3.0, 0.0, 5, 255.0);
            Color color = new Color (r, g, b);
            v.setColor(color);
            
            v.encender(canvas);
            
            /*
            v.setY0(Math.pow(2.0, t));
            v.setColor(Color.blue);
            v.encender(canvas);
            
            
            v.setY0(Math.sin(t));
            v.setColor(Color.cyan);
            v.encender(canvas);
            
            */
            t += dt;
        }while(t<=5);
        
        viewPort.Pintar(canvas);
    }//GEN-LAST:event_btnPuntosActionPerformed

    private void btnEjesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjesActionPerformed
        // TODO add your handling code here:
        Segmento s3 = new Segmento();
        
        s3.setX0(-7.0);
        s3.setY0(.0);
        
        s3.setXf(7.0);
        s3.setYf(0.0);
        
        s3.setColor(Color.black);
        
        s3.encender(canvas);
        
        s3.setX0(.0);
        s3.setY0(5.0);
        
        s3.setXf(.0);
        s3.setYf(-5.0);
        
        s3.encender(canvas);
        
        
        viewPort.Pintar(canvas);
        
    }//GEN-LAST:event_btnEjesActionPerformed

    private void btnFigurasBasicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFigurasBasicasActionPerformed
        // TODO add your handling code here:
        Segmento s1 = new Segmento();
        s1.setX0(0.0);
        s1.setY0(-5.0);
        s1.setXf(7.0);
        s1.setYf(0.0);
        s1.setColor(Color.cyan);
        s1.encender(canvas);
        
        
        Circunferencia c = new Circunferencia();
        c.setX0(3.5);
        c.setY0(2.5);
        c.setRadio(1.5);
        c.setColor(Color.magenta);
        c.encender(canvas);
        
        Lazo l = new Lazo();
        l.setX0(-3.5);
        l.setY0(2.5);
        l.setRadio(2.0);
        l.setColor(Color.GREEN);
        l.encender(canvas);
        
        Margarita m = new Margarita();
        m.setX0(-3.5);
        m.setY0(-2.5);
        m.setRadio(1.9);
        m.setColor(Color.BLUE);
        m.encender(canvas);
        
        viewPort.Pintar(canvas);
    }//GEN-LAST:event_btnFigurasBasicasActionPerformed

    private void btnBorrarSegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarSegActionPerformed
        // TODO add your handling code here:
        
        Lazo l = new Lazo();
        double x = -6.0;
        double y = Math.sin(x);
        do{
            l.setX0(x);
            l.setRadio(0.8);
            l.setY0(y);
            l.setColor(Color.black);
            l.encenderinterpolado(canvas);
            viewPort.Pintar(canvas);
            try {
                
                Thread.sleep(100);
                l.setColor(viewPort.getBackground());
                l.apagar(canvas);
                viewPort.Pintar(canvas);
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            x += 0.3;
            y = Math.sin(x);
            
        } while (x <= 6);
        
        /*
        Epicicloide h = new Epicicloide();
        
        h.setX0(0.0);
        h.setY0(0.0);
        h.setRadio(1.8);
        h.setRadio2(1.3);
        h.setColor(Color.yellow);
        h.encender(canvas);
        */
        viewPort.Pintar(canvas);
        
    }//GEN-LAST:event_btnBorrarSegActionPerformed

    private void btnApaSegmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApaSegmentoActionPerformed
        // TODO add your handling code here:
        Segmento s1 = new Segmento();
        s1.setX0(-7.0);
        s1.setY0(-5.0);
        
        s1.setXf(5.0);
        s1.setYf(4.0);
        
        s1.setColor(viewPort.getBackground());
        
        s1.apagar(canvas);
        
        viewPort.Pintar(canvas);
    }//GEN-LAST:event_btnApaSegmentoActionPerformed

    private void btnPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnPruebaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPrincipal vP = new FrmPrincipal();
                
                Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                
                Dimension vS = vP.getSize();
                
                vP.setLocation((d.height - vS.height)/2, (d.width - vS.width)/2);
                
                vP.setVisible(true);
            }
        });
    }

    BufferedImage canvas;
    ViewPort viewPort;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BtnPintar2Colores;
    private javax.swing.JButton BtnPintar2Colores1;
    private javax.swing.JPanel JViewPort;
    private javax.swing.JMenuItem btnApaSegmento;
    private javax.swing.JButton btnBorrarSeg;
    private javax.swing.JButton btnCircunferencia;
    private javax.swing.JButton btnEjes;
    private javax.swing.JMenuItem btnEncSegmento;
    private javax.swing.JButton btnFigurasBasicas;
    private javax.swing.JMenuItem btnInterpolarColores;
    private javax.swing.JButton btnInterpolarColores1;
    private javax.swing.JButton btnLazo;
    private javax.swing.JButton btnLimpiar0;
    private javax.swing.JButton btnMargarita;
    private javax.swing.JButton btnPintarPixel;
    private javax.swing.JMenuItem btnPrueba;
    private javax.swing.JButton btnPuntos;
    private javax.swing.JButton btnSecuenciaPixceles;
    private javax.swing.JButton btnSegmento;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMCircunferencia;
    private javax.swing.JMenu jMPixcel;
    private javax.swing.JMenu jMSegmento;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu jmColores;
    private javax.swing.JMenu jmParcial1;
    // End of variables declaration//GEN-END:variables
}
