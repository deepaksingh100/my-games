
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONY
 */
public class Ludo extends javax.swing.JFrame {

     RedCircle red1,red2,red3,red4;
     GreenCircle green1,green2,green3,green4;
     YellowCircle yellow1,yellow2,yellow3,yellow4;
     BlueCircle blue1,blue2,blue3,blue4;
     Graphics2D gred,ggreen,gyellow,gblue;
     
    public Ludo() {
    initComponents();
 
        setTitle("Ludo");
        try{
            BufferedImage img=ImageIO.read(getClass().getResourceAsStream("ludo.gif"));
            setIconImage(img);
        }catch(Exception e){}
    //RED
        red1=new RedCircle("1");
       red1.setOpaque(true);
       red1.setBounds(40, 170, 40, 40);
        add(red1);
       red2=new RedCircle("2");
       red2.setOpaque(true);
       red2.setBounds(40, 40, 40, 40);
       add(red2);
       red3=new RedCircle("3");
       red3.setOpaque(true);
       red3.setBounds(170, 40, 40, 40);
        add(red3);
       red4=new RedCircle("4");
       red4.setOpaque(true);
       red4.setBounds(170, 170, 40, 40);
        add(red4);
               
           //BLUE
       blue1=new BlueCircle("1");
       blue1.setOpaque(true);
       blue1.setBounds(480, 40, 40, 40);
        add(blue1);
        blue2=new BlueCircle("2");
       blue2.setOpaque(true);
       blue2.setBounds(600, 40, 40, 40);
        add(blue2);
       
       blue3=new BlueCircle("3");
       blue3.setOpaque(true);
       blue3.setBounds(600, 170, 40, 40);
        add(blue3);
       
        blue4=new BlueCircle("4");
       blue4.setOpaque(true);
       blue4.setBounds(480, 170, 40, 40);
        add(blue4);
        
        
         
        //YELLOW
       
        yellow1=new YellowCircle("1");
       yellow1.setOpaque(true);
       yellow1.setBounds(600, 480, 40, 40);
        add(yellow1);
       
       yellow2=new YellowCircle("2");
       yellow2.setOpaque(true);
       yellow2.setBounds(600, 600, 40, 40);
        add(yellow2);
       yellow3=new YellowCircle("3");
       yellow3.setOpaque(true);
       yellow3.setBounds(480, 600, 40, 40);
        add(yellow3);
       yellow4=new YellowCircle("4");
       yellow4.setOpaque(true);
       yellow4.setBounds(480, 480, 40, 40);
        add(yellow4);
     
        
        
        //GREEN
        green1=new GreenCircle("1");
       green1.setOpaque(true);
       green1.setBounds(170, 600, 40, 40);
        add(green1);
       
       green2=new GreenCircle("2");
       green2.setOpaque(true);
       green2.setBounds(40, 600, 40, 40);
        add(green2);
       green3=new GreenCircle("3");
       green3.setOpaque(true);
       green3.setBounds(40, 480, 40, 40);
        add(green3);
       green4=new GreenCircle("4");
       green4.setOpaque(true);
       green4.setBounds(170, 480, 40, 40);
        add(green4);
        setBounds(180, 0, 997, 730);
    }
    public class RedCircle extends JLabel{
        String s;
        public RedCircle(String text) {
            super(text);
            s=text;
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            gred=(Graphics2D)g;
            gred.setColor(Color.red);
            gred.fillOval(0, 0, 40, 40);
            gred.setColor(Color.black);
            gred.setFont(new Font("Ariel", Font.BOLD, 24));
            gred.drawString(s, 15, 30);
            
        }
        
    }
    public class GreenCircle extends JLabel{
         String s;
        public GreenCircle(String text) {
            super(text);
            s=text;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ggreen=(Graphics2D)g;
            ggreen.setColor(new Color(0, 153, 51));
            ggreen.fillOval(0, 0, 40, 40);
            ggreen.setColor(Color.black);
            ggreen.setFont(new Font("Ariel", Font.BOLD, 24));
            ggreen.drawString(s, 15, 30);
        }
        
    }
    public class YellowCircle extends JLabel{
         String s;
        public YellowCircle(String text) {
            super(text);
            s=text;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            gyellow=(Graphics2D)g;
            gyellow.setColor(new Color(255, 255, 0));
            gyellow.fillOval(0, 0, 40, 40);
            gyellow.setColor(Color.black);
            gyellow.setFont(new Font("Ariel", Font.BOLD, 24));
            gyellow.drawString(s, 15, 30);
        }
        
    }
    public class BlueCircle extends JLabel{
         String s;
        public BlueCircle(String text) {
            super(text);
            s=text;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            gblue=(Graphics2D)g;
            gblue.setColor(Color.blue);
            gblue.fillOval(0, 0, 40, 40);
            gblue.setColor(Color.black);
            gblue.setFont(new Font("Ariel", Font.BOLD, 24));
            gblue.drawString(s, 15, 30);
        }
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        yellow = new javax.swing.JLabel();
        blue = new javax.swing.JLabel();
        red = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButtonred = new javax.swing.JButton();
        jButtonred1 = new javax.swing.JButton();
        jButtonred2 = new javax.swing.JButton();
        jButtonred4 = new javax.swing.JButton();
        jButtonred3 = new javax.swing.JButton();
        jButtonblue = new javax.swing.JButton();
        jButtonblue1 = new javax.swing.JButton();
        jButtonblue2 = new javax.swing.JButton();
        jButtonblue4 = new javax.swing.JButton();
        jButtonblue3 = new javax.swing.JButton();
        jButtonyellow = new javax.swing.JButton();
        jButtonyellow1 = new javax.swing.JButton();
        jButtonyellow2 = new javax.swing.JButton();
        jButtonyellow4 = new javax.swing.JButton();
        jButtonyellow3 = new javax.swing.JButton();
        jButtongreen = new javax.swing.JButton();
        jButtongreen1 = new javax.swing.JButton();
        jButtongreen2 = new javax.swing.JButton();
        jButtongreen4 = new javax.swing.JButton();
        jButtongreen3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(main);
        main.setBounds(0, 0, 700, 690);

        green.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 3, true));
        getContentPane().add(green);
        green.setBounds(0, 410, 280, 280);

        yellow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 3, true));
        getContentPane().add(yellow);
        yellow.setBounds(420, 410, 280, 280);

        blue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        getContentPane().add(blue);
        blue.setBounds(420, 0, 280, 280);

        red.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        getContentPane().add(red);
        red.setBounds(0, 0, 280, 280);

        jLabel73.setFont(new java.awt.Font("Urdu Typesetting", 3, 36)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dice1.gif"))); // NOI18N
        jLabel73.setText("HOME");
        jLabel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel73.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel73);
        jLabel73.setBounds(280, 280, 140, 130);

        jPanel5.setLayout(null);

        jButtonred.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonred.setForeground(new java.awt.Color(255, 0, 0));
        jButtonred.setText("Red-Dice");
        jButtonred.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        jButtonred.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonred.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonred.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonredMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonredMouseExited(evt);
            }
        });
        jButtonred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonredActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonred);
        jButtonred.setBounds(0, 120, 280, 50);

        jButtonred1.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonred1.setForeground(new java.awt.Color(255, 0, 0));
        jButtonred1.setText("Red-1");
        jButtonred1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        jButtonred1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonred1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonred1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonred1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonred1MouseExited(evt);
            }
        });
        jButtonred1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonred1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonred1);
        jButtonred1.setBounds(0, 1, 140, 60);

        jButtonred2.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonred2.setForeground(new java.awt.Color(255, 0, 0));
        jButtonred2.setText("Red-2");
        jButtonred2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        jButtonred2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonred2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonred2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonred2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonred2MouseExited(evt);
            }
        });
        jButtonred2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonred2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonred2);
        jButtonred2.setBounds(140, 1, 140, 60);

        jButtonred4.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonred4.setForeground(new java.awt.Color(255, 0, 0));
        jButtonred4.setText("Red-4");
        jButtonred4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        jButtonred4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonred4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonred4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonred4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonred4MouseEntered(evt);
            }
        });
        jButtonred4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonred4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonred4);
        jButtonred4.setBounds(0, 60, 140, 60);

        jButtonred3.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonred3.setForeground(new java.awt.Color(255, 0, 0));
        jButtonred3.setText("Red-3");
        jButtonred3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        jButtonred3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonred3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonred3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonred3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonred3MouseExited(evt);
            }
        });
        jButtonred3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonred3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonred3);
        jButtonred3.setBounds(140, 60, 140, 60);

        jButtonblue.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonblue.setForeground(new java.awt.Color(0, 0, 255));
        jButtonblue.setText("Blue-Dice");
        jButtonblue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        jButtonblue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonblue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonblueMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonblueMouseEntered(evt);
            }
        });
        jButtonblue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonblueActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonblue);
        jButtonblue.setBounds(0, 290, 280, 50);

        jButtonblue1.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonblue1.setForeground(new java.awt.Color(0, 0, 255));
        jButtonblue1.setText("Blue-1");
        jButtonblue1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        jButtonblue1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonblue1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonblue1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonblue1MouseEntered(evt);
            }
        });
        jButtonblue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonblue1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonblue1);
        jButtonblue1.setBounds(0, 170, 140, 60);

        jButtonblue2.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonblue2.setForeground(new java.awt.Color(0, 0, 255));
        jButtonblue2.setText("Blue-2");
        jButtonblue2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        jButtonblue2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonblue2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonblue2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonblue2MouseEntered(evt);
            }
        });
        jButtonblue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonblue2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonblue2);
        jButtonblue2.setBounds(140, 170, 140, 60);

        jButtonblue4.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonblue4.setForeground(new java.awt.Color(0, 0, 255));
        jButtonblue4.setText("Blue-4");
        jButtonblue4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        jButtonblue4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonblue4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonblue4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonblue4MouseEntered(evt);
            }
        });
        jButtonblue4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonblue4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonblue4);
        jButtonblue4.setBounds(0, 230, 140, 60);

        jButtonblue3.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonblue3.setForeground(new java.awt.Color(0, 0, 255));
        jButtonblue3.setText("Blue-3");
        jButtonblue3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        jButtonblue3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonblue3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonblue3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonblue3MouseEntered(evt);
            }
        });
        jButtonblue3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonblue3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonblue3);
        jButtonblue3.setBounds(140, 230, 140, 60);

        jButtonyellow.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonyellow.setForeground(new java.awt.Color(255, 255, 0));
        jButtonyellow.setText("Yellow-Dice");
        jButtonyellow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        jButtonyellow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonyellow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonyellowMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonyellowMouseEntered(evt);
            }
        });
        jButtonyellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonyellowActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonyellow);
        jButtonyellow.setBounds(0, 470, 280, 50);

        jButtonyellow1.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonyellow1.setForeground(new java.awt.Color(255, 255, 0));
        jButtonyellow1.setText("Yellow-1");
        jButtonyellow1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        jButtonyellow1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonyellow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonyellow1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonyellow1MouseEntered(evt);
            }
        });
        jButtonyellow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonyellow1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonyellow1);
        jButtonyellow1.setBounds(0, 350, 140, 60);

        jButtonyellow2.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonyellow2.setForeground(new java.awt.Color(255, 255, 0));
        jButtonyellow2.setText("Yellow-2");
        jButtonyellow2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        jButtonyellow2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonyellow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonyellow2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonyellow2MouseEntered(evt);
            }
        });
        jButtonyellow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonyellow2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonyellow2);
        jButtonyellow2.setBounds(140, 350, 140, 60);

        jButtonyellow4.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonyellow4.setForeground(new java.awt.Color(255, 255, 0));
        jButtonyellow4.setText("Yellow-4");
        jButtonyellow4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        jButtonyellow4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonyellow4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonyellow4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonyellow4MouseEntered(evt);
            }
        });
        jButtonyellow4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonyellow4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonyellow4);
        jButtonyellow4.setBounds(0, 410, 140, 60);

        jButtonyellow3.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtonyellow3.setForeground(new java.awt.Color(255, 255, 0));
        jButtonyellow3.setText("Yellow-3");
        jButtonyellow3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        jButtonyellow3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonyellow3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonyellow3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonyellow3MouseEntered(evt);
            }
        });
        jButtonyellow3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonyellow3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonyellow3);
        jButtonyellow3.setBounds(140, 410, 140, 60);

        jButtongreen.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtongreen.setForeground(new java.awt.Color(0, 153, 51));
        jButtongreen.setText("Green-Dice");
        jButtongreen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 2, true));
        jButtongreen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtongreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtongreenMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtongreenMouseEntered(evt);
            }
        });
        jButtongreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtongreenActionPerformed(evt);
            }
        });
        jPanel5.add(jButtongreen);
        jButtongreen.setBounds(0, 640, 280, 50);

        jButtongreen1.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtongreen1.setForeground(new java.awt.Color(0, 153, 51));
        jButtongreen1.setText("Green-1");
        jButtongreen1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 2, true));
        jButtongreen1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtongreen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtongreen1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtongreen1MouseEntered(evt);
            }
        });
        jButtongreen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtongreen1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtongreen1);
        jButtongreen1.setBounds(0, 520, 140, 60);

        jButtongreen2.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtongreen2.setForeground(new java.awt.Color(0, 153, 51));
        jButtongreen2.setText("Green-2");
        jButtongreen2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 2, true));
        jButtongreen2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtongreen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtongreen2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtongreen2MouseEntered(evt);
            }
        });
        jButtongreen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtongreen2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtongreen2);
        jButtongreen2.setBounds(140, 520, 140, 60);

        jButtongreen4.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtongreen4.setForeground(new java.awt.Color(0, 153, 51));
        jButtongreen4.setText("Green-4");
        jButtongreen4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 2, true));
        jButtongreen4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtongreen4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtongreen4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtongreen4MouseEntered(evt);
            }
        });
        jButtongreen4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtongreen4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtongreen4);
        jButtongreen4.setBounds(0, 580, 140, 60);

        jButtongreen3.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jButtongreen3.setForeground(new java.awt.Color(0, 153, 51));
        jButtongreen3.setText("Green-3");
        jButtongreen3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 2, true));
        jButtongreen3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtongreen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtongreen3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtongreen3MouseEntered(evt);
            }
        });
        jButtongreen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtongreen3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtongreen3);
        jButtongreen3.setBounds(140, 580, 140, 60);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(700, 0, 280, 690);

        jPanel3.setLayout(null);

        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel37);
        jLabel37.setBounds(2, 0, 46, 43);

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel38);
        jLabel38.setBounds(48, 0, 46, 43);

        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel39);
        jLabel39.setBounds(94, 0, 46, 43);

        jLabel40.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("STOP");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel40);
        jLabel40.setBounds(140, 0, 46, 43);

        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel41);
        jLabel41.setBounds(186, 0, 46, 43);

        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel42);
        jLabel42.setBounds(232, 0, 46, 43);

        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel43);
        jLabel43.setBounds(2, 43, 46, 43);

        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel44);
        jLabel44.setBounds(48, 43, 46, 43);

        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel45);
        jLabel45.setBounds(94, 43, 46, 43);

        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel46);
        jLabel46.setBounds(140, 43, 46, 43);

        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel47);
        jLabel47.setBounds(186, 43, 46, 43);

        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel48);
        jLabel48.setBounds(232, 43, 46, 43);

        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel49);
        jLabel49.setBounds(2, 86, 46, 43);

        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel50);
        jLabel50.setBounds(48, 86, 46, 43);

        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel51);
        jLabel51.setBounds(94, 86, 46, 43);

        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel52);
        jLabel52.setBounds(140, 86, 46, 43);

        jLabel53.setDisplayedMnemonic('0');
        jLabel53.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 0));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("STOP");
        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel53);
        jLabel53.setBounds(186, 86, 46, 43);

        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel54);
        jLabel54.setBounds(232, 86, 46, 43);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(420, 280, 280, 130);

        jPanel4.setLayout(null);

        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel55);
        jLabel55.setBounds(2, 0, 46, 43);

        jLabel56.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 0, 0));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("STOP");
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel56);
        jLabel56.setBounds(48, 0, 46, 43);

        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel57);
        jLabel57.setBounds(94, 0, 46, 43);

        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel58);
        jLabel58.setBounds(140, 0, 46, 43);

        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel59);
        jLabel59.setBounds(186, 0, 46, 43);

        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel60);
        jLabel60.setBounds(232, 0, 46, 43);

        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel61);
        jLabel61.setBounds(2, 43, 46, 43);

        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel62);
        jLabel62.setBounds(48, 43, 46, 43);

        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel63);
        jLabel63.setBounds(94, 43, 46, 43);

        jLabel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel64);
        jLabel64.setBounds(140, 43, 46, 43);

        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel65);
        jLabel65.setBounds(186, 43, 46, 43);

        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel66);
        jLabel66.setBounds(232, 43, 46, 43);

        jLabel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel67);
        jLabel67.setBounds(2, 86, 46, 43);

        jLabel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel68);
        jLabel68.setBounds(48, 86, 46, 43);

        jLabel69.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("STOP");
        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel69);
        jLabel69.setBounds(94, 86, 46, 43);

        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel70);
        jLabel70.setBounds(140, 86, 46, 43);

        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel71);
        jLabel71.setBounds(186, 86, 46, 43);

        jLabel72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel72);
        jLabel72.setBounds(232, 86, 46, 43);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 280, 280, 130);

        jPanel1.setLayout(null);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1, 2, 46, 46);

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(47, 2, 46, 46);

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(93, 2, 46, 46);

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1, 48, 46, 46);

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(47, 48, 46, 46);

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(93, 48, 46, 46);

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1, 94, 46, 46);

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(47, 94, 46, 46);

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(93, 94, 46, 46);

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1, 140, 46, 46);

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(47, 140, 46, 46);

        jLabel12.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("STOP");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(93, 140, 46, 46);

        jLabel13.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("STOP");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1, 186, 46, 46);

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(47, 186, 46, 46);

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel15);
        jLabel15.setBounds(93, 186, 46, 46);

        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel16);
        jLabel16.setBounds(1, 232, 46, 46);

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel17);
        jLabel17.setBounds(47, 232, 46, 46);

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel18);
        jLabel18.setBounds(93, 232, 46, 46);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(280, 410, 140, 280);

        jPanel2.setLayout(null);

        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel19);
        jLabel19.setBounds(1, 2, 46, 46);

        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel20);
        jLabel20.setBounds(47, 2, 46, 46);

        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel21);
        jLabel21.setBounds(93, 2, 46, 46);

        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel22);
        jLabel22.setBounds(1, 48, 46, 46);

        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel23);
        jLabel23.setBounds(47, 48, 46, 46);

        jLabel24.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("STOP");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel24);
        jLabel24.setBounds(93, 48, 46, 46);

        jLabel25.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("STOP");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel25);
        jLabel25.setBounds(1, 94, 46, 46);

        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel26);
        jLabel26.setBounds(47, 94, 46, 46);

        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel27);
        jLabel27.setBounds(93, 94, 46, 46);

        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel28);
        jLabel28.setBounds(1, 140, 46, 46);

        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel29);
        jLabel29.setBounds(47, 140, 46, 46);

        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel30);
        jLabel30.setBounds(93, 140, 46, 46);

        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel31);
        jLabel31.setBounds(1, 186, 46, 46);

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel32);
        jLabel32.setBounds(47, 186, 46, 46);

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel33);
        jLabel33.setBounds(93, 186, 46, 46);

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel34);
        jLabel34.setBounds(1, 232, 46, 46);

        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel35);
        jLabel35.setBounds(47, 232, 46, 46);

        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel36);
        jLabel36.setBounds(93, 232, 46, 46);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(280, 0, 140, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    int posrr=0;
    public class RedSet
   {    String t;
       public int redSet(JLabel red,int posr){
           
           
           
           
       //posr=14;
        t=red.getText();
        int t1=Integer.parseInt(t);
            switch (t) {
                case "1":
                    t="Red-1";
                    break;
                case "2":
                    t="Red-2";
                    break;
                case "3":
                    t="Red-3";
                    break;
                case "4":
                    t="Red-4";
                    break;
            }
        if(posr<=4){posrr=posr;
             red.setLocation(51+46*posr, 1);
        jPanel4.add(red);}
        else if(posr>4&&posr<=10){posrr=posr;
             red.setLocation(4, 51+46*(9-posr));
        jPanel2.add(red);}
        else if(posr>10&&posr<13){posrr=posr;
             red.setLocation(51+46*(posr-11),3);
        jPanel2.add(red);}
        else if(posr>=13&&posr<=17){posrr=posr;
             red.setLocation(51+45,51+46*(posr-13));
        jPanel2.add(red);}
        else if(posr>=18&&posr<=23){posrr=posr;
             red.setLocation(51+46*(posr-19),1);
        jPanel3.add(red);}
        else if(posr==24){posrr=posr;
             red.setLocation(51+46*(28-posr),44);
        jPanel3.add(red);}
        else if(posr>=25&&posr<=30){posrr=posr;
             red.setLocation(51+46*(29-posr),87);
        jPanel3.add(red);}
        else if(posr>=31&&posr<=36){posrr=posr;
             red.setLocation(51+46,51+46*(posr-32));
        jPanel1.add(red);}
        else if(posr==37){posrr=posr;
             red.setLocation(51,51+46*(41-posr));
        jPanel1.add(red);}
        else if(posr>=38&&posr<=43){posrr=posr;
             red.setLocation(2,51+46*(42-posr));
        jPanel1.add(red);}
        else if(posr>=44&&posr<=49){posrr=posr;
             red.setLocation(51+46*(48-posr),2*44);
        jPanel4.add(red);}
        else if(posr>=50&&posr<=55){posrr=posr;
             red.setLocation(51+46*(posr-51),44);
        jPanel4.add(red);}
        
        else if(posr==56){posrr=posr;
        red.setLocation(97,46);
        red.setSize(0, 0);
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Your "+t+" Coin has been Reached to HOME!!!");
        
        if(t1==1)
            jButtonred1.setEnabled(false);
        else if(t1==2)
            jButtonred2.setEnabled(false);
        else if(t1==3)
            jButtonred3.setEnabled(false);
        else if(t1==4)
            jButtonred4.setEnabled(false);
        }
        else if(posr>56){//System.out.println(posrr);
        posr=posrr;
            red.setLocation(51+46*(posrr-51),44);
        jPanel4.add(red);  
        }
        Active a=new Active();
        int redx=red.getLocationOnScreen().x;
        int redy=red.getLocationOnScreen().y;
        //System.out.println(red.getLocationOnScreen().x+","+red.getLocationOnScreen().y);
        if(!(redx==565&&redy==82)&&!(redx==751&&redy==312)&&!(redx==797&&redy==397)&&!(redx==565&&redy==584) 
         &&!(redx==470&&redy==630)&&!(redx==285&&redy==399)&&!(redx==239&&redy==312)&&!(redx==471&&redy==128))
        {
        if((Math.abs(redx-blue1.getLocationOnScreen().x)<=5)&&(Math.abs(redy-blue1.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Blue-1 has been beaten By "+t);
            b1=true;
            pos5=0;
            blue1.setBounds(480, 40, 40, 40);
        add(blue1);
        }
        if((Math.abs(redx-blue2.getLocationOnScreen().x)<=5)&&(Math.abs(redy-blue2.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Blue-2 has been beaten By "+t);
            b2=true;
            pos6=0;
           blue2.setBounds(600, 40, 40, 40);
        add(blue2);
        }
        if((Math.abs(redx-blue3.getLocationOnScreen().x)<=5)&&(Math.abs(redy-blue3.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Blue-3 has been beaten By "+t);
            b3=true;
            pos7=0;
           blue3.setBounds(600, 170, 40, 40);
        add(blue3);
        }
        if((Math.abs(redx-blue4.getLocationOnScreen().x)<=5)&&(Math.abs(redy-blue4.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Blue-4 has been beaten By "+t);
            b4=true;
            pos8=0;
         blue4.setBounds(480, 170, 40, 40);
         add(blue4);
        }
        if((Math.abs(redx-yellow1.getLocationOnScreen().x)<=5)&&(Math.abs(redy-yellow1.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Yellow-1 has been beaten By "+t);
            y1=true;
            pos9=0;
           yellow1.setBounds(600, 480, 40, 40);
        add(yellow1);
        }
        if((Math.abs(redx-yellow2.getLocationOnScreen().x)<=5)&&(Math.abs(redy-yellow2.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Yellow-2 has been beaten By "+t);
            y2=true;
            pos10=0;
            yellow2.setBounds(600, 600, 40, 40);
        add(yellow2);
        }
        if((Math.abs(redx-yellow3.getLocationOnScreen().x)<=5)&&(Math.abs(redy-yellow3.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Yellow-3 has been beaten By "+t);
            y3=true;
            pos11=0;
           yellow3.setBounds(480, 600, 40, 40);
        add(yellow3);
        }
        if((Math.abs(redx-yellow4.getLocationOnScreen().x)<=5)&&(Math.abs(redy-yellow4.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Yellow-4 has been beaten By "+t);
            y4=true;
            pos12=0;
         yellow4.setBounds(480, 480, 40, 40);
        add(yellow4);
        }
        if((Math.abs(redx-green1.getLocationOnScreen().x)<=5)&&(Math.abs(redy-green1.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Green-1 has been beaten By "+t);
            g1=true;
            pos13=0;
           green1.setBounds(170, 600, 40, 40);
        add(green1);
        }
        if((Math.abs(redx-green2.getLocationOnScreen().x)<=5)&&(Math.abs(redy-green2.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Green-2 has been beaten By "+t);
            g2=true;
            pos14=0;
           green2.setBounds(40, 600, 40, 40);
        add(green2);
        }
        if((Math.abs(redx-green3.getLocationOnScreen().x)<=5)&&(Math.abs(redy-green3.getLocationOnScreen().y)<=5))
        {
           
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Green-3 has been beaten By "+t);
            g3=true;
            pos15=0;
           green3.setBounds(40, 480, 40, 40);
        add(green3);
        }
        if((Math.abs(redx-green4.getLocationOnScreen().x)<=5)&&(Math.abs(redy-green4.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Green-4 has been beaten By "+t);
            g4=true;
            pos16=0;
         green4.setBounds(170, 480, 40, 40);
        add(green4);
        }
        }
        return posr;
        }
       
       }
    
    
    
    
    boolean r=false,r1=true,r2=true,r3=true,r4=true,re1=false,re2=false,re3=false,re4=false;int pos1=0,pos2=0,pos3=0,pos4=0;
    private void jButtonred1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonred1ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(red1);
        boolean a2=a.isActive(red2);
        boolean a3=a.isActive(red3);
        boolean a4=a.isActive(red4);
        if(a1) bl=true;
        if(!a2) re2=false;
        if(!a3) re3=false;
        if(!a4) re4=false;
        if(re1){
        if(r){
                    int num=Integer.parseInt(jButtonred.getText().split(":")[1].trim());
        jButtonred.setText("Red-Dice");
        if(r1){
        if(num==6){
            re=true;
            bl=false;
            ye=false;
            gr=false;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Red-1 have Got a Start!!!");
            red1.setLocation(51, 1);
        jPanel4.add(red1);
        r1=false;
        num=0;
        return;
        }
        }
        else{
            pos1=num+pos1;
        RedSet re=new RedSet();
        pos1=re.redSet(red1,pos1);
        }
        r=false;
        }
        }
    }//GEN-LAST:event_jButtonred1ActionPerformed
    
    private void jButtonred2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonred2ActionPerformed
        Active a=new Active();
       boolean a1=a.isActive(red1);
        boolean a2=a.isActive(red2);
        boolean a3=a.isActive(red3);
        boolean a4=a.isActive(red4);
        if(a2) bl=true;
        if(!a1) re1=false;
        if(!a3) re3=false;
        if(!a4) re4=false;
        if(re2){
            if(r){
        int num=Integer.parseInt(jButtonred.getText().split(":")[1].trim());
        jButtonred.setText("Red-Dice");
        if(r2){
        if(num==6){
            re=true;
            bl=false;
            ye=false;
            gr=false;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Red-2 have Got a Start!!!");
            red2.setLocation(51, 1);
        jPanel4.add(red2);
        r2=false;
        num=0;
        }
        }
        else{
            //re=true;
        pos2=num+pos2;
        RedSet re=new RedSet();
        pos2=re.redSet(red2,pos2);
        }
        r=false;
        }
        }
    }//GEN-LAST:event_jButtonred2ActionPerformed
   
    private void jButtonred3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonred3ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(red1);
        boolean a2=a.isActive(red2);
        boolean a3=a.isActive(red3);
        boolean a4=a.isActive(red4);
        if(a3) bl=true;
        if(!a2) re2=false;
        if(!a1) re1=false;
        if(!a4) re4=false;
        if(re3){
        if(r){
        int num=Integer.parseInt(jButtonred.getText().split(":")[1].trim());
        jButtonred.setText("Red-Dice");
        if(r3){
        if(num==6){
            re=true;
            bl=false;
            ye=false;
            gr=false;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Red-3 have Got a Start!!!");
            red3.setLocation(51, 1);
        jPanel4.add(red3);
        r3=false;
        num=0;
        }
        }
        else{
            //re=true;
        pos3=num+pos3;
        RedSet re=new RedSet();
        pos3=re.redSet(red3,pos3);
        }
        r=false;
     }
        }
    }//GEN-LAST:event_jButtonred3ActionPerformed
    
    private void jButtonred4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonred4ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(red1);
        boolean a2=a.isActive(red2);
        boolean a3=a.isActive(red3);
        boolean a4=a.isActive(red4);
        if(a4) bl=true;
        if(!a2) re2=false;
        if(!a3) re3=false;
        if(!a1) re1=false;
        if(re4){
        if(r){
        int num=Integer.parseInt(jButtonred.getText().split(":")[1].trim());
        jButtonred.setText("Red-Dice");
        if(r4){
        if(num==6){
            re=true;
            bl=false;
            ye=false;
            gr=false;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Red-4 have Got a Start!!!");
            red4.setLocation(51, 1);
        jPanel4.add(red4);
        r4=false;
        num=0;
        }
        }
        else{
            //re=true;
        pos4=num+pos4;
        Ludo.RedSet re=new Ludo.RedSet();
        pos4=re.redSet(red4,pos4);
        }
      r=false;  
     }
        }
    }//GEN-LAST:event_jButtonred4ActionPerformed
        
    
    int posbb=0;
    public class BlueSet
   {    String t;
       public int blueSet(JLabel blue,int posb){
        
           //posb=1;
           
           t=blue.getText();
           int t1=Integer.parseInt(t);
            switch (t) {
                case "1":
                    t="Blue-1";
                    break;
                case "2":
                    t="Blue-2";
                    break;
                case "3":
                    t="Blue-3";
                    break;
                case "4":
                    t="Blue-4";
                    break;
            }
        if(posb<=4){posbb=posb;
             blue.setLocation(48*2, 51+46*(posb));
        jPanel2.add(blue);}
        else if(posb>4&&posb<=10){posbb=posb;
             blue.setLocation(51+46*(posb-6),1);
        jPanel3.add(blue);}
        else if(posb>10&&posb<13){posbb=posb;
             blue.setLocation(51+46*(4),44*(posb-10));
        jPanel3.add(blue);}
        else if(posb>=13&&posb<=17){posbb=posb;
             blue.setLocation( 51+46*(16-posb),87);
        jPanel3.add(blue);}
        else if(posb>=18&&posb<=23){posbb=posb;
             blue.setLocation(48*2,51+46*(posb-19));
        jPanel1.add(blue);}
        else if(posb==24){posbb=posb;
             blue.setLocation(48,51+46*(posb-20));
        jPanel1.add(blue);}
        else if(posb>=25&&posb<=30){posbb=posb;
             blue.setLocation(3,51+46*(29-posb));
        jPanel1.add(blue);}
        else if(posb>=31&&posb<=36){posbb=posb;
             blue.setLocation(51+46*(35-posb),87);
        jPanel4.add(blue);}
        else if(posb==37){posbb=posb;
             blue.setLocation(3,44);
        jPanel4.add(blue);}
        else if(posb>=38&&posb<=43){posbb=posb;
             blue.setLocation(51+46*(posb-39),1);
        jPanel4.add(blue);}
        else if(posb>=44&&posb<=49){posbb=posb;
             blue.setLocation(2,51+46*(48-posb));
        jPanel2.add(blue);}
        else if(posb>=50&&posb<=55){posbb=posb;
             blue.setLocation(48,51+46*(posb-51));
        jPanel2.add(blue);}
        
        else if(posb==56){posbb=posb;
        blue.setLocation(48,2*44);
        blue.setSize(0,0);
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Your "+t+" Coin has been Reached to HOME!!!");
        if(t1==1)
            jButtonblue1.setEnabled(false);
        else if(t1==2)
            jButtonblue2.setEnabled(false);
        else if(t1==3)
            jButtonblue3.setEnabled(false);
        else if(t1==4)
            jButtonblue4.setEnabled(false);
        }
        else if(posb>56){//System.out.println(posbb);
        posb=posbb;
            blue.setLocation(48,51+46*(posbb-51));
        jPanel2.add(blue);  
        }
        
                int redx=blue.getLocationOnScreen().x;
        int redy=blue.getLocationOnScreen().y;
        //System.out.println(blue.getLocationOnScreen().x+","+blue.getLocationOnScreen().y);
        if(!(redx==562&&redy==82)&&!(redx==751&&redy==312)&&!(redx==797&&redy==398)&&!(redx==562&&redy==584) 
         &&!(redx==471&&redy==630)&&!(redx==285&&redy==398)&&!(redx==239&&redy==312)&&!(redx==471&&redy==128))
        {
        if((Math.abs(redx-yellow1.getLocationOnScreen().x)<=5)&&(Math.abs(redy-yellow1.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Yellow-1 has been beaten By "+t);
            y1=true;
            pos9=0;
           yellow1.setBounds(600, 480, 40, 40);
        add(yellow1);
        }
        if((Math.abs(redx-yellow2.getLocationOnScreen().x)<=5)&&(Math.abs(redy-yellow2.getLocationOnScreen().y)<=5))
        {
            
             Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Yellow-2 has been beaten By "+t);
            y2=true;
            pos10=0;
          yellow2.setBounds(600, 600, 40, 40);
        add(yellow2);
        }
        if((Math.abs(redx-yellow3.getLocationOnScreen().x)<=5)&&(Math.abs(redy-yellow3.getLocationOnScreen().y)<=5))
        {
            
             Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Yellow-3 has been beaten By "+t);
            y3=true;
            pos11=0;
           yellow3.setBounds(480, 600, 40, 40);
        add(yellow3);
        }
        if((Math.abs(redx-yellow4.getLocationOnScreen().x)<=5)&&(Math.abs(redy-yellow4.getLocationOnScreen().y)<=5))
        {
            
             Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Yellow-4 has been beaten By "+t);
            y4=true;
            pos12=0;
         yellow4.setBounds(480, 480, 40, 40);
        add(yellow4);
        }
        if((Math.abs(redx-green1.getLocationOnScreen().x)<=5)&&(Math.abs(redy-green1.getLocationOnScreen().y)<=5))
        {
            
             Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Green-1 has been beaten By "+t);
            g1=true;
            pos13=0;
           green1.setBounds(170, 600, 40, 40);
        add(green1);
        }
        if((Math.abs(redx-green2.getLocationOnScreen().x)<=5)&&(Math.abs(redy-green2.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Green-2 has been beaten By "+t);
            g2=true;
            pos14=0;
           green2.setBounds(40, 600, 40, 40);
        add(green2);
        }
        if((Math.abs(redx-green3.getLocationOnScreen().x)<=5)&&(Math.abs(redy-green3.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Green-3 has been beaten By "+t);
            g3=true;
            pos15=0;
           green3.setBounds(40, 480, 40, 40);
        add(green3);
        }
        if((Math.abs(redx-green4.getLocationOnScreen().x)<=5)&&(Math.abs(redy-green4.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Green-4 has been beaten By "+t);
            g4=true;
            pos16=0;
         green4.setBounds(170, 480, 40, 40);
        add(green4);
        }
        if((Math.abs(redx-red1.getLocationOnScreen().x)<=5)&&(Math.abs(redy-red1.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Red-1 has been beaten By "+t);
            r1=true;
            pos1=0;
            red1.setBounds(40, 170, 40, 40);
        add(red1);
        }
        if((Math.abs(redx-red2.getLocationOnScreen().x)<=5)&&(Math.abs(redy-red2.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Red-2 has been beaten By "+t);
            r2=true;
            pos2=0;
          red2.setBounds(40, 40, 40, 40);
       add(red2);
        }
        if((Math.abs(redx-red3.getLocationOnScreen().x)<=5)&&(Math.abs(redy-red3.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Red-3 has been beaten By "+t);
            r3=true;
            pos3=0;
           red3.setBounds(170, 40, 40, 40);
        add(red3);
        }
        if((Math.abs(redx-red4.getLocationOnScreen().x)<=5)&&(Math.abs(redy-red4.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Red-4 has been beaten By "+t);
            r4=true;
            pos4=0;
         red4.setBounds(170, 170, 40, 40);
        add(red4);
        }
        
        }
        return posb;
        }
       
       }
    
    boolean b=false,b1=true,b2=true,b3=true,b4=true,bl1=false,bl2=false,bl3=false,bl4=false;int pos5=0,pos6=0,pos7=0,pos8=0;
    private void jButtonblue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonblue1ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(blue1);
        boolean a2=a.isActive(blue2);
        boolean a3=a.isActive(blue3);
        boolean a4=a.isActive(blue4);
        if(a1) ye=true;
        if(!a2) bl2=false;
        if(!a3) bl3=false;
        if(!a4) bl4=false;
        if(bl1){
        if(b){
        int num=Integer.parseInt(jButtonblue.getText().split(":")[1].trim());
        jButtonblue.setText("Blue-Dice");
        if(b1){
        if(num==6){
            re=false;
            bl=true;
            ye=false;
            gr=false;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Blue-1 have Got a Start!!!");
            blue1.setLocation(96,51);
        jPanel2.add(blue1);
        b1=false;
        num=0;
        }
        }
        else{
            //bl=true;
        pos5=num+pos5;
        BlueSet bl=new BlueSet();
        pos5=bl.blueSet(blue1,pos5);
        }
        b=false;
        }
        }
    }//GEN-LAST:event_jButtonblue1ActionPerformed

    private void jButtonblue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonblue2ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(blue1);
        boolean a2=a.isActive(blue2);
        boolean a3=a.isActive(blue3);
        boolean a4=a.isActive(blue4);
        if(a2) ye=true;
        if(!a1) bl1=false;
        if(!a3) bl3=false;
        if(!a4) bl4=false;
        if(bl2){
        if(b){
        int num=Integer.parseInt(jButtonblue.getText().split(":")[1].trim());
        jButtonblue.setText("Blue-Dice");
        if(b2){
        if(num==6){
            re=false;
            bl=true;
            ye=false;
            gr=false;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Blue-2 have Got a Start!!!");
            blue2.setLocation(96,51);
        jPanel2.add(blue2);
        b2=false;
        num=0;
        }
        }
        else{
           // bl=true;
        pos6=num+pos6;
        BlueSet bl=new BlueSet();
        pos6=bl.blueSet(blue2,pos6);
        }
        b=false;
        }
        }
    }//GEN-LAST:event_jButtonblue2ActionPerformed

    private void jButtonblue4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonblue4ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(blue1);
        boolean a2=a.isActive(blue2);
        boolean a3=a.isActive(blue3);
        boolean a4=a.isActive(blue4);
        if(a4) ye=true;
        if(!a2) bl2=false;
        if(!a3) bl3=false;
        if(!a1) bl1=false;
        if(bl4){
        if(b){
        int num=Integer.parseInt(jButtonblue.getText().split(":")[1].trim());
        jButtonblue.setText("Blue-Dice");
        if(b4){
        if(num==6){
            re=false;
            bl=true;
            ye=false;
            gr=false;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Blue-4 have Got a Start!!!");
            blue4.setLocation(96,51);
        jPanel2.add(blue4);
        b4=false;
        num=0;
        }
        }
        else{
            //bl=true;
        pos8=num+pos8;
        BlueSet bl=new BlueSet();
        pos8=bl.blueSet(blue4,pos8);
        }
        b=false;
        }
    }
    }//GEN-LAST:event_jButtonblue4ActionPerformed

    private void jButtonblue3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonblue3ActionPerformed
       Active a=new Active();
        boolean a1=a.isActive(blue1);
        boolean a2=a.isActive(blue2);
        boolean a3=a.isActive(blue3);
        boolean a4=a.isActive(blue4);
        if(a3) ye=true;
        if(!a2) bl2=false;
        if(!a1) bl1=false;
        if(!a4) bl4=false;
       if(bl3){
        if(b){
        int num=Integer.parseInt(jButtonblue.getText().split(":")[1].trim());
        jButtonblue.setText("Blue-Dice");
        if(b3){
        if(num==6){
            re=false;
            bl=true;
            ye=false;
            gr=false;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Blue-3 have Got a Start!!!");
            blue3.setLocation(96,51);
        jPanel2.add(blue3);
        b3=false;
        num=0;
        }
        }
        else{
           // bl=true;
        pos7=num+pos7;
        BlueSet bl=new BlueSet();
        pos7=bl.blueSet(blue3,pos7);
        }
        b=false;
        }
        }
       
    }//GEN-LAST:event_jButtonblue3ActionPerformed
    
    
    
    
    int posyy=0;
    public class YellowSet
   {    String t;
       public int yellowSet(JLabel yellow,int posy){
           
           
           //posy=37;
           
       
        t=yellow.getText();
        int t1=Integer.parseInt(t);
            switch (t) {
                case "1":
                    t="Yellow-1";
                    break;
                case "2":
                    t="Yellow-2";
                    break;
                case "3":
                    t="Yellow-3";
                    break;
                case "4":
                    t="Yellow-4";
                    break;
            }
        if(posy<=4){posyy=posy;
             yellow.setLocation(51+46*(3-posy), 87);
        jPanel3.add(yellow);}
        else if(posy>4&&posy<=10){posyy=posy;
             yellow.setLocation(96, 51+46*(posy-6));
        jPanel1.add(yellow);}
        else if(posy>10&&posy<13){posyy=posy;
             yellow.setLocation(51+45*(11-posy),51+46*4);
        jPanel1.add(yellow);}
        else if(posy>=13&&posy<=17){posyy=posy;
             yellow.setLocation(3,51+46*(16-posy));
        jPanel1.add(yellow);}
        else if(posy>=18&&posy<=23){posyy=posy;
             yellow.setLocation(51+46*(22-posy),87);
        jPanel4.add(yellow);}
        else if(posy==24){posyy=posy;
             yellow.setLocation(3,44);
        jPanel4.add(yellow);}
        else if(posy>=25&&posy<=30){posyy=posy;
             yellow.setLocation(51+46*(posy-26),2);
        jPanel4.add(yellow);}
        else if(posy>=31&&posy<=36){posyy=posy;
             yellow.setLocation(2,51+46*(35-posy));
        jPanel2.add(yellow);}
        else if(posy==37){posyy=posy;
             yellow.setLocation(51,4);
        jPanel2.add(yellow);}
        else if(posy>=38&&posy<=43){posyy=posy;
             yellow.setLocation(94,51+46*(posy-39));
        jPanel2.add(yellow);}
        else if(posy>=44&&posy<=49){posyy=posy;
             yellow.setLocation(51+46*(posy-45),1);
        jPanel3.add(yellow);}
        else if(posy>=50&&posy<=55){posyy=posy;
             yellow.setLocation(51+46*(54-posy),44);
        jPanel3.add(yellow);}
        
        else if(posy==56){posyy=posy;
        yellow.setLocation(97,47);
        yellow.setSize(0,0);
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Your "+t+" Coin has been Reached to HOME!!!");
        
        if(t1==1)
            jButtonyellow1.setEnabled(false);
        else if(t1==2)
            jButtonyellow2.setEnabled(false);
        else if(t1==3)
            jButtonyellow3.setEnabled(false);
        else if(t1==4)
            jButtonyellow4.setEnabled(false);
        }
        else if(posy>56){//System.out.println(posyy);
        posy=posyy;
            yellow.setLocation(51+46*(54-posyy),44);
        jPanel3.add(yellow);  
        }
        int redx=yellow.getLocationOnScreen().x;
        int redy=yellow.getLocationOnScreen().y;
         //System.out.println(yellow.getLocationOnScreen().x+","+yellow.getLocationOnScreen().y);       
        if(!(redx==562&&redy==82)&&!(redx==751&&redy==312)&&!(redx==797&&redy==398)&&!(redx==563&&redy==584) 
         &&!(redx==470&&redy==630)&&!(redx==285&&redy==398)&&!(redx==239&&redy==313)&&!(redx==470&&redy==128))
        {
        if((Math.abs(redx-green1.getLocationOnScreen().x)<=5)&&(Math.abs(redy-green1.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Green-1 has been beaten By "+t);
            g1=true;
            pos13=0;
           green1.setBounds(170, 600, 40, 40);
        add(green1);
        }
        if((Math.abs(redx-green2.getLocationOnScreen().x)<=5)&&(Math.abs(redy-green2.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Green-2 has been beaten By "+t);
            g2=true;
            pos14=0;
           green2.setBounds(40, 600, 40, 40);
        add(green2);
        }
        if((Math.abs(redx-green3.getLocationOnScreen().x)<=5)&&(Math.abs(redy-green3.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Green-3 has been beaten By "+t);
            g3=true;
            pos15=0;
           green3.setBounds(40, 480, 40, 40);
        add(green3);
        }
        if((Math.abs(redx-green4.getLocationOnScreen().x)<=5)&&(Math.abs(redy-green4.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Green-4 has been beaten By "+t);
            g4=true;
            pos16=0;
         green4.setBounds(170, 480, 40, 40);
        add(green4);
        }
        if((Math.abs(redx-red1.getLocationOnScreen().x)<=5)&&(Math.abs(redy-red1.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Red-1 has been beaten By "+t);
            r1=true;
            pos1=0;
            red1.setBounds(40, 170, 40, 40);
        add(red1);
        }
        if((Math.abs(redx-red2.getLocationOnScreen().x)<=5)&&(Math.abs(redy-red2.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Red-2 has been beaten By "+t);
            r2=true;
            pos2=0;
          red2.setBounds(40, 40, 40, 40);
       add(red2);
        }
        if((Math.abs(redx-red3.getLocationOnScreen().x)<=5)&&(Math.abs(redy-red3.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Red-3 has been beaten By "+t);
            r3=true;
            pos3=0;
           red3.setBounds(170, 40, 40, 40);
        add(red3);
        }
        if((Math.abs(redx-red4.getLocationOnScreen().x)<=5)&&(Math.abs(redy-red4.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Red-4 has been beaten By "+t);
            r4=true;
            pos4=0;
         red4.setBounds(170, 170, 40, 40);
        add(red4);
        }
        
        if((Math.abs(redx-blue1.getLocationOnScreen().x)<=5)&&(Math.abs(redy-blue1.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Blue-1 has been beaten By "+t);
            b1=true;
            pos5=0;
            blue1.setBounds(480, 40, 40, 40);
        add(blue1);
        }
        if((Math.abs(redx-blue2.getLocationOnScreen().x)<=5)&&(Math.abs(redy-blue2.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Blue-2 has been beaten By "+t);
            b2=true;
            pos6=0;
           blue2.setBounds(600, 40, 40, 40);
        add(blue2);
        }
        if((Math.abs(redx-blue3.getLocationOnScreen().x)<=5)&&(Math.abs(redy-blue3.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Blue-3 has been beaten By "+t);
            b3=true;
            pos7=0;
           blue3.setBounds(600, 170, 40, 40);
        add(blue3);
        }
        if((Math.abs(redx-blue4.getLocationOnScreen().x)<=5)&&(Math.abs(redy-blue4.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Blue-4 has been beaten By "+t);
            b4=true;
            pos8=0;
         blue4.setBounds(480, 170, 40, 40);
         add(blue4);
        }
        }
        return posy;
        }
       
       }
    
    
    
    
    
    boolean y=false,y1=true,y2=true,y3=true,y4=true,ye1=false,ye2=false,ye3=false,ye4=false;int pos9=0,pos10=0,pos11=0,pos12=0;
    private void jButtonyellow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonyellow1ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(yellow1);
        boolean a2=a.isActive(yellow2);
        boolean a3=a.isActive(yellow3);
        boolean a4=a.isActive(yellow4);
        if(a1) gr=true;
        if(!a2) ye2=false;
        if(!a3) ye3=false;
        if(!a4) ye4=false;
        if(ye1){
        if(y){
        int num=Integer.parseInt(jButtonyellow.getText().split(":")[1].trim());
        jButtonyellow.setText("Yellow-Dice");
        if(y1){
        if(num==6){
            re=false;
            bl=false;
            ye=true;
            gr=false;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Yellow-1 have Got a Start!!!");
            yellow1.setLocation(51+46*3,87);
        jPanel3.add(yellow1);
        y1=false;
        num=0;
        }
        }
        else{
            //ye=true;
        pos9=num+pos9;
        YellowSet ye=new YellowSet();
        pos9=ye.yellowSet(yellow1,pos9);
        }
        y=false;
        }
        }
    }//GEN-LAST:event_jButtonyellow1ActionPerformed

    private void jButtonyellow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonyellow2ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(yellow1);
        boolean a2=a.isActive(yellow2);
        boolean a3=a.isActive(yellow3);
        boolean a4=a.isActive(yellow4);
        if(a2) gr=true;
        if(!a1) ye1=false;
        if(!a3) ye3=false;
        if(!a4) ye4=false;
        if(ye2){
        if(y){
        int num=Integer.parseInt(jButtonyellow.getText().split(":")[1].trim());
        jButtonyellow.setText("Yellow-Dice");
        if(y2){
        if(num==6){
            re=false;
            bl=false;
            ye=true;
            gr=false;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Yellow-2 have Got a Start!!!");
            yellow2.setLocation(51+46*3,87);
        jPanel3.add(yellow2);
        y2=false;
        num=0;
        }
        }
        else{
            //ye=true;
        pos10=num+pos10;
        YellowSet ye=new YellowSet();
        pos10=ye.yellowSet(yellow2,pos10);
        }
        y=false;
        }
        }
    }//GEN-LAST:event_jButtonyellow2ActionPerformed

    private void jButtonyellow4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonyellow4ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(yellow1);
        boolean a2=a.isActive(yellow2);
        boolean a3=a.isActive(yellow3);
        boolean a4=a.isActive(yellow4);
        if(a4) gr=true;
        if(!a2) ye2=false;
        if(!a3) ye3=false;
        if(!a1) ye1=false;
        if(ye4){
        if(y){
        int num=Integer.parseInt(jButtonyellow.getText().split(":")[1].trim());
        jButtonyellow.setText("Yellow-Dice");
        if(y4){
        if(num==6){
            re=false;
            bl=false;
            ye=true;
            gr=false;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Yellow-4 have Got a Start!!!");
            yellow4.setLocation(51+46*3,87);
        jPanel3.add(yellow4);
        y4=false;
        num=0;
        }
        }
        else{
            //ye=true;
        pos12=num+pos12;
        YellowSet ye=new YellowSet();
        pos12=ye.yellowSet(yellow4,pos12);
        }
        y=false;
        }
        }
    }//GEN-LAST:event_jButtonyellow4ActionPerformed

    private void jButtonyellow3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonyellow3ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(yellow1);
        boolean a2=a.isActive(yellow2);
        boolean a3=a.isActive(yellow3);
        boolean a4=a.isActive(yellow4);
        if(a3) gr=true;
        if(!a2) ye2=false;
        if(!a1) ye1=false;
        if(!a4) ye4=false;
        if(ye3){
        if(y){
        int num=Integer.parseInt(jButtonyellow.getText().split(":")[1].trim());
        jButtonyellow.setText("Yellow-Dice");
        if(y3){
        if(num==6){
            re=false;
            bl=false;
            ye=true;
            gr=false;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Yellow-3 have Got a Start!!!");
            yellow3.setLocation(51+46*3,87);
        jPanel3.add(yellow3);
        y3=false;
        num=0;
        }
        }
        else{
            //ye=true;
        pos11=num+pos11;
        YellowSet ye=new YellowSet();
        pos11=ye.yellowSet(yellow3,pos11);
        }
        y=false;
        }
        }
    }//GEN-LAST:event_jButtonyellow3ActionPerformed

    
    
     int posgg=0;
    public class GreenSet
   {    String t;
       public int greenSet(JLabel green,int posg){
           
           
          // posg=12;
           
       
        t=green.getText();
        int t1=Integer.parseInt(t);
            switch (t) {
                case "1":
                    t="Green-1";
                    break;
                case "2":
                    t="Green-2";
                    break;
                case "3":
                    t="Green-3";
                    break;
                case "4":
                    t="Green-4";
                    break;
            }
        if(posg<=4){posgg=posg;
             green.setLocation(3,51+46*(3-posg));
        jPanel1.add(green);}
        else if(posg>4&&posg<=10){posgg=posg;
             green.setLocation(51+46*(9-posg),87);
        jPanel4.add(green);}
        else if(posg>10&&posg<13){posgg=posg;
             green.setLocation(4,45*(12-posg));
        jPanel4.add(green);}
        else if(posg>=13&&posg<=17){posgg=posg;
             green.setLocation(51+46*(posg-13),1);
        jPanel4.add(green);}
        else if(posg>=18&&posg<=23){posgg=posg;
             green.setLocation(2,51+46*(22-posg));
        jPanel2.add(green);}
        else if(posg==24){posgg=posg;
             green.setLocation(48,3);
        jPanel2.add(green);}
        else if(posg>=25&&posg<=30){posgg=posg;
             green.setLocation(96,51+46*(posg-26));
        jPanel2.add(green);}
        else if(posg>=31&&posg<=36){posgg=posg;
             green.setLocation(51+46*(posg-32),1);
        jPanel3.add(green);}
        else if(posg==37){posgg=posg;
             green.setLocation(51+46*4,45);
        jPanel3.add(green);}
        else if(posg>=38&&posg<=43){posgg=posg;
             green.setLocation(51+46*(42-posg),87);
        jPanel3.add(green);}
        else if(posg>=44&&posg<=49){posgg=posg;
             green.setLocation(96,51+46*(posg-45));
        jPanel1.add(green);}
        else if(posg>=50&&posg<=55){posgg=posg;
             green.setLocation(48,51+46*(54-posg));
        jPanel1.add(green);}
        
        else if(posg==56){posgg=posg;
        green.setLocation(51,2*44);
        green.setSize(0,0);
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Your "+t+" Coin has been Reached to HOME!!!");
        
        if(t1==1)
            jButtongreen1.setEnabled(false);
        else if(t1==2)
            jButtongreen2.setEnabled(false);
        else if(t1==3)
            jButtongreen3.setEnabled(false);
        else if(t1==4)
            jButtongreen4.setEnabled(false);
        }
        else if(posg>56){//System.out.println(posgg);
        posg=posgg;
            green.setLocation(47,51+46*(54-posgg));
        jPanel1.add(green);  
        }
        
               int redx=green.getLocationOnScreen().x;
        int redy=green.getLocationOnScreen().y;
        
       //System.out.println(green.getLocationOnScreen().x+","+green.getLocationOnScreen().y);
       if(!(redx==564&&redy==82)&&!(redx==751&&redy==312)&&!(redx==797&&redy==398)&&!(redx==564&&redy==584) 
         &&!(redx==471&&redy==630)&&!(redx==285&&redy==398)&&!(redx==239&&redy==313)&&!(redx==470&&redy==128))
        {
        if((Math.abs(redx-red1.getLocationOnScreen().x)<=5)&&(Math.abs(redy-red1.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Red-1 has been beaten By "+t);
            r1=true;
            pos1=0;
            red1.setBounds(40, 170, 40, 40);
        add(red1);
        }
        if((Math.abs(redx-red2.getLocationOnScreen().x)<=5)&&(Math.abs(redy-red2.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Red-2 has been beaten By "+t);
           r2=true;
           pos2=0;
          red2.setBounds(40, 40, 40, 40);
       add(red2);
        }
        if((Math.abs(redx-red3.getLocationOnScreen().x)<=5)&&(Math.abs(redy-red3.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Red-3 has been beaten By "+t);
           r3=true;
           pos3=0;
           red3.setBounds(170, 40, 40, 40);
        add(red3);
        }
        if((Math.abs(redx-red4.getLocationOnScreen().x)<=5)&&(Math.abs(redy-red4.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Red-4 has been beaten By "+t);
            r4=true;
            pos4=0;
         red4.setBounds(170, 170, 40, 40);
        add(red4);
        }
        
        if((Math.abs(redx-blue1.getLocationOnScreen().x)<=5)&&(Math.abs(redy-blue1.getLocationOnScreen().y)<=5))
        {
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Blue-1 has been beaten By "+t);
            b1=true;
            pos5=0;
            blue1.setBounds(480, 40, 40, 40);
        add(blue1);
        }
        if((Math.abs(redx-blue2.getLocationOnScreen().x)<=5)&&(Math.abs(redy-blue2.getLocationOnScreen().y)<=5))
        {
            
             Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Blue-2 has been beaten By "+t);
            b2=true;
            pos6=0;
           blue2.setBounds(600, 40, 40, 40);
        add(blue2);
        }
        if((Math.abs(redx-blue3.getLocationOnScreen().x)<=5)&&(Math.abs(redy-blue3.getLocationOnScreen().y)<=5))
        {
            
             Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Blue-3 has been beaten By "+t);
            b3=true;
            pos7=0;
           blue3.setBounds(600, 170, 40, 40);
        add(blue3);
        }
        if((Math.abs(redx-blue4.getLocationOnScreen().x)<=5)&&(Math.abs(redy-blue4.getLocationOnScreen().y)<=5))
        {
            
             Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Blue-4 has been beaten By "+t);
            b4=true;
            pos8=0;
         blue4.setBounds(480, 170, 40, 40);
         add(blue4);
        }
        
         if((Math.abs(redx-yellow1.getLocationOnScreen().x)<=5)&&(Math.abs(redy-yellow1.getLocationOnScreen().y)<=5))
        {
            
             Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Yellow-1 has been beaten By "+t);
            y1=true;
            pos9=0;
           yellow1.setBounds(600, 480, 40, 40);
        add(yellow1);
        }
        if((Math.abs(redx-yellow2.getLocationOnScreen().x)<=5)&&(Math.abs(redy-yellow2.getLocationOnScreen().y)<=5))
        {
            
             Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Yellow-2 has been beaten By "+t);
            
            y2=true;pos10=0;
          yellow2.setBounds(600, 600, 40, 40);
        add(yellow2);
        }
        if((Math.abs(redx-yellow3.getLocationOnScreen().x)<=5)&&(Math.abs(redy-yellow3.getLocationOnScreen().y)<=5))
        {
            
             Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Yellow-3 has been beaten By "+t);
            y3=true;
            pos11=0;
           yellow3.setBounds(480, 600, 40, 40);
        add(yellow3);
        }
        if((Math.abs(redx-yellow4.getLocationOnScreen().x)<=5)&&(Math.abs(redy-yellow4.getLocationOnScreen().y)<=5))
        {
            
             Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Yellow-4 has been beaten By "+t);
            y4=true;
            pos12=0;
         yellow4.setBounds(480, 480, 40, 40);
        add(yellow4);
        }
        }
        return posg;
        }
        }
    
    
    boolean g=false,g1=true,g2=true,g3=true,g4=true,gr1=false,gr2=false,gr3=false,gr4=false;int pos13=0,pos14=0,pos15=0,pos16=0;
    private void jButtongreen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtongreen1ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(green1);
        boolean a2=a.isActive(green2);
        boolean a3=a.isActive(green3);
        boolean a4=a.isActive(green4);
        if(a1) re=true;
        if(!a2) gr2=false;
        if(!a3) gr3=false;
        if(!a4) gr4=false;
        if(gr1){
        if(g){
        int num=Integer.parseInt(jButtongreen.getText().split(":")[1].trim());
        jButtongreen.setText("Green-Dice");
        if(g1){
        if(num==6){
            re=false;
            bl=false;
            ye=false;
            gr=true;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Green-1 have Got a Start!!!");
            green1.setLocation(3,51+46*3);
        jPanel1.add(green1);
        g1=false;
        num=0;
        }
        }
        else{
            //gr=true;
        pos13=num+pos13;
        GreenSet gr=new GreenSet();
        pos13=gr.greenSet(green1,pos13);
        }
        g=false;
        }
        }
    }//GEN-LAST:event_jButtongreen1ActionPerformed

    private void jButtongreen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtongreen2ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(green1);
        boolean a2=a.isActive(green2);
        boolean a3=a.isActive(green3);
        boolean a4=a.isActive(green4);
        if(a2) re=true;
        if(!a1) gr1=false;
        if(!a3) gr3=false;
        if(!a4) gr4=false;
        if(gr2){
        if(g){
        int num=Integer.parseInt(jButtongreen.getText().split(":")[1].trim());
        jButtongreen.setText("Green-Dice");
        if(g2){
        if(num==6){
            re=false;
            bl=false;
            ye=false;
            gr=true;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Green-2 have Got a Start!!!");
            green2.setLocation(3,51+46*3);
        jPanel1.add(green2);
        g2=false;
        num=0;
        }
        }
        else{
           // gr=true;
        pos14=num+pos14;
        GreenSet gr=new GreenSet();
        pos14=gr.greenSet(green2,pos14);
        }
        g=false;
        }
        }
    }//GEN-LAST:event_jButtongreen2ActionPerformed

    private void jButtongreen4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtongreen4ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(green1);
        boolean a2=a.isActive(green2);
        boolean a3=a.isActive(green3);
        boolean a4=a.isActive(green4);
        if(a4) re=true;
        if(!a2) gr2=false;
        if(!a3) gr3=false;
        if(!a1) gr1=false;
        if(gr4){
        if(g){
        int num=Integer.parseInt(jButtongreen.getText().split(":")[1].trim());
        jButtongreen.setText("Green-Dice");
        if(g4){
        if(num==6){
            re=false;
            bl=false;
            ye=false;
            gr=true;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Green-4 have Got a Start!!!");
            green4.setLocation(3,51+46*3);
        jPanel1.add(green4);
        g4=false;
        num=0;
        }
        }
        else{
            //gr=true;
        pos16=num+pos16;
        GreenSet gr=new GreenSet();
        pos16=gr.greenSet(green4,pos16);
        }
        g=false;
        }
        }
    }//GEN-LAST:event_jButtongreen4ActionPerformed

    private void jButtongreen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtongreen3ActionPerformed
        Active a=new Active();
        boolean a1=a.isActive(green1);
        boolean a2=a.isActive(green2);
        boolean a3=a.isActive(green3);
        boolean a4=a.isActive(green4);
        if(a3) re=true;
        if(!a2) gr2=false;
        if(!a1) gr1=false;
        if(!a4) gr4=false;
        if(gr3){
        if(g){
        int num=Integer.parseInt(jButtongreen.getText().split(":")[1].trim());
        jButtongreen.setText("Green-Dice");
        if(g3){
        if(num==6){
            re=false;
            bl=false;
            ye=false;
            gr=true;
            Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Green-3 have Got a Start!!!");
            green3.setLocation(3,51+46*3);
        jPanel1.add(green3);
        g3=false;
        num=0;
        }
        }
        else{
            //gr=true;
        pos15=num+pos15;
        GreenSet gr=new GreenSet();
        pos15=gr.greenSet(green3,pos15);
        }
        g=false;
        }
        }
    }//GEN-LAST:event_jButtongreen3ActionPerformed

    private void jButtonyellow1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonyellow1MouseEntered
        jButtonyellow1.setBackground(new Color(255, 255, 0));
        jButtonyellow1.setForeground(Color.white);
    }//GEN-LAST:event_jButtonyellow1MouseEntered

    private void jButtonyellow1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonyellow1MouseExited
        jButtonyellow1.setBackground(Color.white);
        jButtonyellow1.setForeground(new Color(255, 255, 0));
    }//GEN-LAST:event_jButtonyellow1MouseExited

    private void jButtonyellow2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonyellow2MouseEntered
        jButtonyellow2.setBackground(new Color(255, 255, 0));
        jButtonyellow2.setForeground(Color.white);
    }//GEN-LAST:event_jButtonyellow2MouseEntered

    private void jButtonyellow2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonyellow2MouseExited
        jButtonyellow2.setBackground(Color.white);
        jButtonyellow2.setForeground(new Color(255, 255, 0));
    }//GEN-LAST:event_jButtonyellow2MouseExited

    private void jButtonyellow4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonyellow4MouseExited
        jButtonyellow4.setBackground(Color.white);
        jButtonyellow4.setForeground(new Color(255, 255, 0));
    }//GEN-LAST:event_jButtonyellow4MouseExited

    private void jButtonyellow4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonyellow4MouseEntered
       jButtonyellow4.setBackground(new Color(255, 255, 0));
        jButtonyellow4.setForeground(Color.white); 
    }//GEN-LAST:event_jButtonyellow4MouseEntered

    private void jButtonyellow3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonyellow3MouseEntered
        jButtonyellow3.setBackground(new Color(255, 255, 0));
        jButtonyellow3.setForeground(Color.white);
    }//GEN-LAST:event_jButtonyellow3MouseEntered

    private void jButtonyellow3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonyellow3MouseExited
       jButtonyellow3.setBackground(Color.white);
        jButtonyellow3.setForeground(new Color(255, 255, 0)); 
    }//GEN-LAST:event_jButtonyellow3MouseExited
    
    public class Active
    {
        public boolean isActive(JLabel l){
            int lx=l.getLocation().x;
            int ly=l.getLocation().y;
            //System.out.println(lx+","+ly);
            if((lx==40&&ly==170)||(lx==40&&ly==40)||(lx==170&&ly==40)||(lx==170&&ly==170)||  
            (lx==480&&ly==40)||(lx==600&&ly==40)||(lx==600&&ly==170)||(lx==480&&ly==170)|| 
              (lx==600&&ly==480)||(lx==600&&ly==600)||(lx==480&&ly==600)||(lx==480&&ly==480)|| 
                (lx==170&&ly==600)||(lx==40&&ly==600)||(lx==40&&ly==480)||(lx==170&&ly==480))
                    return false;
            return true;
        }
    }
    
    boolean re=true,bl=false,ye=false,gr=false,bor=true,bob=true,boy=true,bog=true;
    private void jButtonredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonredActionPerformed
        if(re){
        r=true;
        bl=false;
        ye=false;
        gr=false;
        jButtongreen.setText("Green-Dice");
        int num=(int)(6*Math.random()+1);
        jButtonred.setText("Dice No. :  "+num);
        if(num==6){
            re1=true;
            re2=true;
            re3=true;
            re4=true;
            //re=false;
            bor=false;
            return;
        }
        if(bor){
            
            bl=true;
        }
        }
        re=false;
    }//GEN-LAST:event_jButtonredActionPerformed
    
    private void jButtonblueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonblueActionPerformed
        if(bl){
        re=false;
        b=true;
        ye=false;
        gr=false;
        jButtonred.setText("Red-Dice");
        int num=(int)(6*Math.random()+1);
        jButtonblue.setText("Dice No. :  "+num);
        if(num==6){
            bl1=true;
            bl2=true;
            bl3=true;
            bl4=true;
            bob=false;
            return;
            }
        if(bob){
            
          ye=true;
        }
        }
        bl=false;
    }//GEN-LAST:event_jButtonblueActionPerformed

    private void jButtonyellowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonyellowMouseExited
        jButtonyellow.setBackground(Color.white);
        jButtonyellow.setForeground(new Color(255, 255, 0));
    }//GEN-LAST:event_jButtonyellowMouseExited

    private void jButtonyellowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonyellowMouseEntered
         jButtonyellow.setBackground(new Color(255, 255, 0));
        jButtonyellow.setForeground(Color.white);
    }//GEN-LAST:event_jButtonyellowMouseEntered
    
    private void jButtonyellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonyellowActionPerformed
        if(ye){
        re=false;
        bl=false;
        y=true;
        gr=false;
        jButtonblue.setText("Blue-Dice");
        int num=(int)(6*Math.random()+1);
        jButtonyellow.setText("Dice No. :  "+num);
        if(num==6){
            ye1=true;
            ye2=true;
            ye3=true;
            ye4=true;
            boy=false;
            return;
             }
        if(boy){
            
           gr=true;
        }
        }
        ye=false;
    }//GEN-LAST:event_jButtonyellowActionPerformed
    
    private void jButtongreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtongreenActionPerformed
         if(gr){
        re=false;
        bl=false;
        ye=false;
        g=true;
        jButtonyellow.setText("Yellow-Dice");
        int num=(int)(6*Math.random()+1);
        jButtongreen.setText("Dice No. :  "+num);
        if(num==6){
            gr1=true;
            gr2=true;
            gr3=true;
            gr4=true;
            bog=false;
            return;
            }
        if(bog){
            
           re=true; 
        }
        }
         gr=false;
    }//GEN-LAST:event_jButtongreenActionPerformed

    private void jButtonred1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonred1MouseEntered
        jButtonred1.setBackground(Color.red);
        jButtonred1.setForeground(Color.white);
    }//GEN-LAST:event_jButtonred1MouseEntered

    private void jButtonred2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonred2MouseEntered
         jButtonred2.setBackground(Color.red);
        jButtonred2.setForeground(Color.white);
    }//GEN-LAST:event_jButtonred2MouseEntered

    private void jButtonred4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonred4MouseEntered
         jButtonred4.setBackground(Color.red);
        jButtonred4.setForeground(Color.white);
    }//GEN-LAST:event_jButtonred4MouseEntered

    private void jButtonred3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonred3MouseEntered
         jButtonred3.setBackground(Color.red);
        jButtonred3.setForeground(Color.white);
    }//GEN-LAST:event_jButtonred3MouseEntered

    private void jButtonredMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonredMouseEntered
         jButtonred.setBackground(Color.red);
        jButtonred.setForeground(Color.white);
    }//GEN-LAST:event_jButtonredMouseEntered

    private void jButtonblue1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonblue1MouseEntered
         jButtonblue1.setBackground(Color.blue);
        jButtonblue1.setForeground(Color.white);
    }//GEN-LAST:event_jButtonblue1MouseEntered

    private void jButtonblue2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonblue2MouseEntered
         jButtonblue2.setBackground(Color.blue);
        jButtonblue2.setForeground(Color.white);
    }//GEN-LAST:event_jButtonblue2MouseEntered

    private void jButtonblue3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonblue3MouseEntered
         jButtonblue3.setBackground(Color.blue);
        jButtonblue3.setForeground(Color.white);
    }//GEN-LAST:event_jButtonblue3MouseEntered

    private void jButtonblue4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonblue4MouseEntered
         jButtonblue4.setBackground(Color.blue);
        jButtonblue4.setForeground(Color.white);
    }//GEN-LAST:event_jButtonblue4MouseEntered

    private void jButtonblueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonblueMouseEntered
         jButtonblue.setBackground(Color.blue);
        jButtonblue.setForeground(Color.white);
    }//GEN-LAST:event_jButtonblueMouseEntered

    private void jButtongreen1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtongreen1MouseEntered
         jButtongreen1.setBackground(new Color(0, 153, 51));
        jButtongreen1.setForeground(Color.white);
    }//GEN-LAST:event_jButtongreen1MouseEntered

    private void jButtongreen2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtongreen2MouseEntered
        jButtongreen2.setBackground(new Color(0, 153, 51));
        jButtongreen2.setForeground(Color.white);
    }//GEN-LAST:event_jButtongreen2MouseEntered

    private void jButtongreen3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtongreen3MouseEntered
        jButtongreen3.setBackground(new Color(0, 153, 51));
        jButtongreen3.setForeground(Color.white);
    }//GEN-LAST:event_jButtongreen3MouseEntered

    private void jButtongreen4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtongreen4MouseEntered
        jButtongreen4.setBackground(new Color(0, 153, 51));
        jButtongreen4.setForeground(Color.white);
    }//GEN-LAST:event_jButtongreen4MouseEntered

    private void jButtongreenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtongreenMouseEntered
        jButtongreen.setBackground(new Color(0, 153, 51));
        jButtongreen.setForeground(Color.white);
    }//GEN-LAST:event_jButtongreenMouseEntered

    private void jButtonred1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonred1MouseExited
        jButtonred1.setBackground(Color.white);
        jButtonred1.setForeground(Color.red);
    }//GEN-LAST:event_jButtonred1MouseExited

    private void jButtonred2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonred2MouseExited
        jButtonred2.setBackground(Color.white);
        jButtonred2.setForeground(Color.red);
    }//GEN-LAST:event_jButtonred2MouseExited

    private void jButtonred3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonred3MouseExited
        jButtonred3.setBackground(Color.white);
        jButtonred3.setForeground(Color.red);
    }//GEN-LAST:event_jButtonred3MouseExited

    private void jButtonred4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonred4MouseExited
        jButtonred4.setBackground(Color.white);
        jButtonred4.setForeground(Color.red);
    }//GEN-LAST:event_jButtonred4MouseExited

    private void jButtonredMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonredMouseExited
        jButtonred.setBackground(Color.white);
        jButtonred.setForeground(Color.red);
    }//GEN-LAST:event_jButtonredMouseExited

    private void jButtonblue1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonblue1MouseExited
        jButtonblue1.setBackground(Color.white);
        jButtonblue1.setForeground(Color.blue);
    }//GEN-LAST:event_jButtonblue1MouseExited

    private void jButtonblue2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonblue2MouseExited
        jButtonblue2.setBackground(Color.white);
        jButtonblue2.setForeground(Color.blue);
    }//GEN-LAST:event_jButtonblue2MouseExited

    private void jButtonblue3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonblue3MouseExited
        jButtonblue3.setBackground(Color.white);
        jButtonblue3.setForeground(Color.blue);
    }//GEN-LAST:event_jButtonblue3MouseExited

    private void jButtonblue4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonblue4MouseExited
        jButtonblue4.setBackground(Color.white);
        jButtonblue4.setForeground(Color.blue);
    }//GEN-LAST:event_jButtonblue4MouseExited

    private void jButtonblueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonblueMouseExited
        jButtonblue.setBackground(Color.white);
        jButtonblue.setForeground(Color.blue);
    }//GEN-LAST:event_jButtonblueMouseExited

    private void jButtongreen1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtongreen1MouseExited
        jButtongreen1.setBackground(Color.white);
        jButtongreen1.setForeground(new Color(0, 153, 51));
    }//GEN-LAST:event_jButtongreen1MouseExited

    private void jButtongreen2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtongreen2MouseExited
        jButtongreen2.setBackground(Color.white);
        jButtongreen2.setForeground(new Color(0, 153, 51));
    }//GEN-LAST:event_jButtongreen2MouseExited

    private void jButtongreen3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtongreen3MouseExited
        jButtongreen3.setBackground(Color.white);
        jButtongreen3.setForeground(new Color(0, 153, 51));
    }//GEN-LAST:event_jButtongreen3MouseExited

    private void jButtongreen4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtongreen4MouseExited
        jButtongreen4.setBackground(Color.white);
        jButtongreen4.setForeground(new Color(0, 153, 51));
    }//GEN-LAST:event_jButtongreen4MouseExited

    private void jButtongreenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtongreenMouseExited
        jButtongreen.setBackground(Color.white);
        jButtongreen.setForeground(new Color(0, 153, 51));
    }//GEN-LAST:event_jButtongreenMouseExited

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
            java.util.logging.Logger.getLogger(Ludo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ludo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ludo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ludo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Ludo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blue;
    private javax.swing.JLabel green;
    private javax.swing.JButton jButtonblue;
    private javax.swing.JButton jButtonblue1;
    private javax.swing.JButton jButtonblue2;
    private javax.swing.JButton jButtonblue3;
    private javax.swing.JButton jButtonblue4;
    private javax.swing.JButton jButtongreen;
    private javax.swing.JButton jButtongreen1;
    private javax.swing.JButton jButtongreen2;
    private javax.swing.JButton jButtongreen3;
    private javax.swing.JButton jButtongreen4;
    private javax.swing.JButton jButtonred;
    private javax.swing.JButton jButtonred1;
    private javax.swing.JButton jButtonred2;
    private javax.swing.JButton jButtonred3;
    private javax.swing.JButton jButtonred4;
    private javax.swing.JButton jButtonyellow;
    private javax.swing.JButton jButtonyellow1;
    private javax.swing.JButton jButtonyellow2;
    private javax.swing.JButton jButtonyellow3;
    private javax.swing.JButton jButtonyellow4;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel main;
    private javax.swing.JLabel red;
    private javax.swing.JLabel yellow;
    // End of variables declaration//GEN-END:variables
}
