/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Mahesh
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        secondvaluebox = new javax.swing.JTextField();
        firstvaluebox = new javax.swing.JTextField();
        okbtn = new javax.swing.JButton();
        answerbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        secondvaluebox.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        secondvaluebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondvalueboxActionPerformed(evt);
            }
        });
        jPanel1.add(secondvaluebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 50, 40));

        firstvaluebox.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        firstvaluebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstvalueboxActionPerformed(evt);
            }
        });
        jPanel1.add(firstvaluebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 50, 40));

        okbtn.setBackground(new java.awt.Color(51, 51, 255));
        okbtn.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        okbtn.setText("EXIT");
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });
        jPanel1.add(okbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 50));

        answerbox.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        answerbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerboxActionPerformed(evt);
            }
        });
        jPanel1.add(answerbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 50, 50));

        jLabel1.setFont(new java.awt.Font("Jokerman", 0, 18)); // NOI18N
        jLabel1.setText("Answer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 90, 60));

        jLabel2.setFont(new java.awt.Font("Jokerman", 0, 18)); // NOI18N
        jLabel2.setText("First number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 40));

        jButton1.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 90, 50));

        jLabel3.setFont(new java.awt.Font("Jokerman", 0, 18)); // NOI18N
        jLabel3.setText("Second number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 50, 40));

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("x");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 50, 40));

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("/");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 50, 40));

        jButton5.setBackground(new java.awt.Color(102, 102, 255));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 50, 40));

        jLabel4.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setText("SIMPLE CALCULATOR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, 350, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstvalueboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstvalueboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstvalueboxActionPerformed

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtnActionPerformed
       
//        int firstvalue = Integer.parseInt(firstvaluebox.getText());
//        int secondvalue = Integer.parseInt(secondvaluebox.getText());
//        
//        int sum = firstvalue+secondvalue;
//        
//        answerbox.setText(sum+"");
    }//GEN-LAST:event_okbtnActionPerformed

    private void answerboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerboxActionPerformed

    }//GEN-LAST:event_answerboxActionPerformed

    private void secondvalueboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondvalueboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondvalueboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        firstvaluebox.setText(null);
        secondvaluebox.setText(null);
        answerbox.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int firstvalue = Integer.parseInt(firstvaluebox.getText());
        int secondvalue = Integer.parseInt(secondvaluebox.getText());
        
        int sum = firstvalue-secondvalue;
        
        answerbox.setText(sum+"");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int firstvalue = Integer.parseInt(firstvaluebox.getText());
        int secondvalue = Integer.parseInt(secondvaluebox.getText());
        
        int sum = firstvalue+secondvalue;
        
        answerbox.setText(sum+"");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int firstvalue = Integer.parseInt(firstvaluebox.getText());
        int secondvalue = Integer.parseInt(secondvaluebox.getText());
        
        int sum = firstvalue/secondvalue;
        
        answerbox.setText(sum+"");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int firstvalue = Integer.parseInt(firstvaluebox.getText());
        int secondvalue = Integer.parseInt(secondvaluebox.getText());
        
        int sum = firstvalue*secondvalue;
        
        answerbox.setText(sum+"");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerbox;
    private javax.swing.JTextField firstvaluebox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okbtn;
    private javax.swing.JTextField secondvaluebox;
    // End of variables declaration//GEN-END:variables
}
