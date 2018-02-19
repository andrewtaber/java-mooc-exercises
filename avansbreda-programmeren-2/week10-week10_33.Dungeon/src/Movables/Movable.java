package Movables;

/**
 *
 * @author andytaber
 */
public abstract class Movable {
    int x;
    int y;
    int height;
    int length;
    
    public Movable(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setLimits(int height, int length) {
        this.height = height;
        this.length = length;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void moveX(int x) {
        if(this.x + x >= length || this.x + x < 0) {
            return;
        }
        this.x += x;
    }
    
    public void moveY(int y) {
        if(this.y + y >= height || this.y + y < 0) {
            return;
        }
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.x;
        hash = 29 * hash + this.y;
        return hash;
    }
}
