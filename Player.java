import javax.swing.*;
import java.awt.*;


public class Player{
    public Player(ImageIcon playerIcon, int x, int y){
        this.xLocation = x;
        this.yLocation = y;
        this.playerIcon=playerIcon;
        createPlayer();
    }

    private final int width = 16;
    private final int height = 16;
    private int xLocation;
    private int yLocation;
    private int speed;
    private JLabel player;

    private ImageIcon playerIcon = new ImageIcon("path ");

    public int getxLocation(){
        return this.xLocation;
    }
    public int getyLocation(){
        return this.yLocation;
    }
    public int getSpeed(){
        return this.speed;
    }
    public JLabel getPlayer(){
        return this.player;
    }
    public void setxLocation(int x){
        this.xLocation = x;
    }
    public void setyLocation(int y){
        this.yLocation = y;
    }
    public void createPlayer(){
        JLabel player = new JLabel();
        player.setBounds(this.xLocation, this.yLocation, width, height);
        player.setIcon(this.playerIcon);
    }
    public void shoot(){
       // Bullets z = new Bullets();

    }






}
