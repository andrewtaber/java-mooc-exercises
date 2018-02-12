package farmsimulator;

/**
 *
 * @author andytaber
 */
public class BulkTank {
    private double capacity;
    private double volumeOfMilk;
    
    public BulkTank() {
        this.capacity = 2000;
        this.volumeOfMilk = 0.0;
    }
    
    public BulkTank(double capacity){
        this.capacity = capacity;
    }
    
    public double getCapacity() {
        return capacity;
    }
    
    public double getVolume() {
        return volumeOfMilk;
    }
    
    public double howMuchFreeSpace() {
        return capacity - volumeOfMilk;
    }
    
    public void addToTank(double amount) {
        if(this.getVolume() + amount >= capacity) {
            volumeOfMilk = capacity;
        } else {
            volumeOfMilk += amount;
        }
    }
    
    public double getFromTank(double amount) {
        if(amount > volumeOfMilk) {
            double taken = volumeOfMilk;
            volumeOfMilk = 0.0;
            return taken;
        } else {
            volumeOfMilk -= amount;
            return amount;
        }
    }
    
    public String toString() {
        return Math.ceil(volumeOfMilk) + "/" + Math.ceil(capacity);
    }
    
    
}
