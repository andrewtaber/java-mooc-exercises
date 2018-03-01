package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author andytaber
 */
public class Employees {
    private List<Person> persons;
    
    public Employees() {
        this.persons = new ArrayList<Person>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public void add(List<Person> persons) {
        this.persons.addAll(persons);
    }
    
    public void print() {
        Iterator<Person> iterator = persons.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while(iterator.hasNext()) {
            Person person = iterator.next();
            if(person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while(iterator.hasNext()) {
            if(iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
    
}
