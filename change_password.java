import java.awt.*;
import java.sql.*;
import javax.swing.*;
import vmm.DBLoader;

public class change_password extends javax.swing.JFrame {

    JLabel lb;

    public change_password() {
        lb = new JLabel();
        initComponents();
        setVisible(true);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int h = (int) d.getHeight();
        int w = (int) d.getWidth();
        lb.setBounds(0, 0, w, h);
        ImageIcon ic = new ImageIcon("src\\myUploads\\movie.jpg");
        Image ic1 = ic.getImage().getScaledInstance(lb.getWidth(), lb.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic2 = new ImageIcon(ic1);
        lb.setIcon(ic2);
        add(lb);
        setSize(w, h);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        pf1 = new javax.swing.JPasswordField();
        pf2 = new javax.swing.JPasswordField();
        pf3 = new javax.swing.JPasswordField();
        bt1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("CHANGE PASSWORD");
        getContentPane().add(lb1);
        lb1.setBounds(620, 10, 360, 90);

        lb2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("OLD PASSWORD");
        getContentPane().add(lb2);
        lb2.setBounds(550, 110, 190, 40);

        lb3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("NEW PASSWORD");
        getContentPane().add(lb3);
        lb3.setBounds(550, 200, 150, 40);

        lb4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setText("CONFIRM PASSWORD");
        getContentPane().add(lb4);
        lb4.setBounds(550, 310, 200, 40);
        getContentPane().add(pf1);
        pf1.setBounds(850, 110, 200, 40);
        getContentPane().add(pf2);
        pf2.setBounds(850, 200, 200, 40);
        getContentPane().add(pf3);
        pf3.setBounds(850, 300, 200, 40);

        bt1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt1.setText("CHANGE");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(720, 440, 150, 50);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("<-BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        String old = pf1.getText();
        String pass = pf2.getText();
        String confirm = pf3.getText();
        if (old.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all the Fields");
        } else if (!pass.equals(confirm)) {
            JOptionPane.showMessageDialog(this, "New Password and Confirm Password Should be Same");
        } else {
            try {
                ResultSet rs = DBLoader.executeSql("select * from user where email='" + global.email + "' and password ='" + old + "'");
                if (rs.next()) {
                    rs.updateString("Password", pass);
                    rs.updateRow();
                    JOptionPane.showMessageDialog(this, "Password Changed Succesfull");
                    pf1.setText("");
                    pf2.setText("");
                    pf3.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Please Enter The Old Password Correctly");

                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        homepage obj1=new homepage();
        setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new change_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JPasswordField pf2;
    private javax.swing.JPasswordField pf3;
    // End of variables declaration//GEN-END:variables
}
