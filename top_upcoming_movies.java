import java.awt.*;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class top_upcoming_movies extends javax.swing.JFrame {

    JLabel lb;

    public top_upcoming_movies() {
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
        getMovies();
        call();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jp = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOP UPCOMING MOVIES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(640, 0, 430, 60);

        jp.setBackground(new java.awt.Color(0, 0, 0));
        jp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp.setLayout(null);
        jScrollPane1.setViewportView(jp);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 80, 1120, 530);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        homepage obj1=new homepage();
        setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void getMovies() {
        String ans = myClient.TopUpcoming();
        System.out.println(ans);
    }

    void call() {
        String ans11 = myClient.TopUpcoming();
        System.out.println("Below email");
        System.out.println(global.email);
        // jp.removeAll();
        int x = 10;
        int y = 10;
        System.out.println(ans11);
        JSONObject obj = new JSONObject(ans11);
        JSONArray arr = obj.getJSONArray("results");
        System.out.println(arr.length());
        for (int i = 0; i < arr.length(); i++) {
            String name = "";
            String date1 = "";
            JSONObject ob = (JSONObject) (arr.get(i));

            String photo1 = ob.get("poster_path").toString();
            String desc = (String) ob.get("overview");
            design obj1 = new design();
            obj1.bt.setVisible(false);
            try {
                ImageIcon ic = new ImageIcon(new URL("https://image.tmdb.org/t/p/w200" + photo1));
                Image ic2 = ic.getImage().getScaledInstance(obj1.photo.getWidth(), obj1.photo.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ic3 = new ImageIcon(ic2);
                obj1.photo.setIcon(ic3);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("------->" + desc);
            String overview = "";

            String[] n = desc.split("(?<=\\G.{" + 39 + "})");
            for (String string : n) {
                overview += string + " " + "\n" + " ";
            }

            if (ob.has("title")) {
                name = (String) ob.get("title");
            }

            if (ob.has("original_title")) {
                name = (String) ob.get("original_title");
            }

            if (ob.has("name")) {
                name = (String) ob.get("name");
            }

            if (ob.has("original_name")) {
                name = (String) ob.get("original_name");
            }

            obj1.title.setText(name);
            if (ob.has("release_date")) {
                date1 = (String) ob.get("release_date");
            }

            if (ob.has("first_air_date")) {
                date1 = (String) ob.get("first_air_date");
            }

            obj1.date.setText(date1);
            obj1.desc.setText(overview);
            obj1.setBounds(x, y, 410, 440);
            if (x < 670) {
                x += 330;
            } else {
                y += 420;
                x = 10;
            }

            int id = ob.getInt("id");

            String abc = myClient.favMovie_check(id);
            if (abc.equals("pass")) {//coloured
                ImageIcon ic4 = new ImageIcon("src\\myUploads\\heart.png");
                Image ic5 = ic4.getImage().getScaledInstance(obj1.bt.getWidth(), obj1.bt.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ic6 = new ImageIcon(ic5);
                obj1.bt.setIcon(ic6);

            } else if (abc.equals("fail")) {//empty
                ImageIcon ic4 = new ImageIcon("src\\myUploads\\heart (1).png");
                Image ic5 = ic4.getImage().getScaledInstance(obj1.bt.getWidth(), obj1.bt.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ic6 = new ImageIcon(ic5);
                obj1.bt.setIcon(ic6);
            } else {
                JOptionPane.showMessageDialog(this, "Please check");
            }

            obj1.bt.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    String ans = myClient.addtofavmovie(id);
                    if (ans.equals("added")) {
//                bt.setText("ADDED");
                        ImageIcon ic4 = new ImageIcon("src\\myUploads\\heart.png");
                        Image ic5 = ic4.getImage().getScaledInstance(obj1.bt.getWidth(), obj1.bt.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon ic6 = new ImageIcon(ic5);
                        obj1.bt.setIcon(ic6);

                    } else if (ans.equals("removed")) {
//                bt.setText("ADD");
                        ImageIcon ic4 = new ImageIcon("src\\myUploads\\heart (1).png");
                        Image ic5 = ic4.getImage().getScaledInstance(obj1.bt.getWidth(), obj1.bt.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon ic6 = new ImageIcon(ic5);
                        obj1.bt.setIcon(ic6);
                    } else {
                        System.out.println("oops");
                    }

                }
            });

            jp.add(obj1);
            jp.repaint();
            obj1.repaint();

        }
        jp.setPreferredSize(new Dimension(400, (440 * arr.length()) / 3));
    }

    @SuppressWarnings("unchecked")

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
            java.util.logging.Logger.getLogger(top_upcoming_movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(top_upcoming_movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(top_upcoming_movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(top_upcoming_movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new top_upcoming_movies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp;
    // End of variables declaration//GEN-END:variables
}
