import java.awt.*;
import javax.swing.*;

public class homepage extends javax.swing.JFrame {

    JLabel lb;

    public homepage() {
        lb = new JLabel();
        initComponents();
        lb4.setIcon(resize("src/myUploads/inside out2.jpg"));
        lb5.setIcon(resize("src/myUploads/Deadpool & Wolverine.jpg"));
        lb6.setIcon(resize("src/myUploads/In a Violent Nature.jpg"));
        lb7.setIcon(resize("src/myUploads/flames.jpg"));
        lb8.setIcon(resize("src/myUploads/Longlegs.jpg"));
        lb9.setIcon(resize("src/myUploads/The Bikeriders.jpg"));
        lb10.setIcon(resize("src/myUploads/Twisters.jpg"));
        lb11.setIcon(resize("src/myUploads/harrypotter.jpg"));
        lb12.setIcon(resize("src/myUploads/the exorcism.jpg"));
        lb13.setIcon(resize("src/myUploads/airlift.jpg"));
        lb14.setIcon(resize("src/myUploads/shershah.jpg"));
        lb15.setIcon(resize("src/myUploads/Late Night with the Devil.jpg"));
        lb16.setIcon(resize("src/myUploads/major.jpg"));
        lb17.setIcon(resize("src/myUploads/uri.jpg"));


        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int h = (int) d.getHeight();
        int w = (int) d.getWidth();
        lb.setBounds(0, 0, w, h);
        ImageIcon ic = new ImageIcon("src\\myUploads\\netflix2.jpg");
        Image ic1 = ic.getImage().getScaledInstance(lb.getWidth(), lb.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic2 = new ImageIcon(ic1);
        lb.setIcon(ic2);
        add(lb);
        setSize(w, h);
        setVisible(true);
    }

    ImageIcon resize(String path) {
        ImageIcon ic = new ImageIcon(path);
        Image img = ic.getImage().getScaledInstance(lb4.getWidth(), lb4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon im = new ImageIcon(img);
        return im;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        bt1 = new javax.swing.JButton();
        lb2 = new javax.swing.JLabel();
        bt2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lb15 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb12 = new javax.swing.JLabel();
        lb13 = new javax.swing.JLabel();
        lb14 = new javax.swing.JLabel();
        lb16 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        bt3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("WELCOME TO MOVIES");
        getContentPane().add(lb1);
        lb1.setBounds(500, 10, 400, 40);

        tf1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(tf1);
        tf1.setBounds(390, 70, 380, 40);

        bt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt1.setText("SEARCH");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(800, 70, 100, 40);

        lb2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("TOP UPCOMING MOVIES");
        getContentPane().add(lb2);
        lb2.setBounds(10, 210, 300, 50);

        bt2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt2.setText("EXPLORE");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(320, 220, 160, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);
        jPanel1.add(lb15);
        lb15.setBounds(1350, 10, 190, 170);
        jPanel1.add(lb10);
        lb10.setBounds(10, 10, 190, 170);
        jPanel1.add(lb11);
        lb11.setBounds(240, 10, 190, 170);
        jPanel1.add(lb12);
        lb12.setBounds(480, 10, 190, 170);
        jPanel1.add(lb13);
        lb13.setBounds(700, 10, 190, 170);
        jPanel1.add(lb14);
        lb14.setBounds(930, 10, 190, 170);
        jPanel1.add(lb16);
        lb16.setBounds(1140, 10, 190, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 510, 1560, 190);

        lb3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("TOP RATED MOVIES");
        getContentPane().add(lb3);
        lb3.setBounds(10, 470, 240, 30);

        bt3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt3.setText("EXPLORE");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(260, 470, 160, 30);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);
        jPanel4.add(lb4);
        lb4.setBounds(20, 10, 190, 170);
        jPanel4.add(lb5);
        lb5.setBounds(260, 10, 190, 170);
        jPanel4.add(lb6);
        lb6.setBounds(490, 10, 190, 170);
        jPanel4.add(lb7);
        lb7.setBounds(710, 10, 190, 170);
        jPanel4.add(lb9);
        lb9.setBounds(1150, 10, 190, 170);
        jPanel4.add(lb8);
        lb8.setBounds(930, 10, 190, 170);
        jPanel4.add(lb17);
        lb17.setBounds(1370, 10, 190, 170);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 260, 1580, 190);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("MOVIE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 10, 120, 27);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("TV");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 50, 120, 27);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("ACTOR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(10, 90, 120, 27);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("MOVIE HOUSE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(10, 130, 130, 27);

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 10, 150, 170);

        bt5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt5.setText("FAV_MOVIE");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        getContentPane().add(bt5);
        bt5.setBounds(10, 70, 120, 40);

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.setText("EDIT PROFILE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(950, 10, 200, 40);

        bt6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt6.setText("CHANGE PASSWORD");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        getContentPane().add(bt6);
        bt6.setBounds(1180, 10, 220, 40);

        bt7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt7.setText("LOGOUT");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        getContentPane().add(bt7);
        bt7.setBounds(1410, 10, 110, 40);

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("FAV_TV");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(10, 120, 120, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        top_rated_movies trm = new top_rated_movies();
         dispose();
    }//GEN-LAST:event_bt3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ans = "Movie";
        search_movie obj = new search_movie(ans);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ans = "TV";
        search_movie obj = new search_movie(ans);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String ans = "Actor";
        search_movie obj = new search_movie(ans);
        obj.setVisible(true);
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String ans = "MovieHouse";
        search_movie obj = new search_movie(ans);
        obj.setVisible(true);
        

    }//GEN-LAST:event_jButton4ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        String ans = tf1.getText();
        ans = ans.replace(" ", "%20");
        search_movie obj = new search_movie(ans);
        obj.setVisible(true);
        obj.tf.setVisible(false);
        obj.bt.setVisible(false);
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        top_upcoming_movies tum = new top_upcoming_movies();
         dispose();
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        String ans = "movie";
        favourites fv = new favourites(ans);
        fv.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        edit_profile ed = new edit_profile();
 dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        change_password cp = new change_password();
         dispose();
    }//GEN-LAST:event_bt6ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String ans = "tv";
        favourites fv = new favourites(ans);
        fv.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        global.email = "";
        login obj1 = new login();
        dispose();
    }//GEN-LAST:event_bt7ActionPerformed

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb13;
    private javax.swing.JLabel lb14;
    private javax.swing.JLabel lb15;
    private javax.swing.JLabel lb16;
    private javax.swing.JLabel lb17;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
