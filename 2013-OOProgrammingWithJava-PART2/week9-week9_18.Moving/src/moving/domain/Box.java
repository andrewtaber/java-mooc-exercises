package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andytaber
 */
public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> things;
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        if(this.getVolume() + thing.getVolume() > maximumCapacity) {
            return false;
        }
        
        things.add(thing);
        return true;
    }

    @Override
    public int getVolume() {
        int totalVolume = 0;
        for(Thing thing : things) {
            totalVolume += thing.getVolume();
        }
        return totalVolume;
    }
}
