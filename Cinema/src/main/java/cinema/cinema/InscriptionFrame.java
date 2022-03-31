/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cinema;

/**
 *
 * @author 33659
 */
public class InscriptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form InscriptionFrame
     */
    public InscriptionFrame() {
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

        PanelFirstBackground1 = new javax.swing.JPanel();
        LabelCinemaName1 = new javax.swing.JLabel();
        PanelSecondBackground1 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelPassword1 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jTextSurname = new javax.swing.JTextField();
        jButtonCreate = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelMail = new javax.swing.JLabel();
        jLabelBirth = new javax.swing.JLabel();
        jTextMail = new javax.swing.JTextField();
        jTextBirthDate = new javax.swing.JTextField();
        jLabelSurname = new javax.swing.JLabel();
        jTextPassword = new javax.swing.JTextField();
        jSeparatorCinemaName1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFirstBackground1.setBackground(new java.awt.Color(54, 33, 89));

        LabelCinemaName1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        LabelCinemaName1.setForeground(new java.awt.Color(204, 204, 204));
        LabelCinemaName1.setText("Projector.");

        PanelSecondBackground1.setBackground(new java.awt.Color(169, 149, 195));

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(204, 204, 204));
        jLabelName.setText("Name");

        jLabelPassword1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelPassword1.setForeground(new java.awt.Color(204, 204, 204));
        jLabelPassword1.setText("Password");

        jTextName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameActionPerformed(evt);
            }
        });

        jTextSurname.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSurnameActionPerformed(evt);
            }
        });

        jButtonCreate.setBackground(new java.awt.Color(214, 211, 218));
        jButtonCreate.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jButtonCreate.setForeground(new java.awt.Color(102, 102, 102));
        jButtonCreate.setText("Create");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(214, 211, 218));
        jButtonCancel.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(102, 102, 102));
        jButtonCancel.setText("Cancel");

        jLabelMail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelMail.setForeground(new java.awt.Color(204, 204, 204));
        jLabelMail.setText("Email");

        jLabelBirth.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelBirth.setForeground(new java.awt.Color(204, 204, 204));
        jLabelBirth.setText("Birth Date (YYYY-MM-DD)");

        jTextMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMailActionPerformed(evt);
            }
        });

        jTextBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBirthDateActionPerformed(evt);
            }
        });

        jLabelSurname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelSurname.setForeground(new java.awt.Color(204, 204, 204));
        jLabelSurname.setText("Surname");

        jTextPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSecondBackground1Layout = new javax.swing.GroupLayout(PanelSecondBackground1);
        PanelSecondBackground1.setLayout(PanelSecondBackground1Layout);
        PanelSecondBackground1Layout.setHorizontalGroup(
            PanelSecondBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSecondBackground1Layout.createSequentialGroup()
                .addGroup(PanelSecondBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSecondBackground1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(PanelSecondBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelSecondBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelMail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextMail, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                                .addComponent(jTextSurname)
                                .addComponent(jTextName)
                                .addComponent(jTextBirthDate)
                                .addComponent(jTextPassword))
                            .addComponent(jLabelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelSecondBackground1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        PanelSecondBackground1Layout.setVerticalGroup(
            PanelSecondBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSecondBackground1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabelName)
                .addGap(18, 18, 18)
                .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabelMail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextMail, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabelBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(PanelSecondBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelFirstBackground1Layout = new javax.swing.GroupLayout(PanelFirstBackground1);
        PanelFirstBackground1.setLayout(PanelFirstBackground1Layout);
        PanelFirstBackground1Layout.setHorizontalGroup(
            PanelFirstBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFirstBackground1Layout.createSequentialGroup()
                .addGroup(PanelFirstBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFirstBackground1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(LabelCinemaName1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFirstBackground1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparatorCinemaName1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelSecondBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFirstBackground1Layout.setVerticalGroup(
            PanelFirstBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFirstBackground1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(LabelCinemaName1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelFirstBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorCinemaName1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelSecondBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelFirstBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2638, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelFirstBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(1313, 1313, 1313)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameActionPerformed

    private void jTextSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSurnameActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jTextMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMailActionPerformed

    private void jTextBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBirthDateActionPerformed

    private void jTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCinemaName1;
    private javax.swing.JPanel PanelFirstBackground1;
    private javax.swing.JPanel PanelSecondBackground1;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JLabel jLabelBirth;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPassword1;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JSeparator jSeparatorCinemaName1;
    private javax.swing.JTextField jTextBirthDate;
    private javax.swing.JTextField jTextMail;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JTextField jTextSurname;
    // End of variables declaration//GEN-END:variables
}