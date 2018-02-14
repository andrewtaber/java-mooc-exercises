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
    
    public void moveX(int x) {
        this.x += x;
    }
    
    public void moveY(int y) {
        this.y += y;
    }
    
    @Override
    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        if(getClass() != object.getClass()) {
            return false;
        }
        
        Movable compared = (Movable) object;
        
        return !(this.x != compared.getX() || this.y != compared.getY());        
    }
}
