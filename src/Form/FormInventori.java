/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import Config.Koneksi;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sen
 */
public class FormInventori extends javax.swing.JFrame {
    private Connection conn;

    public FormInventori() {
        initComponents();
        conn = Koneksi.getConnetion();
        getData();
        nonaktifButton();
        aktifButton();
    }
    
    private void getData() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "Select * From inventori";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int id                  = rs.getInt("id");
                String nama_barang      = rs.getString("nama_barang");
                String no_barang        = rs.getString("no_barang");
                String jenis_barang     = rs.getString("jenis_barang"); 
                
                Object[] rowData = {id,nama_barang,no_barang,jenis_barang};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(FormInventori.class.getName()).log(Level.SEVERE, null, e);
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        t_nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t_no = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t_jenis = new javax.swing.JTextField();
        t_cari = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_perbarui = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_data.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tbl_data.setForeground(new java.awt.Color(102, 102, 102));
        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Nomor", "Jenis"
            }
        ));
        tbl_data.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_data.setRowHeight(30);
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        jLabel1.setText("Nama Barang");

        jLabel2.setText("No Barang");

        t_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_noActionPerformed(evt);
            }
        });

        jLabel3.setText("Jenis Barang");

        t_jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_jenisActionPerformed(evt);
            }
        });

        t_cari.setBackground(new java.awt.Color(102, 204, 255));
        t_cari.setText("Pencarian ");
        t_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_cariMouseClicked(evt);
            }
        });
        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cariKeyTyped(evt);
            }
        });

        btn_tambah.setText("Add");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_perbarui.setText("Edit");
        btn_perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perbaruiActionPerformed(evt);
            }
        });

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_hapus.setText("Delete");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_cari)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_no, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(t_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_no, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_perbarui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_batal)
                    .addComponent(btn_hapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_jenisActionPerformed

    private void btn_perbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perbaruiActionPerformed
        int selectedRow = tbl_data.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan di edit");
            return;
        }
        
        String id = tbl_data.getValueAt(selectedRow, 0).toString();
        String nama_barang = t_nama.getText();
        String no_barang = t_no.getText();
        String jenis_barang = t_jenis.getText();
        
       if(nama_barang.isEmpty() || no_barang.isEmpty() || jenis_barang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus di isi !!", "validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String sql  = "UPDATE inventori SET nama_barang=?, no_barang=?, jenis_barang=? WHERE id=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nama_barang);
            st.setString(2, no_barang);
            st.setString(3, jenis_barang);
            st.setString(4, id);
            
            int rowUpdate = st.executeUpdate();
            if(rowUpdate > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate");
                resetForm();
                getData();
                aktifButton();
            }
            
            st.close();
        } catch (Exception e) {
            Logger.getLogger(FormInventori.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_perbaruiActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        String nama_barang = t_nama.getText();
        String no_barang = t_no.getText();
        String jenis_barang = t_jenis.getText();
        
        if(nama_barang.isEmpty() || no_barang.isEmpty() || jenis_barang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus di isi !!", "validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String sql  = "INSERT INTO inventori (nama_barang,no_barang,jenis_barang) VALUES (?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nama_barang);
            st.setString(2, no_barang);
            st.setString(3, jenis_barang);
            
            int rowInserted = st.executeUpdate();
            if(rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
                resetForm();
                getData();
            }
            
            st.close();
        } catch (Exception e) {
            Logger.getLogger(FormInventori.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        resetForm();
        aktifButton();
        nonaktifButton();
        
    }//GEN-LAST:event_btn_batalActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        int selectedRow = tbl_data.getSelectedRow();
        if(selectedRow != -1) {
            String nama_barang = tbl_data.getValueAt(selectedRow, 1).toString();
            String no_barang = tbl_data.getValueAt(selectedRow, 2).toString();
            String jenis_barang = tbl_data.getValueAt(selectedRow, 3).toString();
            
            t_nama.setText(nama_barang);
            t_no.setText(no_barang);
            t_jenis.setText(jenis_barang);
        }
        btn_perbarui.setEnabled(true);
        btn_tambah.setEnabled(false);
        btn_hapus.setEnabled(true);
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int selectedRow = tbl_data.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan di edit");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin untuk menghapus data ini?", "konfirmasi", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            String id = tbl_data.getValueAt(selectedRow, 0).toString();
            
            try {
                String sql = "DELETE FROM inventori WHERE id=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, id);
                
                int rowDelete = st.executeUpdate();
                if(rowDelete > 0){
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                    
                }
                st.close();
            } catch (Exception e) {
                Logger.getLogger(FormInventori.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        resetForm();
        getData();
        aktifButton();
        nonaktifButton();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void t_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyTyped
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        
        String cari = t_cari.getText();
        try {
            String sql = "Select * From inventori WHERE nama_barang LIKE ? OR no_barang LIKE ? OR jenis_barang LIKE ?";
            PreparedStatement st = conn.prepareStatement(sql);
             st.setString(1, "%" + cari + "%");
             st.setString(2, "%" + cari + "%");
             st.setString(3, "%" + cari + "%");
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int id                  = rs.getInt("id");
                String nama_barang      = rs.getString("nama_barang");
                String no_barang        = rs.getString("no_barang");
                String jenis_barang     = rs.getString("jenis_barang"); 
                
                Object[] rowData = {id,nama_barang,no_barang,jenis_barang};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(FormInventori.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_t_cariKeyTyped

    private void t_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_cariMouseClicked
        t_cari.setText("");
    }//GEN-LAST:event_t_cariMouseClicked

    private void t_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_noActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormInventori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInventori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInventori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInventori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInventori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_perbarui;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_jenis;
    private javax.swing.JTextField t_nama;
    private javax.swing.JTextField t_no;
    private javax.swing.JTable tbl_data;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        t_nama.setText("");
        t_no.setText("");
        t_jenis.setText("");
    }

    private void nonaktifButton() {
        btn_perbarui.setEnabled(false);
        btn_hapus.setEnabled(false);
    }

    private void aktifButton() {
        btn_tambah.setEnabled(true);
        btn_batal.setEnabled(true);
    }
    


}
