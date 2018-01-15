
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        if(owners.get(plate) == null) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }
    
    public String get(RegistrationPlate plate) {
        return owners.get(plate); 
    }
    
    public boolean delete(RegistrationPlate plate) {
        if(owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }
    
    public void printRegistrationPlates() {
        for(RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList();
        
        for(String owner : owners.values()) {
            if(!ownerList.contains(owner)) {
                ownerList.add(owner);
            }
        }
        
        for(String owner : ownerList) {
            System.out.println(owner);
        }
    }
}
