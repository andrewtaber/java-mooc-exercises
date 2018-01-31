package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andytaber
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }
    
    public List<Integer> readings() {
        return readings;
    }
    
    @Override
    public boolean isOn() {
        boolean isOn = true;
        for(Sensor sensor : sensors) {
            if(!sensor.isOn()) {
                return false;
            }
        }
        return isOn;
    }

    @Override
    public void on() {
        for(Sensor sensor : sensors) {
            sensor.on();
        }        
    }

    @Override
    public void off() {
        for(Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if(!this.isOn()) {
            throw new IllegalStateException("Not all sensors are on.");
        }
        
        int total = 0;
        for(Sensor sensor : sensors) {
            total += sensor.measure();
        }
        int average = total/sensors.size();
        readings.add(average);
        return average;
    }
    
}
