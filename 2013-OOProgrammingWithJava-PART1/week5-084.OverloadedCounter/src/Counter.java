/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class Counter {
    private int number;
    private boolean check;
   
    public Counter() {
        this(0, false);
    }
    
    public Counter(boolean check) {
        this(0, check);
    }
     
    public Counter(int startingValue) {
        this(startingValue, false);
    }
     
    
    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;
    }
    
    
    

    
   
    public int value() {
        return this.number;
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.number += increaseAmount;
        }
    }
    
    public void decrease() {
        this.decrease(1);
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount <= 0) {
            return;
        }
        
        if(this.check) {
            if(this.number - decreaseAmount <= 0) {
                this.number = 0;
            } else {
                this.number -= decreaseAmount;
            }
        } else {
            this.number -= decreaseAmount;
        }
    }
    
}
