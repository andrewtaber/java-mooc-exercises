
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class Phonebook {
    private ArrayList<Person> phonebook = new ArrayList<Person>();
    
    public Phonebook() {
        
    }
    
    public void add(String name, String number) {
        phonebook.add(new Person(name, number));
    }
    
    public String searchNumber(String name) {
        for ( Person person : phonebook ) {
            if (person.getName() == name) {
                return person.getNumber();
            } 
        }
        
        return "number not known";
    }
    
    public void printAll() {
        for( Person person : phonebook ) {
            System.out.println(person);
        }
    }
}
