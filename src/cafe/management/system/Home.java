/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe.management.system;

import javax.swing.JOptionPane;

/**
 *
 * @author ghost
 */
public class Home extends javax.swing.JFrame {

    public String email;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();

    }

    public Home(String userEmail) {
        initComponents();
        email = userEmail;
        if (!email.equals("admin@gmail.com")) {
            btnCategory.setVisible(false);
            btnNewProduct.setVisible(false);
            btnViewEditDeleteProduct.setVisible(false);
            btnVerifyUsers.setVisible(false);
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnViewEditDeleteProduct = new javax.swing.JButton();
        btnVerifyUsers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        jButton2.setText("Place Order");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        jButton3.setText("View Bill & Order Placed Details");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        jButton4.setText("Change Password");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Security Question.png"))); // NOI18N
        jButton5.setText("Change SecurityQuestion");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, -1, -1));

        btnCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnCategory.setText("Mange Category");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, -1, -1));

        btnNewProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnNewProduct.setText("New Product");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, -1, -1));

        btnViewEditDeleteProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewEditDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnViewEditDeleteProduct.setText("View,Edit & Delete Product");
        btnViewEditDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditDeleteProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewEditDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, -1, -1));

        btnVerifyUsers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerifyUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify users.png"))); // NOI18N
        btnVerifyUsers.setText("Verify Users");
        btnVerifyUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 560, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-background-image.png"))); // NOI18N
        jLabel1.setText(".");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1370, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do You really Want to Logout", "select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do You really Want to Close Application", "select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        // TODO add your handling code here:
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnViewEditDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditDeleteProductActionPerformed
        // TODO add your handling code here:
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnViewEditDeleteProductActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        // TODO add your handling code here:
        new MangeCategory().setVisible(true);
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnVerifyUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyUsersActionPerformed
        // TODO add your handling code here:
        new VerifyUsers().setVisible(true);
    }//GEN-LAST:event_btnVerifyUsersActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnVerifyUsers;
    private javax.swing.JButton btnViewEditDeleteProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
