import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameFrame extends JFrame{
   private JButton AButton;
   private JButton BButton;
   private JButton CButton;
   private JButton DButton;
   private JButton back; 
   
   public GameFrame(){
      this.setLayout(null);
     JLabel mainques=new JLabel("Select level of difficulty",JLabel.CENTER);
      Font bigfont = new Font("",Font.PLAIN, 50);
     
      mainques.setFont(bigfont);
       Font modfont=new Font("",Font.PLAIN,25);
       // these are level buttons
      AButton=new JButton("Easy");
      AButton.setFont(modfont);
      AButton.setBounds(200, 280, 180, 80);
      AButton.addActionListener(e->{
         setVisible(false);
         EasyP game = new EasyP();
         game.setVisible(true);
      });
      
      BButton=new JButton("NORMAL");
      BButton.setFont(modfont);
      BButton.setBounds(450, 280, 180, 80);
      BButton.addActionListener(e->{
    	  setVisible(false);
    	  Normal n=new Normal();
    	  n.setVisible(true);
      });
      
      CButton=new JButton("HARD");
      CButton.setFont(modfont);
      CButton.setBounds(200, 380, 180, 80);
      CButton.addActionListener(e->{
    	  setVisible(false);
    	  Hard h=new Hard();
    	  h.setVisible(true);
      });
      
      DButton=new JButton("EXAMPLE");
      DButton.setFont(modfont);
      DButton.setBounds(450, 380, 180, 80);
      
      back=new JButton("back");
      back.setFont(modfont);
      back.setBounds(680, 480, 100, 40);
      back.addActionListener(e->{
         
         this.dispose();
         FrontPanel p=new FrontPanel();
         p.setVisible(true);
      });
      
      
     
      mainques.setBounds(30, 80, 800, 200);
      add(mainques);
      add(AButton);
      add(BButton);
      add(CButton);
      add(DButton);
      add(back);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(1010,700);
      setVisible(true);
      
      
      
   }
}
