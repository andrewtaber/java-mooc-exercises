public class Reformatory {
    
    private int weightsMeasured;

    public Reformatory() {
        this.weightsMeasured = 0;
    }
    
    public int weight(Person person) {
        // return the weight of the person
        this.weightsMeasured++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        return weightsMeasured;
    }
}
