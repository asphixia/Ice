import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Game extends JFrame implements KeyListener {
    JLabel pC;
    Player player = new Player();



    public Game() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.BLACK);




        this.add(player.playerLabel);



        ScoreBoard board = new ScoreBoard();
        this.add(board.sc);

        Enemy enemy = new Enemy();
        this.add(enemy.enemyLabel);

    }
    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()) {
            case 'a':
                player.playerLabel.setLocation(player.playerLabel.getX()-10, player.playerLabel.getY());
                    break;
            case 'w':
                player.playerLabel.setLocation(player.playerLabel.getX(), player.playerLabel.getY() - 10);
                    break;
            case 's':
                player.playerLabel.setLocation(player.playerLabel.getX(), player.playerLabel.getY() + 10);
                    break;
            case 'd':
                player.playerLabel.setLocation(player.playerLabel.getX() + 10, player.playerLabel.getY());
                    break;
        }

    }
    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}


