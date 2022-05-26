
package tugasakhir_penitipanhewan;

import java.awt.Dimension;
import java.awt.Toolkit;


public class Loading extends javax.swing.JFrame implements Runnable{

    
    public Loading() {
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
        Thread t = new Thread(this);
        
        t.start();
    }
    
    @Override
    public void run() {
        for(int i = 1;i <= 100;i++){
            try{
                Thread.sleep(20);
                
            } catch (Exception e){
                e.printStackTrace();
            }
            lbl_count.setText(i+"%");
            Progres.setValue(i);
            
        }
        // Constructor Pemanggilan class
        PenitipanHewan home = new PenitipanHewan();
        home.setVisible(true);
        dispose();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Progres = new javax.swing.JProgressBar();
        lbl_count = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(518, 300));
        getContentPane().setLayout(null);
        getContentPane().add(Progres);
        Progres.setBounds(112, 156, 266, 25);
        getContentPane().add(lbl_count);
        lbl_count.setBounds(112, 125, 82, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\AnjingKucing.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-100, 0, 620, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Progres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_count;
    // End of variables declaration//GEN-END:variables

    
}
