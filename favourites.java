import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.StringTokenizer;
import javax.swing.*;
import org.json.JSONObject;

public class favourites extends javax.swing.JFrame {

    JLabel lb;

    public favourites(String name) {
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
        if (name.equals("movie")) {
            starmovie();
        } else {
            startv();
        }

    }

    void starmovie() {
        int x = 10;
        int y = 10;

        String ans1 = myClient.buttoncheck();
        StringTokenizer st = new StringTokenizer(ans1, "$");
        while (st.hasMoreTokens()) {
            int id = Integer.parseInt(st.nextToken());
            String ans = myClient.showfav_movie(id);
            JSONObject obj = new JSONObject(ans);

            design obj1 = new design(); 
            obj1.bt.setVisible(false);

            if (obj.has("poster_path")) {
                try {
                    String ph = obj.get("poster_path").toString();
                    ImageIcon ic = new ImageIcon(new URL("https://image.tmdb.org/t/p/w200" + ph));
                    Image ic2 = ic.getImage().getScaledInstance(obj1.photo.getWidth(), obj1.photo.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon ic3 = new ImageIcon(ic2);
                    obj1.photo.setIcon(ic3);
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                }
            }

            if (obj.has("title")) {
                String name = obj.get("title").toString();
                obj1.title.setText(name);
            } else if (obj.has("original_title")) {
                String name = obj.get("original_title").toString();
                obj1.title.setText(name);
            } else if (obj.has("name")) {
                String name = obj.get("name").toString();
                obj1.title.setText(name);
            } else if (obj.has("original_name")) {
                String name = obj.get("original_name").toString();
                obj1.title.setText(name);
            }

            if (obj.has("overview")) {
                String desc = obj.get("overview").toString();
                String overview = "";
                String[] n = desc.split("(?<=\\G.{" + 39 + "})");
                for (String string : n) {
                    overview += string + " " + "\n" + " ";
                }
                obj1.desc.setText(overview);
            }

            if (obj.has("release_date")) {
                String date = obj.get("release_date").toString();
                obj1.date.setText(date);
            }

            obj1.setBounds(x, y, 300, 400);

            if (x < 940) {
                x += 310;
            } else {
                x = 10;
                y += 410;
            }

            jp.add(obj1);
        }

        jp.repaint();
        jp.revalidate();

        int ans11 = st.countTokens();

        jp.setPreferredSize(new Dimension(1000, 1000));
    }

    void startv() {
        int x = 10;
        int y = 10;
        String ans1 = myClient.buttoncheck1();
        StringTokenizer st = new StringTokenizer(ans1, "$");
        while (st.hasMoreTokens()) {
            int id = Integer.parseInt(st.nextToken());
            String ans = myClient.showfav_tv(id);
            JSONObject obj = new JSONObject(ans);

            design obj1 = new design(); 
            obj1.bt.setVisible(false);

            if (obj.has("poster_path")) {
                try {
                    String ph = obj.get("poster_path").toString();
                    ImageIcon ic = new ImageIcon(new URL("https://image.tmdb.org/t/p/w200" + ph));
                    Image ic2 = ic.getImage().getScaledInstance(obj1.photo.getWidth(), obj1.photo.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon ic3 = new ImageIcon(ic2);
                    obj1.photo.setIcon(ic3);
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                }
            }

            if (obj.has("title")) {
                String name = obj.get("title").toString();
                obj1.title.setText(name);
            } else if (obj.has("original_title")) {
                String name = obj.get("original_title").toString();
                obj1.title.setText(name);
            } else if (obj.has("name")) {
                String name = obj.get("name").toString();
                obj1.title.setText(name);
            } else if (obj.has("original_name")) {
                String name = obj.get("original_name").toString();
                obj1.title.setText(name);
            }

            if (obj.has("overview")) {
                String desc = obj.get("overview").toString();
                String overview = "";
                String[] n = desc.split("(?<=\\G.{" + 39 + "})");
                for (String string : n) {
                    overview += string + " " + "\n" + " ";
                }
                obj1.desc.setText(overview);
            }

            if (obj.has("release_date")) {
                String date = obj.get("release_date").toString();
                obj1.date.setText(date);
            }

            obj1.setBounds(x, y, 300, 400);

            if (x < 940) {
                x += 310;
            } else {
                x = 10;
                y += 410;
            }

            jp.add(obj1);
        }

        jp.repaint();
        jp.revalidate();

        int ans11 = st.countTokens();

        jp.setPreferredSize(new Dimension(1000, 1000));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jp = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jp.setBackground(new java.awt.Color(0, 0, 0));
        jp.setLayout(null);
        jScrollPane1.setViewportView(jp);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 100, 810, 460);

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
            java.util.logging.Logger.getLogger(favourites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(favourites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(favourites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(favourites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new favourites("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp;
    // End of variables declaration//GEN-END:variables
}
