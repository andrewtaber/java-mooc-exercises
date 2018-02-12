package farmsimulator;

import java.util.Collection;

/**
 *
 * @author andytaber
 */
public class Barn {
    private BulkTank tank = null;
    private MilkingRobot milkingRobot = null;
    
    public Barn(BulkTank tank) {
        this.tank = tank;
    }
    
    public BulkTank getBulkTank() {
        return tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(tank);
    }
    
    public void takeCareOf(Cow cow) {
        if(milkingRobot == null) {
            throw new IllegalStateException("Milking Robot not installed. Cannot milk cow.");
        }
        milkingRobot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows) {
        if(milkingRobot == null) {
            throw new IllegalStateException("Milking Robot not installed. Cannot milk cows.");
        }
        for(Cow cow : cows) {
            milkingRobot.milk(cow);
        }
    }
    
    public String toString() {
        return tank.toString();
    }
}
