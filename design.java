public class design extends javax.swing.JPanel {

    public design() {
        initComponents();
        setSize(800, 600);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        bt = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        size = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(null);

        title.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("MOVIE NAME");
        add(title);
        title.setBounds(90, 30, 140, 40);

        bt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        add(bt);
        bt.setBounds(230, 30, 70, 40);

        photo.setText("MOVIE IMAGE");
        add(photo);
        photo.setBounds(70, 80, 200, 120);

        lb3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("RELEASE DATE");
        add(lb3);
        lb3.setBounds(60, 200, 140, 50);

        date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("date");
        add(date);
        date.setBounds(200, 210, 160, 30);

        lb5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setText("ABOUT MOVIE");
        add(lb5);
        lb5.setBounds(120, 250, 180, 40);

        desc.setBackground(new java.awt.Color(0, 0, 0));
        desc.setColumns(20);
        desc.setForeground(new java.awt.Color(255, 255, 255));
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        add(jScrollPane1);
        jScrollPane1.setBounds(80, 300, 240, 120);

        size.setBackground(new java.awt.Color(255, 255, 255));
        size.setForeground(new java.awt.Color(255, 255, 255));
        add(size);
        size.setBounds(-3, -4, 400, 440);
    }// </editor-fold>//GEN-END:initComponents

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed

    }//GEN-LAST:event_btActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bt;
    public javax.swing.JLabel date;
    public javax.swing.JTextArea desc;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lb3;
    public javax.swing.JLabel lb5;
    public javax.swing.JLabel photo;
    private javax.swing.JLabel size;
    public javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
