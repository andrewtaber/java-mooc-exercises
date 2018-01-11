
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
public class BirdList {
    private ArrayList<Bird> birdList = new ArrayList<Bird>();
    
    public void BirdList() {
        
    }
    
    public void add(String name, String latinName) {
        birdList.add(new Bird(name, latinName));
    }
    
    public boolean observation(String name) {
        boolean birdsFound = false;
        for(Bird bird : birdList) {
            if(bird.name().contains(name)){
                bird.addObservation();
                birdsFound = true;
            }
        }
        return birdsFound;
    }
    
    public void statistics() {
        for(Bird bird : birdList) {
            System.out.println(bird);
        }
    }
    
    public boolean show(String name) {
        boolean birdFound = false;
        for(Bird bird : birdList) {
            if(bird.name().contains(name)) {
                System.out.println(bird);
                birdFound = true;
            }
        }
        return birdFound;
    }
}
