package reference.domain;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andytaber
 */
public class PersonComparator implements Comparator<Person>{
    private Map<Person, Integer> peopleIdentities;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = new HashMap<Person, Integer>();
        this.peopleIdentities = peopleIdentities;
    }
    
    @Override
    public int compare(Person o1, Person o2) {
        int person1 = peopleIdentities.get(o1);
        int person2 = peopleIdentities.get(o2);
        
        return person1 > person2 ? -1 : person1 == person2 ? 0 : 1;
    }
    
}
