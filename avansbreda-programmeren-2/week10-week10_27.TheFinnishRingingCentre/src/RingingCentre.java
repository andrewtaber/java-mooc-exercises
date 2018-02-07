
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author andytaber
 */
public class RingingCentre {
    private Map<Bird, List<String>> place = new HashMap<Bird, List<String>>();
    
    public void observe(Bird bird, String place) {
        if(this.place.containsKey(bird)) {
            this.place.get(bird).add(place);
        } else {
            this.place.put(bird, new ArrayList<String>());
            this.place.get(bird).add(place);
        }
    }
    
    public void observations(Bird bird) {
        if(place.containsKey(bird)) {
            System.out.println(bird + " observations: " + place.get(bird).size());
            for(String place : place.get(bird)) {
                System.out.println(place);
            }
        } else {
            System.out.println(bird + " observations: 0");
        }       
    }
    
}
