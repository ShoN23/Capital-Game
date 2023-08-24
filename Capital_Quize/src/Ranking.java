import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ranking extends JFrame {
   private JLabel title;
   private JButton newgameButton;
   private JButton exitButton;
   public int score;
   public Ranking() {
	
      this.setLayout(null);
      title= new JLabel("Correct answer -> "+score,JLabel.CENTER);
      
      Font titleFont = new Font("",Font.PLAIN, 50);
      title.setFont(titleFont);

      Font modeFont = new Font("", Font.PLAIN, 25);
      newgameButton=(new JButton("New Game"));
      newgameButton.setFont(modeFont);
      newgameButton.addActionListener(e->{
         setVisible(false);
         GameFrame game = new GameFrame();
         game.setVisible(true);
      });
      exitButton=(new JButton("Exit"));
      exitButton.setFont(modeFont);
      exitButton.addActionListener(e->{
         System.exit(0);
      });
      
     
      title.setBounds(100, 80, 800, 200);
      newgameButton.setBounds(270, 280, 200, 100);
      exitButton.setBounds(550, 280, 200, 100);
      add(title);
      add(newgameButton);
      add(exitButton);
      add(newgameButton);
      add(exitButton);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(1010,700);
      setVisible(true);

   }
   public int getScore() {
       return score;
   }

  
}
	
	
