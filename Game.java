import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Game extends JFrame implements KeyListener {
    JLabel label = new JLabel();
    static ArrayList bullets;


    public Game() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.BLACK);



        label.setIcon(new ImageIcon("C:\\Users\\william hansen\\Desktop\\ice images\\PlayerTest.png"));
        label.setBounds(210, 350, 100, 100);
        this.add(label);
    }
    public static ArrayList getBullets{
        return bullets;
    }
    public void fire(){
        Bullets bullet = new Bullets(label.getX(), label.getY());
        bullets.add(bullet);

    }


    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'a' : label.setLocation(label.getX()-10, label.getY());
                break;
            case 'w' : label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's' : label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd' : label.setLocation(label.getX()+10, label.getY());
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

