/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONY
 */
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Bank extends javax.swing.JFrame {

    /**
     * Creates new form Bank
     */
    public Bank(String usrname) {
       super("Railway Reservation System::Bank Window");
        initComponents();
    setLocation(300,80);
     setSize(700,590);
        try{
		BufferedImage img=ImageIO.read(getClass().getResourceAsStream("Train.gif"));
		setIconImage(img);
	}catch (Exception e)
	{}
    }String name,age,berth,tno,tname,source,dest,fair,usrname;
public  Bank(String name,String age,String berth,String tno,String tname,String source,String dest,String fair,String usrname)
{
    super("Railway Reservation System::Bank Window"); 
    initComponents();
    jTextField4.setText(fair);
     jTextField4.setEditable(false);
    usrname=this.usrname;
     try{
		BufferedImage img=ImageIO.read(getClass().getResourceAsStream("Train.gif"));
		setIconImage(img);
	}catch (Exception e)
	{}
     
     setVisible(true);
     setLocation(300,80);
     setSize(700,600);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel1.setText("RAILWAY RESERVATION SYSTEM ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 630, 50);

        jLabel2.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel2.setText("Amount");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 350, 110, 40);

        jLabel3.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel3.setText("Account No.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 230, 140, 40);

        jLabel4.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel4.setText("CVV No.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 290, 110, 40);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(230, 170, 250, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(230, 230, 250, 40);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(230, 290, 250, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(440, 460, 130, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Confirm");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(130, 460, 120, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Reset");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(290, 460, 120, 40);

        jLabel5.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel5.setText("Card No.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 170, 90, 40);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(230, 350, 250, 40);

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 30)); // NOI18N
        jLabel6.setText("Bank Details");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(240, 90, 220, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 700, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        String s = jTextField1.getText();
        int len = s.length();
        char ch = evt.getKeyChar();
        if (!((ch >= '0' && ch <= '9') || ch == java.awt.event.KeyEvent.VK_BACK_SPACE || ch == java.awt.event.KeyEvent.VK_DELETE)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }
        if (len >= 16) {
            jTextField1.setEditable(false);
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        String s = jTextField2.getText();
        int len = s.length();
        char ch = evt.getKeyChar();
        if (!((ch >= '0' && ch <= '9') || ch == java.awt.event.KeyEvent.VK_BACK_SPACE || ch == java.awt.event.KeyEvent.VK_DELETE)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }
        if (len >= 10) {
            jTextField2.setEditable(false);
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        String s = jTextField3.getText();
        int len = s.length();
        char ch = evt.getKeyChar();
        if (!((ch >= '0' && ch <= '9') || ch == java.awt.event.KeyEvent.VK_BACK_SPACE || ch == java.awt.event.KeyEvent.VK_DELETE)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }
        if (len >= 3) {
            jTextField3.setEditable(false);
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new Payment(usrname).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       try {
              Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
       Statement st=con.createStatement();
       ResultSet rs=st.executeQuery("select * from reservationhistory");
       if(rs.next())
       {
           new Confirm(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),usrname).setVisible(true);
           this.dispose();
       }
       else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "Please Fill The Blank Field(s)!!! ");
        }
       }catch (Exception e) 
        {
            Toolkit.getDefaultToolkit().beep();
                 JOptionPane.showMessageDialog(this,e);
            }
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");

    }//GEN-LAST:event_jButton3MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        String s = jTextField4.getText();
        char ch = evt.getKeyChar();
        if (!((ch >= '0' && ch <= '9') || ch == java.awt.event.KeyEvent.VK_BACK_SPACE || ch == java.awt.event.KeyEvent.VK_DELETE)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

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
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //new Bank().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
