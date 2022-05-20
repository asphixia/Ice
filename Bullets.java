import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Bullets {
    private int bulletX;
    private int bulletY;
    Image img;
    boolean visible;

    public Bullets(int x, int y){
        this.bulletX = x;
        this.bulletY = y;
        ImageIcon newBullet = new ImageIcon("C:\\Users\\william hansen\\Desktop\\ice images\\fireball.png");
        img = newBullet.getImage();
        visible = true;
    }
    public void move(){
        bulletY = bulletY-10;
        if (bulletY < 10){
            visible = false;
        }
    }
    public int getX(){
        return bulletX;
    }
    public int getY{
        return bulletY;
    }
    public void tick(){
        bulletY -= 10;
    }
    public void draw(Graphics g){
        //g.drawImage();

    }

}
