
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class Suitcase {
    private int weightLimit;
    private ArrayList<Thing> thingsList;
    
    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.thingsList = new ArrayList<Thing>();
    }
    
    public void addThing(Thing newThing) {
        if(totalWeight() + newThing.getWeight() <= this.weightLimit){
            thingsList.add(newThing);
        }
    }
    
    public String toString() {
        if(numberOfThings() == 0) {
            return "empty (0 kg)";
        } else if (numberOfThings() == 1) {
            return "1 thing (" + totalWeight() + " kg)";
        } else {
            return numberOfThings() + " things (" + totalWeight() + " kg)";
        }      
    }
    
    public void printThings() {
        for (Thing thing : thingsList) {
            System.out.println(thing);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for(Thing thing : thingsList) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }
    
    public Thing heaviestThing() {
        if (numberOfThings() == 0) {
            return null;
        }
        
        int weight = 0;
        Thing heaviest = null;
        for (Thing thing : thingsList) {
            if (thing.getWeight() > weight) {
                weight = thing.getWeight();
                heaviest = thing;
            }
        }
        return heaviest;
    }
    
    private int numberOfThings() {
        return thingsList.size();
    }
    

}
