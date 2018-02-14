package Movables;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author andytaber
 */
public class VampireGenerator {
    private int numOfVampires;
    private int length;
    private int height;
    private ArrayList<Vampire> vampireList;
    Random random = new Random();
    
    public VampireGenerator(int numOfVampires, int length, int height) {
        this.numOfVampires = numOfVampires;
        this.length = length;
        this.height = height;
    }
    
    public ArrayList<Vampire> newVampires() {
        for(int i = 0; i < numOfVampires; i++) {
            Vampire newVampire = new Vampire(randX(), randY());
            while(!vampireIsValid(newVampire)) {
                newVampire = new Vampire(randX(), randY());
            }
            vampireList.add(newVampire);
        }
        return vampireList;
    }
    
    private int randX() {
        return random.nextInt(length + 1);
    }
    
    private int randY() {
        return random.nextInt(height + 1);
    }
    
    private boolean vampireIsValid(Vampire vampire) {
        if(vampireList.contains(vampire)) {
            return false;
        }
        return !(vampire.getX() == 0 && vampire.getY() == 0);
    }
}
