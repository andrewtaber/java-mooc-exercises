package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author andytaber
 */
public class Packer {
    private int boxesVolume;
    
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        Box box = new Box(boxesVolume);
        boxes.add(box);
        for(Thing thing : things) {
            if(!box.addThing(thing)) {
                box = new Box(boxesVolume);
                boxes.add(box);
                box.addThing(thing);
            }
            else {
                box.addThing(thing);
            }
        }
        return boxes;
    }
}
