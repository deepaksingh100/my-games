import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class Rotate extends JFrame 
{
    double angle=90;
    JLabel l;
    public Rotate()
    {
        super("My Window");
        setLayout(null);
        setResizable(false);
        l=new JLabel(new ImageIcon(getClass().getResource("apple.png"))){

            @Override
            protected void paintComponent(Graphics g) 
            {
                Graphics2D g2=(Graphics2D)g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                        RenderingHints.VALUE_ANTIALIAS_ON);
                AffineTransform aff=g2.getTransform();
                Shape shape=g2.getClip();
                double w=getWidth()/2.0;
                double h=getHeight()/2.0;
                aff.rotate(Math.toRadians(angle), w, h);
                g2.setClip(shape);
                g2.setTransform(aff);
                super.paintComponent(g);
            }
            
        };
        l.setBounds(200,200,100,100);
        l.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) 
            {
                try{
                URL url=getClass().getResource("wind.wav");
                AudioStream stream=new AudioStream(url.openStream());
                AudioPlayer.player.start(stream);
                }catch(Exception ex)
                {}
            }
                
        });
        add(l);
        l.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addKeyListener(new MyClass());
        setSize(500,500);
        setVisible(true);
    }
    public class MyClass extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e) 
        {
            int keycode=e.getKeyCode();
            if(keycode==KeyEvent.VK_LEFT)
                angle=270;
            else if(keycode==KeyEvent.VK_RIGHT)
                angle=90;
            else if(keycode==KeyEvent.VK_UP)
                angle=0;
            else if(keycode==KeyEvent.VK_DOWN)
                angle=180;
            l.repaint();
        }   
    }
    public static void main(String a[])
    {
        new Rotate();
    }
}
