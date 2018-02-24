package movingfigure;

import movingfigure.Figure;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author andytaber
 */
public class KeyboardListener implements KeyListener{
    private Component panel;
    private Figure figure;
    
    public KeyboardListener(Component panel, Figure figure) {
        this.panel = panel;
        this.figure = figure;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            figure.move(-1, 0);
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            figure.move(1, 0);
        }
        if(e.getKeyCode() == KeyEvent.VK_UP) {
            figure.move(0, -1);
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            figure.move(0, 1);
        }
        
        panel.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    
}
