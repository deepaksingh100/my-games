
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONY
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
        setLocation(330, 100);
        setSize(600, 500);
        try{
            BufferedImage img=ImageIO.read(getClass().getResourceAsStream("snakeladder.gif"));
            setIconImage(img);
        }catch(Exception e){}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel2.setText("PLAYER-1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(36, 162, 115, 34);

        jLabel3.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel3.setText("PLAYER-2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(36, 233, 115, 39);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(206, 162, 313, 34);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(206, 233, 313, 37);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(206, 311, 102, 38);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(417, 311, 102, 39);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("<html><a href='' '>Help</a></html>");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 410, 60, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("<html>&copy; copyright 2014  DEEPAK </html>");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 420, 190, 30);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel1.setText("SNAKE-LADDER GAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(91, 23, 425, 66);

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String p1=jTextField1.getText().trim(); 
        String p2=jTextField2.getText().trim(); 
        if(!(p1.equals("")||p2.equals(""))){
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(this, "Welcome to Snake-Ladder Game!!!");
       new SnakeLadder(p1,p2).setVisible(true);
        this.dispose();
        }
        else{
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(this, "Please Fill All The Blank Field(s)");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setText("<html><a href='' style='color:red'>Help</a></html>");
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setText("<html><a href='' style='color:blue'>Help</a></html>");
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new Help().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        int key=evt.getKeyChar();
        if((key>='a'&&key<='z')||(key>='A'&&key<='Z')||key==evt.VK_SPACE||key==evt.VK_BACK_SPACE||key==evt.VK_DELETE);
        else{Toolkit.getDefaultToolkit().beep();
        evt.consume();}
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
         int key=evt.getKeyChar();
        if((key>='a'&&key<='z')||(key>='A'&&key<='Z')||key==evt.VK_SPACE||key==evt.VK_BACK_SPACE||key==evt.VK_DELETE);
        else{Toolkit.getDefaultToolkit().beep();
        evt.consume();}
    }//GEN-LAST:event_jTextField2KeyTyped

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
