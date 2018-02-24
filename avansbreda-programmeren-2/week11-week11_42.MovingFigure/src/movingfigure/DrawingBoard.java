package movingfigure;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author andytaber
 */
public class DrawingBoard extends JPanel{
    Figure figure;
    
    public DrawingBoard(Figure figure) {
        this.figure = figure;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        figure.draw(g);
    }
    
}
