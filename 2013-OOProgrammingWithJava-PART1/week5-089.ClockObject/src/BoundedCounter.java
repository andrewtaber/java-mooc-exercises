
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }
    
    public void next() {
        if(this.value + 1 > upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }

    public String toString() {
        if(this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + value;
        }
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        if (value <= upperLimit && value >= 0) {
            this.value = value;
        }
    }
}
