


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
public class Stage2 extends JFrame implements Runnable
{
	JFrame f;
	JPanel p;
	JLabel l,l1,l2,l3;
        boolean bo=false;
	int w=595,h=619,x=280,y=100,sw,sh,w1,h1,sco,q=0,hs=0;
	Timer t;
        Thread th1;
        int z;
	int v=5;
        double angle=270;
	ImageIcon icon,icon1,icon2;
	JLabel larr[]=new JLabel[36];
	int x1[]=new int[36];
	int y1[]=new int[36];
        File file=new File(System.getProperty("user.dir")+File.separator+"r@nd0#$%^&"+File.separator+"dks"+File.separator+"hs");
         File f1=new File("hs.txt");
         String str=file+File.separator+f1;
	JLabel larr1[]=new JLabel[30];
	int x2[]=new int[30];
	int y2[]=new int[30];
	JLabel larr2[]=new JLabel[30];
	int x3[]=new int[30];
	int y3[]=new int[30];
	JLabel larr3[]=new JLabel[30];
	int x4[]=new int[30];
	int y4[]=new int[30];
	JLabel larr4[]=new JLabel[30];
	int x5[]=new int[30];
	int y5[]=new int[30];
	public Stage2(final int n,int o)
	{
		super("Snake Game::STAGE-2");
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
                sco=o;
		f=this;
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		sw=(int)(d.getWidth());
		sh=(int)(d.getHeight());
		setSize(w,h);
		setLocation((sw-w)/2,(sh-h)/2);
                th1=new Thread(this);
                 th1.start();
                 addKeyListener(new MyListener1());
                addKeyListener(new MyClass());
                setResizable(false);  
                for(int i=0;i<v;i++)
		{
			x1[i]=280+20*i;
			y1[i]=100;
		}
		setVisible(true);
		p=new JPanel();
		p.setBackground(new Color(100,130,160));
		p.setLayout(null);
		      larr[0]=new JLabel(new ImageIcon(getClass().getResource("apple.png")))
                {
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
		w1=(20*(int)(25*Math.random()+1));
		h1=(20*(int)(25*Math.random()+1));
		l=new JLabel(icon);
		l.setBounds(w1,h1,20,20);
		p.add(l);
                l3=new JLabel();
		l3.setBounds(0,560,595,20);
                p.add(l3);
                try{
                ObjectInputStream fin=new ObjectInputStream(new FileInputStream(str));
            //byte b[]=new byte[fin.available()];
                String chs = (String)fin.readObject();
                //String chs=new String(b);
                hs=Integer.parseInt(chs);
                }catch(Exception e){}
                l3.setText("                             Your Score is :"+sco +","+"           Highest Score is :"+hs);
                //l3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                Font f1=new Font("Tahoma",Font.BOLD,15);
                l3.setFont(f1);
                l3.setOpaque(false);
		icon1=new ImageIcon(getClass().getResource("blood.jpg"));
		l1=new JLabel(icon1);
		p.add(l1);
                icon=new ImageIcon(getClass().getResource("green1.png"));
                l2=new JLabel(icon);
		p.add(l2);
		add(p);
		icon2=new ImageIcon(getClass().getResource("blood1.jpg"));
		for(int i=0;i<28;i++)
		{
			x2[i]=20*i;
			y2[i]=0;
		}
		for(int i=0;i<28;i++)
		{
			larr1[i]=new JLabel(icon2);
			larr1[i].setBounds(x2[i],y2[i],20,20);
			p.add(larr1[i]);
		}
		for(int i=0;i<28;i++)
		{
			x3[i]=20*i;
			y3[i]=540;
		}
		for(int i=0;i<28;i++)
		{
			larr2[i]=new JLabel(icon2);
			larr2[i].setBounds(x3[i],y3[i],20,20);
			p.add(larr2[i]);
		}
		for(int i=0;i<28;i++)
		{
			x4[i]=0;
			y4[i]=20*i;
		}
		for(int i=0;i<28;i++)
		{
			larr3[i]=new JLabel(icon2);
			larr3[i].setBounds(x4[i],y4[i],20,20);
			p.add(larr3[i]);
		}
		for(int i=0;i<28;i++)
		{
			x5[i]=560;
			y5[i]=20*i;
		}
		for(int i=0;i<28;i++)
		{
			larr4[i]=new JLabel(icon2);
			larr4[i].setBounds(x5[i],y5[i],20,20);
			p.add(larr4[i]);
		}
                
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
			public void windowClosing(WindowEvent e)
			{
				t.stop();
                                Toolkit.getDefaultToolkit().beep();
				int opt=JOptionPane.showOptionDialog(f,"Are you sure to EXIT???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
				if(opt==0){
                                    try{Runtime.getRuntime().exec("attrib +H +r"+file+File.separator+"hs.txt");
                                //Runtime.getRuntime().exec("attrib +r"+file+File.separator+"hs.txt");
                                }catch(Exception ex){}
					System.exit(0);}
				else
					t.start();
			}
		});
		addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e)
			{
				int keycode=e.getKeyCode();
				if(keycode==8)
				{
					t.stop();
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Are you sure to go back to MAIN MENU???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0)
					{
                                                new MainMenu().setVisible(true);				
						f.dispose();
                                                try{Runtime.getRuntime().exec("attrib +H "+file+File.separator+"hs.txt");
                                //Runtime.getRuntime().exec("attrib +r"+file+File.separator+"hs.txt");
                                }catch(Exception ex){}
					}
					else
						t.start();
                                }
                                if(keycode==e.VK_SPACE){
                                        t.stop();
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Snake Game has been PAUSED...\nDo you want to RESUME???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0){
					    t.start();
                                        }
			}}
		});
		setVisible(true);
	}
        int val=0;
        boolean b=true;
    public void run(){
       while(b)
       {
        if(val<100)
           val+=5;
            try{
                th1.sleep(250);
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
				y=y>0?y-20:h-60;
			}
			else if(keycode==40)
			{
				y=y<h-60?y+20:0;
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
					l1.setBounds(x1[0],y1[0],20,20);
					try{
			                URL url=getClass().getResource("wind1.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
					JOptionPane.showMessageDialog(null,"Game Over, Your Score is "+sco+" !!!");
                                        if(bo){
                                            Toolkit.getDefaultToolkit().beep();
                                        JOptionPane.showMessageDialog(null,"Now You Are Snake Master,\nHighest Score is  "+sco+" !!!");
                                        }
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Retry???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0)
					{
                                                new Stage2(z,0);
						f.dispose();
					}
					else{try{Runtime.getRuntime().exec("attrib +H +r"+file+File.separator+f1);
                                        //Runtime.getRuntime().exec("attrib +r"+file+File.separator+f1);
                                        }catch(Exception ex){}
						System.exit(0);	}		
					k=1;
				}
			}
			for(int i=0;i<30;i++)
			{
				if(x1[0]==x2[i]&&y1[0]==y2[i])
				{
					t.stop();
					l1.setBounds(x2[i],y2[i],20,20);
					try{
			                URL url=getClass().getResource("wind1.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
					JOptionPane.showMessageDialog(null,"Game Over, Your Score is "+sco+" !!!");
                                        if(bo){
                                            Toolkit.getDefaultToolkit().beep();
                                        JOptionPane.showMessageDialog(null,"Now You Are Snake Master,\nHighest Score is  "+sco+" !!!");
                                        }
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Retry???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0)
					{
						new Stage2(z,0);
						f.dispose();
					}
					else{try{Runtime.getRuntime().exec("attrib +H +r"+file+File.separator+f1);
                                       // Runtime.getRuntime().exec("attrib +r"+file+File.separator+f1);
                                        }catch(Exception ex){}
						System.exit(0);	}		
					k=1;
				}
			}
			for(int i=1;i<30;i++)
			{
				if(x1[0]==x4[i]&&y1[0]==y4[i])
				{
					t.stop();
					l1.setBounds(x4[i],y4[i],20,20);
                                        try{
			                URL url=getClass().getResource("wind1.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
					JOptionPane.showMessageDialog(null,"Game Over, Your Score is "+sco+" !!!");
                                        if(bo){
                                            Toolkit.getDefaultToolkit().beep();
                                        JOptionPane.showMessageDialog(null,"Now You Are Snake Master,\nHighest Score is  "+sco+" !!!");
                                        }
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Retry???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0)
					{
						new Stage2(z,0);
						f.dispose();
					}
					else{try{Runtime.getRuntime().exec("attrib +H +r"+file+File.separator+f1);
                                        //Runtime.getRuntime().exec("attrib +r"+file+File.separator+f1);
                                        }catch(Exception ex){}
						System.exit(0);	}		
					k=1;
				}
			}
			for(int i=0;i<30;i++)
			{
				if(x1[0]==x3[i]&&y1[0]==y3[i])
				{
					t.stop();
					l1.setBounds(x3[i],y3[i],20,20);
					try{
			                URL url=getClass().getResource("wind1.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
					JOptionPane.showMessageDialog(null,"Game Over, Your Score is "+sco+" !!!");
                                        if(bo){
                                            Toolkit.getDefaultToolkit().beep();
                                        JOptionPane.showMessageDialog(null,"Now You Are Snake Master,\nHighest Score is  "+sco+" !!!");
                                        }
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Retry???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0)
					{
						new Stage2(z,0);
						f.dispose();
					}
					else{try{Runtime.getRuntime().exec("attrib +H +r"+file+File.separator+f1);
                                        //Runtime.getRuntime().exec("attrib +r"+file+File.separator+f1);
                                        }catch(Exception ex){}
						System.exit(0);	}		
					k=1;
				}
			}
			for(int i=1;i<30;i++)
			{
				if(x1[0]==x5[i]&&y1[0]==y5[i])
				{
					t.stop();
					l1.setBounds(x5[i],y5[i],20,20);
					try{
			                URL url=getClass().getResource("wind1.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
					JOptionPane.showMessageDialog(null,"Game Over, Your Score is "+sco+" !!!");
                                        if(bo){
                                        JOptionPane.showMessageDialog(null,"Now You Are Snake Master,\nHighest Score is  "+sco+" !!!");
                                        Toolkit.getDefaultToolkit().beep();
                                        }
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Retry???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0)
					{
						new Stage2(z,0);
						f.dispose();
					}
					else{try{Runtime.getRuntime().exec("attrib +H +r"+file+File.separator+f1);
                                        //Runtime.getRuntime().exec("attrib +r"+file+File.separator+f1);
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
			{			    if(z==100) {  
                                sco=sco+6;
                                        if(q==1)
                        {      if(val<25){
                                      sco+=60;
                                     }
                          else if(val<50){
                                        sco+=50;
                                        }
                          else if(val<75){
                                         sco+=40;
                                         }
                        q=0;
                        }}
                             else if(z==85) {  
                                sco=sco+11;
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
                                sco=sco+16;
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
                        } if(hs<sco){hs=sco;
                    try{
                        if(!f1.isHidden()||f1.canRead()||f1.canWrite()){
                        ObjectOutputStream dout=new ObjectOutputStream(new FileOutputStream(str));
                    dout.writeObject((sco+""));
                    dout.close();
                    bo=true;}
                         }catch(Exception ex){System.out.println(ex);}
                }    
                        l3.setText("                             Your Score is :"+sco +","+"           Highest Score is :"+hs);
                                 
                        try{
			                URL url=getClass().getResource("wind3.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
				w1=(20*(int)(25*Math.random()+1));
				h1=(20*(int)(25*Math.random()+1));
				if(v==36)
				{
					t.stop();
					try{
			                URL url=getClass().getResource("wind.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
					JOptionPane.showMessageDialog(null,"You have won STAGE-2, Your Score is "+sco+" !!!");
                                        if(bo){
                                            Toolkit.getDefaultToolkit().beep();
                                        JOptionPane.showMessageDialog(null,"Now You Are Snake Master,\nHighest Score is  "+sco+" !!!");
                                        }
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Go to STAGE-3???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0)
					{
                                                new Stage3(z,sco);
						f.dispose();
					}
					else{try{Runtime.getRuntime().exec("attrib +H +r"+file+File.separator+f1);
                                       // Runtime.getRuntime().exec("attrib +r"+file+File.separator+f1);
                                        }catch(Exception ex){}
						System.exit(0);	}		
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
						w1=(20*(int)(27*Math.random()));
						h1=(20*(int)(27*Math.random()));
						i=0;
					}
						
				}
				if(v<36)
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
		//new Stage2(100,0);
	}
}		