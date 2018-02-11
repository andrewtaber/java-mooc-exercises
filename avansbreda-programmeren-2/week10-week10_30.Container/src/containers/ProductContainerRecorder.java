package containers;

/**
 *
 * @author andytaber
 */
public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory history = new ContainerHistory();
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        history.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }
    
    public String history() {
        return history.toString();
    }
    
    @Override
    public void addToTheContainer(double ammount) {
        super.addToTheContainer(ammount);
        history.add(super.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        double amountTaken = super.takeFromTheContainer(amount);
        history.add(super.getVolume());
        return amountTaken;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history.toString());
        System.out.println("Greatest product amount: " + history.maxValue());
        System.out.println("Smallest product amount: " + history.minValue());
        System.out.println("Average: " + history.average());
        System.out.println("Greatest change: " + history.greatestFluctuation());
        System.out.println("Variance: " + history.variance());
    }
}
