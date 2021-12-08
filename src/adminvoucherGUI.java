
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
public class adminvoucherGUI extends javax.swing.JFrame {

    /**
     * Creates new form adminvoucherGUI
     */
    admin_driverCode adm_dc = new admin_driverCode();

    public adminvoucherGUI() throws SQLException {
        initComponents();
        setResizable(false);
        setSize(810, 600);
        UnpaidChallansTF.setText(String.valueOf(adm_dc.countUnpaidChallans()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        RoomsButton = new javax.swing.JButton();
        Employees = new javax.swing.JButton();
        VoucherButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        ViewChallanButton = new javax.swing.JButton();
        CheckButton = new javax.swing.JButton();
        PayChallanButton = new javax.swing.JButton();
        UnpaidChallansTF = new javax.swing.JTextField();
        VoucherNoTF = new javax.swing.JTextField();
        VoucherNo2TF = new javax.swing.JTextField();
        HomeBUtton = new javax.swing.JButton();
        admvoucher = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        RegisterButton.setBorder(null);
        RegisterButton.setContentAreaFilled(false);
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterButton);
        RegisterButton.setBounds(20, 90, 140, 30);

        EditButton.setBorder(null);
        EditButton.setContentAreaFilled(false);
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EditButton);
        EditButton.setBounds(20, 140, 140, 30);

        RoomsButton.setBorder(null);
        RoomsButton.setContentAreaFilled(false);
        RoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RoomsButton);
        RoomsButton.setBounds(20, 190, 140, 30);

        Employees.setBorder(null);
        Employees.setContentAreaFilled(false);
        Employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeesActionPerformed(evt);
            }
        });
        getContentPane().add(Employees);
        Employees.setBounds(20, 230, 140, 30);

        VoucherButton.setBorder(null);
        VoucherButton.setBorderPainted(false);
        VoucherButton.setContentAreaFilled(false);
        VoucherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoucherButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VoucherButton);
        VoucherButton.setBounds(30, 280, 130, 29);

        LogoutButton.setBorder(null);
        LogoutButton.setBorderPainted(false);
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton);
        LogoutButton.setBounds(20, 510, 130, 30);

        ViewChallanButton.setBorder(null);
        ViewChallanButton.setContentAreaFilled(false);
        getContentPane().add(ViewChallanButton);
        ViewChallanButton.setBounds(580, 189, 170, 40);

        CheckButton.setBorder(null);
        CheckButton.setContentAreaFilled(false);
        CheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CheckButton);
        CheckButton.setBounds(580, 330, 170, 30);

        PayChallanButton.setBorder(null);
        PayChallanButton.setContentAreaFilled(false);
        PayChallanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayChallanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PayChallanButton);
        PayChallanButton.setBounds(580, 460, 180, 30);

        UnpaidChallansTF.setEditable(false);
        UnpaidChallansTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UnpaidChallansTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UnpaidChallansTF.setBorder(null);
        UnpaidChallansTF.setOpaque(false);
        getContentPane().add(UnpaidChallansTF);
        UnpaidChallansTF.setBounds(450, 200, 70, 20);

        VoucherNoTF.setBorder(null);
        VoucherNoTF.setOpaque(false);
        getContentPane().add(VoucherNoTF);
        VoucherNoTF.setBounds(220, 340, 310, 20);

        VoucherNo2TF.setBorder(null);
        VoucherNo2TF.setOpaque(false);
        getContentPane().add(VoucherNo2TF);
        VoucherNo2TF.setBounds(220, 470, 310, 20);

        HomeBUtton.setBorderPainted(false);
        HomeBUtton.setContentAreaFilled(false);
        HomeBUtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBUttonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeBUtton);
        HomeBUtton.setBounds(10, 9, 290, 40);

        admvoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin_voucher.jpg"))); // NOI18N
        getContentPane().add(admvoucher);
        admvoucher.setBounds(0, 0, 800, 569);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PayChallanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayChallanButtonActionPerformed
        String status = "";
        int id = Integer.parseInt(VoucherNo2TF.getText());
        try {
            int check = adm_dc.payVoucher(id);
            if(check ==1)
                status += "Voucher PAID";
            else if(check == 0)
                status += "Already Paid!";
            else status+= "Voucher Doesnot Exists!";
            JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, status);
        VoucherNo2TF.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(adminvoucherGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_PayChallanButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        setVisible(false);
        adminrg1GUI a = new adminrg1GUI();
        a.setVisible(true);
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        setVisible(false);
        adminedit1GUI a;
        try {
            a = new adminedit1GUI();
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(adminvoucherGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_EditButtonActionPerformed

    private void RoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsButtonActionPerformed
        setVisible(false);
        adminroomsGUI a;
        try {
            a = new adminroomsGUI();
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(adminvoucherGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_RoomsButtonActionPerformed

    private void EmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeesActionPerformed
        setVisible(false);
        admitempGUI a = new admitempGUI();
        a.setVisible(true);
    }//GEN-LAST:event_EmployeesActionPerformed

    private void VoucherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoucherButtonActionPerformed
        setVisible(false);
        adminvoucherGUI a;
        try {
            a = new adminvoucherGUI();
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(adminvoucherGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_VoucherButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        setVisible(false);
        IntialGui a = new IntialGui();
        a.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void HomeBUttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBUttonActionPerformed
        setVisible(false);
        adminwelcomeGUI a;
        try {
            a = new adminwelcomeGUI();
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(adminvoucherGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_HomeBUttonActionPerformed

    private void CheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckButtonActionPerformed
        String status = "";
        int id = Integer.parseInt(VoucherNoTF.getText());
        try {
            int check = adm_dc.checkVoucher_Status(id);
            if (check == 1) {
                status += "PAID!!";
            } else if (check == 0) {
                status += "NOT PAID!";
            } else {
                status += "Voucher doesnot exist!";
            }

            JFrame f = new JFrame();

            JOptionPane.showMessageDialog(f, status);

            VoucherNoTF.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(adminvoucherGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CheckButtonActionPerformed

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
            java.util.logging.Logger.getLogger(adminvoucherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminvoucherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminvoucherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminvoucherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new adminvoucherGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(adminvoucherGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton Employees;
    private javax.swing.JButton HomeBUtton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton PayChallanButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton RoomsButton;
    private javax.swing.JTextField UnpaidChallansTF;
    private javax.swing.JButton ViewChallanButton;
    private javax.swing.JButton VoucherButton;
    private javax.swing.JTextField VoucherNo2TF;
    private javax.swing.JTextField VoucherNoTF;
    private javax.swing.JLabel admvoucher;
    // End of variables declaration//GEN-END:variables
}
