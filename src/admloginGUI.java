
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
public class admloginGUI extends javax.swing.JFrame {

    /**
     * Creates new form admloginGUI
     */
//    int adm_id;
    admin_driverCode adm_dc = new admin_driverCode();

    public admloginGUI() {
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

        LoginButton = new javax.swing.JButton();
        IdLoginTF = new javax.swing.JTextField();
        pwTF = new javax.swing.JPasswordField();
        admlogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LoginButton.setBorder(null);
        LoginButton.setBorderPainted(false);
        LoginButton.setContentAreaFilled(false);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton);
        LoginButton.setBounds(540, 390, 130, 30);

        IdLoginTF.setMaximumSize(new java.awt.Dimension(107, 107));
        getContentPane().add(IdLoginTF);
        IdLoginTF.setBounds(430, 260, 250, 40);
        getContentPane().add(pwTF);
        pwTF.setBounds(430, 330, 250, 40);

        admlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin_login.jpg"))); // NOI18N
        getContentPane().add(admlogin);
        admlogin.setBounds(0, 0, 800, 569);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String pwd = new String(pwTF.getPassword());
        int id = Integer.parseInt(IdLoginTF.getText());
        try {
            adm_dc.adminLogin(id, pwd);
//            setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(admloginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(admloginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admloginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admloginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admloginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admloginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdLoginTF;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel admlogin;
    private javax.swing.JPasswordField pwTF;
    // End of variables declaration//GEN-END:variables
}
