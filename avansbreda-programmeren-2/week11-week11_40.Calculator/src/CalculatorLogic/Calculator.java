package CalculatorLogic;

/**
 *
 * @author andytaber
 */
public class Calculator {
    private int firstArg = 0;
    private int secondArg = 0;
    
    public void setFirstArg(int value) {
        this.firstArg = value;
    }
    
    public void setSecondArg(int value) {
        this.secondArg = value;
    }
    
    public int getValue() {
        return firstArg;
    }
    
    public void reset() {
        firstArg = 0;
        secondArg = 0;
    }
    
    public void add() {
        firstArg += secondArg;
    }
    
    public void substract() {
        firstArg -= secondArg;
    }
    
}
