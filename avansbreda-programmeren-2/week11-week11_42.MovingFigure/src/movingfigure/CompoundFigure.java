package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author andytaber
 */
public class CompoundFigure extends Figure {
    private ArrayList<Figure> figures;
    
    public CompoundFigure() {
        figures = new ArrayList<Figure>();
    }
    
    public void add(Figure figure) {
        figures.add(figure);
    }
    
    @Override
    public void draw(Graphics graphics) {
        for(Figure figure : figures) {
            figure.draw(graphics);
        }
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Figure figure : figures) {
            figure.move(dx, dy);
        }
    }
    
}
