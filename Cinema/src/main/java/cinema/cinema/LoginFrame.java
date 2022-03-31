/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.mycompany.cinema;

/**
 *
 * @author 33659
 */
public class LoginFrame extends javax.swing.JFrame {

    /** Creates new form LoginFrame */
    public LoginFrame() {
        initComponents();
    }
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFirstBackground = new javax.swing.JPanel();
        LabelCinemaName = new javax.swing.JLabel();
        PanelSecondBackground = new javax.swing.JPanel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextPassword = new javax.swing.JTextField();
        jButtonSignIn = new javax.swing.JButton();
        jButtonSignUp = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparatorCinemaName = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(100, 130, 160));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PanelFirstBackground.setBackground(new java.awt.Color(54, 33, 89));

        LabelCinemaName.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        LabelCinemaName.setForeground(new java.awt.Color(204, 204, 204));
        LabelCinemaName.setText("Projector.");

        PanelSecondBackground.setBackground(new java.awt.Color(169, 149, 195));

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(204, 204, 204));
        jLabelEmail.setText("Email ");

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(204, 204, 204));
        jLabelPassword.setText("Password");

        jTextPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPasswordActionPerformed(evt);
            }
        });

        jButtonSignIn.setBackground(new java.awt.Color(214, 211, 218));
        jButtonSignIn.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jButtonSignIn.setForeground(new java.awt.Color(102, 102, 102));
        jButtonSignIn.setText("Sign In");
        jButtonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignInActionPerformed(evt);
            }
        });

        jButtonSignUp.setBackground(new java.awt.Color(214, 211, 218));
        jButtonSignUp.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jButtonSignUp.setForeground(new java.awt.Color(102, 102, 102));
        jButtonSignUp.setText("Sign Up");

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSecondBackgroundLayout = new javax.swing.GroupLayout(PanelSecondBackground);
        PanelSecondBackground.setLayout(PanelSecondBackgroundLayout);
        PanelSecondBackgroundLayout.setHorizontalGroup(
            PanelSecondBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSecondBackgroundLayout.createSequentialGroup()
                .addGroup(PanelSecondBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSecondBackgroundLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(PanelSecondBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelSecondBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField1))
                            .addGroup(PanelSecondBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelSecondBackgroundLayout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jButtonSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jButtonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        PanelSecondBackgroundLayout.setVerticalGroup(
            PanelSecondBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSecondBackgroundLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(PanelSecondBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(PanelSecondBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelSecondBackgroundLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(PanelSecondBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelFirstBackgroundLayout = new javax.swing.GroupLayout(PanelFirstBackground);
        PanelFirstBackground.setLayout(PanelFirstBackgroundLayout);
        PanelFirstBackgroundLayout.setHorizontalGroup(
            PanelFirstBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFirstBackgroundLayout.createSequentialGroup()
                .addGroup(PanelFirstBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFirstBackgroundLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(LabelCinemaName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFirstBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparatorCinemaName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelSecondBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        PanelFirstBackgroundLayout.setVerticalGroup(
            PanelFirstBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFirstBackgroundLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(LabelCinemaName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelFirstBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorCinemaName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelSecondBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFirstBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFirstBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPasswordActionPerformed

    private void jButtonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSignInActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCinemaName;
    private javax.swing.JPanel PanelFirstBackground;
    private javax.swing.JPanel PanelSecondBackground;
    private javax.swing.JButton jButtonSignIn;
    private javax.swing.JButton jButtonSignUp;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparatorCinemaName;
    private javax.swing.JTextField jTextPassword;
    // End of variables declaration//GEN-END:variables

}