
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayur
 */
public class admreg2GUI extends javax.swing.JFrame {

    /**
     * Creates new form admreg2
     */
    int std_id;
        admin_driverCode adm_dc = new admin_driverCode();

    public admreg2GUI() {
        initComponents();
        setResizable(false);
        setSize(810, 600);
    }

    public admreg2GUI(int id) {

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

        RegisterButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        RoomsButton = new javax.swing.JButton();
        Employees = new javax.swing.JButton();
        VoucherButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        ShowAvailbleRoomsButton = new javax.swing.JButton();
        RoomNoTF = new javax.swing.JTextField();
        messCB = new javax.swing.JCheckBox();
        laundryCB = new javax.swing.JCheckBox();
        ParkingCB = new javax.swing.JCheckBox();
        GymCB = new javax.swing.JCheckBox();
        SrCB = new javax.swing.JCheckBox();
        CancelButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        RoomsButton.setBounds(30, 190, 140, 30);

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
        LogoutButton.setBounds(30, 510, 130, 30);

        NextButton.setBorder(null);
        NextButton.setBorderPainted(false);
        NextButton.setContentAreaFilled(false);
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NextButton);
        NextButton.setBounds(340, 490, 150, 30);

        ShowAvailbleRoomsButton.setBorder(null);
        ShowAvailbleRoomsButton.setContentAreaFilled(false);
        ShowAvailbleRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAvailbleRoomsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ShowAvailbleRoomsButton);
        ShowAvailbleRoomsButton.setBounds(600, 200, 160, 30);

        RoomNoTF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        RoomNoTF.setBorder(null);
        RoomNoTF.setOpaque(false);
        RoomNoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNoTFActionPerformed(evt);
            }
        });
        getContentPane().add(RoomNoTF);
        RoomNoTF.setBounds(220, 210, 250, 20);

        messCB.setBorder(null);
        messCB.setOpaque(false);
        getContentPane().add(messCB);
        messCB.setBounds(230, 340, 81, 23);

        laundryCB.setBorder(null);
        laundryCB.setOpaque(false);
        laundryCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laundryCBActionPerformed(evt);
            }
        });
        getContentPane().add(laundryCB);
        laundryCB.setBounds(230, 360, 81, 30);

        ParkingCB.setOpaque(false);
        ParkingCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParkingCBActionPerformed(evt);
            }
        });
        getContentPane().add(ParkingCB);
        ParkingCB.setBounds(230, 390, 100, 30);

        GymCB.setOpaque(false);
        GymCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GymCBActionPerformed(evt);
            }
        });
        getContentPane().add(GymCB);
        GymCB.setBounds(230, 410, 100, 40);

        SrCB.setOpaque(false);
        getContentPane().add(SrCB);
        SrCB.setBounds(230, 440, 81, 23);

        CancelButton.setBorderPainted(false);
        CancelButton.setContentAreaFilled(false);
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelButton);
        CancelButton.setBounds(500, 493, 150, 30);

        HomeButton.setBorderPainted(false);
        HomeButton.setContentAreaFilled(false);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton);
        HomeButton.setBounds(20, 19, 270, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amdin_registernew2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        setVisible(false);
        adminwelcomeGUI a = new adminwelcomeGUI();
        a.setVisible(true);
        int room_id = Integer.parseInt(RoomNoTF.getText());
        try {
            adm_dc.updateSTudentRoom(std_id, room_id);
        } catch (SQLException ex) {
            Logger.getLogger(admreg2GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_NextButtonActionPerformed

    private void ShowAvailbleRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAvailbleRoomsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowAvailbleRoomsButtonActionPerformed

    private void RoomNoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomNoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomNoTFActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        setVisible(false);
        adminrg1GUI a = new adminrg1GUI();
        a.setVisible(true);
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        setVisible(false);
        adminedit1GUI a = new adminedit1GUI();
        a.setVisible(true);
    }//GEN-LAST:event_EditButtonActionPerformed

    private void RoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsButtonActionPerformed
        setVisible(false);
        adminroomsGUI a = new adminroomsGUI();
        a.setVisible(true);
    }//GEN-LAST:event_RoomsButtonActionPerformed

    private void EmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeesActionPerformed
        setVisible(false);
        admitempGUI a = new admitempGUI();
        a.setVisible(true);
    }//GEN-LAST:event_EmployeesActionPerformed

    private void VoucherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoucherButtonActionPerformed
        setVisible(false);
        adminvoucherGUI a = new adminvoucherGUI();
        a.setVisible(true);
    }//GEN-LAST:event_VoucherButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        setVisible(false);
        IntialGui a = new IntialGui();
        a.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void laundryCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laundryCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laundryCBActionPerformed

    private void GymCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GymCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GymCBActionPerformed

    private void ParkingCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParkingCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ParkingCBActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
        adminwelcomeGUI a = new adminwelcomeGUI();
        a.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        setVisible(false);
        adminwelcomeGUI a = new adminwelcomeGUI();
        a.setVisible(true);
    }//GEN-LAST:event_HomeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(admreg2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admreg2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admreg2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admreg2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admreg2GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton Employees;
    private javax.swing.JCheckBox GymCB;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton NextButton;
    private javax.swing.JCheckBox ParkingCB;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField RoomNoTF;
    private javax.swing.JButton RoomsButton;
    private javax.swing.JButton ShowAvailbleRoomsButton;
    private javax.swing.JCheckBox SrCB;
    private javax.swing.JButton VoucherButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox laundryCB;
    private javax.swing.JCheckBox messCB;
    // End of variables declaration//GEN-END:variables
}
