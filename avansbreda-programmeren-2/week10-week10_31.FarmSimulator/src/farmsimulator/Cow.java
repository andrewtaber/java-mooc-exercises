package farmsimulator;

import java.util.Random;

/**
 *
 * @author andytaber
 */
public class Cow implements Alive, Milkable{
    private Random random = new Random();
    private String name;
    private double capacity = 15 + random.nextInt(26);
    private double amount = 0.0;
    
    public Cow() {
        this.name = NAMES[random.nextInt(31)]; // Pick random name from array of 31 names
    }
    
    public Cow(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public double getCapacity() {
        return capacity;
    }
    
    public double getAmount() {
        return amount;
    }
    
    @Override
    public String toString() {
        return name + " " + Math.ceil(amount) + "/" + capacity;
    }
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    @Override
    public void liveHour() {
        double produced = ((7 + random.nextInt(14))/10.0);
        if(amount + produced > capacity) {
            amount = capacity;
        } else {
            amount += produced;
        }
    }

    @Override
    public double milk() {
        double milkTaken = amount;
        amount = 0.0;
        return milkTaken;
    }
    
}
