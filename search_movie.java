import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.StringTokenizer;
import javax.swing.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class search_movie extends javax.swing.JFrame {

    JLabel lb;

    String name;

    public search_movie(String name) {
        lb = new JLabel();
        initComponents();

        getContentPane().setBackground(new java.awt.Color(0, 0, 0));
        lb1.setText("Searching for " + name);
        if (name != "Movie" && name != "Actor" && name != "MovieHouse" && name != "TV") {
            lb1.setText("Searching for " + name);
            name = name.replace(" ", "%20");
            String abc = myClient.Searchmultitask(name);
            searchmovie(abc);
        }

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
        this.name = name;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        bt = new javax.swing.JButton();
        tf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jp = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("SEARCH MOVIES");
        getContentPane().add(lb1);
        lb1.setBounds(580, 10, 580, 50);

        bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt.setText("SEARCH");
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt);
        bt.setBounds(840, 90, 140, 40);

        tf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });
        getContentPane().add(tf);
        tf.setBounds(510, 90, 280, 40);

        jp.setBackground(new java.awt.Color(0, 0, 0));
        jp.setAutoscrolls(true);
        jp.setLayout(null);
        jScrollPane2.setViewportView(jp);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(150, 160, 1330, 470);

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

    void searchmovie(String ans) {
        System.out.println("Below email");
        System.out.println(global.email);
        jp.removeAll();
        int x = 10;
        int y = 0;
        System.out.println(ans);
        JSONObject obj = new JSONObject(ans);
        JSONArray arr = obj.getJSONArray("results");
        System.out.println(arr.length());
        for (int i = 0; i < arr.length(); i++) {
            String name = "";
            String date1 = "";

            JSONObject ob = (JSONObject) (arr.get(i));
            design obj1 = new design();

            if (ob.has("poster_path")) {
                String photo1 = ob.get("poster_path").toString();
                if (photo1.equals("null")) {
                    continue;
                } else {
                    try {
                        ImageIcon ic = new ImageIcon(new URL("https://image.tmdb.org/t/p/w200" + photo1));
                        Image ic2 = ic.getImage().getScaledInstance(obj1.photo.getWidth(), obj1.photo.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon ic3 = new ImageIcon(ic2);
                        obj1.photo.setIcon(ic3);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (ob.has("profile_path")) {
                String photo1 = ob.get("profile_path").toString();
                if (photo1.equals("null")) {
                    continue;
                } else {
                    try {
                        ImageIcon ic = new ImageIcon(new URL("https://image.tmdb.org/t/p/w200" + photo1));
                        Image ic2 = ic.getImage().getScaledInstance(obj1.photo.getWidth(), obj1.photo.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon ic3 = new ImageIcon(ic2);
                        obj1.photo.setIcon(ic3);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (ob.has("overview")) {
                String desc = ob.get("overview").toString();
                System.out.println("------->" + desc);
                String overview = "";

                String[] n = desc.split("(?<=\\G.{" + 39 + "})");
                for (String string : n) {
                    overview += string + " " + "\n" + " ";
                }
                obj1.desc.setText(overview);
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

            obj1.setBounds(x, 20, 330, 420);
            x = x + 330;
            jp.add(obj1);
            jp.repaint();
            jp.revalidate();
            obj1.repaint();
            y += 1;

            int id = ob.getInt("id");

//        
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

                    if (ans.equals("pass")) {

                        ImageIcon ic4 = new ImageIcon("src\\myUploads\\heart.png");
                        Image ic5 = ic4.getImage().getScaledInstance(obj1.bt.getWidth(), obj1.bt.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon ic6 = new ImageIcon(ic5);
                        obj1.bt.setIcon(ic6);
                    } else if (ans.equals("fail")) {

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
            jp.revalidate();
            obj1.repaint();

            System.out.println("-----------------------------------------------");

        }
        jp.setPreferredSize(new Dimension((500 * y) / 2, 350));
    }

    void searchtv(String ans) {
        System.out.println("Below email");
        System.out.println(global.email);
        jp.removeAll();
        int x = 10;
        int y = 0;
        System.out.println(ans);
        JSONObject obj = new JSONObject(ans);
        JSONArray arr = obj.getJSONArray("results");
        System.out.println(arr.length());
        for (int i = 0; i < arr.length(); i++) {
            String name = "";
            String date1 = "";

            JSONObject ob = (JSONObject) (arr.get(i));
            design obj1 = new design();

            if (ob.has("poster_path")) {
                String photo1 = ob.get("poster_path").toString();
                if (photo1.equals("null")) {
                    continue;
                } else {
                    try {
                        ImageIcon ic = new ImageIcon(new URL("https://image.tmdb.org/t/p/w200" + photo1));
                        Image ic2 = ic.getImage().getScaledInstance(obj1.photo.getWidth(), obj1.photo.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon ic3 = new ImageIcon(ic2);
                        obj1.photo.setIcon(ic3);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (ob.has("profile_path")) {
                String photo1 = ob.get("profile_path").toString();
                if (photo1.equals("null")) {
                    continue;
                } else {
                    try {
                        ImageIcon ic = new ImageIcon(new URL("https://image.tmdb.org/t/p/w200" + photo1));
                        Image ic2 = ic.getImage().getScaledInstance(obj1.photo.getWidth(), obj1.photo.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon ic3 = new ImageIcon(ic2);
                        obj1.photo.setIcon(ic3);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (ob.has("overview")) {
                String desc = ob.get("overview").toString();
                System.out.println("------->" + desc);
                String overview = "";

                String[] n = desc.split("(?<=\\G.{" + 39 + "})");
                for (String string : n) {
                    overview += string + " " + "\n" + " ";
                }
                obj1.desc.setText(overview);
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

            obj1.setBounds(x, 20, 330, 420);
            x = x + 330;
            jp.add(obj1);
            jp.repaint();
            jp.revalidate();
            obj1.repaint();
            y += 1;

            int id = ob.getInt("id");
            System.out.println("id--->" + id);

            String abc = myClient.favtv_check(id);
            if (abc.equals("pass")) {

                ImageIcon ic4 = new ImageIcon("src\\myUploads\\heart.png");
                Image ic5 = ic4.getImage().getScaledInstance(obj1.bt.getWidth(), obj1.bt.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ic6 = new ImageIcon(ic5);
                obj1.bt.setIcon(ic6);

            } else if (abc.equals("fail")) {
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
                    String ans = myClient.addtofavtv(id);
                    System.out.println(ans);

                    if (ans.equals("pass")) {

                        ImageIcon ic4 = new ImageIcon("src\\myUploads\\heart.png");
                        Image ic5 = ic4.getImage().getScaledInstance(obj1.bt.getWidth(), obj1.bt.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon ic6 = new ImageIcon(ic5);
                        obj1.bt.setIcon(ic6);

                    } else if (ans.equals("fail")) {

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
            jp.revalidate();
            obj1.repaint();

            System.out.println("-----------------------------------------------");

        }
        jp.setPreferredSize(new Dimension((500 * y) / 2, 350));

    }

    void searchactor(String ans) {
        int x = 10;
        int y = 0;
        jp.removeAll();
        JSONObject obj = new JSONObject(ans);
        JSONArray arr = obj.getJSONArray("results");
        for (int i = 0; i < arr.length(); i++) {
            JSONObject ob = arr.getJSONObject(i);
            if (ob.has("known_for")) {
                JSONArray arr1 = ob.getJSONArray("known_for");
                for (int j = 0; j < arr1.length(); j++) {
                    JSONObject ob2 = arr1.getJSONObject(j);

                    design obj7 = new design();
                    obj7.bt.setVisible(false);
                    if (ob2.has("title")) {
                        String title = ob2.get("title").toString();
                        obj7.title.setText(title);
                        System.out.println(title);
                    }

                    if (ob2.has("original_title")) {
                        String name = ob2.get("original_title").toString();
                        obj7.title.setText(name);
                        System.out.println(name);
                    }

                    if (ob2.has("poster_path")) {
                        String photo = ob2.get("poster_path").toString();
                        if (photo.equals("null")) {
                            continue;
                        } else {
                            obj7.photo.setIcon(imageresize(photo));
                        }
                    }

                    if (ob2.has("overview")) {
                        String desc = ob2.get("overview").toString();
                        if (desc.equals("")) {
                            continue;
                        } else {
                            System.out.println("------->" + desc);
                            String overview = "";
                            String[] n = desc.split("(?<=\\G.{" + 39 + "})");
                            for (String string : n) {
                                overview += string + " " + "\n" + " ";
                            }
                            obj7.desc.setText(overview);
                        }
                    }

                    if (ob2.has("release_date")) {
                        String date = ob2.get("release_date").toString();
                        obj7.date.setText(date);
                        System.out.println(date);
                    }

                    obj7.setBounds(x, 20, 400, 440);
                    x = x + 330;
                    jp.add(obj7);
                    jp.repaint();
                    jp.revalidate();
                    obj7.repaint();
                    y += 1;
                }
            }
        }
        jp.setPreferredSize(new Dimension((500 * y) / 2, 350));
    }

    void searchmoviehouse(String ans) {

        jp.removeAll();
        int x = 10;
        int y = 0;
        System.out.println(ans);
        JSONObject obj = new JSONObject(ans);
        JSONArray arr = obj.getJSONArray("results");
        System.out.println(arr.length());
        for (int i = 0; i < arr.length(); i++) {
            String name = "";
            String date1 = "";

            JSONObject ob = (JSONObject) (arr.get(i));
            design obj1 = new design();
            obj1.bt.setVisible(false);

            if (ob.has("poster_path")) {
                String photo1 = ob.get("poster_path").toString();
                if (photo1.equals("null")) {
                    continue;
                } else {
                    try {
                        ImageIcon ic = new ImageIcon(new URL("https://image.tmdb.org/t/p/w200" + photo1));
                        Image ic2 = ic.getImage().getScaledInstance(obj1.photo.getWidth(), obj1.photo.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon ic3 = new ImageIcon(ic2);
                        obj1.photo.setIcon(ic3);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (ob.has("profile_path")) {
                String photo1 = ob.get("profile_path").toString();
                if (photo1.equals("null")) {
                    continue;
                } else {
                    try {
                        ImageIcon ic = new ImageIcon(new URL("https://image.tmdb.org/t/p/w200" + photo1));
                        Image ic2 = ic.getImage().getScaledInstance(obj1.photo.getWidth(), obj1.photo.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon ic3 = new ImageIcon(ic2);
                        obj1.photo.setIcon(ic3);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

//                 
            if (ob.has("logo_path")) {
                String photo1 = ob.get("logo_path").toString();
                if (photo1.equals("null")) {
                    continue;
                } else {
                    try {
                        ImageIcon ic = new ImageIcon(new URL("https://image.tmdb.org/t/p/w200" + photo1));
                        Image ic2 = ic.getImage().getScaledInstance(obj1.photo.getWidth(), obj1.photo.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon ic3 = new ImageIcon(ic2);
                        obj1.photo.setIcon(ic3);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (ob.has("overview")) {
                String desc = ob.get("overview").toString();
                System.out.println("------->" + desc);
                String overview = "";

                String[] n = desc.split("(?<=\\G.{" + 39 + "})");
                for (String string : n) {
                    overview += string + " " + "\n" + " ";
                }
                obj1.desc.setText(overview);
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

            obj1.setBounds(x, 20, 350, 440);
            x = x + 380;
            jp.add(obj1);
            jp.repaint();
            jp.revalidate();
            obj1.repaint();
            y += 1;

            jp.add(obj1);
            jp.repaint();
            jp.revalidate();
            obj1.repaint();

            System.out.println("-----------------------------------------------");

        }
        jp.setPreferredSize(new Dimension((500 * y) / 2, 350));

    }


    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed

    }//GEN-LAST:event_tfActionPerformed

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        
        if (name.equals("Movie")) {
            String name1 = tf.getText();
            name1 = name1.replace(" ", "%20");
            String ans = myClient.searchmovie(name1);
            System.out.println(ans);
            searchmovie(ans);
        } else if (name.equals("TV")) {
            String name = tf.getText();
            name = name.replace(" ", "%20");
            String ans = myClient.searchTV(name);
            System.out.println(ans);
            searchtv(ans);
        } else if (name.equals("Actor")) {
            String name = tf.getText();
            name = name.replace(" ", "%20");
            String ans = myClient.searchActor(name);
            System.out.println(ans);
            searchactor(ans);
        } else if (name.equals("MovieHouse")) {
            String name = tf.getText();
            name = name.replace(" ", "%20");
            String ans = myClient.searchMovieHouse(name);
            System.out.println(ans);
            searchmoviehouse(ans);
        }
    }//GEN-LAST:event_btActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        homepage obj1=new homepage();
        setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    ImageIcon imageresize(String ph) {
        ImageIcon ic3 = new ImageIcon();
        try {
            design obj = new design();
            ImageIcon ic = new ImageIcon(new URL("https://image.tmdb.org/t/p/w200" + ph));
            Image ic2 = ic.getImage().getScaledInstance(obj.photo.getWidth(), obj.photo.getHeight(), Image.SCALE_SMOOTH);
            ic3 = new ImageIcon(ic2);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        return ic3;
    }

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
            java.util.logging.Logger.getLogger(search_movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search_movie("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bt;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jp;
    private javax.swing.JLabel lb1;
    public javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
