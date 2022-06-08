import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Player{
    public Player(){
        createPlayer();
    }

    private final int playerWidth = 100;
    private final int playerHeight = 100;
    private int playerX = 210;
    private int playerY = 350;
    public JLabel playerLabel = new JLabel();
    String playerIcon = "C:\\Users\\william hansen\\Desktop\\ice images\\PlayerTest.png";



    public int getPlayerY(){
        return this.playerY;
    }
    public int getPlayerX(){
        return this.playerX;
    }
    public void setPlayerX(int x){
        this.playerX = x;
    }
    public void setPlayerY(int y){
        this.playerY = y;
    }
    public void createPlayer(){
        playerLabel.setIcon(new ImageIcon(playerIcon));
        playerLabel.setBounds(playerX, playerY, playerWidth, playerHeight);
    }
}
