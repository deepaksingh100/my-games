
import java.applet.Applet;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
public class SnakeLadder extends javax.swing.JFrame {
    String p1,p2,p11,p22;
    public SnakeLadder(String p1,String p2) {
        initComponents();
        setTitle("Snake-Ladder");
        setLocation(150, 0);
        setSize(1000, 730);
        p11=this.p1=p1.split(" ")[0];
        p22=this.p2=p2.split(" ")[0];
        player1.setText(p11);
        player2.setText(p22);
        player1button.setText(p1);
        player2button.setText(p2);
        player1.setLocation(-100, -100);
        player2.setLocation(-100, -100);
        player1.setOpaque(true);
        player2.setOpaque(true);
        player2button.setEnabled(false);
        try{
            BufferedImage img=ImageIO.read(getClass().getResourceAsStream("snakeladder.gif"));
            setIconImage(img);
        }catch(Exception e){}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        player1pos = new javax.swing.JLabel();
        player2pos = new javax.swing.JLabel();
        player2num = new javax.swing.JLabel();
        player1num = new javax.swing.JLabel();
        mainlabel = new javax.swing.JLabel();
        player1button = new javax.swing.JButton();
        player2button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        player1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/player1.gif"))); // NOI18N
        player1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(player1);
        player1.setBounds(0, 630, 70, 70);

        player2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        player2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/player2.gif"))); // NOI18N
        player2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(player2);
        player2.setBounds(0, 630, 70, 70);

        player1pos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        player1pos.setForeground(new java.awt.Color(153, 0, 204));
        player1pos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        player1pos.setOpaque(true);
        getContentPane().add(player1pos);
        player1pos.setBounds(710, 260, 270, 70);

        player2pos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        player2pos.setForeground(new java.awt.Color(255, 0, 0));
        player2pos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        player2pos.setOpaque(true);
        getContentPane().add(player2pos);
        player2pos.setBounds(710, 610, 270, 70);

        player2num.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        player2num.setForeground(new java.awt.Color(255, 0, 0));
        player2num.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        player2num.setOpaque(true);
        getContentPane().add(player2num);
        player2num.setBounds(710, 540, 270, 70);

        player1num.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        player1num.setForeground(new java.awt.Color(153, 0, 204));
        player1num.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        player1num.setOpaque(true);
        getContentPane().add(player1num);
        player1num.setBounds(710, 200, 270, 60);

        mainlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeladder.gif"))); // NOI18N
        mainlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(mainlabel);
        mainlabel.setBounds(0, 0, 700, 700);

        player1button.setBackground(new java.awt.Color(255, 255, 255));
        player1button.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        player1button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dice1.gif"))); // NOI18N
        player1button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        player1button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        player1button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player1button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1buttonActionPerformed(evt);
            }
        });
        getContentPane().add(player1button);
        player1button.setBounds(710, 0, 270, 200);

        player2button.setBackground(new java.awt.Color(255, 255, 255));
        player2button.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        player2button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dice1.gif"))); // NOI18N
        player2button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        player2button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        player2button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player2button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2buttonActionPerformed(evt);
            }
        });
        getContentPane().add(player2button);
        player2button.setBounds(710, 340, 270, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int pos2=0;boolean b2=false,b22=true;int n2=0,x2=0,y2=0,pos22=0;
    private void player2buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2buttonActionPerformed
        Applet.newAudioClip(getClass().getResource("dice.wav")).play();
        int num2=(int)(6*Math.random()+1);
        n1=0;
        player2button.setEnabled(false);
        player1button.setEnabled(true);
        if(b22){
            player2num.setText(p2+"  Dice No. :"+num2);
            player2pos.setText(p2+"  Position :"+0);
        if(num2==6){
            b2=true;
            b22=false;
            x2=-100;y2=-100;
            num2=0;
            n2=1;
            Toolkit.getDefaultToolkit().beep();
          JOptionPane.showMessageDialog(this, p2+",  You have Got a Start \nas well as a Bonus Chance!!!");
          player2button.setEnabled(true);
          player1button.setEnabled(false);
        }
        }
        if(num2==6&&n2<2){
            n2++;
            pos22=pos2;
            x2=player2.getLocation().x;
            y2=player2.getLocation().y;
            System.out.println("2-"+x2+","+y2);
             Toolkit.getDefaultToolkit().beep();
          JOptionPane.showMessageDialog(this, p2+",  You have Got a Bonus Chance!!!");
            //System.out.println("n2 if ,"+n2);
            player2num.setText(p2+"  Dice No. :"+num2);
        player2pos.setText(p2+"  Position :"+pos22  );
            player1button.setEnabled(false);
        player2button.setEnabled(true);
       }
        else if(num2==6&&n2==2){n2=1;pos2=0;
        Toolkit.getDefaultToolkit().beep();
          JOptionPane.showMessageDialog(this, p2+",  You have Lost Your Bonus Chance\n You have Only one Chance!!!");
           player2.setLocation(x2,y2);
         player2num.setText(p2+"  Dice No. :"+num2);
        player2pos.setText(p2+"  Position :"+pos22);
            player1button.setEnabled(false);
        player2button.setEnabled(true);
        return;
        }
        if(b2&&num2!=0){
            pos2=pos2+num2;
        if(pos2<100){
        if(pos2<=10){
            if(pos2==1){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You Got a Ladder!!!");  
                player2.setLocation((2)*70, 6*70);
                pos2=38;
            }
            else if(pos2==4){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You Got a Ladder!!!");  
                player2.setLocation((6)*70, 8*70);
                pos2=14;
            }
            else if(pos2==9){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You Got a Ladder!!!");  
                player2.setLocation((9)*70, 6*70);
                pos2=31;
                
            }
            else
                player2.setLocation((pos2-1)*70, 9*70);
        }
        else if(pos2>10&&pos2<=20){
            if(pos2==17){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You are in the Mouth of Snake!!!");  
                player2.setLocation((6)*70, 9*70);
                pos2=7;
                
            }
            else
                player2.setLocation((20-pos2)*70, 8*70);
        }
        else if(pos2>20&&pos2<=30){
            if(pos2==21){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You Got a Ladder!!!");  
                player2.setLocation((1)*70, 5*70);
                pos2=42;
            }
            else if(pos2==28){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You Got a Ladder!!!");  
                player2.setLocation((3)*70, 1*70);
                pos2=84;
            }
            else
                player2.setLocation((pos2-21)*70, 7*70);
        }
        else if(pos2>30&&pos2<=40)
            player2.setLocation((20*2-pos2)*70, 6*70);
        else if(pos2>40&&pos2<=50)
            player2.setLocation((pos2-41)*70, 5*70);
        else if(pos2>50&&pos2<=60){
            if(pos2==51){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You Got a Ladder!!!");  
                player2.setLocation((6)*70, 3*70);
                pos2=67;
            }
            else if(pos2==54){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You are in the Mouth of a Snake!!!");  
               player2.setLocation((6)*70, 6*70);
               pos2=34;
            }
            else
                player2.setLocation((20*3-pos2)*70, 4*70);
        }
        else if(pos2>60&&pos2<=70){
            if(pos2==64){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You are in the Mouth of a Snake!!!");  
                player2.setLocation((0)*70, 4*70);
                pos2=60;
            }
            else if(pos2==62){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You are in the Mouth of a Snake!!!");  
               player2.setLocation((1)*70, 8*70);
               pos2=19;
            }
            else
                player2.setLocation((pos2-61)*70, 3*70);
        }
        else if(pos2>70&&pos2<=80){
            if(pos2==71){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You Got a Ladder!!!");  
                player2.setLocation((9)*70, 0*70);
                pos2=91;
            }
            else if(pos2==80){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You Got a Ladder!!!");  
                player2.setLocation(0, 0*70);
                pos2=100;
            }
            else
                player2.setLocation((20*4-pos2)*70, 2*70);
        }
        else if(pos2>80&&pos2<=90){
            if(pos2==87){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You are in the Mouth of a Snake!!!");  
                player2.setLocation((3)*70, 7*70);
                pos2=24;
            }
            else
                player2.setLocation((pos2-81)*70, 1*70);
        }
        else if(pos2>90&&pos2<=94){
            if(pos2==93){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You are in the Mouth of a Snake!!!");  
                player2.setLocation((7)*70, 2*70);
                pos2=73;
            }
            else
                player2.setLocation((20*5-pos2)*70, 0*70);
        }
        else if(pos2>94&&pos2<=100){
            //System.out.println("pos2,"+pos2);
            if(pos2==98){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You are in the Mouth of a Snake!!!");  
                player2.setLocation((1)*70, 2*70);
                pos2=79;
            }
            else if(pos2==95){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p2+",  You are in the Mouth of a Snake!!!");  
                player2.setLocation((5)*70, 2*70);
                pos2=75;
            }
            
            else
                player2.setLocation((20*5-pos2)*70, 0*70);
            }
        player2num.setText(p2+"  Dice No. :"+num2);
        player2pos.setText(p2+"  Position :"+pos2);
        }
        if(pos2==100){
                        player2.setLocation(0, 0);
            player2num.setText(p2+"  Dice No. :"+num2);
            player2pos.setText(p2+"  Position :"+pos2);
                Toolkit.getDefaultToolkit().beep();
                int opt=JOptionPane.showOptionDialog(this, p2+"  has Won the Game,\n Do You Want to Restart???", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if(opt==0){
                    new SnakeLadder(p1,p2).setVisible(true);
                    this.dispose();
                }
                else
                    System.exit(0);
            }
        if(pos2>100){
            pos2=pos2-num2;
            x2=player2.getLocation().x;
            y2=player2.getLocation().y;
            //System.out.println("100+"+x2+","+y2);
            player2num.setText(p2+"  Dice No. :"+num2);
            player2pos.setText(p2+"  Position :"+pos2);
        }
        }
    }//GEN-LAST:event_player2buttonActionPerformed
    int pos1=0;boolean b1=false,b11=true;int n1=0,x1=0,y1=0,pos11=0;
    private void player1buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1buttonActionPerformed
        //int num1=6;
        Applet.newAudioClip(getClass().getResource("dice.wav")).play();
        int num1=(int)(6*Math.random()+1);
        n2=0;
        player1button.setEnabled(false);
        player2button.setEnabled(true);
        if(b11){player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+0);
        if(num1==6){
            b1=true;
            b11=false;x1=-100;y1=-100;
            num1=0;
            n1=1;
            Toolkit.getDefaultToolkit().beep();
          JOptionPane.showMessageDialog(this, p1+",  You have Got a Start \nas well as a Bonus Chance!!!");
          player1button.setEnabled(true);
          player2button.setEnabled(false);
        }
        }
        if(num1==6&&n1<2){
            n1++;
            pos11=pos1;
            x1=player1.getLocation().x;
            y1=player1.getLocation().y;
            System.out.println("1-"+x1+","+y1);
             Toolkit.getDefaultToolkit().beep();
          JOptionPane.showMessageDialog(this, p1+",  You have Got a Bonus Chance!!!");
            //System.out.println("n2 if ,"+n2);
            player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos11  );
            player2button.setEnabled(false);
        player1button.setEnabled(true);
       }
        else if(num1==6&&n1==2){n1=1;pos1=0;
        Toolkit.getDefaultToolkit().beep();
          JOptionPane.showMessageDialog(this, p1+",  You have Lost Your Bonus Chance \n You have Only one Chance!!!");
           player1.setLocation(x1,y1);
         player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos11);
            player2button.setEnabled(false);
        player1button.setEnabled(true);
        return;
        }
        if(b1&&num1!=0){
            pos1=pos1+num1;
        if(pos1<100){
        if(pos1<=10){
            if(pos1==1){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You Got a Ladder!!!");  
                player1.setLocation((2)*70, 6*70);
                pos1=38;
            }
            else if(pos1==4){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You Got a Ladder!!!");  
                player1.setLocation((6)*70, 8*70);
                pos1=14;
            }
            else if(pos1==9){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You Got a Ladder!!!");  
                player1.setLocation((9)*70, 6*70);
                pos1=31;
            }
            else
                player1.setLocation((pos1-1)*70, 9*70);//System.out.println("pos1,"+pos1);
            player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
            
        }
        else if(pos1>10&&pos1<=20){
            if(pos1==17){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You are in the Mouth of a Snake!!!");  
                player1.setLocation((6)*70, 9*70);
                pos1=7;
            }
            else
                player1.setLocation((20-pos1)*70, 8*70);
            player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
        }
        else if(pos1>20&&pos1<=30){
            if(pos1==21){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You Got a Ladder!!!");  
                player1.setLocation((1)*70, 5*70);
                pos1=42;
            }
            else if(pos1==28){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You Got a Ladder!!!");  
                player1.setLocation((3)*70, 1*70);
                pos1=84;
            }
            else
                player1.setLocation((pos1-21)*70, 7*70);
            player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
        }
        else if(pos1>30&&pos1<=40){
            player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
            player1.setLocation((20*2-pos1)*70, 6*70);}
        else if(pos1>40&&pos1<=50){
            player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
            player1.setLocation((pos1-41)*70, 5*70);}
        else if(pos1>50&&pos1<=60){
            if(pos1==51){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You Got a Ladder!!!");  
                player1.setLocation((6)*70, 3*70);
                pos1=67;
            }
            else if(pos1==54){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You are in the Mouth of a Snake!!!");  
               player1.setLocation((6)*70, 6*70);
               pos1=34;
            }
            else
                player1.setLocation((20*3-pos1)*70, 4*70);
            player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
        }
        else if(pos1>60&&pos1<=70){
            if(pos1==64){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You are in the Mouth of a Snake!!!");  
                player1.setLocation((0)*70, 4*70);
                player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
                pos1=60;
            }
            else if(pos1==62){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You are in the Mouth of a Snake!!!");  
               player1.setLocation((1)*70, 8*70);
               pos1=19;
            }
            else
                player1.setLocation((pos1-61)*70, 3*70);
            player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
        }
        else if(pos1>70&&pos1<=80){
            if(pos1==71){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You Got a Ladder!!!");  
                player1.setLocation((9)*70, 0*70);
                pos1=91;
                player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
            }
            else if(pos1==80){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You Got a Ladder!!!");  
                player1.setLocation(0, 0*70);
                pos1=100;
            }
            else
                player1.setLocation((20*4-pos1)*70, 2*70);
            player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
        }
        else if(pos1>80&&pos1<=90){
            if(pos1==87){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You are in the Mouth of a Snake!!!");  
                player1.setLocation((3)*70, 7*70);
                pos1=24;
            }
            else
                player1.setLocation((pos1-81)*70, 1*70);
            player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
        }
        else if(pos1>90&&pos1<=94){
            if(pos1==93){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You are in the Mouth of a Snake!!!");  
                player1.setLocation((7)*70, 2*70);
                pos1=73;
            }
            else
                player1.setLocation((20*5-pos1)*70, 0*70);
            player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
        }
        else if(pos1>94&&pos1<=100){
            //System.out.println("pos1,"+pos1);
            if(pos1==98){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You are in the Mouth of a Snake!!!");  
                player1.setLocation((1)*70, 2*70);
                pos1=79;
            }
            else if(pos1==95){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, p1+",  You are in the Mouth of a Snake!!!");  
                player1.setLocation((5)*70, 2*70);
                pos1=75;
            }
           
            else 
                player1.setLocation((20*5-pos1)*70, 0*70);
            player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
            }
        }   
        
        if(pos1==100){
            player1.setLocation(0, 0);
            player1num.setText(p1+"  Dice No. :"+num1);
        player1pos.setText(p1+"  Position :"+pos1);
                Toolkit.getDefaultToolkit().beep();
                int opt=JOptionPane.showOptionDialog(this, p1+"  has Won the Game,\n Do You Want to Restart???", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if(opt==0){
                    new SnakeLadder(p1,p2).setVisible(true);
                    this.dispose();
                }
                else
                    System.exit(0);
            }
        if(pos1>100){
            pos1=pos1-num1;
            x1=player1.getLocation().x;
            y1=player1.getLocation().y;
            //System.out.println("100+"+x1+","+y1);
            player1num.setText(p1+"  Dice No. :"+num1);
            player1pos.setText(p1+"  Position :"+pos1);
        }
      }
    }//GEN-LAST:event_player1buttonActionPerformed
    boolean b=true;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       if(b){
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(this, p1+",  You must Start the Game!!!");  
        b=false;
       }
    }//GEN-LAST:event_formWindowGainedFocus
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
            java.util.logging.Logger.getLogger(SnakeLadder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SnakeLadder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SnakeLadder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SnakeLadder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //new SnakeLadder().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mainlabel;
    private javax.swing.JLabel player1;
    private javax.swing.JButton player1button;
    private javax.swing.JLabel player1num;
    private javax.swing.JLabel player1pos;
    private javax.swing.JLabel player2;
    private javax.swing.JButton player2button;
    private javax.swing.JLabel player2num;
    private javax.swing.JLabel player2pos;
    // End of variables declaration//GEN-END:variables
}
