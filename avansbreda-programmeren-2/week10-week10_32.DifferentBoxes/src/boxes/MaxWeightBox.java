package boxes;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author andytaber
 */
public class MaxWeightBox extends Box{
    private int maxWeight;
    private Collection<Thing> things;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
       if((thing.getWeight() + this.getTotalWeight()) <= maxWeight) {
           things.add(thing);
       }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
    
    private int getTotalWeight() {
        int total = 0;
        for(Thing thing : things) {
            total += thing.getWeight();
        }
        return total;
    }
    
}
