import javax.swing.*;
import java.awt.*;

public class ScoreBoard {
    private int score = 0;
    JLabel sc;

    public ScoreBoard(){
        displayScore();

    }
    public void displayScore(){
        sc = new JLabel("Score: " + score);
        sc.setBounds(0, 0, 600, 50);
        sc.setFont(new Font(null, Font.PLAIN,25));
        sc.setForeground(Color.WHITE);

    }

}
