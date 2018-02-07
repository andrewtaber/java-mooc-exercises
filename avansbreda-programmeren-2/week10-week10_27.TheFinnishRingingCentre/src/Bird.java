
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int getRingingYear() {
        return this.ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    public int hashCode() {
        return this.ringingYear + this.latinName.hashCode();
    }
    
    @Override   
    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        
        if(getClass() != object.getClass()) {
            return false;
        }
        
        Bird compared = (Bird) object;
        
        if(this.ringingYear != compared.ringingYear || this.latinName != compared.getLatinName()) {
            return false;
        }
        
        return true;
    }
}


