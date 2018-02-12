package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if(weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object compared) {
        
        if(compared.getClass() != this.getClass()) {
            return false;
        }
        
        return compared.hashCode() == this.hashCode();
    }
    
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
