

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Help extends JFrame 
{
	JFrame f;
	JLabel l1,l2,l5,la,a,b;
	public Help()
	{
		super("Snake Game::Help");
		f=this;
		ImageIcon image=new ImageIcon(getClass().getResource("Snake1.jpg"));
                 la=new JLabel(image);
                 la.setOpaque(false);
		l2=new JLabel("SNAKE GAME");
                //l2.setForeground(new Color(0,0,255));
		l2.setBounds(150,20,300,50);
                l1=new JLabel("Help");
               // l1.setForeground(new Color(0,0,255));
		l1.setBounds(225,100,100,50);
		Font font2=new Font("Traditional Arabic",Font.BOLD,36);
		l2.setFont(font2);
		la.add(l2);
                l1.setFont(font2);
		la.add(l1);
                b=new JLabel("<html><a href=''>Main Menu</a></html>");
                b.setBounds(400,450,150,30);
		setResizable(false);  
		b.addMouseListener(new MouseAdapter(){
            @Override
                     public void mouseEntered(MouseEvent e)
			{
				b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                b.setText("<html><a href=''style='color:red'>Main Menu</a></html>");
			}
            @Override
			public void mouseExited(MouseEvent e)
			{
                         		b.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                                        b.setText("<html><a href=''style='color:blue'>Main Menu</a></html>");
			}
            @Override
			public void mouseClicked(MouseEvent e)
			{
				f.dispose();
				new MainMenu().setVisible(true);
			}
                       
		});
                la.add(b);
                a=new JLabel("1. Press UP arrow key to turn UP,");
                JLabel a2=new JLabel("2. Press DOWN arrow key to turn DOWN,");
                JLabel a3=new JLabel("3. Press LEFT arrow key to turn LEFT,");
                JLabel a4=new JLabel("4. Press RIGHT arrow key to turn RIGHT,");
                JLabel a5=new JLabel("5. Press BACKSPACE key to go to MAIN MENU,");
                JLabel a6=new JLabel("6.Press SPACE key to pause.");
		Font font=new Font("Tohima",Font.BOLD,18);
		a.setFont(font);
		a2.setFont(font);
		a3.setFont(font);
		a4.setFont(font);
		a5.setFont(font);
		a6.setFont(font);
		a.setBounds(75, 200, 500, 30);
		a2.setBounds(75, 240, 500, 30);
		a3.setBounds(75,280, 500, 30);
		a4.setBounds(75, 320, 500, 30);
		a5.setBounds(75, 360, 500, 30);
		a6.setBounds(75, 400, 500, 30);
		la.add(a);
                la.add(a2);
                la.add(a3);
                la.add(a4);
                la.add(a5);
                la.add(a6);
                la.setLayout(null);
                b.setFont(font);
		try{
			BufferedImage img=ImageIO.read(getClass().getResource("Snake1.jpg"));
			setIconImage(img);
		}catch (Exception e)
		{}
		
		setSize(600,600);
                setLocationRelativeTo(null);
                setResizable(false);
		final JLabel l5=new JLabel("<html><a style='color:red'>&copy; copyright 2014 DEEPAK</a></html>");
                Font font3=new Font("Tahoma",Font.PLAIN,14);
		l5.setBounds(25,500,550,50);
                l5.setFont(font3);
                la.add(l5);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                add(la);
		
	}
	public static void main(String a[])
	{
	}
}