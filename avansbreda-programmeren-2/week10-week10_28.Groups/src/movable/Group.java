package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andytaber
 */
public class Group implements Movable {
    private List<Movable> organisms = new ArrayList<Movable>();
    
    public void addToGroup(Movable movable) {
        organisms.add(movable);
    }
    
    public String toString() {
        String organismString = "";
        for(Movable organism : organisms) {
            organismString += organism.toString() + "\n";
        }
        return organismString;
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable organism : organisms) {
            organism.move(dx, dy);
        }
    }
    
}
