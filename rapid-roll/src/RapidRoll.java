import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class RapidRoll extends javax.swing.JFrame {
    int x=0,y=280,w1,h1,score;
    JFrame f;
    Timer t,t1,t2;
    int z1=300,z2=400,z3=500,z4=600;
    public RapidRoll() {
        initComponents();
        f=this;
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int sw=(int)d.getWidth();
        int sh=(int)d.getHeight();
        int w=getWidth();
        int h=getHeight();
        setBounds((sw-w)/2, (sh-h)/2, w, h);
        setTitle("Rapid Roll");
        jPanel1.setSize(500, 600);
             jLabel1.setBounds(0, z1, 100, 10);
             jLabel2.setBounds(133, z2, 100, 10);
             jLabel3.setBounds(266, z3, 100, 10);
             jLabel5.setBounds(400, z4, 100, 10);
             jLabel4.setBounds(x, y, 20, 20);
             jLabel6.setBounds(0, 0, 250, 10);
             jLabel7.setBounds(0, 590, 250, 10);
             jLabel9.setBounds(250, 0, 250, 10);
             jLabel10.setBounds(250, 590, 250, 10);
        try{
        BufferedImage img =ImageIO.read(getClass().getResourceAsStream("green.png"));
        setIconImage(img);
        }catch(Exception e){}
        w1=(int)(470*Math.random());
        h1=(int)(570*Math.random());
        jLabel8.setBounds(w1, h1, 20, 20);
        t=new Timer(15, new MyListener());
        t.start();
        t1=new Timer(10, new MyListener1());
        t2=new Timer(5000, new MyListener2());
        t2.start();
        }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(163, 20));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 280, 120, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(163, 20));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 310, 90, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(163, 20));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 520, 140, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 220, 20, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(163, 20));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 410, 130, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up.gif"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(163, 20));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 30, 120, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down.gif"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(163, 20));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 450, 120, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apple.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(170, 220, 30, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up.gif"))); // NOI18N
        jLabel9.setPreferredSize(new java.awt.Dimension(163, 20));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 30, 120, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down.gif"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(163, 20));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 450, 120, 20);

        jLabel11.setBackground(new java.awt.Color(0, 0, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("<html>&copy; copyright DEEPAK 2014</html>");
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 590, 250, 30);

        jLabel12.setBackground(new java.awt.Color(0, 0, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Your Score is :0");
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(250, 590, 250, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public class MyListener implements ActionListener
     {
        @Override
         public void actionPerformed(ActionEvent e)
         {
             if(y<=10||(y>=580))
             {
                 t.stop();
                 t1.stop();
                 t2.stop();
                 try{
			                URL url=getClass().getResource("wind1.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
                 JOptionPane.showMessageDialog(f, "You Lose!!!\nYour Score is  :"+score);
                 Toolkit.getDefaultToolkit().beep();
                 int opt=JOptionPane.showOptionDialog(f, "Do You Want to Retry???", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                 if(opt==0){
                     new RapidRoll().setVisible(true);
                     f.dispose();
                 }
                 else 
                    System.exit(0);
             }
             if(z1<=10)z1=590;
             if(z2<=10)z2=590;
             if(z3<=10)z3=590;
             if(z4<=10)z4=590;
             y=y-2;
             z1=z1-2;
             z2=z2-2;
             z3=z3-2;
             z4=z4-2;
             jLabel1.setBounds(0, z1, 100, 10);
             jLabel2.setBounds(133, z2, 100, 10);
             jLabel3.setBounds(266, z3, 100, 10);
             jLabel5.setBounds(400,z4, 100, 10);
             jLabel4.setBounds(x, y, 20, 20);
             }
     }
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        t1.start();
        Point p4 = jLabel4.getLocation();
        int y4=(int)p4.getY();
        int x4=(int)p4.getX();//System.out.println(x4+","+w1+","+y4+","+h1);
        
        if(((x4-w1<=20&&x4-w1>=0)||(w1-x4<=20&&w1-x4>=0))&&((y4-h1<=20&&y4-h1>=0)||(h1-y4<=20&&h1-y4>=0))){
                        try{
                                        
			                URL url=getClass().getResource("wind.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                         
                                        }catch(Exception ex)
                                        {}     
            t2.stop(); 
                 w1=(int)(470*Math.random());
                 h1=(int)(570*Math.random());
                 jLabel8.setBounds(w1, h1, 20, 20);
                 score+=10;
                 jLabel12.setText("Your Score is : "+score);
        }
        t2.start();
        int keycode=evt.getKeyCode();
         if(keycode==37){
            x=x>0?x-5:0;
            }
        else if(keycode==39){
            x=x<460?x+5:480;
        }
        
                                        if(keycode==evt.VK_SPACE){
                                        t.stop();
                                        t1.stop();
                                        t2.stop();
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Rapid Roll has been PAUSED...\nDo you want to RESUME???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0){
					    t.start();
                                            t1.start();
                                            t2.start();
                                        }}
        
    }//GEN-LAST:event_formKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        t.stop();
        t1.stop();
        t2.stop();
        Toolkit.getDefaultToolkit().beep();
        int opt=JOptionPane.showOptionDialog(f,"Do you want to EXIT???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
        if(opt==0){
            System.exit(0);
        }
        else
        {
            t.start();
            t1.start();
            t2.start();  
        }
    }//GEN-LAST:event_formWindowClosing
     public class MyListener1 implements ActionListener
     {
        @Override
         public void actionPerformed(ActionEvent e)
         {
              Point p1 = jLabel1.getLocation();
        Point p2 = jLabel2.getLocation();
        Point p3 = jLabel3.getLocation();
        Point p4 = jLabel4.getLocation();
        Point p5 = jLabel5.getLocation();
        int y1=(int)p1.getY();
        int y2=(int)p2.getY();
        int y3=(int)p3.getY();
        int y4=(int)p4.getY();
        int x4=(int)p4.getX();
        int y5=(int)p5.getY();
             if((y1-y4>=17&&y1-y4<=22&&x<=100)||(y2-y4>=17&&y2-y4<=22&&x<=233&&x>=120)||(y3-y4>=17&&y3-y4<=22&&x<=366&&x>=255)||(y5-y4>=17&&y5-y4<=22&&x>=390))
             {
                 t1.stop();//System.out.println("hi");
             }
             else{
                 t1.start();//System.out.println("hey");
                 y=y+4;
                 if(((x4-w1<=20&&x4-w1>=0)||(w1-x4<=20&&w1-x4>=0))&&((y4-h1<=20&&y4-h1>=0)||(h1-y4<=20&&h1-y4>=0))){
                        try{
                                        
			                URL url=getClass().getResource("wind.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                         
                                        }catch(Exception ex)
                                        {}     
            t2.stop(); 
                 w1=(int)(470*Math.random());
                 h1=(int)(570*Math.random());
                 jLabel8.setBounds(w1, h1, 20, 20);
                 score+=10;
                 jLabel12.setText("Your Score is : "+score);
        }
             }
         }
     }
     public class MyListener2 implements ActionListener
     {
        @Override
         public void actionPerformed(ActionEvent e)
         {
                w1=(int)(470*Math.random());
                 h1=(int)(570*Math.random());
                 jLabel8.setBounds(w1, h1, 20, 20);
         }
     }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new RapidRoll().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
