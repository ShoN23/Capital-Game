import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class FrontPanel extends JFrame {
   private JButton playButton;
   private JButton quitButton;
   private ButtonGroup numstates;
   public FrontPanel() {
      this.setLayout(null);
      JLabel title = new JLabel("Welcome to the Country Quiz!", JLabel.CENTER);
      Font titleFont = new Font("",Font.PLAIN, 50);
      title.setFont(titleFont);

      Font modeFont = new Font("", Font.PLAIN, 25);
      playButton=(new JButton("Play"));
      playButton.setFont(modeFont);
      playButton.addActionListener(e->{
         setVisible(false);
         GameFrame game = new GameFrame();
         game.setVisible(true);
      });
      quitButton=(new JButton("Quit"));
      quitButton.setFont(modeFont);
      quitButton.addActionListener(e->{
         System.exit(0);
      });
      
      numstates = new ButtonGroup();
      title.setBounds(100, 80, 800, 200);
      playButton.setBounds(270, 280, 200, 100);
      quitButton.setBounds(550, 280, 200, 100);
      add(title);
      add(playButton);
      add(quitButton);
      add(playButton);
      add(quitButton);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(1010,700);
      setVisible(true);

   }
   public static void main(String[] args) {

      FrontPanel p=new FrontPanel();
   }

}
	
	
