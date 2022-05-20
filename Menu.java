import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
    JFrame frame = new JFrame();
    JButton startGameButton = new JButton("Start Game");
    JButton showScoreButton = new JButton("High Score");
    JButton instructionsButton = new JButton("Instructions");
    JButton quitGameButton = new JButton("Quit");

    public Menu(){
        startGame();
        gameScore();
        gameInstructions();
        quit();

        frame.add(startGameButton);
        frame.add(showScoreButton);
        frame.add(instructionsButton);
        frame.add(quitGameButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    public void startGame(){
        startGameButton.setBounds(100, 160, 200, 40);
        startGameButton.setFocusable(false);
        startGameButton.addActionListener(this);
    }
    public void gameScore(){
        showScoreButton.setBounds(100, 210, 200, 40);
        showScoreButton.setFocusable(false);
        showScoreButton.addActionListener(this);
    }
    public void gameInstructions(){
        instructionsButton.setBounds(100, 260, 200, 40);
        instructionsButton.setFocusable(false);
        instructionsButton.addActionListener(this);
    }
    public void quit(){
        quitGameButton.setBounds(100, 310, 200, 40);
        quitGameButton.setFocusable(false);
        quitGameButton.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==startGameButton){
            frame.dispose();
             Game game = new Game();
        }
        else if (e.getSource() == showScoreButton){
            frame.dispose();
            //instance
        }
        else if (e.getSource() == instructionsButton){
            frame.dispose();
            GameInstructions gi = new GameInstructions();
        }
        else if (e.getSource() == quitGameButton){
            frame.dispose();

        }

    }
}
