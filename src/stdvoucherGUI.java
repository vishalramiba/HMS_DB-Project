/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayur
 */
public class stdvoucherGUI extends javax.swing.JFrame {

    /**
     * Creates new form stdvoucher
     */
    public stdvoucherGUI() {
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

        VoucherStatusTF = new javax.swing.JTextField();
        RoomFeeTF = new javax.swing.JTextField();
        MessTF = new javax.swing.JTextField();
        LaundryTF = new javax.swing.JTextField();
        ParkingTF = new javax.swing.JTextField();
        GymTF = new javax.swing.JTextField();
        ProfileButton = new javax.swing.JButton();
        VoucherButton = new javax.swing.JButton();
        GenerateVoucherButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        stdvoucher = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        VoucherStatusTF.setEditable(false);
        VoucherStatusTF.setBorder(null);
        VoucherStatusTF.setOpaque(false);
        VoucherStatusTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoucherStatusTFActionPerformed(evt);
            }
        });
        getContentPane().add(VoucherStatusTF);
        VoucherStatusTF.setBounds(530, 150, 60, 20);

        RoomFeeTF.setEditable(false);
        RoomFeeTF.setBorder(null);
        RoomFeeTF.setOpaque(false);
        getContentPane().add(RoomFeeTF);
        RoomFeeTF.setBounds(320, 316, 170, 20);

        MessTF.setEditable(false);
        MessTF.setBorder(null);
        MessTF.setOpaque(false);
        getContentPane().add(MessTF);
        MessTF.setBounds(320, 350, 170, 20);

        LaundryTF.setEditable(false);
        LaundryTF.setBorder(null);
        LaundryTF.setOpaque(false);
        getContentPane().add(LaundryTF);
        LaundryTF.setBounds(320, 370, 170, 20);

        ParkingTF.setEditable(false);
        ParkingTF.setBorder(null);
        ParkingTF.setOpaque(false);
        ParkingTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParkingTFActionPerformed(evt);
            }
        });
        getContentPane().add(ParkingTF);
        ParkingTF.setBounds(580, 320, 190, 20);

        GymTF.setEditable(false);
        GymTF.setBorder(null);
        GymTF.setOpaque(false);
        getContentPane().add(GymTF);
        GymTF.setBounds(580, 350, 190, 20);

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
        VoucherButton.setBounds(20, 140, 140, 29);

        GenerateVoucherButton.setBorderPainted(false);
        GenerateVoucherButton.setContentAreaFilled(false);
        GenerateVoucherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateVoucherButtonActionPerformed(evt);
            }
        });
        getContentPane().add(GenerateVoucherButton);
        GenerateVoucherButton.setBounds(420, 470, 150, 30);

        LogoutButton.setBorderPainted(false);
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton);
        LogoutButton.setBounds(20, 510, 130, 30);

        HomeButton.setBorderPainted(false);
        HomeButton.setContentAreaFilled(false);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton);
        HomeButton.setBounds(20, 9, 270, 40);

        stdvoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/std_voucher.jpg"))); // NOI18N
        getContentPane().add(stdvoucher);
        stdvoucher.setBounds(0, 0, 800, 569);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoucherStatusTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoucherStatusTFActionPerformed
        setVisible(false);
        stdvoucherGUI a = new stdvoucherGUI();
        a.setVisible(true);
    }//GEN-LAST:event_VoucherStatusTFActionPerformed

    private void ProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileButtonActionPerformed
         setVisible(false);
        stdprofileGUI a = new stdprofileGUI();
        a.setVisible(true);
    }//GEN-LAST:event_ProfileButtonActionPerformed

    private void GenerateVoucherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateVoucherButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerateVoucherButtonActionPerformed

    private void ParkingTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParkingTFActionPerformed
         setVisible(false);
        IntialGui a = new IntialGui();
        a.setVisible(true);
    }//GEN-LAST:event_ParkingTFActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        setVisible(false);
        IntialGui a = new IntialGui();
        a.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void VoucherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoucherButtonActionPerformed
         setVisible(false);
        stdvoucherGUI a = new stdvoucherGUI();
        a.setVisible(true);
    }//GEN-LAST:event_VoucherButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
       setVisible(false);
        StdwelcomeGUI a = new StdwelcomeGUI();
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
            java.util.logging.Logger.getLogger(stdvoucherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stdvoucherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stdvoucherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stdvoucherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stdvoucherGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerateVoucherButton;
    private javax.swing.JTextField GymTF;
    private javax.swing.JButton HomeButton;
    private javax.swing.JTextField LaundryTF;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField MessTF;
    private javax.swing.JTextField ParkingTF;
    private javax.swing.JButton ProfileButton;
    private javax.swing.JTextField RoomFeeTF;
    private javax.swing.JButton VoucherButton;
    private javax.swing.JTextField VoucherStatusTF;
    private javax.swing.JLabel stdvoucher;
    // End of variables declaration//GEN-END:variables
}
