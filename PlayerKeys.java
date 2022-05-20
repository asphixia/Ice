import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerKeys implements KeyListener {
    Game game;
    Player player;

    public PlayerKeys(Game game){
        //game.addKeyListener(this);
        this.game = game;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){

        }
        if(e.getKeyCode() == KeyEvent.VK_S){

        }
        if(e.getKeyCode() == KeyEvent.VK_D){

        }
        if(e.getKeyCode() == KeyEvent.VK_A){

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){

        }
        if(e.getKeyCode() == KeyEvent.VK_S){

        }
        if(e.getKeyCode() == KeyEvent.VK_D){

        }
        if(e.getKeyCode() == KeyEvent.VK_A){

        }

    }


    public void keyTyped(KeyEvent e) {

    }
}
