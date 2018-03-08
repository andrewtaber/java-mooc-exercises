package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author andytaber
 */
public class RatingRegister {
    private Map<Film, List<Rating>> films;
    private Map<Person, Map<Film, Rating>> personalRatings;
    
    public RatingRegister() {
        films = new HashMap<Film, List<Rating>>();
        personalRatings = new HashMap<Person, Map<Film, Rating>>();
    }
    
    public void addRating(Film film, Rating rating) {
        if(films.containsKey(film)) {
            films.get(film).add(rating);
        } else {
            films.put(film, new ArrayList<Rating>());
            films.get(film).add(rating);
        }
    }
    
    public List<Rating> getRatings(Film film) {
        List<Rating> ratings = films.get(film);
        return ratings;
    }
    
    public Map<Film, List<Rating>> filmRatings() {
        return films;
    }
    
    public void addRating(Person person, Film film, Rating rating) {
        if(personalRatings.containsKey(person)) {
            if(!(personalRatings.get(person).containsKey(film))) {
                personalRatings.get(person).put(film, rating);
                addRating(film, rating);
            }
        } else {
            personalRatings.put(person, new HashMap<Film, Rating>());
            personalRatings.get(person).put(film, rating);
            addRating(film, rating);
        }
    }
    
    public Rating getRating(Person person, Film film) {
        Map<Film, Rating> personsRatings = personalRatings.get(person);
        
        if(!personsRatings.containsKey(film)) {
            return Rating.NOT_WATCHED;
        }
        return personalRatings.get(person).get(film);
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person) {
        Map<Film, Rating> personsRatings = new HashMap<Film, Rating>();
                
        if(!personalRatings.containsKey(person)) {
            return personsRatings;
        }
        personsRatings = personalRatings.get(person);
        
//        if(personsRatings.isEmpty()) {
//            for(Film film : films.keySet()) {
//                personsRatings.put(film, getRating(person, film));
//            }
//        }
        return personsRatings;
    }
    
    public List<Person> reviewers() {
        List<Person> reviewers = new ArrayList<Person>();
        reviewers.addAll(personalRatings.keySet());
        return reviewers;
    }
    
}
