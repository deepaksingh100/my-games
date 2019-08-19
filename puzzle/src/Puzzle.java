import java.awt.Color;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Puzzle extends javax.swing.JFrame {
    int n,h,m,s;JFrame f1;
    public Puzzle() {
        super("Puzzle");
        initComponents();
        setLocation(225,70);
        setSize(980, 570);
        //boolean g=false;
        //ReSet s=new ReSet();
        //s.reSet();
        n=0;
        Date d=new Date();
         h=d.getHours();
         m=d.getMinutes();
         s=d.getSeconds();
        try{
        BufferedImage img=ImageIO.read(getClass().getResourceAsStream("Apple.png"));
        setIconImage(img);}catch(Exception e){System.out.println(e);}
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 1, 120, 121);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.gif"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton1FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 1, 120, 121);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.gif"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton2FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton2FocusGained(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 1, 120, 121);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.gif"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton3FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton3FocusGained(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 1, 120, 121);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.gif"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton4FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton4FocusGained(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 122, 120, 121);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6.gif"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton5FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton5FocusGained(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(120, 122, 120, 121);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7.gif"))); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusable(false);
        jButton6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton6FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton6FocusGained(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton6KeyPressed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(240, 122, 120, 121);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8.gif"))); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusable(false);
        jButton7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton7FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton7FocusGained(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton7KeyPressed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(360, 122, 120, 121);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/9.gif"))); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusable(false);
        jButton8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton8FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton8FocusGained(evt);
            }
        });
        jButton8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(0, 243, 120, 121);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/10.gif"))); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setFocusable(false);
        jButton9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton9FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton9FocusGained(evt);
            }
        });
        jButton9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton9KeyPressed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(120, 243, 120, 121);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/11.gif"))); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setFocusable(false);
        jButton10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton10FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton10FocusGained(evt);
            }
        });
        jButton10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton10KeyPressed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(240, 243, 120, 121);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/12.gif"))); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setFocusable(false);
        jButton11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton11FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton11FocusGained(evt);
            }
        });
        jButton11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton11KeyPressed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(360, 243, 120, 121);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/13.gif"))); // NOI18N
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setFocusable(false);
        jButton12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton12FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton12FocusGained(evt);
            }
        });
        jButton12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton12KeyPressed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(0, 364, 120, 121);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/14.gif"))); // NOI18N
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setFocusable(false);
        jButton13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton13FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton13FocusGained(evt);
            }
        });
        jButton13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton13KeyPressed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(120, 364, 120, 121);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/15.gif"))); // NOI18N
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setFocusable(false);
        jButton14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton14FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton14FocusGained(evt);
            }
        });
        jButton14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton14KeyPressed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(240, 364, 120, 121);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16.gif"))); // NOI18N
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.setFocusable(false);
        jButton15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton15FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton15FocusGained(evt);
            }
        });
        jButton15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton15KeyPressed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(360, 364, 120, 121);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 490, 370, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("<html>&copy; copyright DEEPAK 2014</html>");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 520, 170, 20);

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton17.setText("RESET");
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(400, 490, 80, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apple.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 10, 470, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public class Result
    {
        public boolean result()
        {
            Point p=jLabel1.getLocation();
            int x=(int)p.getX();
            int y=(int)p.getY();
            Point p1=jButton1.getLocation();
            int x1=(int)p1.getX();
            int y1=(int)p1.getY();
            Point p2=jButton2.getLocation();
            int x2=(int)p2.getX();
            int y2=(int)p2.getY();
            Point p3=jButton3.getLocation();
            int x3=(int)p3.getX();
            int y3=(int)p3.getY();
            Point p4=jButton4.getLocation();
            int x4=(int)p4.getX();
            int y4=(int)p4.getY();
            Point p5=jButton5.getLocation();
            int x5=(int)p5.getX();
            int y5=(int)p5.getY();
            Point p6=jButton6.getLocation();
            int x6=(int)p6.getX();
            int y6=(int)p6.getY();
            Point p7=jButton7.getLocation();
            int x7=(int)p7.getX();
            int y7=(int)p7.getY();
            Point p8=jButton8.getLocation();
            int x8=(int)p8.getX();
            int y8=(int)p8.getY();
            Point p9=jButton9.getLocation();
            int x9=(int)p9.getX();
            int y9=(int)p9.getY();
            Point p10=jButton10.getLocation();
            int x10=(int)p10.getX();
            int y10=(int)p10.getY();
            Point p11=jButton11.getLocation();
            int x11=(int)p11.getX();
            int y11=(int)p11.getY();
            Point p12=jButton12.getLocation();
            int x12=(int)p12.getX();
            int y12=(int)p12.getY();
            Point p13=jButton13.getLocation();
            int x13=(int)p13.getX();
            int y13=(int)p13.getY();
            Point p14=jButton14.getLocation();
            int x14=(int)p14.getX();
            int y14=(int)p14.getY();
            Point p15=jButton15.getLocation();
            int x15=(int)p15.getX();
            int y15=(int)p15.getY();
            if((x==0&&y==0)&&(x1==120&&y1==0)&&(x2==240&&y2==0)&&(x3==360&&y3==0)&&(x4==0&&y4==120)&&(x5==120&&y5==120)&&(x6==240&&y6==120)&&(x7==360&&y7==120)&&(x8==0&&y8==240)&&(x9==120&&y9==240)&&(x10==240&&y10==240)&&(x11==360&&y11==240)&&(x12==0&&y12==360)&&(x13==120&&y13==360)&&(x14==240&&y14==360)&&(x15==360&&y15==360))
                return true;
            else
                return false;
        }
    }
    static int []x=new int[16];
    static int []y=new int[16];
    public class ReSet{
    public void reSet()
    {n=0;
        Date d=new Date();
         h=d.getHours();
         m=d.getMinutes();
         s=d.getSeconds();
        for(int i=0;i<16;i++){
        // System.out.println(i);   
        x[i]=(120*(int)(4*Math.random()));
        y[i]=(120*(int)(4*Math.random()));
        // System.out.println(x[i]+","+y[i]); 
        }
        for(int k=0;k<15;k++){
        for(int j=0;j<16;j++){
            if(k!=j){
        while((x[k]==x[j])&&(y[k]==y[j]))
        {
         //   System.out.println(k+","+j);   
        x[j]=(120*(int)(4*Math.random()));
        y[j]=(120*(int)(4*Math.random()));
        k=0;
        //System.out.println(x[j]+","+y[j]); 
        if(k==15&&j==15)
            break;
        }}}}
        jLabel1.setLocation(x[0], y[0]);
        jButton1.setLocation(x[1], y[1]);
        jButton2.setLocation(x[2], y[2]);
        jButton3.setLocation(x[3], y[3]);
        jButton4.setLocation(x[4], y[4]);
        jButton5.setLocation(x[5], y[5]);
        jButton6.setLocation(x[6], y[6]);
        jButton7.setLocation(x[7], y[7]);
        jButton8.setLocation(x[8], y[8]);
        jButton9.setLocation(x[9], y[9]);
        jButton10.setLocation(x[10], y[10]);
        jButton11.setLocation(x[11], y[11]);
        jButton12.setLocation(x[12], y[12]);
        jButton13.setLocation(x[13], y[13]);
        jButton14.setLocation(x[14], y[14]);
        jButton15.setLocation(x[15], y[15]);
    }
    }
    public class Location{
        String h5="",m5="",s5="";
   public boolean hasLeft(Point p1,Point p2)
   {//System.out.println(p2);
       n++;//System.out.println(n);
       Date d1=new Date();
       int h1=d1.getHours();
       int m3=d1.getMinutes();
       int s1=d1.getSeconds();
       int h2=h1-h;
       int m4=m3-m;
       int s2=s1-s;
       
       if(h2<0&&m4<0){
           h2=23+h2;
           m4=60+m4;
       }
       else if(h2<0&&m4>=0)
           h2=24+h2;
       if(m4<0&&s2>=0){h2--;
           m4=60+m4;}
       if(m4<0&&s2<0){
           m4=59+m4;
           s2=60+s2;
       }
       if(s2<0){
           s2=60+s2;
       m4--;
       }
       if(h2<10&&h2>=0)
           h5="0"+h2;
       else
           h5=h2+"";
       if(m4<10&&m4>=0)
           m5="0"+m4;
       else
           m5=m4+"";
       if(s2<10&&s2>=0)
           s5="0"+s2;
       else
           s5=s2+"";
       jLabel2.setText("No. of Moves : "+n+"                Time Taken : "+h5+":"+m5+":"+s5);
       //System.out.println(h5+":"+m5+":"+s5);
      int m1=(int)p1.getX();
       int n1=(int)p1.getY();
       int m2=(int)p2.getX();
       int n2=(int)p2.getY();
       //System.out.println(m1+""+n1+""+m2+""+n2);
       if((n1==n2)&&(m2-m1==120))
           return true;
       else
          return false;
   }
   public boolean hasRight(Point p1,Point p2)
   {
       Result r=new Result();
        boolean o=r.result();
        if(o){//System.out.println("hi");
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(f1, "Congratulations,You Win!!!\nTotal No. of Moves is : "+n+"     \n     "+"Total Time Taken is : "+h5+":"+m5+":"+s5);
        Toolkit.getDefaultToolkit().beep();
        int opt=JOptionPane.showOptionDialog(f1, "Do You Want to Exit", "Confirmation", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION, null, null, null);
        if(opt==0)
            System.exit(0);
        }
       int m1=(int)p1.getX();
       int n1=(int)p1.getY();
       int m2=(int)p2.getX();
       int n2=(int)p2.getY();
       if((n1==n2)&&(m1-m2==120))
           return true;
       else
          return false;
   }
   public boolean hasUp(Point p1,Point p2)
   {
       int m1=(int)p1.getX();
       int n1=(int)p1.getY();
       int m2=(int)p2.getX();
       int n2=(int)p2.getY();
       if((m1==m2)&&(n2-n1==120))
           return true;
       else
          return false;
   }
   public boolean hasDown(Point p1,Point p2)
   {
       int m1=(int)p1.getX();
       int n1=(int)p1.getY();
       int m2=(int)p2.getX();
       int n2=(int)p2.getY();
       if((m1==m2)&&(n1-n2==120))
           return true;
       else
          return false;
   }
  
   }
    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
        jButton1.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton1FocusGained

    private void jButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusLost
       jButton1.setBorder(BorderFactory.createLineBorder(Color.white)); 
    }//GEN-LAST:event_jButton1FocusLost

    private void jButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusGained
       jButton2.setBorder(BorderFactory.createLineBorder(Color.red)); 
    }//GEN-LAST:event_jButton2FocusGained

    private void jButton2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusLost
        jButton2.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton2FocusLost

    private void jButton3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton3FocusGained
        jButton3.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton3FocusGained

    private void jButton3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton3FocusLost
        jButton3.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton3FocusLost

    private void jButton4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton4FocusGained
        jButton4.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton4FocusGained

    private void jButton4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton4FocusLost
        jButton4.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton4FocusLost

    private void jButton5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton5FocusGained
        jButton5.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton5FocusGained

    private void jButton5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton5FocusLost
        jButton5.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton5FocusLost

    private void jButton6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton6FocusGained
        jButton6.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton6FocusGained

    private void jButton6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton6FocusLost
        jButton6.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton6FocusLost

    private void jButton7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton7FocusGained
        jButton7.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton7FocusGained

    private void jButton7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton7FocusLost
        jButton7.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton7FocusLost

    private void jButton8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton8FocusGained
        jButton8.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton8FocusGained

    private void jButton8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton8FocusLost
        jButton8.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton8FocusLost

    private void jButton9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton9FocusGained
        jButton9.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton9FocusGained

    private void jButton9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton9FocusLost
        jButton9.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton9FocusLost

    private void jButton10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton10FocusGained
        jButton10.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton10FocusGained

    private void jButton10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton10FocusLost
        jButton10.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton10FocusLost

    private void jButton11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton11FocusGained
       jButton11.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton11FocusGained

    private void jButton11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton11FocusLost
        jButton11.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton11FocusLost

    private void jButton12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton12FocusGained
        jButton12.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton12FocusGained

    private void jButton12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton12FocusLost
        jButton12.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton12FocusLost

    private void jButton13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton13FocusGained
        jButton13.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton13FocusGained

    private void jButton13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton13FocusLost
        jButton13.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton13FocusLost

    private void jButton14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton14FocusGained
        jButton14.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton14FocusGained

    private void jButton14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton14FocusLost
        jButton14.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton14FocusLost

    private void jButton15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton15FocusGained
        jButton15.setBorder(BorderFactory.createLineBorder(Color.red));
    }//GEN-LAST:event_jButton15FocusGained

    private void jButton15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton15FocusLost
        jButton15.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jButton15FocusLost

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
       Point p1= jLabel1.getLocation();
       Point p2= jButton1.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton1.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton1.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton1.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton1.setLocation(x1,y1+120);}
                
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
      Point p1= jLabel1.getLocation();
       Point p2= jButton2.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton2.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton2.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton2.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton2.setLocation(x1,y1+120);}
    
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        Point p1= jLabel1.getLocation();
       Point p2= jButton3.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton3.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton3.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton3.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton3.setLocation(x1,y1+120);}
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
 Point p1= jLabel1.getLocation();
       Point p2= jButton4.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton4.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton4.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton4.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton4.setLocation(x1,y1+120);}
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        Point p1= jLabel1.getLocation();
       Point p2= jButton5.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton5.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton5.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton5.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton5.setLocation(x1,y1+120);}
    }//GEN-LAST:event_jButton5KeyPressed

    private void jButton6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton6KeyPressed
         Point p1= jLabel1.getLocation();
       Point p2= jButton6.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton6.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton6.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton6.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton6.setLocation(x1,y1+120);}
    }//GEN-LAST:event_jButton6KeyPressed

    private void jButton7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton7KeyPressed
         Point p1= jLabel1.getLocation();
       Point p2= jButton7.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton7.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton7.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton7.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton7.setLocation(x1,y1+120);}
    }//GEN-LAST:event_jButton7KeyPressed

    private void jButton8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton8KeyPressed
         Point p1= jLabel1.getLocation();
       Point p2= jButton8.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton8.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton8.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton8.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton8.setLocation(x1,y1+120);}
    }//GEN-LAST:event_jButton8KeyPressed

    private void jButton9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton9KeyPressed
         Point p1= jLabel1.getLocation();
       Point p2= jButton9.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton9.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton9.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton9.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton9.setLocation(x1,y1+120);}
    }//GEN-LAST:event_jButton9KeyPressed

    private void jButton10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton10KeyPressed
         Point p1= jLabel1.getLocation();
       Point p2= jButton10.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton10.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton10.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton10.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton10.setLocation(x1,y1+120);}
    }//GEN-LAST:event_jButton10KeyPressed

    private void jButton11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton11KeyPressed
        Point p1= jLabel1.getLocation();
       Point p2= jButton11.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton11.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton11.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton11.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton11.setLocation(x1,y1+120);}
    }//GEN-LAST:event_jButton11KeyPressed

    private void jButton12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton12KeyPressed
         Point p1= jLabel1.getLocation();
       Point p2= jButton12.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton12.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton12.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton12.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton12.setLocation(x1,y1+120);}
            
    }//GEN-LAST:event_jButton12KeyPressed

    private void jButton13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton13KeyPressed
          Point p1= jLabel1.getLocation();
       Point p2= jButton13.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton13.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton13.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton13.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton13.setLocation(x1,y1+120);}
    }//GEN-LAST:event_jButton13KeyPressed

    private void jButton14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton14KeyPressed
         Point p1= jLabel1.getLocation();
       Point p2= jButton14.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton14.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton14.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton14.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton14.setLocation(x1,y1+120);}
    }//GEN-LAST:event_jButton14KeyPressed

    private void jButton15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton15KeyPressed
         Point p1= jLabel1.getLocation();
       Point p2= jButton15.getLocation();
           //System.out.println(p[1]);
        Location l=new Location();
        boolean b1=l.hasLeft(p1, p2);
        boolean b2=l.hasRight(p1, p2);
        boolean b3=l.hasUp(p1, p2);
        boolean b4=l.hasDown(p1, p2);
        //System.out.println(p[1]);
        //System.out.println(b1+""+b2+""+b3+""+b4);
        int x1=(int)p2.getX();
        int y1=(int)p2.getY();
        //System.out.println(x1+""+y1);
        int keycode=evt.getKeyCode();
                if(keycode==37&&b1){jLabel1.setLocation(x1, y1);
                    jButton15.setLocation(x1-120,y1);}
                else if(keycode==38&&b3){jLabel1.setLocation(x1, y1);
                    jButton15.setLocation(x1,y1-120);}
               else if(keycode==39&&b2){jLabel1.setLocation(x1, y1);
                    jButton15.setLocation(x1+120,y1);}
               else if(keycode==40&&b4){jLabel1.setLocation(x1, y1);
                    jButton15.setLocation(x1,y1+120);}
    }//GEN-LAST:event_jButton15KeyPressed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
          jLabel2.setText("No. of Moves : 0   ,          Time Taken : 00:00:00");
          jButton1.setFocusable(true);
          jButton2.setFocusable(true);
          jButton3.setFocusable(true);
          jButton4.setFocusable(true);
          jButton5.setFocusable(true);
          jButton6.setFocusable(true);
          jButton7.setFocusable(true);
          jButton8.setFocusable(true);
          jButton9.setFocusable(true);
          jButton10.setFocusable(true);
          jButton11.setFocusable(true);
          jButton12.setFocusable(true);
          jButton13.setFocusable(true);
          jButton14.setFocusable(true);
          jButton15.setFocusable(true);
          ReSet s=new ReSet();
        s.reSet();
    }//GEN-LAST:event_jButton17ActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Puzzle().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
    }
