
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONY
 */
public class Signup extends javax.swing.JFrame {
  int n=0,c=0,sc=0;
  JTextField jt[]=new JTextField[3];
    /**
     * Creates new form SnakeGame18
     */
    public Signup() {
        super("Railway Reservation System::Signup Window");
        initComponents();
        setSize(710,710);
        setLocation(275, 00);
       jt[0]=jTextField4;
        jt[1]=jTextField3;
        jt[2]=jTextField1;
           
         try{
		BufferedImage img=ImageIO.read(getClass().getResourceAsStream("Train.gif"));
		setIconImage(img);
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
                Statement st=con.createStatement();
                st.execute("create table railway(name varchar2 (200),userid varchar2 (200),emailid varchar2 (200),mobile varchar2 (200),address varchar2 (200),password varchar2 (200))");    
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(240, 410, 360, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("<html><a href=''>&copy; copyright 2014</a></html>");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 640, 210, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Signup");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(240, 590, 110, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 590, 100, 40);
        jPanel1.add(jPasswordField3);
        jPasswordField3.setBounds(240, 530, 360, 30);

        jLabel10.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel10.setText("Confirm Password ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 530, 176, 30);

        jLabel9.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel9.setText("Password ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 490, 100, 30);

        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusGained(evt);
            }
        });
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyTyped(evt);
            }
        });
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(240, 490, 360, 30);

        jLabel5.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel5.setText("Address");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 430, 90, 40);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(280, 370, 320, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("+91");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(240, 370, 40, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Bussiness man", "Doctor", "Teacher", "Engineer", "Govt. Service", "Other" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(240, 330, 130, 30);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Female");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(340, 290, 70, 23);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(240, 290, 60, 23);

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951" }));
        jComboBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox4FocusGained(evt);
            }
        });
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(510, 250, 70, 30);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jComboBox3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox3FocusGained(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(370, 250, 80, 30);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(240, 250, 70, 30);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(240, 210, 370, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(240, 170, 370, 30);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(240, 130, 370, 30);

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel6.setText("Signup ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(280, 70, 130, 40);

        jLabel13.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel13.setText("Name");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 130, 80, 30);

        jLabel7.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel7.setText("User ID ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 170, 90, 30);

        jLabel8.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel8.setText("Email ID ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 210, 100, 30);

        jLabel12.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel12.setText("Date Of Birth");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 250, 130, 30);

        jLabel11.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 290, 70, 30);

        jLabel4.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel4.setText("Occupation");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 330, 110, 30);

        jLabel3.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel3.setText("Mobile");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 370, 80, 30);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel1.setText("RAILWAY RESERVATION SYSTEM");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 660, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                String s6=jPasswordField3.getText();
         String s5=jPasswordField2.getText();
         String s2=jTextField2.getText();
         String s1=jTextField1.getText();
         String s7=jTextArea2.getText();
         int len=s1.length();
         int len1=s5.length();
         String s3=jTextField3.getText();
         String s4=jTextField4.getText();
         Object obj2=jComboBox2.getSelectedItem();
         Object obj3=jComboBox3.getSelectedItem();
         Object obj4=jComboBox4.getSelectedItem();
           Connection con;
           Statement st;
           ResultSet rs;
         try{
                            
                           Class.forName("oracle.jdbc.driver.OracleDriver");
                           con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
                           st=con.createStatement();
                           if(!(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals("")||s6.equals("")||s7.equals("")||obj2.equals("Date")||obj3.equals("Month")||obj4.equals("Year"))){  
                             if(s6.equals(s5)){
                                if(!((!s3.startsWith("@"))&&(s3.endsWith(".com"))&&(s3.contains("@")))){
                                    Toolkit.getDefaultToolkit().beep();
                                    JOptionPane.showMessageDialog(this,"Please Enter A Valid Email ID!!!");
                                    jTextField3.setText("");
                            }
                          else if(len<10){
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(this,"Please Enter A Valid Mobile Number!!!");
                            jTextField1.setText("");
                         }
                          else if((len1<8)||(n<3)||(c<3)||(sc<1)){
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(this,"Please Enter A Secure Password(According to Message)!!!");
                            jPasswordField2.setText("");
                            jPasswordField3.setText("");
                            n=0;c=0;sc=0;
                         }
                         else {
                              rs=st.executeQuery("select * from Railway where userid='"+s4+"'or emailid='"+s3+"'or mobile='"+s1+"'");
                              if(rs.next()){
                                  System.out.println("abc");
                                Toolkit.getDefaultToolkit().beep();
                                int ws=0;
                                boolean b[]=new boolean[3];
                                String msg="Please Try With Another ";
                                String s[]={"User Id","Email Id","Mobile No."};
                                b[0]=(s4.equals(rs.getString(2)));
                                b[1]=(s3.equals(rs.getString(3)));
                                b[2]=(s1.equals(rs.getString(4)));
                                if(b[0]&&b[1]&&b[2])
                                {
                                   msg+=s[0]+", "+s[1]+" And "+s[2]+"!!!"; 
                                   ws=1;
                                   jTextField1.setText("");
                                   jTextField4.setText("");
                                   jTextField3.setText("");
                                }
                                else{
                                for(int i=0;i<3;i++){
                                     if(b[i%3]&&b[(i+1)%3])
                                     {
                                         msg+=s[i]+" And "+s[(i+1)%3]+"!!!";
                                         ws=1;
                                         jt[i].setText("");
                                         jt[(i+1)%3].setText("");
                                     }
                                }
                                }
                              
                                if(ws==0)
                                {
                                     for(int i=0;i<3;i++)
                                     {
                                         if(b[i])
                                         {
                                             msg+=s[i]+"!!!"; 
                                             jt[i].setText("");
                                         }
                                     }
                                }
                                Toolkit.getDefaultToolkit().beep();
                                JOptionPane.showMessageDialog(this,msg);
                                }
                         else{
                             st.executeUpdate("insert into Railway values('"+s2+"','"+s4+"','"+s3+"','"+s1+"','"+s7+"','"+s5+"')");    
                             Toolkit.getDefaultToolkit().beep();
                             JOptionPane.showMessageDialog(this,"Signup Successfull!!!");
                             new Login().setVisible(true);
                             this.dispose();
                              }     
                          }
                             }
                    else{
                         Toolkit.getDefaultToolkit().beep();
                         JOptionPane.showMessageDialog(this,"Please Confirm The Password Correctly!!!");
                         jPasswordField3.setText("");
                    }
            }
            else{
                 Toolkit.getDefaultToolkit().beep();
                 JOptionPane.showMessageDialog(this,"Please Fill The Blank Field(s)!!!");
            } 
               st.close();
               con.close();
       }catch(Exception e)
       { 
         Toolkit.getDefaultToolkit().beep();
         JOptionPane.showMessageDialog(this, e);
      
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char ch=evt.getKeyChar();
        if(!((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||ch==java.awt.event.KeyEvent.VK_BACK_SPACE||ch==java.awt.event.KeyEvent.VK_SPACE||ch==java.awt.event.KeyEvent.VK_DELETE)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

    }//GEN-LAST:event_jTextField2KeyTyped

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
         jLabel2.setText("<html><a href=''style='color:red'>&copy; copyright 2014</a></html>");
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
         jLabel2.setText("<html><a href=''>&copy; copyright 2014</a></html>");
    }//GEN-LAST:event_jLabel2MouseExited

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        String s=jTextField1.getText();
	int len=s.length();
        char ch=evt.getKeyChar();
        if(!(ch>='0'&&ch<='9')||ch==java.awt.event.KeyEvent.VK_BACK_SPACE||ch==java.awt.event.KeyEvent.VK_DELETE){
            evt.consume();
        }
	if(len>=10){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        int keycode=evt.getKeyCode();
	if(keycode==KeyEvent.VK_BACK_SPACE||keycode==KeyEvent.VK_DELETE){
            }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char ch=evt.getKeyChar();
	if(!((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')||ch==java.awt.event.KeyEvent.VK_PERIOD||ch=='@'||ch==java.awt.event.KeyEvent.VK_BACK_SPACE||ch==java.awt.event.KeyEvent.VK_DELETE)){
            evt.consume();
        }
                        
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jComboBox3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox3FocusGained
         String s1=jComboBox2.getSelectedItem().toString();
         if(s1.equals("30")){
                jComboBox3.removeAllItems();
                jComboBox3.addItem("Month");
                jComboBox3.addItem("JAN");
                jComboBox3.addItem("MAR");
                jComboBox3.addItem("APR");
                jComboBox3.addItem("MAY");
                jComboBox3.addItem("JUN");
                jComboBox3.addItem("JUL");
                jComboBox3.addItem("AUG");
                jComboBox3.addItem("SEP");
                jComboBox3.addItem("OCT");
                jComboBox3.addItem("NOV");
                jComboBox3.addItem("DEC");
         }
         else if(s1.equals("31")){
                jComboBox3.removeAllItems();
                jComboBox3.addItem("Month");
                jComboBox3.addItem("JAN");
                jComboBox3.addItem("MAR");
                jComboBox3.addItem("MAY");
                jComboBox3.addItem("JUL");
                jComboBox3.addItem("AUG");
                jComboBox3.addItem("OCT");
                jComboBox3.addItem("DEC");
         }  
         else{
                jComboBox3.removeAllItems();
                jComboBox3.addItem("Month");
                jComboBox3.addItem("JAN");
                jComboBox3.addItem("FEB");
                jComboBox3.addItem("MAR");
                jComboBox3.addItem("APR");
                jComboBox3.addItem("MAY");
                jComboBox3.addItem("JUN");
                jComboBox3.addItem("JUL");
                jComboBox3.addItem("AUG");
                jComboBox3.addItem("SEP");
                jComboBox3.addItem("OCT");
                jComboBox3.addItem("NOV");
                jComboBox3.addItem("DEC");
        }
        
    }//GEN-LAST:event_jComboBox3FocusGained

    private void jComboBox4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox4FocusGained
          String s1=jComboBox2.getSelectedItem().toString();
          String s2=jComboBox3.getSelectedItem().toString();
          if(s1.equals("29")&&s2.equals("FEB")){
               jComboBox4.removeAllItems();
               jComboBox4.addItem("Year");
               for(int i=96;i>=51;i=i-4){
                    jComboBox4.addItem("19"+i);
               }  
         }
          else{
               jComboBox4.removeAllItems();
               jComboBox4.addItem("Year");
               for(int i=96;i>=51;i--){
                    jComboBox4.addItem("19"+i);
               }
          }
    }//GEN-LAST:event_jComboBox4FocusGained
    boolean b=true;
    private void jPasswordField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusGained
        
        if(b){
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(this,"Your Password must contain atleast 8 characters consist of atleast 3 alphabets,3 numerics & a special character!!!");
        b=false;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2FocusGained

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
b=true;        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jPasswordField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyTyped
        String s=jPasswordField2.getText();
        char ch=evt.getKeyChar();
        if(ch>='0'&&ch<='9')
            n++;
        
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            c++;
           
        if((ch=='.')||(ch=='!')||(ch=='@')||(ch=='#')||(ch=='$')||(ch=='^')||(ch=='&')||(ch=='*')||(ch=='(')||(ch==')')||(ch=='%'))
           sc++;
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2KeyTyped

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
               new Signup().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
