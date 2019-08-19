

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class Welcome extends javax.swing.JFrame implements Runnable{
        Thread th1; 
        public Welcome() {
        super("Snake Game::Welcome Window");
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        setResizable(false);  
                th1=new Thread(this);
		th1.start();
        try{
		BufferedImage img=ImageIO.read(getClass().getResource("Snake1.jpg"));
		setIconImage(img);
	}catch (Exception e)
	{}
    }
        int val=0;
    @Override
    public void run(){
       while(true)
       {
            if(val<100){
            val+=1;
            jProgressBar1.setValue(val);
     }
     else{
        new MainMenu().setVisible(true);
        this.dispose();
         th1.stop();
            } 
             
            try{
                th1.sleep(100);
            }catch(Exception e)
            {}
       }        
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(0, 500, 600, 10);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Loading...");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 480, 120, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("<html><a style='color:red'>&copy; copyright 2014 DEEPAK</a></html>");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 530, 190, 17);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel2.setText("SNAKE GAME");
        jLabel2.setFocusCycleRoot(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 90, 270, 56);
        jLabel2.getAccessibleContext().setAccessibleParent(jLabel2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Snake1.jpg"))); // NOI18N
        jLabel1.setName(""); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
