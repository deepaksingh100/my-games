
import java.applet.Applet;
import java.applet.AudioClip;
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
public class Helicopter extends javax.swing.JFrame {
    Timer t,t1;
    JFrame f;
    AudioClip ac;
    int x1=900,x2=1300,x3=1700,y1=20,w=20,h=20,keycode;
    public Helicopter() {
        initComponents();
        try{
            BufferedImage img=ImageIO.read(getClass().getResourceAsStream("heli.jpg"));
            setIconImage(img);
        }catch(Exception e){}
        ac=Applet.newAudioClip(getClass().getResource("start.wav")); 
        ac.loop();
        setTitle("Helicopter");
        setBounds(100, 30, 1150, 650);
        jLabel1.setLocation(x1, y1);
        jLabel7.setLocation(w, h);
        jLabel8.setLocation(x1+275, y1+180);
        jLabel9.setLocation(x1+550, y1+430);
        //AWTUtilities.setWindowOpaque(this, false);
        //System.out.println(x);
        t=new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int h7=jLabel7.getLocation().y;
                int w8=jLabel8.getLocation().x;
                int h8=jLabel8.getLocation().y;
                int w9=jLabel9.getLocation().x;
                int h9=jLabel9.getLocation().y;
                if((w8-200<20&&h7+90>=h8&&h7+200<h9)||(w9-150<20&&h7+80>h9))
                {
                    ac.stop();
                    t.stop();
            t1.stop();
            try{
			                URL url=getClass().getResource("Blast.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
            int opt=JOptionPane.showOptionDialog(f, "You Lose!!! \n Do You want to Retry?", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if(opt==0)
            {
                new Helicopter().setVisible(true);
                dispose();
            }
            else 
                System.exit(0);
                }
                x1=x1>-50?x1-10:925;
                x2=x2>-50?x2-10:925;
                x3=x3>-50?x3-10:925;
                jLabel1.setLocation(x1, y1);
                jLabel8.setLocation(x2, y1+180);
                jLabel9.setLocation(x3, y1+430);
            }
        });
        t.start();
        t1=new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(h>=480){ac.stop();
            t.stop();
            t1.stop();
           try{
			                URL url=getClass().getResource("Blast.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
            int opt=JOptionPane.showOptionDialog(f, "You Lose!!! \n Do You want to Retry?", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if(opt==0)
            {
                new Helicopter().setVisible(true);
                dispose();
            }
            else 
                System.exit(0);
        }
                h=h+7;
                jLabel7.setLocation(w, h);
            }
        });
        t1.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heli2.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(760, 30, 370, 160);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(570, 590, 575, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 575, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(570, 0, 575, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heli3.gif"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 40, 300, 130);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heli1.gif"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(880, 230, 200, 130);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heli2.gif"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(830, 430, 300, 130);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 590, 575, 20);

        jLabel4.setBackground(new java.awt.Color(102, 102, 255));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-6, 0, 1160, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        keycode=evt.getKeyCode();
        if(keycode==evt.VK_SPACE){ac.stop();
                                        t.stop();
                                        t1.stop();
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Snake Game has been PAUSED...\nDo you want to RESUME???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0){ac.loop();
					    t.start();
                                            t1.start();
                                        }}
        if(keycode==38){
            h=h-3;
        if(h<=0){ac.stop();
            t.stop();
            t1.stop();
            try{
			                URL url=getClass().getResource("Blast.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
            int opt=JOptionPane.showOptionDialog(this, "You Lose!!! \n Do You want to Retry?", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if(opt==0)
            {
                new Helicopter().setVisible(true);
                this.dispose();
            }
            else 
                System.exit(0);
        }
        int h7=jLabel7.getLocation().y;
                int w1=jLabel1.getLocation().x;
                int h1=jLabel1.getLocation().y;
                int w8=jLabel8.getLocation().x;
                int h8=jLabel8.getLocation().y;
                if((w8-200<20&&h7-90<h8&&h7-200>h1)||(w1-200<20&&h7-100<h1))
                {ac.stop();
                    t.stop();
            t1.stop();
            try{
			                URL url=getClass().getResource("Blast.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
            int opt=JOptionPane.showOptionDialog(f, "You Lose!!! \n Do You want to Retry?", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if(opt==0)
            {
                new Helicopter().setVisible(true);
                dispose();
            }
            else 
                System.exit(0);
        }}
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Helicopter().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}