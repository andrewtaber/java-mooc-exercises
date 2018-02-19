package Movables;

/**
 *
 * @author andytaber
 */
public class Player extends Movable{
    int movesLeft;
    
    public Player(int movesLeft) {
        super(0, 0);
        this.movesLeft = movesLeft;
    }
    
    public int getMovesLeft() {
        return this.movesLeft;
    }
    
    public void moveUsed() {
        movesLeft--;
    }
    
    @Override
    public String toString() {
        return "@ " + x + " " + y;
    }
    
}
