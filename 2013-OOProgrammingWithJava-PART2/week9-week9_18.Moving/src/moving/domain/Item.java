package moving.domain;

/**
 *
 * @author andytaber
 */
public class Item implements Thing, Comparable<Item> {
    private String name;
    private int volume;
    
    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }
    
    @Override
    public int getVolume() {
        return this.volume;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }

    /**
     *
     * @param comparable
     * @return
     */
    @Override
    public int compareTo(Item comparable) {
        return this.getVolume() - comparable.getVolume();
    }

}
