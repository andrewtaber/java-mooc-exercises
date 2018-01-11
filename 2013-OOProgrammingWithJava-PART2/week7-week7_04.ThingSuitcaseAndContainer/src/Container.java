
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
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(suitcase.totalWeight() + totalWeightOfSuitcases() <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        return numberOfSuitcases() + " suitcases (" + totalWeightOfSuitcases() + " kg)";
    }
    
    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
    
    private int numberOfSuitcases() {
        return suitcases.size();
    }
    
    private int totalWeightOfSuitcases() {
        int totalContainerWeight = 0;
        for(Suitcase suitcase : suitcases) {
            totalContainerWeight += suitcase.totalWeight();
        }
        return totalContainerWeight;
    }
}
