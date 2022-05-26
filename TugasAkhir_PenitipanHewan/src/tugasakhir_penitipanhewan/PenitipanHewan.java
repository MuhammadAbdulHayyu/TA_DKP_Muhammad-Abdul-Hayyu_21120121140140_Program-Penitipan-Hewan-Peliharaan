
package tugasakhir_penitipanhewan;

import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Toolkit;



public class PenitipanHewan extends javax.swing.JFrame {

    public PenitipanHewan() {
        initComponents();
        //Digunakan untuk mangatur form ditengah
        Dimension screenSize = 
         Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = this.getSize();
            if (frameSize.height > screenSize.height) {
                frameSize.height = screenSize.height;
            }
            if (frameSize.width > screenSize.width) {
                frameSize.width = screenSize.width;
            }
            this.setLocation(
                    (screenSize.width - frameSize.width) / 2, 
                    (screenSize.height - frameSize.height) / 2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHewan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rdAnjing = new javax.swing.JRadioButton();
        rdKucing = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cbxLama = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        btnInput = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTlp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rbTambahan = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtKembali = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        rbTidak = new javax.swing.JRadioButton();
        btnReset = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(810, 650));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nama Pemilik ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 50, 80, 15);
        getContentPane().add(txtNama);
        txtNama.setBounds(140, 50, 182, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nama Hewan ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 200, 76, 15);
        getContentPane().add(txtHewan);
        txtHewan.setBounds(140, 200, 182, 30);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(197, 499, 34, 0);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Jenis Hewan  ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 240, 118, 15);

        rdAnjing.setText("Anjing");
        getContentPane().add(rdAnjing);
        rdAnjing.setBounds(150, 240, 70, 23);

        rdKucing.setText("Kucing");
        getContentPane().add(rdKucing);
        rdKucing.setBounds(220, 240, 70, 23);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Lama Waktu Penitipan ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 50, 130, 15);

        cbxLama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLamaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxLama);
        cbxLama.setBounds(560, 50, 114, 24);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Harga");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 90, 34, 15);
        getContentPane().add(txtHarga);
        txtHarga.setBounds(540, 90, 186, 30);

        btnInput.setText("Input");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });
        getContentPane().add(btnInput);
        btnInput.setBounds(480, 310, 73, 25);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus);
        btnHapus.setBounds(580, 310, 73, 25);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblData);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 380, 780, 200);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Penitipan Hewan Peliharaan MOMOJAYA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 10, 360, 25);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("No.Telepon");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 160, 70, 15);

        txtTlp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTlpKeyTyped(evt);
            }
        });
        getContentPane().add(txtTlp);
        txtTlp.setBounds(140, 160, 180, 30);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Alamat ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 90, 50, 15);
        getContentPane().add(txtAlamat);
        txtAlamat.setBounds(140, 90, 260, 60);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tambahan");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(460, 130, 60, 15);

        rbTambahan.setText("Paket Grooming + Rp.100.000");
        rbTambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTambahanActionPerformed(evt);
            }
        });
        getContentPane().add(rbTambahan);
        rbTambahan.setBounds(530, 130, 180, 23);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Total Harga");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(440, 160, 70, 15);
        getContentPane().add(txtTotal);
        txtTotal.setBounds(540, 160, 180, 30);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Uang Bayar");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(440, 200, 70, 15);
        getContentPane().add(txtBayar);
        txtBayar.setBounds(540, 200, 180, 30);

        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBayar);
        btnBayar.setBounds(540, 240, 80, 25);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Uang kembali");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(440, 270, 80, 20);
        getContentPane().add(txtKembali);
        txtKembali.setBounds(540, 270, 180, 30);

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Rp.");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(520, 90, 40, 15);

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Rp.");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(520, 270, 40, 15);

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Rp.");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(520, 200, 40, 15);

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Rp.");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(520, 160, 40, 15);

        rbTidak.setText("Tidak");
        rbTidak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTidakActionPerformed(evt);
            }
        });
        getContentPane().add(rbTidak);
        rbTidak.setBounds(720, 130, 70, 23);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(680, 310, 70, 25);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\Cobacobe.jpg")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -10, 800, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // Digunakan untuk memanggil tabel
        tblData.setModel(tbl);
    }//GEN-LAST:event_formComponentShown

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        // Tipe Data string
        String ls_nama = txtNama.getText();
        String ls_alamat = txtAlamat.getText();
        String ls_tlp = txtTlp.getText();
        String ls_hewan = txtHewan.getText();
        String ls_jh="";
        if(rdAnjing.isSelected()){              //Pengkondisian
            ls_jh = rdAnjing.getText();
        }
        else if(rdKucing.isSelected()){
            ls_jh = rdKucing.getText();
        }
        
        String ls_lama = cbxLama.getSelectedItem().toString();      //Tipe Data String
        String ls_harga = txtTotal.getText();
        String ls_bayar = txtBayar.getText();
        String ls_kembali= txtKembali.getText();
        
        tbl = (DefaultTableModel) tblData.getModel();          
        Object[] data = new Object[9];          //Array
        data[0]=ls_nama;
        data[1]=ls_alamat;
        data[2]=ls_tlp;
        data[3]=ls_hewan;
        data[4]=ls_jh;
        data[5]=ls_lama;
        data[6]=ls_harga;
        data[7]=ls_bayar;
        data[8]=ls_kembali;
        
        tbl.addRow(data);
        txtNama.setText("");
        txtAlamat.setText("");
        txtTlp.setText("");
        txtHewan.setText("");
        rdAnjing.setSelected(false);
        rdKucing.setSelected(false);
        cbxLama.setSelectedIndex(0);
        txtHarga.setText("");
        rbTambahan.setSelected(false);
        rbTidak.setSelected(false);
        txtTotal.setText("");
        txtBayar.setText("");
        txtKembali.setText("");
        
    }//GEN-LAST:event_btnInputActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        cbxLama.removeAllItems();
cbxLama.addItem("====pilih====");
cbxLama.addItem("1 Hari");
cbxLama.addItem("2 Hari");
cbxLama.addItem("3 Hari");
cbxLama.addItem("4 Hari");
cbxLama.addItem("5 Hari");
cbxLama.addItem("6 Hari");
cbxLama.addItem("7 Hari");
    }//GEN-LAST:event_formWindowActivated

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // Pengkondisian
        DefaultTableModel model= (DefaultTableModel) tblData.getModel();
        if (model.getRowCount()>=1){
            model.removeRow(0);
        }
        else {
        }
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void cbxLamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLamaActionPerformed
        // Pengkondisian dan Setter Getter
         if(cbxLama.getSelectedItem().equals("1 Hari")){  
            txtHarga.setText("25000");  
        }else if(cbxLama.getSelectedItem().equals("2 Hari")){  
            txtHarga.setText("50000");  
        }else if(cbxLama.getSelectedItem().equals("3 Hari")){  
            txtHarga.setText("75000");   
        }
         else if(cbxLama.getSelectedItem().equals("4 Hari")){  
            txtHarga.setText("100000"); 
        }
         else if(cbxLama.getSelectedItem().equals("5 Hari")){  
            txtHarga.setText("125000"); 
        }else if(cbxLama.getSelectedItem().equals("6 Hari")){  
            txtHarga.setText("150000"); 
        }else if(cbxLama.getSelectedItem().equals("7 Hari")){  
            txtHarga.setText("175000"); 
        }
          
    }//GEN-LAST:event_cbxLamaActionPerformed

    private void rbTambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTambahanActionPerformed
        // Tipe Data Integer dan Pengkondisian
        int subtotal = 100000;
        
        int hasil = Integer.parseInt(txtHarga.getText());
        
        if(rbTambahan.isSelected()){
            subtotal = subtotal + hasil;
            txtTotal.setText(Integer.toString(subtotal));
            
        }else {
            
            
        }
         
        
    }//GEN-LAST:event_rbTambahanActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // Tipe Data Integer
        
        int total=Integer.parseInt(txtTotal.getText());  
        int uang=Integer.parseInt(txtBayar.getText());  
        int hasil=uang-total;
        txtKembali.setText(Integer.toString(hasil));
        
    
    }//GEN-LAST:event_btnBayarActionPerformed

    private void rbTidakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTidakActionPerformed
        // Tipe Data Integer dan Pengkondisian
        int sub = 0;
        int hasil = Integer.parseInt(txtHarga.getText());
        if(rbTidak.isSelected()){
           sub = sub + hasil;
            txtTotal.setText(Integer.toString(sub)); 
        } else{
            
        }
            
    }//GEN-LAST:event_rbTidakActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // Perulangan
        for( int i = tbl.getRowCount() - 1; i >= 0; i-- )
        {
            tbl = (DefaultTableModel) tblData.getModel();
            tbl.removeRow(i);
            txtNama.setText("");
            txtAlamat.setText("");
            txtTlp.setText("");
            txtHewan.setText("");
            rdAnjing.setSelected(false);
            rdKucing.setSelected(false);
            cbxLama.setSelectedIndex(0);
            txtHarga.setText("");
            rbTambahan.setSelected(false);
            rbTidak.setSelected(false);
            txtTotal.setText("");
            txtBayar.setText("");
            txtKembali.setText("");
            
            
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtTlpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTlpKeyTyped
        //Untuk mengatur jumlah huruf pada telepon  
        if(txtTlp.getText().length()>11){
            evt.consume();
        }
    }//GEN-LAST:event_txtTlpKeyTyped

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
            java.util.logging.Logger.getLogger(PenitipanHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenitipanHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenitipanHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenitipanHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenitipanHewan().setVisible(true);
                
            }
        });
    }
    //Digunakan untuk pembuatan tabel
    int Baris = 0;
    static Object Kolom [] = {"Nama Pemilik","Alamat","No.Telp","Nama Hewan","Jenis Hewan","Lama Waktu "
            ,"Total Harga","Uang Bayar","Uang kembali"};
    DefaultTableModel tbl = new DefaultTableModel(Kolom,Baris); 
           

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbxLama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbTambahan;
    private javax.swing.JRadioButton rbTidak;
    private javax.swing.JRadioButton rdAnjing;
    private javax.swing.JRadioButton rdKucing;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtHewan;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTlp;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
