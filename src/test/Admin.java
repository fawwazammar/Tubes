/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
   
//    private Connection conn;
    private ResultSet rs;
    private Statement stat;
    
    String zzz;

//    public Admin(String zzz) {
//        this.zzz = zzz;
//    }
    
    

    public Admin(String zzz) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Hello Admin");
        new Koneksi();
        tabel();
        zzzz.setText(zzz);
    }
    
    private void tabel(){
        int no = 1;

        DefaultTableModel t = new DefaultTableModel();
        t.addColumn("No");
        t.addColumn("Username"); 
        t.addColumn("Password"); 
        t.addColumn("Status");
        tData.setModel(t); 
        
        try{
           Statement stat = (Statement) Koneksi.connect().createStatement();
           String sql = "SELECT * FROM pegawai WHERE akses = 'pegawai'";
           rs   = stat.executeQuery(sql);

           //penelusuran baris pada tabel pegawai dari database
           while(rs.next()){
                Object[ ] obj = new Object[4];
                obj[0] = no;
                obj[1] = rs.getString("username");
                obj[2] = rs.getString("password");
                obj[3] = rs.getString("status");

                t.addRow(obj);
                no++;
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zzzz = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        pfPasswordnd = new javax.swing.JPasswordField();
        bTambah = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tfUsernameStatus = new javax.swing.JTextField();
        bCari = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bProses = new javax.swing.JButton();
        lStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tData = new javax.swing.JTable();
        bLogout = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(637, 539));
        getContentPane().setLayout(null);

        zzzz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zzzz.setText("-");
        getContentPane().add(zzzz);
        zzzz.setBounds(510, 20, 117, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Status : ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(440, 20, 67, 22);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tambah Pegawai", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setText("Username");

        jLabel3.setText("Password");

        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        jLabel4.setText("Confirm Password");

        bTambah.setContentAreaFilled(false);
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfPasswordnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pfPasswordnd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(bTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 80, 294, 252);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status Pegawai", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel5.setText("Username");

        tfUsernameStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameStatusActionPerformed(evt);
            }
        });

        bCari.setContentAreaFilled(false);
        bCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCariActionPerformed(evt);
            }
        });

        jLabel6.setText("Status");

        bProses.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        bProses.setForeground(new java.awt.Color(255, 255, 255));
        bProses.setText("Proses");
        bProses.setContentAreaFilled(false);
        bProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProsesActionPerformed(evt);
            }
        });

        lStatus.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lStatus)
                            .addComponent(tfUsernameStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCari, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(bProses, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(tfUsernameStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bCari, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(bProses, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(310, 80, 320, 252);

        tData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Username", "Password", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tData);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 352, 617, 176);

        bLogout.setContentAreaFilled(false);
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(bLogout);
        bLogout.setBounds(348, 11, 70, 37);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/gambar/Admin.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 637, 539);

        setBounds(0, 0, 653, 578);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void tfUsernameStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameStatusActionPerformed

    private void bCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCariActionPerformed
        // TODO add your handling code here:
        try {
            Statement stat = (Statement) Koneksi.connect().createStatement();
            String sql = "SELECT * from pegawai where username='" +tfUsernameStatus.getText()+"'";
//            String akses = "SELECT akses from pegawai where username='" +tfUsernameStatus.getText()+"'";
            rs = stat.executeQuery(sql);
            String status = null , aa = null;

            boolean aksess = false;
            if(tfUsernameStatus.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Harap mengisi username");
            }
            
            while (rs.next()){
                status = rs.getString("status");
                tfUsernameStatus.setText(rs.getString("username"));

                if(rs.getString("username").equals(tfUsernameStatus.getText())){
                    aksess = true;
                }else {
                    aksess = false;
                }
            }
                
//            String status = "SELECT status from pegawai where username='" +tfUsernameStatus.getText()+"'`";
//            while(rs.next()){
                
            if(aksess == false || tfUsernameStatus.getText().equalsIgnoreCase("admin")){
                JOptionPane.showMessageDialog(this, "Username yang anda masukkan salah");                

            }else{
//                while (rs.next()){
//                    String status = rs.getString("status");
//                    tfUsernameStatus.setText(rs.getString("username"));
//                }
                if(status.equals("Aktif")){
                    lStatus.setText("Aktif");
                    bProses.setText("Non Aktif");
                }else{
                    lStatus.setText("Tidak Aktif");
                    bProses.setText("Aktif");
                }
                
            }
//            }
                      
           
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bCariActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        // TODO add your handling code here:
        try {
            String username = "SELECT username FROM pegawai";
            Statement stat = (Statement) Koneksi.connect().createStatement();
            
            if(tfUsername.getText().equals("") || pfPassword.getPassword().equals("")){
                JOptionPane.showMessageDialog(this, "Harap semua terisi");
            }else{
                String sql = "INSERT INTO pegawai (username, password, akses, status) values ('"+tfUsername.getText()+"','" +pfPassword.getText()+"','pegawai','Aktif')";
                stat.executeUpdate(sql);                

                tfUsername.setText(""); 
                pfPassword.setText("");
                pfPasswordnd.setText("");

                tabel();
                JOptionPane.showMessageDialog(null, "Berhasil Menambah Pegawai"); 

            }
        } catch (HeadlessException e) { 
           JOptionPane.showMessageDialog(null, "Perintah Salah : "+e);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan username yang lain");
//            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            tabel();
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        // TODO add your handling code here:
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bLogoutActionPerformed

    private void bProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProsesActionPerformed
        // TODO add your handling code here:
        try{
            Statement stat = (Statement) Koneksi.connect().createStatement();
            String status = lStatus.getText();             

            if(status.equals("Aktif")){
                String sql = "UPDATE pegawai SET status = 'Tidak Aktif' where username = '"+tfUsernameStatus.getText()+"'";
                
//                int opsi = JOptionPane.showConfirmDialog(null, "Apakah yakin ingin menonaktifkan?");
//                switch(opsi){
//                    case JOptionPane.YES_OPTION:
//                        stat.executeUpdate(sql);
//                        JOptionPane.showMessageDialog(null, "Saat dipilih yes !");
//                        break;
//                    case JOptionPane.NO_OPTION:
//                        JOptionPane.showMessageDialog(null, "Saat dipilih no !");
//                        break;
//                    default:
//                        JOptionPane.showMessageDialog(null, "Saat dipilih cancel !");
//                        break;
//                }
                int jawab = JOptionPane.showOptionDialog(this, 
                        "Apakah yakin ingin menonaktifkan?", 
                        null, 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
        
                if(jawab == JOptionPane.YES_OPTION){
                    stat.executeUpdate(sql);
                }

            }else if(status.equals("Tidak Aktif")){
                String sql = "UPDATE pegawai SET status = 'Aktif' where username = '"+tfUsernameStatus.getText()+"'";
//                int opsi = JOptionPane.showConfirmDialog(null, "Apakah yakin ingin mengaktifkan kembali?");
//                switch(opsi){
//                    case JOptionPane.YES_OPTION:
//                        stat.executeUpdate(sql);
////                        JOptionPane.showMessageDialog(null, "Saat dipilih yes !");
//                        break;
//                    case JOptionPane.NO_OPTION:
////                        JOptionPane.showMessageDialog(null, "Saat dipilih no !");
//                        break;
////                    default:
////                        JOptionPane.showMessageDialog(null, "Saat dipilih cancel !");
////                        break;
//                }
                int jawab = JOptionPane.showOptionDialog(this, 
                        "Apakah yakin ingin mengaktifkan kembali?", 
                        null, 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
        
                if(jawab == JOptionPane.YES_OPTION){
                    stat.executeUpdate(sql);
                }
            }
            
            tfUsernameStatus.setText(""); 
            lStatus.setText("-");
            bProses.setText("Proses");

        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            tabel();
        }
    }//GEN-LAST:event_bProsesActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCari;
    private javax.swing.JButton bLogout;
    private javax.swing.JButton bProses;
    private javax.swing.JButton bTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lStatus;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JPasswordField pfPasswordnd;
    private javax.swing.JTable tData;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JTextField tfUsernameStatus;
    private javax.swing.JLabel zzzz;
    // End of variables declaration//GEN-END:variables
}
