/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayur
 */
public class stdprofileGUI extends javax.swing.JFrame {

    /**
     * Creates new form stdprofileGUI
     */
    public stdprofileGUI() {
        initComponents();
        setResizable(false);
        setSize(810,600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpdateProfileButton = new javax.swing.JButton();
        UpdateProfileButton1 = new javax.swing.JButton();
        FirstNmeTF = new javax.swing.JTextField();
        StudentIDTF = new javax.swing.JTextField();
        LastNameTF = new javax.swing.JTextField();
        FathersNameTF = new javax.swing.JTextField();
        EmailTF = new javax.swing.JTextField();
        PhoneTF = new javax.swing.JTextField();
        AddressTF = new javax.swing.JTextField();
        ProgramTF = new javax.swing.JTextField();
        DOBTF = new javax.swing.JTextField();
        CNICTF = new javax.swing.JTextField();
        RoomTF = new javax.swing.JTextField();
        BuldingTF = new javax.swing.JTextField();
        ProfileButton = new javax.swing.JButton();
        VoucherButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        stdprofile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        UpdateProfileButton.setBorderPainted(false);
        UpdateProfileButton.setContentAreaFilled(false);
        UpdateProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateProfileButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateProfileButton);
        UpdateProfileButton.setBounds(500, 480, 150, 50);

        UpdateProfileButton1.setBorderPainted(false);
        UpdateProfileButton1.setContentAreaFilled(false);
        UpdateProfileButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateProfileButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateProfileButton1);
        UpdateProfileButton1.setBounds(330, 480, 160, 50);

        FirstNmeTF.setEditable(false);
        FirstNmeTF.setBorder(null);
        FirstNmeTF.setOpaque(false);
        getContentPane().add(FirstNmeTF);
        FirstNmeTF.setBounds(360, 140, 170, 30);

        StudentIDTF.setEditable(false);
        StudentIDTF.setBorder(null);
        StudentIDTF.setOpaque(false);
        getContentPane().add(StudentIDTF);
        StudentIDTF.setBounds(620, 140, 120, 30);

        LastNameTF.setEditable(false);
        LastNameTF.setBorder(null);
        LastNameTF.setOpaque(false);
        getContentPane().add(LastNameTF);
        LastNameTF.setBounds(360, 170, 380, 30);

        FathersNameTF.setEditable(false);
        FathersNameTF.setBorder(null);
        FathersNameTF.setOpaque(false);
        FathersNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FathersNameTFActionPerformed(evt);
            }
        });
        getContentPane().add(FathersNameTF);
        FathersNameTF.setBounds(360, 206, 380, 30);

        EmailTF.setEditable(false);
        EmailTF.setBorder(null);
        EmailTF.setOpaque(false);
        getContentPane().add(EmailTF);
        EmailTF.setBounds(360, 240, 380, 20);

        PhoneTF.setEditable(false);
        PhoneTF.setBorder(null);
        PhoneTF.setOpaque(false);
        getContentPane().add(PhoneTF);
        PhoneTF.setBounds(360, 270, 380, 30);

        AddressTF.setEditable(false);
        AddressTF.setBorder(null);
        AddressTF.setOpaque(false);
        getContentPane().add(AddressTF);
        AddressTF.setBounds(360, 300, 380, 30);

        ProgramTF.setEditable(false);
        ProgramTF.setBorder(null);
        ProgramTF.setOpaque(false);
        getContentPane().add(ProgramTF);
        ProgramTF.setBounds(360, 336, 380, 20);

        DOBTF.setEditable(false);
        DOBTF.setBorder(null);
        DOBTF.setOpaque(false);
        getContentPane().add(DOBTF);
        DOBTF.setBounds(360, 370, 380, 20);

        CNICTF.setEditable(false);
        CNICTF.setBorder(null);
        CNICTF.setOpaque(false);
        getContentPane().add(CNICTF);
        CNICTF.setBounds(360, 400, 380, 30);

        RoomTF.setEditable(false);
        RoomTF.setBorder(null);
        RoomTF.setOpaque(false);
        getContentPane().add(RoomTF);
        RoomTF.setBounds(360, 430, 170, 30);

        BuldingTF.setEditable(false);
        BuldingTF.setBorder(null);
        BuldingTF.setOpaque(false);
        getContentPane().add(BuldingTF);
        BuldingTF.setBounds(620, 430, 120, 30);

        ProfileButton.setBorderPainted(false);
        ProfileButton.setContentAreaFilled(false);
        ProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ProfileButton);
        ProfileButton.setBounds(20, 90, 150, 30);

        VoucherButton.setBorderPainted(false);
        VoucherButton.setContentAreaFilled(false);
        VoucherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoucherButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VoucherButton);
        VoucherButton.setBounds(20, 140, 150, 29);

        LogoutButton.setBorderPainted(false);
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton);
        LogoutButton.setBounds(20, 510, 150, 30);

        stdprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/std_profile.jpg"))); // NOI18N
        getContentPane().add(stdprofile);
        stdprofile.setBounds(0, 0, 800, 569);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FathersNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FathersNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FathersNameTFActionPerformed

    private void VoucherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoucherButtonActionPerformed
        setVisible(false);
        stdvoucherGUI a = new stdvoucherGUI();
        a.setVisible(true);
    }//GEN-LAST:event_VoucherButtonActionPerformed

    private void ProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileButtonActionPerformed
        setVisible(false);
        stdprofileGUI a = new stdprofileGUI();
        a.setVisible(true);
    }//GEN-LAST:event_ProfileButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        setVisible(false);
        IntialGui a = new IntialGui();
        a.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void UpdateProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateProfileButtonActionPerformed
        setVisible(false);
        stdpassGUI a = new stdpassGUI();
        a.setVisible(true);
    }//GEN-LAST:event_UpdateProfileButtonActionPerformed

    private void UpdateProfileButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateProfileButton1ActionPerformed
        setVisible(false);
        stdupdateGUI a = new stdupdateGUI();
        a.setVisible(true);
    }//GEN-LAST:event_UpdateProfileButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(stdprofileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stdprofileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stdprofileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stdprofileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stdprofileGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTF;
    private javax.swing.JTextField BuldingTF;
    private javax.swing.JTextField CNICTF;
    private javax.swing.JTextField DOBTF;
    private javax.swing.JTextField EmailTF;
    private javax.swing.JTextField FathersNameTF;
    private javax.swing.JTextField FirstNmeTF;
    private javax.swing.JTextField LastNameTF;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField PhoneTF;
    private javax.swing.JButton ProfileButton;
    private javax.swing.JTextField ProgramTF;
    private javax.swing.JTextField RoomTF;
    private javax.swing.JTextField StudentIDTF;
    private javax.swing.JButton UpdateProfileButton;
    private javax.swing.JButton UpdateProfileButton1;
    private javax.swing.JButton VoucherButton;
    private javax.swing.JLabel stdprofile;
    // End of variables declaration//GEN-END:variables
}
