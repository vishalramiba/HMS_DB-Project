/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayur
 */
public class admedit2GUI extends javax.swing.JFrame {

    /**
     * Creates new form admedit2GUI
     */
    public admedit2GUI() {
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

        VoucherButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        RoomsButton = new javax.swing.JButton();
        Employees = new javax.swing.JButton();
        FirstNameTF = new javax.swing.JTextField();
        StudentIDTF = new javax.swing.JTextField();
        FatherNameTF = new javax.swing.JTextField();
        PhoneTF = new javax.swing.JTextField();
        DateOfBirthTF = new javax.swing.JTextField();
        AddressTF = new javax.swing.JTextField();
        RoomTF = new javax.swing.JTextField();
        FacilitiesTF = new javax.swing.JTextField();
        LastNameTF = new javax.swing.JTextField();
        EmailTF = new javax.swing.JTextField();
        ProgramTF = new javax.swing.JTextField();
        CNICTF = new javax.swing.JTextField();
        BuildingTF = new javax.swing.JTextField();
        Edit2Button = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        admedit2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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

        FirstNameTF.setBorder(null);
        FirstNameTF.setOpaque(false);
        getContentPane().add(FirstNameTF);
        FirstNameTF.setBounds(320, 190, 180, 30);

        StudentIDTF.setBorder(null);
        StudentIDTF.setOpaque(false);
        getContentPane().add(StudentIDTF);
        StudentIDTF.setBounds(320, 220, 460, 30);

        FatherNameTF.setBorder(null);
        FatherNameTF.setOpaque(false);
        getContentPane().add(FatherNameTF);
        FatherNameTF.setBounds(320, 240, 180, 40);

        PhoneTF.setBorder(null);
        PhoneTF.setOpaque(false);
        getContentPane().add(PhoneTF);
        PhoneTF.setBounds(320, 270, 180, 30);

        DateOfBirthTF.setBorder(null);
        DateOfBirthTF.setOpaque(false);
        getContentPane().add(DateOfBirthTF);
        DateOfBirthTF.setBounds(320, 300, 180, 20);

        AddressTF.setBorder(null);
        AddressTF.setOpaque(false);
        getContentPane().add(AddressTF);
        AddressTF.setBounds(320, 320, 460, 40);

        RoomTF.setBorder(null);
        RoomTF.setOpaque(false);
        getContentPane().add(RoomTF);
        RoomTF.setBounds(320, 350, 180, 30);

        FacilitiesTF.setBorder(null);
        FacilitiesTF.setOpaque(false);
        getContentPane().add(FacilitiesTF);
        FacilitiesTF.setBounds(320, 380, 460, 14);

        LastNameTF.setBorder(null);
        LastNameTF.setOpaque(false);
        getContentPane().add(LastNameTF);
        LastNameTF.setBounds(580, 190, 200, 30);

        EmailTF.setBorder(null);
        EmailTF.setOpaque(false);
        getContentPane().add(EmailTF);
        EmailTF.setBounds(580, 240, 200, 40);

        ProgramTF.setBorder(null);
        ProgramTF.setOpaque(false);
        getContentPane().add(ProgramTF);
        ProgramTF.setBounds(580, 270, 200, 30);

        CNICTF.setBorder(null);
        CNICTF.setOpaque(false);
        getContentPane().add(CNICTF);
        CNICTF.setBounds(580, 300, 200, 20);

        BuildingTF.setBorder(null);
        BuildingTF.setOpaque(false);
        getContentPane().add(BuildingTF);
        BuildingTF.setBounds(580, 350, 200, 30);

        Edit2Button.setBorder(null);
        Edit2Button.setContentAreaFilled(false);
        Edit2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit2ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Edit2Button);
        Edit2Button.setBounds(340, 490, 150, 29);

        CancelButton.setBorder(null);
        CancelButton.setContentAreaFilled(false);
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelButton);
        CancelButton.setBounds(500, 490, 150, 30);

        admedit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin_edit2.jpg"))); // NOI18N
        getContentPane().add(admedit2);
        admedit2.setBounds(0, 0, 800, 569);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void Edit2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit2ButtonActionPerformed
        setVisible(false);
        admedit3GUI a = new admedit3GUI();
        a.setVisible(true);
    }//GEN-LAST:event_Edit2ButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
        adminedit1GUI a = new adminedit1GUI();
        a.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(admedit2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admedit2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admedit2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admedit2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admedit2GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTF;
    private javax.swing.JTextField BuildingTF;
    private javax.swing.JTextField CNICTF;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField DateOfBirthTF;
    private javax.swing.JButton Edit2Button;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField EmailTF;
    private javax.swing.JButton Employees;
    private javax.swing.JTextField FacilitiesTF;
    private javax.swing.JTextField FatherNameTF;
    private javax.swing.JTextField FirstNameTF;
    private javax.swing.JTextField LastNameTF;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField PhoneTF;
    private javax.swing.JTextField ProgramTF;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField RoomTF;
    private javax.swing.JButton RoomsButton;
    private javax.swing.JTextField StudentIDTF;
    private javax.swing.JButton VoucherButton;
    private javax.swing.JLabel admedit2;
    // End of variables declaration//GEN-END:variables
}
