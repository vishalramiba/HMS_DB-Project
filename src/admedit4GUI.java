/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayur
 */
public class admedit4GUI extends javax.swing.JFrame {

    /**
     * Creates new form admedit4GUI
     */
    public admedit4GUI() {
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
        DoneButton = new javax.swing.JButton();
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
        admedit4 = new javax.swing.JLabel();

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

        DoneButton.setBorder(null);
        DoneButton.setContentAreaFilled(false);
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DoneButton);
        DoneButton.setBounds(420, 490, 150, 29);

        FirstNameTF.setBorder(null);
        FirstNameTF.setOpaque(false);
        getContentPane().add(FirstNameTF);
        FirstNameTF.setBounds(320, 200, 170, 20);

        StudentIDTF.setBorder(null);
        StudentIDTF.setOpaque(false);
        getContentPane().add(StudentIDTF);
        StudentIDTF.setBounds(320, 220, 440, 20);

        FatherNameTF.setBorder(null);
        FatherNameTF.setOpaque(false);
        getContentPane().add(FatherNameTF);
        FatherNameTF.setBounds(320, 250, 160, 20);

        PhoneTF.setBorder(null);
        PhoneTF.setOpaque(false);
        getContentPane().add(PhoneTF);
        PhoneTF.setBounds(320, 270, 170, 20);

        DateOfBirthTF.setBorder(null);
        DateOfBirthTF.setOpaque(false);
        getContentPane().add(DateOfBirthTF);
        DateOfBirthTF.setBounds(320, 300, 170, 20);

        AddressTF.setBorder(null);
        AddressTF.setOpaque(false);
        getContentPane().add(AddressTF);
        AddressTF.setBounds(320, 330, 440, 14);

        RoomTF.setBorder(null);
        RoomTF.setOpaque(false);
        getContentPane().add(RoomTF);
        RoomTF.setBounds(320, 350, 170, 20);

        FacilitiesTF.setBorder(null);
        FacilitiesTF.setOpaque(false);
        getContentPane().add(FacilitiesTF);
        FacilitiesTF.setBounds(320, 380, 450, 14);

        LastNameTF.setBorder(null);
        LastNameTF.setOpaque(false);
        getContentPane().add(LastNameTF);
        LastNameTF.setBounds(580, 200, 180, 20);

        EmailTF.setBorder(null);
        EmailTF.setOpaque(false);
        getContentPane().add(EmailTF);
        EmailTF.setBounds(580, 250, 180, 20);

        ProgramTF.setBorder(null);
        ProgramTF.setOpaque(false);
        getContentPane().add(ProgramTF);
        ProgramTF.setBounds(580, 270, 190, 20);

        CNICTF.setBorder(null);
        CNICTF.setOpaque(false);
        getContentPane().add(CNICTF);
        CNICTF.setBounds(580, 300, 180, 20);

        BuildingTF.setBorder(null);
        BuildingTF.setOpaque(false);
        getContentPane().add(BuildingTF);
        BuildingTF.setBounds(580, 350, 180, 20);

        admedit4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin_edit4.jpg"))); // NOI18N
        getContentPane().add(admedit4);
        admedit4.setBounds(0, 0, 800, 569);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
         setVisible(false);
        adminwelcomeGUI a = new adminwelcomeGUI();
        a.setVisible(true);
    }//GEN-LAST:event_DoneButtonActionPerformed

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
            java.util.logging.Logger.getLogger(admedit4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admedit4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admedit4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admedit4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admedit4GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTF;
    private javax.swing.JTextField BuildingTF;
    private javax.swing.JTextField CNICTF;
    private javax.swing.JTextField DateOfBirthTF;
    private javax.swing.JButton DoneButton;
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
    private javax.swing.JLabel admedit4;
    // End of variables declaration//GEN-END:variables
}
