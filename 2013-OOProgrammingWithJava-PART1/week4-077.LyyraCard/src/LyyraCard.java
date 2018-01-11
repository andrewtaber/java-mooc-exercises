/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class LyyraCard {
    private double balance;
    
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    
    public void loadMoney(double amount) {
        double cardMax = 150.00;
        
        if(amount < 0){
            return;
        }
        
        if((this.balance + amount) >= cardMax) {
            this.balance = cardMax;
        } else {
            this.balance += amount;
        }
    }
    
    public void payEconomical() {
        balanceNonNegative(2.50);
    }
    
    public void payGourmet() {
        balanceNonNegative(4.00);
    }
    
    public void balanceNonNegative(double payment) {
        if((this.balance - payment) >= 0) {
            this.balance -= payment;
        }
    }
}
