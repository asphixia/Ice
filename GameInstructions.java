import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameInstructions implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JButton backToMain;


    public GameInstructions(){
        title();
        moveLeft();
        moveRight();
        moveDown();
        moveUp();
        shootKey();
        frame.add(label);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);

        button();
        frame.add(backToMain);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void title(){
        label6 = new JLabel("---Game-Instructions---");
        label6.setBounds(0,0, 600, 50);
        label6.setFont(new Font(null, Font.PLAIN,25));
    }
    public void moveLeft(){
        label = new JLabel("--Move Left = a");
        label.setBounds(0,50, 600, 50);
        label.setFont(new Font(null, Font.PLAIN,25));
    }
    public void moveRight(){
        label2 = new JLabel("--Move Right = d");
        label2.setBounds(0,100, 600, 50);
        label2.setFont(new Font(null, Font.PLAIN,25));
    }
    public void moveUp(){
        label3 = new JLabel("--Move Up = w");
        label3.setBounds(0,150, 600, 50);
        label3.setFont(new Font(null, Font.PLAIN,25));
    }
    public void moveDown(){
        label4 = new JLabel("--Move Down = s");
        label4.setBounds(0,200, 600, 50);
        label4.setFont(new Font(null, Font.PLAIN,25));
    }
    public void shootKey(){
        label5 = new JLabel("--Shoot = SpaceBar");
        label5.setBounds(0,250, 600, 50);
        label5.setFont(new Font(null, Font.PLAIN,25));
    }
    public void button(){
        backToMain = new JButton("Back To Main Meny");
        backToMain.setBounds(0, 300, 200, 40);
        backToMain.addActionListener(this);
        backToMain.setFocusable(false);


    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backToMain){
            frame.dispose();
            Menu menu = new Menu();
        }

    }
}
