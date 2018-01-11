/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class Calculator {
    private Reader reader;
    private int stats;
    
    public Calculator() {
        this.reader = new Reader();  
        this.stats = 0;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            
            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        
        statistics();
    }
    
    private void sum() {
        int sum = getValue(1) + getValue(2);
        System.out.println("sum of the values " + sum);
        stats++;
    }
    
    private void difference() {
        int difference = getValue(1) - getValue(2);
        System.out.println("difference of the values " + difference);
        stats++;
    }
    
    private void product() {
        int product = getValue(1) * getValue(2);
        System.out.println("product of the values " + product);
        stats++;
    }
    
    private int getValue(int number) {
        System.out.print("value" + number + ": ");
        int value = reader.readInteger();
        return value;
    }
    
    private void statistics() {
        System.out.println("Calculations done " + stats);
    }
}
