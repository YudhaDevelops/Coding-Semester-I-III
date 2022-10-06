package project_akhir_v2.pkg0;

public class JFrame_MenuUtama extends javax.swing.JFrame {

    public GUI_Tree phn = new GUI_Tree();

    public JFrame_MenuUtama() {
        initComponents();
        phn = new GUI_Tree();
        help();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_guest = new javax.swing.JMenuItem();
        menu_admin = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kamus KUU");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2-removebg-preview.png"))); // NOI18N

        jMenu1.setText("Kamus KUU");

        menu_guest.setText("Guest");
        menu_guest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_guestActionPerformed(evt);
            }
        });
        jMenu1.add(menu_guest);

        menu_admin.setText("Admin");
        menu_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_adminActionPerformed(evt);
            }
        });
        jMenu1.add(menu_admin);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_adminActionPerformed
        JDialog_Login login = new JDialog_Login(this, true, phn);
        login.setVisible(true);
    }//GEN-LAST:event_menu_adminActionPerformed

    private void menu_guestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_guestActionPerformed
        JDialog_Guest g = new JDialog_Guest(this, true, phn);
        g.setVisible(true);
    }//GEN-LAST:event_menu_guestActionPerformed

    public void help() {
        String[] kata = {"AKAR", "BAJU", "BANDAR", "CERITA", "CENDAWAN", "ABAD",
            "ALUR", "BERDALIH", "BERSUA"};
        String[] arti = {"Bagian tumbuhan yang tertanam di dalam tanah", "Pakaian"
            + " penutup badan bagian atas", "Orang yang bermodal dalam "
            + "perdagangan", "Omong kosong", "Jamur yang besar", "Masa "
            + "Seratur Tahun", "Rangakaian peristiwa yang direka dan di "
            + "jalin dengan seksama dan menggerakkan jalan cerita melalui "
            + "kerumitan ke arah klimaks dan penyelesaian", "Mengemukakan "
            + "alasan (yang dicari-cari) untuk menghindari tugas atau menutupi "
            + "perbuatan yang salah atau tercela", "Data saling mendekati "
            + "(berdekat-dekatan)"};
        for (int i = 0; i < kata.length; i++) {
            phn.insert(kata[i], arti[i]);
            System.out.println("Data Berhasil Di Tambahkan");
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem menu_admin;
    private javax.swing.JMenuItem menu_guest;
    // End of variables declaration//GEN-END:variables
}
