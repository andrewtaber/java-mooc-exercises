package farmsimulator;

/**
 *
 * @author andytaber
 */
public class MilkingRobot {
    private BulkTank tank;
    
    public MilkingRobot() {
        this.tank = null;
    }
    
    public BulkTank getBulkTank() {
        return tank;
    }
    
    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }
    
    public void milk(Milkable milkable) {
        if(tank == null) {
            throw new IllegalStateException("Robot not connected to any tanks yet.");
        }
        tank.addToTank(milkable.milk());
    }
}
