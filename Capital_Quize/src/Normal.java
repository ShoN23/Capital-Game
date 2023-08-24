
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Normal extends JFrame{
   private JButton A1Button;
   private JButton B1Button;
   private JButton C1Button;
   private JButton D1Button;
   private JButton back1; 
   private JButton result; 

   public Normal() {   
      String [][] normal = 
    	  			{
      {"Russia","Georgia","Azerbaijan","Armenia",  "Turkey",  "Cyprus", "Lebanon",   "Israel",   "Syria",   "Saudi Arabia"," Yemen","Oman",  "Jordan",
    	 "United Arab Emirates","Qatar","Bahrain","Kuwait","Iraq","Iran","Turkmenistan","Afganistan","Tajikistan","Pakistan","Uzbekistan","Kyrgyzstan",
    	 "Kazakhstan","India","Maldives","Sri Lanka","Nepal"},
      {"Moscow","Tbilis", "Baku","Yerevan",  "Ankara",  "Nicosia","Beirut",    "Jerusalem","Damascus",  "Riyadh",     "Sanaa","Muscat","Amman",
    	"Abu Dhari","Doha","Manama","Kuwait","Baghdad","Tehran","Ashkhabad","Kabul","Dushanbe","Islamabad","Tashkent","Bishkek",
    	"Astana","New Delhi","Male","Colombo","Kathmandu"}
      				};	
      Ranking sc=new Ranking();
      sc.setVisible(false);
      Random rand = new Random();
      
      int  a = rand.nextInt(30);    
      int  s = rand.nextInt(30);
      int  p = rand.nextInt(30);
      int  v = rand.nextInt(30);
      int  u = rand.nextInt(30);
      
     
      if(a>=23)
      {
     	
     	 a=s;
      }
      else if(a<=22 && a>14)
      {
     	
     	 a=p;
      }
      else if(a<=14 && a>7)
      {
     	 
     	 a=u;
      }
      else
      {
     	 
     	 a=v;
      }
      

      this.setLayout(null);
      JLabel mainques1 = new JLabel("What is the capital of "+normal[0][a], JLabel.CENTER);
      Font bigfont = new Font("",Font.PLAIN, 50);
      Font modfont=  new Font("",Font.PLAIN,25);
      mainques1.setFont(bigfont);
   
      int r;
      r=a;
      
      A1Button=new JButton(normal[1][s]);
      A1Button.setFont(modfont);
      A1Button.setBounds(200, 280, 170, 80);
      A1Button.addActionListener(e->{
     	 if(r==s)
     	 {
     		 A1Button.setBackground(Color.green);
     		new Timer().schedule(new TimerTask() {          
     		    public void run() {
     		    setVisible(false);
    		    EasyP e=new EasyP();
     		    }
     		}, 700);
     		 
    		sc.score++;
     	 }
     	 else
     	 {
     		 A1Button.setBackground(Color.red);
     		new Timer().schedule(new TimerTask() {          
     		    public void run() {
     		    setVisible(false);
    		    EasyP e=new EasyP();
     		    }
     		}, 700);
     	 }
     	
      });


      B1Button=new JButton(normal[1][p]);
      B1Button.setFont(modfont);
      B1Button.setBounds(450, 280, 170, 80);
      B1Button.addActionListener(e->{
     	 if(r==p)
     	 {
     		 B1Button.setBackground(Color.green);
     		new Timer().schedule(new TimerTask() {          
     		    public void run() {
     		    setVisible(false);
    		    EasyP e=new EasyP();
     		    }
     		}, 700);
     	 }
     	 else
     	 {
     		 B1Button.setBackground(Color.red);
     		new Timer().schedule(new TimerTask() {          
     		    public void run() {
     		    setVisible(false);
    		    EasyP e=new EasyP();
     		    }
     		}, 700);
     	 }
     	
      });

      C1Button=new JButton(normal[1][u]);
      C1Button.setFont(modfont);
      C1Button.setBounds(200, 390, 170, 80);
      C1Button.addActionListener(e->{
     	 if(r==u)
     	 {
     		 C1Button.setBackground(Color.green);
     		new Timer().schedule(new TimerTask() {          
     		    public void run() {
     		    setVisible(false);
    		    EasyP e=new EasyP();
     		    }
     		}, 700);
     		 
     	 }
     	 else
     	 {
     		 C1Button.setBackground(Color.red);
     		new Timer().schedule(new TimerTask() {          
     		    public void run() {
     		    setVisible(false);
    		    EasyP e=new EasyP();
     		    }
     		}, 700);
     	 }
     	
      });

      D1Button=new JButton(normal[1][v]);
      D1Button.setFont(modfont);
      D1Button.setBounds(450, 390, 170, 80);
      D1Button.addActionListener(e->{
     	 if(r==v)
     	 {
     		 D1Button.setBackground(Color.green);
     		new Timer().schedule(new TimerTask() {          
     		    public void run() {
     		    setVisible(false);
    		    EasyP e=new EasyP();
     		    }
     		}, 700);		
     	 }
     	 else
     	 {
     		 D1Button.setBackground(Color.red);
     		new Timer().schedule(new TimerTask() {          
     		    public void run() {
     		    setVisible(false);
    		    EasyP e=new EasyP();
     		    }
     		}, 700);
     	 }
     	
      });
      
      back1=new JButton("back");
      back1.setFont(modfont);
      back1.setBounds(610, 550, 100, 40);
      back1.addActionListener(e->{

         this.dispose();
         GameFrame game = new GameFrame();

      });

      result=new JButton("Result");
      result.setFont(modfont);
      result.setBounds(90, 550, 200, 40);
     
      result.addActionListener(e->{
     	 this.dispose();
     	 Ranking game=new Ranking();
     	
      });
      
      mainques1.setBounds(30, 80, 800, 200);
      add(mainques1);
      add(A1Button);
      add(B1Button);
      add(C1Button);
      add(D1Button);
      add(back1);
      add(result);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(1010,700);
      setVisible(true);
      
   }

}