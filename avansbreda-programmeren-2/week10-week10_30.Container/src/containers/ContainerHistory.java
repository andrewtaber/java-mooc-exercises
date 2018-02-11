package containers;

import java.util.ArrayList;

/**
 *
 * @author andytaber
 */
public class ContainerHistory {
    private ArrayList<Double> history = new ArrayList<Double>();
    
    public void add(double situation) {
        this.history.add(situation);
    }
    
    public double maxValue() {
        if(this.history.isEmpty()) {
            return 0;
        }
        double max = 0.0;
        for(Double situation : history) {
            if(situation > max) {
                max = situation;
            }
        }
        return max;
    }
    
    public double minValue() {
        if(this.history.isEmpty()) {
            return 0;
        }
        double min = history.get(0);
        for(Double situation : history) {
            if(situation < min) {
                min = situation;
            }
        }
        return min;
    }
    
    public double average() {
        if(this.history.isEmpty()) {
            return 0;
        }
        double sum = 0.0;
        for(Double situation : history) {
            sum += situation;
        }
        return sum/history.size();
    }
    
    public double greatestFluctuation() {
        double maxFluctuation = 0.0;
        for(int i = 0; i < history.size() - 1; i++) {
            double fluctuation = Math.abs(history.get(i) - history.get(i + 1));
            if(fluctuation > maxFluctuation) {
                maxFluctuation = fluctuation;
            }
        }
        return maxFluctuation;
    }
    
    public double variance() {
        if(history.isEmpty() || history.size() == 1) {
            return 0;
        }
        double sqDevTotal = 0.0; 
        for(Double situation : history) {
            sqDevTotal += Math.pow((situation - this.average()), 2);
        }
        return sqDevTotal/(history.size() - 1);
    }
    
    public void reset() {
        this.history.clear();
    }
    
    public String toString() {
        return this.history.toString();
    }
}
