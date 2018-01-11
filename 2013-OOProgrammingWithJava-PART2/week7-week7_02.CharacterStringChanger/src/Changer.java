
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
public class Changer {
    ArrayList<Change> changeList; 
    
    
    public Changer() {
        this.changeList = new ArrayList<Change>();
    }
    
    public void addChange(Change change) {
        changeList.add(change);
    }
    
    public String change(String characterString) {
        String newString = characterString;
        for (Change thisChange : changeList) {
            newString = thisChange.change(newString);
        }
        return newString;
    }
}
