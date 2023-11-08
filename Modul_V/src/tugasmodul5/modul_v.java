/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugasmodul5;


import com.mysql.jdbc.Statement;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class modul_v extends javax.swing.JFrame {

//    private boolean isEditMode = false;
    private koneksi mysqlkonek;
    
    
    public modul_v() {
        mysqlkonek = new koneksi();
        initComponents();
        tampil_data();
        bersihkan();
        tambahpilihBarang();
        
    }
    
    public void tambahpilihBarang() {
        try {
            java.sql.Statement st = mysqlkonek.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT barang FROM tbdatapenjualan");

            while (rs.next()) {
                String namaBarang = rs.getString("barang");
                cbPilih.addItem(namaBarang);
            }

            st.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        }

    }
    
    private void bersihkan(){
        tfBarang.setText("");
        tfkode.setText("");
        tfharga.setText("");
    }

    
    public void tampil_data(){
        DefaultTableModel tabel1 = new DefaultTableModel();
        tabel1.addColumn("Pilih Barang");
        tabel1.addColumn("Kode Barang");
        tabel1.addColumn("Harga");
        
        try{
            java.sql.Connection conn = tugasmodul5.koneksi.koneksiDB();
            String query = "select * from tbdatapenjualan";
            java.sql.PreparedStatement pst = conn.prepareStatement(query);
            ResultSet  rs = pst.executeQuery();
            
            while(rs.next()){
                Object[] row = {
                    rs.getString("barang"),
                    rs.getString("kode"),
                    rs.getString("harga")
                };
                tabel1.addRow(row);
            }
            
            jTable1.setModel(tabel1);
        }catch(Exception e){
            e.printStackTrace();
        }     
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfBarang = new javax.swing.JTextField();
        tfkode = new javax.swing.JTextField();
        tfharga = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbPilih = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tfKode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfHarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfJumlah = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfTotalHarga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfBayar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfKembalian = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnCek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jInternalFrame1.setVisible(true);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama Barang", "Kode Barang", "Harga Barang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnHapus.setBackground(new java.awt.Color(255, 51, 0));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(0, 0, 255));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("BARANG");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("KODE");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("HARGA");

        btnSimpan.setBackground(new java.awt.Color(255, 153, 153));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnHapus)
                .addGap(22, 22, 22))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(116, 116, 116)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfharga, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfkode, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSimpan)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tfBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tfharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Data", jPanel4);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setLayout(new java.awt.GridLayout(8, 0, 50, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("NAMA");
        jPanel5.add(jLabel1);
        jPanel5.add(tfNama);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("PILIH BARANG");
        jPanel5.add(jLabel2);

        cbPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPilihActionPerformed(evt);
            }
        });
        jPanel5.add(cbPilih);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("KODE BARANG");
        jPanel5.add(jLabel3);

        tfKode.setEditable(false);
        jPanel5.add(tfKode);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("HARGA ");
        jPanel5.add(jLabel4);

        tfHarga.setEditable(false);
        jPanel5.add(tfHarga);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("JUMLAH");
        jPanel5.add(jLabel5);
        jPanel5.add(tfJumlah);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("TOTAL HARGA");
        jPanel5.add(jLabel6);

        tfTotalHarga.setEditable(false);
        jPanel5.add(tfTotalHarga);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("BAYAR");
        jPanel5.add(jLabel7);
        jPanel5.add(tfBayar);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("KEMBALIAN");
        jPanel5.add(jLabel8);

        tfKembalian.setEditable(false);
        jPanel5.add(tfKembalian);

        btnBayar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBayar.setText("BAYAR");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel9.setText("SILAHKAN");

        btnCek.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCek.setText("CEK HARGA");
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnCek)
                .addGap(18, 18, 18)
                .addComponent(btnBayar)
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("Penjualan", jPanel3);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        
        try{
            String sql="insert into tbdatapenjualan values('"+ tfBarang.getText()+"','"+tfkode.getText()+"', '"+ tfharga.getText()+"')";
            java.sql.Connection conn=(java.sql.Connection)tugasmodul5.koneksi.koneksiDB();
            java.sql.PreparedStatement 
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            bersihkan();
            tampil_data();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
        }     
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus.");
        } else {
//            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
            
            int option = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                try {
                    String kodeDelete = jTable1.getValueAt(selectedRow, 1).toString();
                    String sql = "DELETE FROM tbdatapenjualan WHERE kode = ?";
                    java.sql.Connection conn = (java.sql.Connection) tugasmodul5.koneksi.koneksiDB();
                    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, kodeDelete);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
                    tampil_data();
                    pst.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data.\n" + e.getMessage());
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Pilih baris yang ingin diedit.");
        } else {
            String newBarang = tfBarang.getText();
            String newKode = tfkode.getText();
//            String newHarga = tfharga.getText();
            try {
                BigDecimal newHarga = new BigDecimal(tfharga.getText());

                int option = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menyimpan perubahan?", "Konfirmasi Edit", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    try {
                        String kodeToUpdate = (String) jTable1.getValueAt(selectedRow, 1).toString();
                        String sql = "UPDATE tbdatapenjualan SET barang = ?, kode = ?, harga = ? WHERE kode = ?";
                        java.sql.Connection conn = (java.sql.Connection) tugasmodul5.koneksi.koneksiDB();
                        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                        pst.setString(1, newBarang);
                        pst.setString(2, newKode);
                        pst.setBigDecimal(3, newHarga); // Menggunakan setBigDecimal untuk nilai DECIMAL
                        pst.setString(4, kodeToUpdate);
                        pst.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null, "Data berhasil diupdate.");
                        bersihkan();
                        tampil_data();
                        
                        pst.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Gagal mengupdate data.\n" + e.getMessage());
                        System.out.println(e.getMessage());
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Harga harus berupa angka yang valid.");
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            String barangValue = (String) jTable1.getValueAt(selectedRow, 0);
            String kodeValue = (String) jTable1.getValueAt(selectedRow, 1);
            String hargaValue = (String) jTable1.getValueAt(selectedRow, 2);

            tfBarang.setText(barangValue);
            tfkode.setText(kodeValue);
            tfharga.setText(hargaValue);
        }  
    }//GEN-LAST:event_jTable1MouseClicked

    private void cbPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPilihActionPerformed
        // TODO add your handling code here:
        
        String pilihBarang = cbPilih.getSelectedItem().toString();
        
        
        try{
            Statement st = (Statement) mysqlkonek.getConnection().createStatement();
            String query = "SELECT kode, harga FROM tbdatapenjualan WHERE barang = '" + pilihBarang + "'";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()) {
                tfKode.setText(rs.getString("kode"));
                tfHarga.setText(rs.getString("harga"));
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        }
    }//GEN-LAST:event_cbPilihActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
        String nama = tfNama.getText();

        try {
            int totalHarga = Integer.parseInt(tfTotalHarga.getText());
            int totalBayar = Integer.parseInt(tfBayar.getText());

            int kembalian = totalBayar - totalHarga;
            if (kembalian < 0) {
                JOptionPane.showMessageDialog(this, "Uang yang Anda bayarkan kurang");
            } else {
                tfKembalian.setText(String.valueOf(kembalian));
            }

            JOptionPane.showMessageDialog(null, "Selamat\n" + nama + "\n dengan Total Pembayaran " + totalHarga);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Pastikan total harga dan jumlah pembayaran adalah angka yang valid.");
        }
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
        // TODO add your handling code here:
        String jumlahString = tfJumlah.getText();
        String hargaString = tfHarga.getText();
        
        if(jumlahString.isEmpty() || hargaString.isEmpty()){
            JOptionPane.showMessageDialog(this, "Anda belum memasukan jumlah barang.");
            return;
        }
        
        int jumlahPembelian = Integer.parseInt(tfJumlah.getText());
        int hargaBarang = Integer.parseInt(tfHarga.getText());
        int totalHarga = jumlahPembelian * hargaBarang;
        tfTotalHarga.setText(String.valueOf(totalHarga));
        
    }//GEN-LAST:event_btnCekActionPerformed
    
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
            java.util.logging.Logger.getLogger(modul_v.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modul_v.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modul_v.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modul_v.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modul_v().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnCek;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbPilih;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfBarang;
    private javax.swing.JTextField tfBayar;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfJumlah;
    private javax.swing.JTextField tfKembalian;
    private javax.swing.JTextField tfKode;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfTotalHarga;
    private javax.swing.JTextField tfharga;
    private javax.swing.JTextField tfkode;
    // End of variables declaration//GEN-END:variables
}
