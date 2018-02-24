package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author andytaber
 */
public class Square extends Figure{
    private int sideLength;
    
    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(this.getX(), this.getY(), sideLength, sideLength);
    }
    
}
