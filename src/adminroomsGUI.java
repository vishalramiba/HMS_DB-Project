/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayur
 */
public class adminroomsGUI extends javax.swing.JFrame {

    /**
     * Creates new form admiroomsGUI
     */
    public adminroomsGUI() {
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

        RegisterButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        RoomsButton = new javax.swing.JButton();
        Employees = new javax.swing.JButton();
        VoucherButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        ShowAvailbleRoomsButton = new javax.swing.JButton();
        VacateRoomButton = new javax.swing.JButton();
        Building1Occuiped = new javax.swing.JTextField();
        Building1Availble = new javax.swing.JTextField();
        Building2Occuiped = new javax.swing.JTextField();
        Building2Availble = new javax.swing.JTextField();
        Building3Occuiped = new javax.swing.JTextField();
        Building3Availble = new javax.swing.JTextField();
        Building4Occuiped = new javax.swing.JTextField();
        Building4Availble = new javax.swing.JTextField();
        RoomIDTF = new javax.swing.JTextField();
        NoOfAvailbleRoomsTF = new javax.swing.JTextField();
        admrooms = new javax.swing.JLabel();

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

        ShowAvailbleRoomsButton.setBorder(null);
        ShowAvailbleRoomsButton.setContentAreaFilled(false);
        ShowAvailbleRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAvailbleRoomsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ShowAvailbleRoomsButton);
        ShowAvailbleRoomsButton.setBounds(580, 310, 170, 30);

        VacateRoomButton.setBorder(null);
        VacateRoomButton.setContentAreaFilled(false);
        getContentPane().add(VacateRoomButton);
        VacateRoomButton.setBounds(580, 460, 170, 20);

        Building1Occuiped.setEditable(false);
        Building1Occuiped.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Building1Occuiped.setBorder(null);
        Building1Occuiped.setOpaque(false);
        Building1Occuiped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Building1OccuipedActionPerformed(evt);
            }
        });
        getContentPane().add(Building1Occuiped);
        Building1Occuiped.setBounds(340, 220, 90, 26);

        Building1Availble.setEditable(false);
        Building1Availble.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Building1Availble.setBorder(null);
        Building1Availble.setOpaque(false);
        Building1Availble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Building1AvailbleActionPerformed(evt);
            }
        });
        getContentPane().add(Building1Availble);
        Building1Availble.setBounds(440, 220, 90, 20);

        Building2Occuiped.setEditable(false);
        Building2Occuiped.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Building2Occuiped.setBorder(null);
        Building2Occuiped.setOpaque(false);
        Building2Occuiped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Building2OccuipedActionPerformed(evt);
            }
        });
        getContentPane().add(Building2Occuiped);
        Building2Occuiped.setBounds(340, 250, 90, 30);

        Building2Availble.setEditable(false);
        Building2Availble.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Building2Availble.setBorder(null);
        Building2Availble.setOpaque(false);
        Building2Availble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Building2AvailbleActionPerformed(evt);
            }
        });
        getContentPane().add(Building2Availble);
        Building2Availble.setBounds(440, 250, 90, 30);

        Building3Occuiped.setEditable(false);
        Building3Occuiped.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Building3Occuiped.setBorder(null);
        Building3Occuiped.setOpaque(false);
        getContentPane().add(Building3Occuiped);
        Building3Occuiped.setBounds(340, 280, 90, 30);

        Building3Availble.setEditable(false);
        Building3Availble.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Building3Availble.setBorder(null);
        Building3Availble.setOpaque(false);
        getContentPane().add(Building3Availble);
        Building3Availble.setBounds(440, 280, 90, 30);

        Building4Occuiped.setEditable(false);
        Building4Occuiped.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Building4Occuiped.setBorder(null);
        Building4Occuiped.setOpaque(false);
        getContentPane().add(Building4Occuiped);
        Building4Occuiped.setBounds(340, 320, 90, 20);

        Building4Availble.setEditable(false);
        Building4Availble.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Building4Availble.setBorder(null);
        Building4Availble.setOpaque(false);
        getContentPane().add(Building4Availble);
        Building4Availble.setBounds(440, 320, 90, 20);

        RoomIDTF.setBorder(null);
        RoomIDTF.setOpaque(false);
        getContentPane().add(RoomIDTF);
        RoomIDTF.setBounds(220, 460, 310, 20);

        NoOfAvailbleRoomsTF.setEditable(false);
        NoOfAvailbleRoomsTF.setBorder(null);
        NoOfAvailbleRoomsTF.setOpaque(false);
        getContentPane().add(NoOfAvailbleRoomsTF);
        NoOfAvailbleRoomsTF.setBounds(600, 260, 130, 20);

        admrooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin_rooms.jpg"))); // NOI18N
        getContentPane().add(admrooms);
        admrooms.setBounds(0, 0, 800, 569);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowAvailbleRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAvailbleRoomsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowAvailbleRoomsButtonActionPerformed

    private void Building1OccuipedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Building1OccuipedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Building1OccuipedActionPerformed

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

    private void Building2AvailbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Building2AvailbleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Building2AvailbleActionPerformed

    private void Building2OccuipedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Building2OccuipedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Building2OccuipedActionPerformed

    private void Building1AvailbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Building1AvailbleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Building1AvailbleActionPerformed

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
            java.util.logging.Logger.getLogger(adminroomsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminroomsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminroomsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminroomsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminroomsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Building1Availble;
    private javax.swing.JTextField Building1Occuiped;
    private javax.swing.JTextField Building2Availble;
    private javax.swing.JTextField Building2Occuiped;
    private javax.swing.JTextField Building3Availble;
    private javax.swing.JTextField Building3Occuiped;
    private javax.swing.JTextField Building4Availble;
    private javax.swing.JTextField Building4Occuiped;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton Employees;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField NoOfAvailbleRoomsTF;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField RoomIDTF;
    private javax.swing.JButton RoomsButton;
    private javax.swing.JButton ShowAvailbleRoomsButton;
    private javax.swing.JButton VacateRoomButton;
    private javax.swing.JButton VoucherButton;
    private javax.swing.JLabel admrooms;
    // End of variables declaration//GEN-END:variables
}
