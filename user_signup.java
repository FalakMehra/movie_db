import java.awt.*;
import java.io.File;
import javax.swing.*;
import vmm.DBLoader;
import java.sql.*;
import java.util.regex.Pattern;

public class user_signup extends javax.swing.JFrame {

    JLabel lb;
    File ph;

    public user_signup() {
        lb = new JLabel();
        initComponents();

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
        setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lb0 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        pf1 = new javax.swing.JPasswordField();
        pf2 = new javax.swing.JPasswordField();
        tf4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        lb0.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb0.setForeground(new java.awt.Color(255, 255, 255));
        lb0.setText("SIGNUP");
        getContentPane().add(lb0);
        lb0.setBounds(620, 10, 150, 50);

        lb1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("USERNAME");
        getContentPane().add(lb1);
        lb1.setBounds(470, 70, 160, 30);

        lb2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("EMAIL");
        getContentPane().add(lb2);
        lb2.setBounds(470, 120, 160, 30);

        lb3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("PASSWORD");
        getContentPane().add(lb3);
        lb3.setBounds(470, 180, 160, 30);

        lb4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setText("CONFIRM PASSWORD");
        getContentPane().add(lb4);
        lb4.setBounds(470, 240, 260, 30);

        lb5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setText("CONTACT");
        getContentPane().add(lb5);
        lb5.setBounds(470, 300, 160, 32);

        lb6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb6.setForeground(new java.awt.Color(255, 255, 255));
        lb6.setText("PHOTO");
        getContentPane().add(lb6);
        lb6.setBounds(480, 370, 210, 30);
        getContentPane().add(photo);
        photo.setBounds(740, 350, 290, 170);

        bt1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt1.setText("SELECT PHOTO");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(1060, 390, 210, 50);

        bt2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt2.setText("SUBMIT");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(670, 530, 170, 60);

        tf2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        getContentPane().add(tf2);
        tf2.setBounds(770, 60, 250, 40);

        tf3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });
        getContentPane().add(tf3);
        tf3.setBounds(770, 110, 250, 40);

        pf1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf1ActionPerformed(evt);
            }
        });
        getContentPane().add(pf1);
        pf1.setBounds(770, 170, 250, 40);

        pf2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf2ActionPerformed(evt);
            }
        });
        getContentPane().add(pf2);
        pf2.setBounds(770, 230, 250, 40);

        tf4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });
        getContentPane().add(tf4);
        tf4.setBounds(770, 290, 250, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\MOVIE_CENTRAL_FALAK\\src\\myUploads\\signup.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -4, 1570, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        JFileChooser jfc = new JFileChooser();
        int ans = jfc.showOpenDialog(this);
        if (ans == JFileChooser.APPROVE_OPTION) {
            ph = jfc.getSelectedFile();
            ImageIcon ic = new ImageIcon(ph.getPath());
            Image ic1 = ic.getImage().getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ic2 = new ImageIcon(ic1);
            photo.setIcon(ic2);
        }
    }//GEN-LAST:event_bt1ActionPerformed


    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        String name = tf2.getText();
        String email = tf3.getText();
        String password = pf1.getText();
        String cp = pf2.getText();
        String contact = tf4.getText();

        try {
            ResultSet rs = DBLoader.executeSql("select * from user where email='" + email + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Email Already Exist");
            } else {
                String path = SaveFile.saveFile(ph);
                rs.moveToInsertRow();
                rs.updateString("email", email);
                rs.updateString("username", name);
                rs.updateString("password", password);
                rs.updateString("contact", contact);
                rs.updateString("photo", path);
                rs.insertRow();
                JOptionPane.showMessageDialog(this, "Your Account has been Created");
                tf2.setText("");
                tf3.setText("");
                pf1.setText("");
                pf2.setText("");
                tf4.setText("");

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_bt2ActionPerformed

    private void pf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf1ActionPerformed

    }//GEN-LAST:event_pf1ActionPerformed

    private void pf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf2ActionPerformed

    }//GEN-LAST:event_pf2ActionPerformed

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed

    }//GEN-LAST:event_tf4ActionPerformed

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

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
            java.util.logging.Logger.getLogger(user_signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb0;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JPasswordField pf2;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    // End of variables declaration//GEN-END:variables
}
