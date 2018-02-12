package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author andytaber
 */
public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private Collection<Cow> cows;
    
    public Farm(String name, Barn barn) {
        this.owner = name;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public void addCow(Cow cow) {
        cows.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }
    
    public void manageCows() {
        barn.takeCareOf(cows);
    }
    
    private String getCows() {
        if(cows.isEmpty() || cows == null) {
            return "No cows.";
        }
        String animals = "Animals:";
        for(Cow cow : cows) {
            animals += "\n        " + cow.toString();
        }
        return animals;
    }
    
    public String getOwner() {
        return owner;
    }
    
    @Override
    public String toString() {
        return "Farm owner: " + owner + "\nBarn bulk tank: " + barn + "\n" + this.getCows();
    }
    
    @Override
    public void liveHour() {
        for(Cow cow : cows) {
            cow.liveHour();
        }
    }
}
