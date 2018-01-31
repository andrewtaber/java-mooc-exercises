package Main;

import application.AverageSensor;
import application.ConstantSensor;
import application.Sensor;
import application.Thermometer;

/**
 *
 * @author andytaber
 */
public class Main {
    public static void main(String[] args) {
        AverageSensor ka = new AverageSensor();
        ka.addSensor( new ConstantSensor(3) );
        ka.addSensor( new ConstantSensor(7) );
        System.out.println(ka.readings());
    }
}
