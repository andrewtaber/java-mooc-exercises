package Movables;

/**
 *
 * @author andytaber
 */
public class Vampire extends Movable{
    private boolean vampireMoves;
    
    public Vampire(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "v " + this.x + " " + this.y;
    }
    
    
}
