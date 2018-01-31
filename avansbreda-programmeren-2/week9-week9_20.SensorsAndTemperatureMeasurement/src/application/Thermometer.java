package application;

import java.util.Random;

/**
 *
 * @author andytaber
 */
public class Thermometer implements Sensor {
    private boolean on;
    
    public Thermometer() {
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void on() {
        this.on = true;
    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public int measure() {
        Random rand = new Random();
        
        if (!this.isOn()) {
            throw new IllegalStateException("Thermometer is off.");
        }
        
        return rand.nextInt(61) - 30;
    }
    
    
}
