package Movables;

/**
 *
 * @author andytaber
 */
public abstract class Movable {
    int x;
    int y;
    
    public Movable(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    void moveX(int x) {
        this.x += x;
    }
    
    void moveY(int y) {
        this.y += y;
    }
}
