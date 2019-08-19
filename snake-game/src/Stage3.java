


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.*;
import java.io.*;
import java.net.URL;
import javax.imageio.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class Stage3 extends JFrame implements Runnable
{
	JFrame f;
	JPanel p;
	JLabel l,l1,l2,l3;
        boolean bo=false;
	int w=600,h=620,x=280,y=100,sw,sh,w1,h1,sco,q=0,hs=0;
	Timer t;
        Thread th1;
        int v=5;
	double angle=270;
	ImageIcon icon,icon1,icon2;
	JLabel larr[]=new JLabel[36];
	int x1[]=new int[36];
	int y1[]=new int[36];
	JLabel larr5[]=new JLabel[13];
	int x6[]=new int[13];
	int y6[]=new int[13];
        File file=new File(System.getProperty("user.dir")+File.separator+"r@nd0#$%^&"+File.separator+"dks"+File.separator+"hs");
         File f1=new File("hs.txt");
         String str=file+File.separator+f1;
	JLabel larr6[]=new JLabel[13];
	int x7[]=new int[13];
	int y7[]=new int[13];
	JLabel larr7[]=new JLabel[12];
	int x8[]=new int[12];
	int y8[]=new int[12];
	JLabel larr8[]=new JLabel[12];
	int x9[]=new int[12];
	int y9[]=new int[12];
	int z;
	public Stage3(final int n,int o)
	{
		super("Snake Game::STAGE-3");
                file.mkdirs();
                file.setReadOnly();
                //f1.setReadOnly();
                try{Runtime.getRuntime().exec("attrib -r -H "+file+File.separator+f1);
               // Runtime.getRuntime().exec("attrib -r"+file+File.separator+f1);
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
                setResizable(false);  
                th1=new Thread(this);
                 th1.start();
                 addKeyListener(new MyClass());
                addKeyListener(new MyListener1());
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
		w1=(20*(int)(27*Math.random()+1));
		h1=(20*(int)(26*Math.random()+1));
		l=new JLabel(icon);
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
                Font f1=new Font("Tahoma",Font.BOLD,15);
                l3.setFont(f1);
                //l3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                l3.setOpaque(false);
		icon1=new ImageIcon(getClass().getResource("blood.jpg"));
		l1=new JLabel(icon1);
		p.add(l1);
                icon=new ImageIcon(getClass().getResource("green1.png"));
                l2=new JLabel(icon);
		p.add(l2);
		icon2=new ImageIcon(getClass().getResource("blood1.jpg"));
		for(int i=0;i<13;i++)
		{
			x6[i]=160+20*i;
			y6[i]=80;
		}
		for(int i=0;i<13;i++)
		{
			larr5[i]=new JLabel(icon2);
			larr5[i].setBounds(x6[i],y6[i],20,20);
			p.add(larr5[i]);
		}
		for(int i=0;i<13;i++)
		{
			x7[i]=160+20*i;
			y7[i]=460;
		}
		for(int i=0;i<13;i++)
		{
			larr6[i]=new JLabel(icon2);
			larr6[i].setBounds(x7[i],y7[i],20,20);
			p.add(larr6[i]);
		}
		for(int i=0;i<12;i++)
		{
			x8[i]=80;
			y8[i]=160+20*i;
		}
		for(int i=0;i<12;i++)
		{
			larr7[i]=new JLabel(icon2);
			larr7[i].setBounds(x8[i],y8[i],20,20);
			p.add(larr7[i]);
		}
		for(int i=0;i<12;i++)
		{
			x9[i]=480;
			y9[i]=160+20*i;
		}
		for(int i=0;i<12;i++)
		{
			larr8[i]=new JLabel(icon2);
			larr8[i].setBounds(x9[i],y9[i],20,20);
			p.add(larr8[i]);
		}
		for(int i=0;i<13;i++)
		{
			while((w1==x6[i]&&h1==y6[i])||(w1==x7[i]&&h1==y7[i]))
			{
				w1=(20*(int)(27*Math.random()+1));
				h1=(20*(int)(26*Math.random()+1));
				i=0;
			}
		}
		for(int i=0;i<12;i++)
		{
			while((w1==x8[i]&&h1==y8[i])||(w1==x9[i]&&h1==y9[i]))
			{
				w1=(20*(int)(27*Math.random()+1));
				h1=(20*(int)(26*Math.random()+1));
				i=0;
			}
		}
                
		t=new Timer(z,new MyListener());
		t.start();
		l.setBounds(w1,h1,20,20);
		add(p);
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
				if(opt==0){try{Runtime.getRuntime().exec("attrib +H +r"+file+File.separator+"hs.txt");
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
					}
			}
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
						new Stage3(z,0);
						f.dispose();
					}
					else{try{Runtime.getRuntime().exec("attrib +H +r"+file+File.separator+f1);
                                        //Runtime.getRuntime().exec("attrib +r"+file+File.separator+f1);
                                        }catch(Exception ex){}
						System.exit(0);	}		
					k=1;
				}
			}
			for(int i=0;i<13;i++)
			{
				if((x1[0]==x6[i]&&y1[0]==y6[i])||(x1[0]==x7[i]&&y1[0]==y7[i]))
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
						new Stage3(z,0);
						f.dispose();
					}
					else{try{Runtime.getRuntime().exec("attrib +H +r"+file+File.separator+f1);
                                        //Runtime.getRuntime().exec("attrib +r"+file+File.separator+f1);
                                        }catch(Exception ex){}
						System.exit(0);	}		
					k=1;
				}
			}
			for(int i=0;i<12;i++)
			{
				if((x1[0]==x8[i]&&y1[0]==y8[i])||(x1[0]==x9[i]&&y1[0]==y9[i]))
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
						new Stage3(z,0);
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
			{       if(z==100) {  
                                sco=sco+7;
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
                                sco=sco+12;
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
                                sco=sco+17;
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
				w1=(20*(int)(27*Math.random()+1));
				h1=(20*(int)(26*Math.random()+1));
				if(v==36)
				{
					t.stop();
					try{
			                URL url=getClass().getResource("wind.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
					JOptionPane.showMessageDialog(null,"You have won STAGE-3, Your Score is "+sco+" !!!");
                                        if(bo){
                                            Toolkit.getDefaultToolkit().beep();
                                        JOptionPane.showMessageDialog(null,"Now You Are Snake Master,\nHighest Score is  "+sco+" !!!");
                                        }
                                        Toolkit.getDefaultToolkit().beep();
					int opt=JOptionPane.showOptionDialog(f,"Go to STAGE-4???","Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					if(opt==0)
					{
                                                new Stage4(z,sco);
						f.dispose();
					}
					else{try{Runtime.getRuntime().exec("attrib +H +r"+file+File.separator+f1);
                                        //Runtime.getRuntime().exec("attrib +r"+file+File.separator+f1);
                                        }catch(Exception ex){}
						System.exit(0);	}		
				}
				for(int i=0;i<13;i++)
				{
					while((w1==x6[i]&&h1==y6[i])||(w1==x7[i]&&h1==y7[i]))
					{
                                                try{
			                URL url=getClass().getResource("wind3.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
						w1=(20*(int)(27*Math.random()+1));
						h1=(20*(int)(26*Math.random()+1));
						i=0;			
					}	
				}
				for(int i=0;i<12;i++)
				{
					while((w1==x8[i]&&h1==y8[i])||(w1==x9[i]&&h1==y9[i]))
					{
                                                try{
			                URL url=getClass().getResource("wind3.wav");
                                         AudioStream stream=new AudioStream(url.openStream());
                                         AudioPlayer.player.start(stream);
                                        }catch(Exception ex)
                                        {}
						w1=(20*(int)(27*Math.random()+1));
						h1=(20*(int)(26*Math.random()+1));
						i=0;
					}
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
						w1=(20*(int)(27*Math.random()+1));
						h1=(20*(int)(26*Math.random()+1));
						i=0;
					}
						
				}
				if(v<36)
				{
                                        if(v%5==4)
                                        {
                                                               q=1;
                                            val=0;                                  try{
                                                
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
		//new Stage3(100,0);
	}
}		