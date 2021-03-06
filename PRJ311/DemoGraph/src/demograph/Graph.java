/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demograph;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JColorChooser;

/**
 *
 * @author nguye
 */
public class Graph extends javax.swing.JFrame {

    /**
     * Creates new form Graph
     */
    Graphics g;
    Point p1 = null, p2 = null;
    Color color = Color.RED;

    public Graph() {
        initComponents();
        g = jpnLine.getGraphics();
        jrbtnDrawFill.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jbtnSColor = new javax.swing.JButton();
        jrbtnDraw = new javax.swing.JRadioButton();
        jrbtnDrawFill = new javax.swing.JRadioButton();
        jtbp = new javax.swing.JTabbedPane();
        jpnLine = new javax.swing.JPanel();
        jpnEllipses = new javax.swing.JPanel();
        jpnRec = new javax.swing.JPanel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnSColor.setText("Select Color");
        jbtnSColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSColorActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbtnDraw);
        jrbtnDraw.setText("Draw");

        buttonGroup1.add(jrbtnDrawFill);
        jrbtnDrawFill.setText("Draw and fill");

        jtbp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbpMouseClicked(evt);
            }
        });

        jpnLine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnLineMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpnLineMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jpnLineLayout = new javax.swing.GroupLayout(jpnLine);
        jpnLine.setLayout(jpnLineLayout);
        jpnLineLayout.setHorizontalGroup(
            jpnLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );
        jpnLineLayout.setVerticalGroup(
            jpnLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jtbp.addTab("Lines", jpnLine);

        jpnEllipses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnEllipsesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpnEllipsesMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jpnEllipsesLayout = new javax.swing.GroupLayout(jpnEllipses);
        jpnEllipses.setLayout(jpnEllipsesLayout);
        jpnEllipsesLayout.setHorizontalGroup(
            jpnEllipsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );
        jpnEllipsesLayout.setVerticalGroup(
            jpnEllipsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jtbp.addTab("Ellipses", jpnEllipses);

        jpnRec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnRecMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpnRecMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jpnRecLayout = new javax.swing.GroupLayout(jpnRec);
        jpnRec.setLayout(jpnRecLayout);
        jpnRecLayout.setHorizontalGroup(
            jpnRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );
        jpnRecLayout.setVerticalGroup(
            jpnRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jtbp.addTab("Rectangles", jpnRec);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jbtnSColor)
                        .addGap(18, 18, 18)
                        .addComponent(jrbtnDraw)
                        .addGap(18, 18, 18)
                        .addComponent(jrbtnDrawFill)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtbp, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSColor)
                    .addComponent(jrbtnDraw)
                    .addComponent(jrbtnDrawFill))
                .addGap(18, 18, 18)
                .addComponent(jtbp, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSColorActionPerformed
        color = JColorChooser.showDialog(this, "Pick a color", color);
        g.setColor(color);
    }//GEN-LAST:event_jbtnSColorActionPerformed

    private void jtbpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbpMouseClicked
        int index = jtbp.getSelectedIndex();
        switch (index) {
            case 0:
                g = jpnLine.getGraphics();
                jrbtnDraw.setSelected(true);
                jrbtnDrawFill.setEnabled(false);
                break;
            case 1:
                g = jpnEllipses.getGraphics();
                jrbtnDrawFill.setEnabled(true);
                break;
            case 2:
                g = jpnRec.getGraphics();
                jrbtnDrawFill.setEnabled(true);
                break;
        }
        g.setColor(color);
    }//GEN-LAST:event_jtbpMouseClicked

    private void jpnLineMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnLineMouseReleased
        p2 = evt.getPoint();
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
        p1 = p2 = null;
    }//GEN-LAST:event_jpnLineMouseReleased

    private void jpnLineMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnLineMousePressed
        p1 = evt.getPoint();
    }//GEN-LAST:event_jpnLineMousePressed

    private void jpnEllipsesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnEllipsesMousePressed
        p1 = evt.getPoint();
    }//GEN-LAST:event_jpnEllipsesMousePressed

    private void jpnEllipsesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnEllipsesMouseReleased
        p2=  evt.getPoint();
        int left = Math.min(p1.x, p2.x);
        int top = Math.min(p1.y, p2.y);
        int width = Math.abs(p1.x = p2.x);
        int height = Math.abs(p1.y - p2.y);
        if (jrbtnDraw.isSelected()) {
            g.drawOval(left, top, width, height);
        } else {
            g.fillOval(left, top, width, height);
        }
        p1 = p2 = null;
    }//GEN-LAST:event_jpnEllipsesMouseReleased

    private void jpnRecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnRecMousePressed
        p1 = evt.getPoint();
    }//GEN-LAST:event_jpnRecMousePressed

    private void jpnRecMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnRecMouseReleased
        p2=  evt.getPoint();
        int left = Math.min(p1.x, p2.x);
        int top = Math.min(p1.y, p2.y);
        int width = Math.abs(p1.x = p2.x);
        int height = Math.abs(p1.y - p2.y);
        if (jrbtnDraw.isSelected()) {
            g.drawRect(left, top, width, height);
        } else {
            g.fillRect(left, top, width, height);
        }
        p1 = p2 = null;
    }//GEN-LAST:event_jpnRecMouseReleased

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
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton jbtnSColor;
    private javax.swing.JPanel jpnEllipses;
    private javax.swing.JPanel jpnLine;
    private javax.swing.JPanel jpnRec;
    private javax.swing.JRadioButton jrbtnDraw;
    private javax.swing.JRadioButton jrbtnDrawFill;
    private javax.swing.JTabbedPane jtbp;
    // End of variables declaration//GEN-END:variables
}
