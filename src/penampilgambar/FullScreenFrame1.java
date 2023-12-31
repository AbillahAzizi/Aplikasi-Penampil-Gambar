/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package penampilgambar;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import javax.swing.JFrame;

/**
 *
 * @author Axioo
 */
public class FullScreenFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public FullScreenFrame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        btnGambar1 = new javax.swing.JButton();
        btnGambar2 = new javax.swing.JButton();
        btnGambar3 = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        lblGambar1 = new javax.swing.JLabel();
        lblGambar3 = new javax.swing.JLabel();
        lblGambar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnGambar1.setText("Gambar 1");
        btnGambar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGambar1ActionPerformed(evt);
            }
        });
        buttonPanel.add(btnGambar1);

        btnGambar2.setText("Gambar 2");
        btnGambar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGambar2ActionPerformed(evt);
            }
        });
        buttonPanel.add(btnGambar2);

        btnGambar3.setText("Gambar 3");
        btnGambar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGambar3ActionPerformed(evt);
            }
        });
        buttonPanel.add(btnGambar3);

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        buttonPanel.add(btnKeluar);

        imagePanel.setLayout(new java.awt.CardLayout());

        lblGambar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGambar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penampilgambar/gambar1.png"))); // NOI18N
        lblGambar1.setToolTipText("null");
        lblGambar1.setMaximumSize(new java.awt.Dimension(10, 10));
        lblGambar1.setMinimumSize(new java.awt.Dimension(10, 10));
        lblGambar1.setPreferredSize(new java.awt.Dimension(100, 100));
        imagePanel.add(lblGambar1, "0");
        lblGambar1.getAccessibleContext().setAccessibleName("0");

        lblGambar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGambar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penampilgambar/gambar3.jpg"))); // NOI18N
        lblGambar3.setToolTipText("null");
        imagePanel.add(lblGambar3, "2");
        lblGambar3.getAccessibleContext().setAccessibleName("2");

        lblGambar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGambar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penampilgambar/gambar3.jpg"))); // NOI18N
        lblGambar2.setToolTipText("null");
        imagePanel.add(lblGambar2, "1");
        lblGambar2.getAccessibleContext().setAccessibleName("1");

        buttonPanel.add(imagePanel);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGambar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGambar1ActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_btnGambar1ActionPerformed

    private void btnGambar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGambar2ActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_btnGambar2ActionPerformed

    private void btnGambar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGambar3ActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_btnGambar3ActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(FullScreenFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FullScreenFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FullScreenFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FullScreenFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PilihGambarButton fullframe = new PilihGambarButton();
                
                GraphicsDevice device =
                        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                Window fullFrame = null;
                
                device.setFullScreenWindow(fullFrame);
                fullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGambar1;
    private javax.swing.JButton btnGambar2;
    private javax.swing.JButton btnGambar3;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel lblGambar1;
    private javax.swing.JLabel lblGambar2;
    private javax.swing.JLabel lblGambar3;
    // End of variables declaration//GEN-END:variables
}
