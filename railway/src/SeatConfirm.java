
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GAURAV KUMAR
 */
public class SeatConfirm extends javax.swing.JFrame {

    /**
     * Creates new form SeatConfirm
     */
    public SeatConfirm(String usrname) {
        super("Railway Reservation System::Seat Confirm");
        initComponents();
         setVisible(true);
         jLabel24.setText(usrname);
            setSize(1000,700);
            setLocation(185,20);
            try{
                	BufferedImage img=ImageIO.read(getClass().getResourceAsStream("Train.gif"));
		setIconImage(img);
	}catch (Exception e)
	{}
    }
    String source,dest,tno,tname,dtime,atime,dist,fair,usrname;
    public SeatConfirm(String ss,String ds,String no,String tname,String dt,String at,String fair,String dist,String usrname)
    {
        super("Railway Reservation System::Seat Confirm");
        initComponents();
         setVisible(true);
         jLabel24.setText(usrname);
          jLabel25.setText(no);
          jLabel35.setText(dt);
            jLabel27.setText(at);
              jLabel14.setText(dist);
              jLabel6.setText(fair);
       jLabel18.setText(ss);
         jLabel11.setText(ds);
         jLabel26.setText(tname);
         setSize(1000,700);
            setLocation(185,20);
            try{
                	BufferedImage img=ImageIO.read(getClass().getResourceAsStream("Train.gif"));
		setIconImage(img);
	}catch (Exception e)
	{}
        
         
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SeatConfirmation");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 20));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Logout");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3);
        jLabel3.setBounds(790, 0, 110, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 110, 1000, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("Trains");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 140, 110, 30);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Source");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(0, 0, 60, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Destination");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(90, 0, 100, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Train No.");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(190, 0, 70, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Train Name");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(270, 0, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Departure Time");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(470, 0, 110, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Distance");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(820, 0, 60, 30);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Arrival Time");
        jPanel4.add(jLabel33);
        jLabel33.setBounds(630, 0, 90, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Fair");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(730, 0, 50, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 910, 30);
        jPanel3.add(jLabel11);
        jLabel11.setBounds(100, 60, 70, 30);
        jPanel3.add(jLabel14);
        jLabel14.setBounds(830, 60, 70, 30);
        jPanel3.add(jLabel17);
        jLabel17.setBounds(10, 40, 20, 20);
        jPanel3.add(jLabel25);
        jLabel25.setBounds(190, 60, 60, 30);
        jPanel3.add(jLabel26);
        jLabel26.setBounds(280, 50, 210, 40);
        jPanel3.add(jLabel27);
        jLabel27.setBounds(660, 60, 60, 30);
        jPanel3.add(jLabel18);
        jLabel18.setBounds(10, 60, 60, 30);
        jPanel3.add(jLabel34);
        jLabel34.setBounds(590, 50, 80, 30);
        jPanel3.add(jLabel35);
        jLabel35.setBounds(480, 60, 90, 30);
        jPanel3.add(jLabel6);
        jLabel6.setBounds(730, 60, 70, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(50, 180, 910, 120);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 0));
        jLabel28.setText("Book Ticket");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(50, 300, 160, 30);

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        jPanel5.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(102, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        jPanel6.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Gender");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(370, 0, 80, 30);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Name");
        jPanel6.add(jLabel29);
        jLabel29.setBounds(30, 0, 70, 30);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Age");
        jPanel6.add(jLabel31);
        jLabel31.setBounds(570, 0, 60, 30);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Berth");
        jPanel6.add(jLabel32);
        jLabel32.setBounds(720, 0, 60, 30);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(0, 0, 910, 30);
        jPanel5.add(jTextField1);
        jTextField1.setBounds(10, 190, 290, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel5.add(jComboBox1);
        jComboBox1.setBounds(370, 140, 130, 30);
        jPanel5.add(jTextField2);
        jTextField2.setBounds(570, 190, 30, 30);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Upper", "Middle", "Lower", "Side Lower", "Side Upper" }));
        jPanel5.add(jComboBox2);
        jComboBox2.setBounds(720, 140, 160, 30);
        jPanel5.add(jTextField4);
        jTextField4.setBounds(10, 40, 290, 30);
        jPanel5.add(jTextField5);
        jTextField5.setBounds(10, 90, 290, 30);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel5.add(jComboBox3);
        jComboBox3.setBounds(370, 40, 130, 30);

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel5.add(jComboBox4);
        jComboBox4.setBounds(370, 90, 130, 30);
        jPanel5.add(jTextField6);
        jTextField6.setBounds(570, 40, 30, 30);
        jPanel5.add(jTextField7);
        jTextField7.setBounds(570, 90, 30, 30);

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Upper", "Middle", "Lower", "Side Lower", "Side Upper" }));
        jPanel5.add(jComboBox5);
        jComboBox5.setBounds(720, 40, 160, 30);

        jComboBox6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Upper", "Middle", "Lower", "Side Lower", "Side Upper" }));
        jPanel5.add(jComboBox6);
        jComboBox6.setBounds(720, 90, 160, 30);

        jComboBox10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Upper", "Middle", "Lower", "Side Lower", "Side Upper" }));
        jPanel5.add(jComboBox10);
        jComboBox10.setBounds(720, 190, 160, 30);
        jPanel5.add(jTextField3);
        jTextField3.setBounds(10, 140, 290, 30);

        jComboBox7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel5.add(jComboBox7);
        jComboBox7.setBounds(370, 190, 130, 30);
        jPanel5.add(jTextField8);
        jTextField8.setBounds(570, 140, 30, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(50, 350, 910, 240);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Confirm");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(300, 610, 140, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Cancel");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(580, 610, 140, 40);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(840, 650, 80, 40);
        jPanel1.add(jLabel16);
        jLabel16.setBounds(930, 640, 70, 40);
        jPanel1.add(jLabel19);
        jLabel19.setBounds(940, 360, 200, 100);
        jPanel1.add(jLabel20);
        jLabel20.setBounds(940, 480, 200, 120);

        jPanel7.setBackground(new java.awt.Color(102, 153, 255));
        jPanel7.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 51, 51));
        jLabel23.setToolTipText("");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(1010, 70, 120, 30);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel2.setText("RAILWAY RESERVATION SYSTEM");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(160, 0, 630, 50);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(0, 10, 790, 60);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setText("Welcome  Mr.");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(680, 80, 120, 30);

        jLabel24.setBackground(new java.awt.Color(255, 51, 51));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel24);
        jLabel24.setBounds(800, 80, 130, 30);
        jPanel1.add(jLabel21);
        jLabel21.setBounds(0, 0, 1000, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 700);

        getAccessibleContext().setAccessibleName(" ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String name=jTextField4.getText();
        String age=jTextField6.getText();
        String sex=jComboBox3.getSelectedItem().toString();
        String berth=jComboBox5.getSelectedItem().toString();
        if (!(name.equals("")||age.equals(""))) 
        {
             try{
                 Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            Statement st=con.createStatement();
            st.executeUpdate("insert into reservationhistory values('"+name+"','"+age+"','"+berth+"','"+tno+"','"+tname+"','"+source+"','"+dest+"','"+fair+"')");
           st.close();
           con.close();
           Toolkit.getDefaultToolkit().beep();
           JOptionPane.showMessageDialog(this,"Please Pay the Fair!!!");
                       source=jLabel18.getText();
         dest=jLabel11.getText();
          tno=jLabel25.getText();
          tname= jLabel26.getText();
          dtime=jLabel35.getText();
          atime=jLabel27.getText();
          dist=jLabel14.getText();
          usrname=jLabel24.getText();
           fair=jLabel6.getText();
           new Payment(name,age,berth,tno,tname,source,dest,fair,usrname).setVisible(true);
          // System.out.println(fair);
           this.dispose();
        }catch(Exception e)
            {}
        } else {Toolkit.getDefaultToolkit().beep();
              JOptionPane.showMessageDialog(this,"Please Fill the Blank Field(s)!!!");
        }
                 
                
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
     new Reservation(usrname).setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
new Login().setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(SeatConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
               // new SeatConfirm(usrname).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
