import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Enemy implements ActionListener {
    private final int enemyWidth = 200;
    private final int enemyHeight = 200;
    private int enemyX = 250;
    private int enemyY = 10;
    private int enemySpeed = 10;
    Timer timer;
    String icon  = "C:\\Users\\william hansen\\Desktop\\ice images\\enemy33488888.jpg";
    public JLabel enemyLabel = new JLabel();
    public Enemy(){
        createEnemy();
        timer = new Timer(50, this);
        timer.start();
    }
    public void createEnemy(){
        enemyLabel.setIcon(new ImageIcon(icon));
        enemyLabel.setBounds(enemyX, enemyY, enemyWidth, enemyHeight);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (enemyX >= 400 || enemyX<0){
            enemySpeed = enemySpeed*-1;
        }
        enemyLabel.setLocation(enemyX+=enemySpeed, enemyY);
    }
}
