
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
public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList<ToBeStored> stored;
    
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.stored = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored item) {
        if(weight() + item.weight() < maxWeight) {
            stored.add(item);
        }
    }
    
    public double weight() {
        double weight = 0;
        for(ToBeStored item : stored) {
            weight += item.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + stored.size() + " things, total weight " + weight() + " kg";
    }
}
