


import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class Stage1 extends JFrame implements Runnable
{
	JFrame f;
	JPanel p;
	JLabel l,l1,l2,l3;
	int w=600,h=620,x=100,y=100,v=5,sw,sh,w1,h1,z,sco=0,q=0,hs=0;
	Timer t;
        boolean b=false;
        Thread th1;
        double angle=270;
        ImageIcon icon,icon1,icon2;
	JLabel larr[]=new JLabel[41];
	int x1[]=new int[41];
	int y1[]=new int[41];
        File file=new File(System.getProperty("user.dir")+File.separator+"r@nd0#$%^&"+File.separator+"dks"+File.separator+"hs");
         File f1=new File("hs.txt");
         String str=file+File.separator+f1;
	public Stage1(final int n)
	{
		super("Snake Game::STAGE-1");
                file.mkdirs();
                file.setReadOnly();
                //f1.setReadOnly();
                try{Runtime.getRuntime().exec("attrib -r -H "+file+File.separator+f1);
                //Runtime.getRuntime().exec("attrib -r"+file+File.separator+f1);
                Runtime.getRuntime().exec("attrib +H "+file);
                Runtime.getRuntime().exec("attrib +H "+file+File.separator+"..");
                Runtime.getRuntime().exec("attrib +H r@nd0#$%^&");
                }catch(Exception ex){}
		z=n;
		f=this;
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		sw=(int)(d.getWidth());
		sh=(int)(d.getHeight());
		setSize(w,h);
		setLocation((sw-w)/2,(sh-h)/2);
                setResizable(false);  
                th1=new Thread(this);
                th1.start();
                addKeyListener(new MyListener1());
		for(int i=0;i<v;i++)
		{
			x1[i]=100+20*i;
			y1[i]=100;
		}
		p=new JPanel();
		p.setBackground(new Color(100,130,160));
		p.setLayout(null);  
                larr[0]=new JLabel(new ImageIcon(getClass().getResource("apple.png"))){
                    
            @Override
                protected void paintComponent(Graphics g) {
                                Graphics2D g2=(Graphics2D)g;
                		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
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
                larr[0].setBounds(x1[0],y1[0],20,20);
		p.add(larr[0]);
		icon=new ImageIcon(getClass().getResource("green.png"));
		for(int i=1;i<5;i++)
		{
			larr[i]=new JLabel(icon);
			larr[i].setBounds(x1[i],y1[i],20,20);
			p.add(larr[i]);
		}
                icon=new ImageIcon(getClass().getResource("green2.png"));
		w1=(20*(int)(28*Math.random()));
		h1=(20*(int)(28*Math.random()));
		l=new JLabel(icon);
		l.setBounds(w1,h1,20,20);
		p.add(l);
                l3=new JLabel();
		l3.setBounds(0,560,595,20);
                //l3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                p.add(l3);
                try{
                ObjectInputStream fin=new ObjectInputStream(new FileInputStream(str));
                String chs = (String)fin.readObject();
                hs=Integer.parseInt(chs);
                }catch(Exception e){}
                l3.setText("                             Your Score is :"+sco +","+"           Highest Score is :"+hs);
                //l3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                l3.setOpaque(false);
                Font f1=new Font("Tahoma",Font.BOLD,15);
                l3.setFont(f1);
		icon1=new ImageIcon(getClass().getResource("blood.jpg"));
		l1=new JLabel(icon1);
                p.add(l1);
                icon=new ImageIcon(getClass().getResource("green1.png"));
                l2=new JLabel(icon);
		p.add(l2);
		add(p);
                add(p);
                addKeyListener(new MyClass());
		t=new Timer(z,new MyListener());
		t.start();
		try{
			BufferedImage img=ImageIO.read(getClass().getResourceAsStream("Snake1.jpg"));
			setIconImage(img);
		}catch (Exception e)
		{}
		setCursor(Cursor.getPredefinedCursor(2));
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter(){
            @Override
			public void windowClosing(WindowEvent e)
			{
				t.stop();
                                Toolkit.getDefaultToolkit().beep();
				int opt=JOptionPane.showOptionDialog(f,"Are you sure to EXIT??","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
				if(opt==0){
                                    try{Runtime.getRuntime().exec("attrib +H +r "+file+File.separator+"hs.txt");
                                //Runtime.getRuntime().exec("attrib +r"+file+File.separator+"hs.txt");
                                }catch(Exception ex){}
					System.exit(0);}
				else
					t.start();
			}
		});
		addKeyListener(new KeyAdapter(){
            @Override
			public void keyPressed(KeyEvent e)
			{
				int keycode=e.getKeyCode();
                               if(keycode==8)
				{
					t.stop();
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Go back to MAIN MENU???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0)
					{
                                                new MainMenu().setVisible(true);
						f.dispose();
                                                try{Runtime.getRuntime().exec("attrib +H "+file+File.separator+"hs.txt");
                                //Runtime.getRuntime().exec("attrib +r"+file+File.separator+"hs.txt");
                                }catch(Exception ex){}
					}
					else
						t.start();}
                                        if(keycode==e.VK_SPACE){
                                        t.stop();
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Snake Game has been PAUSED...\nDo you want to RESUME???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0){
					    t.start();
                                        }}
                        }		
		});
		setVisible(true);   
    	}int val=0;
    @Override
    public void run(){
       while(true)
       {
        if(val<100)
           val+=5;
            try{
                th1.sleep(300);
            }catch(Exception e)
            {}
       }        }
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
	public class MyListener implements ActionListener
	{ 
        @Override
		public void actionPerformed(ActionEvent e)
		{
			if(keycode==37)
			{
				x=x>0?x-20:w-40;
			}
			else if(keycode==39)
			{
				x=x<w-40?x+20:0;
			}
			else if(keycode==38)
			{
				y=y>0?y-20:h-80;
			}
			else if(keycode==40)
			{
				y=y<h-80?y+20:0;
			}
			for(int i=v-1;i>0;i--)
			{
				x1[i]=x1[i-1];
				y1[i]=y1[i-1];		
			}
			x1[0]=x;
			y1[0]=y;
			int k=0;
			for(int i=3;i<v;i++)
			{
				if(x1[0]==x1[i]&&y1[0]==y1[i])
				{
					t.stop();
					l1.setBounds(x1[i],y1[i],20,20);
                                        try{
			                URL url=getClass().getResource("wind1.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
					JOptionPane.showMessageDialog(null,"Game Over, Your Score is "+sco+" !!!");
                                        if(b){
                                            Toolkit.getDefaultToolkit().beep();
                                            JOptionPane.showMessageDialog(null,"Now You Are Snake Master,\nHighest Score is  "+sco+" !!!");
                                        }
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Retry???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0)
					{
						new Stage1(z);
						f.dispose();
					}
                                        else{try{Runtime.getRuntime().exec("attrib +H +r"+file+File.separator+f1);
                                       // Runtime.getRuntime().exec("attrib +r"+file+File.separator+f1);
                                        }catch(Exception ex){}
						System.exit(0);	}		
					k=1;
				}
			}
			for(int i=0;i<v;i++)
			{
				if(k==0)
					larr[i].setBounds(x1[i],y1[i],20,20);
			}
			if(w1==x&&h1==y)
			{    if(z==100) {  
                                sco=sco+5;
                                        if(q==1)
                        {      if(val<25){
                                      sco+=60;
                                     }
                        else if(val<50){
                                        sco+=50;
                                        }
                        else if(val<75){
                                         sco+=40;
                                         }q=0;
                        }}
                             else if(z==85) {  
                                sco=sco+10;
                                     if(q==1)
                        {      if(val<25){
                                      sco+=55;
                                     }
                          else if(val<50){
                                        sco+=45;
                                        }
                          else if(val<75){
                                         sco+=35;
                                         }
                             q=0;
                             }}
                             else if(z==60) {  
                                sco=sco+15;
                        if(q==1)
                        {      if(val<25){
                                      sco+=50;
                                     }
                          else if(val<50){
                                        sco+=40;
                                        }
                          else if(val<75){
                                         sco+=30;
                                         }
                             q=0;}
                        }     if(hs<sco){hs=sco;
                    try{
                        if(!f1.isHidden()||f1.canRead()||f1.canWrite()){
                        ObjectOutputStream dout=new ObjectOutputStream(new FileOutputStream(str));
                    dout.writeObject((sco+""));
                    dout.close();
                    b=true;}
                         }catch(Exception ex){System.out.println(ex);}
                }    
                        l3.setText("                             Your Score is :"+sco +","+"           Highest Score is :"+hs);
                         
                        try{
			                URL url=getClass().getResource("wind3.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
                w1=(20*(int)(28*Math.random()));
				h1=(20*(int)(28*Math.random()));
				if(v==41)
				{
					t.stop();
					try{
			                URL url=getClass().getResource("wind.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
					JOptionPane.showMessageDialog(null,"You have won STAGE-1, Your Score is "+sco+" !!!");
                                      if(b){
                                            Toolkit.getDefaultToolkit().beep();
                                        JOptionPane.showMessageDialog(null,"Now You Are Snake Master,\nHighest Score is  "+sco+" !!!");
                                        }           Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Go to STAGE-2???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0)
					{
                                                new Stage2(z,sco);
						f.dispose();
					}	
                                        else{try{Runtime.getRuntime().exec("attrib +H +r"+file+File.separator+f1);
                                        //Runtime.getRuntime().exec("attrib +r"+file+File.separator+f1);
                                        }catch(Exception ex){}
						System.exit(0);}
				}
				for(int i=0;i<v;i++)
				{
					if(w1==x1[i]&&h1==y1[i])
					{
                                                try{
			                URL url=getClass().getResource("wind3.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
						w1=(20*(int)(28*Math.random()));
						h1=(20*(int)(28*Math.random()));
						i=0;
					}
						
				}		
				if(v<41)
				{   
                                        if(v%5==4)
                                        {
                                            q=1;
                                            val=0;
                                                  try{
                                        
			                URL url=getClass().getResource("wind4.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                         
                                        }catch(Exception ex)
                                        {}
                                            l2.setBounds(w1, h1, 20, 20);
                                            l.setBounds(600, 600, 20, 20);
                                        }
                                        else
                                        {
					l.setBounds(w1,h1,20,20);
                                         l2.setBounds(600, 600, 20, 20);
                                        }
					icon=new ImageIcon(getClass().getResource("green.png"));
					larr[v]= new JLabel(icon);		
					p.add(larr[v++]);		
				}	
			}
                }
	}
	int keycode=37,oldkey=37;
	public class MyListener1 extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{	
			keycode=e.getKeyCode();
			if(keycode>36&&keycode<41)
			{
				if(keycode==39&&oldkey==37)
					keycode=oldkey;
				else if(keycode==37&&oldkey==39)
					keycode=oldkey;
				else if(keycode==38&&oldkey==40)
					keycode=oldkey;
				else if(keycode==40&&oldkey==38)
					keycode=oldkey;
				oldkey=keycode;
			}
			else 
				keycode=oldkey;
		}
	}
	public static void main(String a[])
	{
		//new Stage1(100).setVisible(true);
	}
}		