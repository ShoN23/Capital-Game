import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hard extends JFrame{
   private JButton A1Button;
   private JButton B1Button;
   private JButton C1Button;
   private JButton D1Button;
   private JButton back1; 
   private JButton result;

   public Hard() {   
      String [][] hard = 
    	  			{
      {"Russia","Georgia","Azerbaijan","Armenia",  "Turkey",  "Cyprus", "Lebanon",   "Israel",   "Syria",   "Saudi Arabia"," Yemen","Oman",  "Jordan",
    	 "United Arab Emirates","Qatar","Bahrain","Kuwait","Iraq","Iran","Turkmenistan","Afganistan","Tajikistan","Pakistan","Uzbekistan","Kyrgyzstan",
    	 "Kazakhstan","India","Maldives","Sri Lanka","Nepal","Bhutan","Bangladesh","Myanmar","Thailand","Malaysia","Singapore","Indonesia"," Brunei Bandar",
    	 "Cambodia","Laos","Vietnam","Philippeans","Taiwan","China","North Korea","South Korea","Japan"},
      {"Moscow","Tbilis", "Baku",      "Yerevan",  "Ankara",  "Nicosia","Beirut",    "Jerusalem","Damascus",  "Riyadh",     "Sanaa","Muscat","Amman",
    	"Abu Dhari","Doha","Manama","Kuwait","Baghdad","Tehran","Ashkhabad","Kabul","Dushanbe","Islamabad","Tashkent","Bishkek",
    	"Astana","New Delhi","Male","Colombo","Kathmandu","Thimphu","Dhaka","Yangoon","Bangkok","Kuala Lumpur","Singapore","Jakarta","Seri Begawan",
    	"Phnom Penh","Vietiane","Hanoi","Manila","T'aipei","Beijing","P'yongyang","Seoul","Tokyo"}
      				};	
      Ranking sc=new Ranking();
      sc.setVisible(false);
      Random rand = new Random();
      
      int  a = rand.nextInt(50);    
      int  s = rand.nextInt(50);
      int  p = rand.nextInt(50);
      int  v = rand.nextInt(50);
      int  u = rand.nextInt(50);
      
     
      if(a>=38)
      {
     	
     	 a=s;
      }
      else if(a<37 && a>25)
      {
     	
     	 a=p;
      }
      else if(a<=25 && a>13)
      {
     	 
     	 a=u;
      }
      else
      {
     	 
     	 a=v;
      }
         
      this.setLayout(null);
      JLabel mainques1 = new JLabel("What is the capital of "+hard[0][a], JLabel.CENTER);
      Font bigfont = new Font("",Font.PLAIN, 50);
      Font modfont=  new Font("",Font.PLAIN,25);
      mainques1.setFont(bigfont);
   
      int r;
      r=a;
      
      A1Button=new JButton(hard[1][s]);
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
     		}, 1000);
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
     		}, 1000);
     	 }
     	
      });


      B1Button=new JButton(hard[1][p]);
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
     		sc.score++;
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

      C1Button=new JButton(hard[1][u]);
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
     		 sc.score++;
     		 
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

      D1Button=new JButton(hard[1][v]);
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
     		 sc.score++;
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
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(1010,700);
      setVisible(true);
      
   }

}
         