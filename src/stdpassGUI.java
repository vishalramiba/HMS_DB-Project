
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mayur
 */
public class stdpassGUI extends javax.swing.JFrame {

    /**
     * Creates new form stdpassGUI
     */
    int std_id;
    student_driverCode std_dc = new student_driverCode();

    public stdpassGUI() {
        initComponents();
        setResizable(false);
        setSize(810, 600);
    }

    public stdpassGUI(int id) {
        std_id = id;
        initComponents();
        setResizable(false);
        setSize(810, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProfileButton = new javax.swing.JButton();
        VoucherButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        OldPasswordTF = new javax.swing.JTextField();
        NewPasswordTF = new javax.swing.JTextField();
        ConfirmPasswordTF = new javax.swing.JTextField();
        HomeButton = new javax.swing.JButton();
        stdpass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ProfileButton.setBorderPainted(false);
        ProfileButton.setContentAreaFilled(false);
        ProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ProfileButton);
        ProfileButton.setBounds(20, 90, 140, 30);

        VoucherButton.setBorderPainted(false);
        VoucherButton.setContentAreaFilled(false);
        VoucherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoucherButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VoucherButton);
        VoucherButton.setBounds(20, 140, 130, 29);

        LogoutButton.setBorderPainted(false);
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton);
        LogoutButton.setBounds(20, 510, 130, 30);

        UpdateButton.setBorder(null);
        UpdateButton.setContentAreaFilled(false);
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateButton);
        UpdateButton.setBounds(420, 390, 150, 29);

        CancelButton.setBorder(null);
        CancelButton.setBorderPainted(false);
        CancelButton.setContentAreaFilled(false);
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelButton);
        CancelButton.setBounds(420, 430, 150, 30);

        OldPasswordTF.setBorder(null);
        OldPasswordTF.setOpaque(false);
        OldPasswordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OldPasswordTFActionPerformed(evt);
            }
        });
        getContentPane().add(OldPasswordTF);
        OldPasswordTF.setBounds(380, 176, 230, 30);

        NewPasswordTF.setBorder(null);
        NewPasswordTF.setOpaque(false);
        getContentPane().add(NewPasswordTF);
        NewPasswordTF.setBounds(380, 250, 230, 20);

        ConfirmPasswordTF.setBorder(null);
        ConfirmPasswordTF.setOpaque(false);
        getContentPane().add(ConfirmPasswordTF);
        ConfirmPasswordTF.setBounds(380, 330, 230, 20);

        HomeButton.setBorderPainted(false);
        HomeButton.setContentAreaFilled(false);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton);
        HomeButton.setBounds(20, 9, 280, 40);

        stdpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/std_changepw.jpg"))); // NOI18N
        getContentPane().add(stdpass);
        stdpass.setBounds(0, 0, 800, 569);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileButtonActionPerformed
        setVisible(false);
        stdprofileGUI a;
        try {
            a = new stdprofileGUI(std_id);
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(stdpassGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ProfileButtonActionPerformed

    private void OldPasswordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OldPasswordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OldPasswordTFActionPerformed

    private void VoucherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoucherButtonActionPerformed
        setVisible(false);
        stdvoucherGUI a;
        try {
            a = new stdvoucherGUI(std_id);
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(stdpassGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_VoucherButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        setVisible(false);
        IntialGui a = new IntialGui();
        a.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
        stdprofileGUI a;
        try {
            a = new stdprofileGUI(std_id);
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(stdpassGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_CancelButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        setVisible(false);
        StdwelcomeGUI a = new StdwelcomeGUI(std_id);
        a.setVisible(true);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

        String old_pass = new String(OldPasswordTF.getText());
        String new_pass = new String(NewPasswordTF.getText());
        String confirm_pass = new String(ConfirmPasswordTF.getText());
        
       
        stdprofileGUI a;
        try {
             if (old_pass.isEmpty() || new_pass.isEmpty() || confirm_pass.isEmpty()) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Fill All Fields");
        }
        
        if (!new_pass.equals(confirm_pass)) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Confirm password doesnot match");
        }
        
        else{
            int success = std_dc.updatePass(std_id, old_pass, new_pass, confirm_pass);
            if (success == 1) {
                setVisible(false);
                a = new stdprofileGUI(std_id);
                a.setVisible(true);
            }
        }
        } catch (SQLException ex) {
            Logger.getLogger(stdpassGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(stdpassGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stdpassGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stdpassGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stdpassGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stdpassGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField ConfirmPasswordTF;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField NewPasswordTF;
    private javax.swing.JTextField OldPasswordTF;
    private javax.swing.JButton ProfileButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton VoucherButton;
    private javax.swing.JLabel stdpass;
    // End of variables declaration//GEN-END:variables
}
