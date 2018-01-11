
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public boolean less(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        } else if (this.euros() == compared.euros()) {
            if (this.cents() < compared.cents()) {
                return true;
            }
        } 
        return false;
    }
    
    public Money plus(Money added) {
        int cents = this.cents() + added.cents();
        int euros = this.euros() + added.euros();
        
        Money money = new Money(euros, cents);
        return money;
    }
    
    public Money minus(Money decremented) {
        int cents = this.cents() - decremented.cents();
        int euros = this.euros() - decremented.euros();
        Money money;
        
        if (euros < 0) {
            return new Money(0, 0);
        }
        
        if (cents < 0) {
            euros -= 1;
            cents = (100 + cents);
        }
        
        return new Money(euros, cents);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
