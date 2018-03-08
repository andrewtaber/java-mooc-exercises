package reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author andytaber
 */
public class Reference {
    private RatingRegister ratings;
    
    public Reference(RatingRegister ratings) {
        this.ratings = ratings;
    }
    
    public Film recommendFilm(Person person) {
        Map<Film, List<Rating>> filmRatings = ratings.filmRatings();
        //If Person has not yet watched any movies    
        Map<Film, Rating> personsRatings = ratings.getPersonalRatings(person);
        
        if(personsRatings.isEmpty()) {
            List<Film> films = new ArrayList<Film>();
            films.addAll(filmRatings.keySet());

            Collections.sort(films, new FilmComparator(filmRatings));

            return films.get(0); 
        } else {
            return topRatedRecomendation(person);
        }
    }

    private Film topRatedRecomendation(Person person) {
        Map<Film, Rating> notWatchedRated = closestTasteNotWatchedBy(person);
        List<Film> notWatchedFilms = new ArrayList<Film>();
        if(notWatchedRated == null) {
            return null;
        }
        notWatchedFilms.addAll(notWatchedRated.keySet());
        
        
        Film topFilm = notWatchedFilms.get(0);
        for(Film film : notWatchedFilms) {
            if(notWatchedRated.get(film).getValue() > notWatchedRated.get(topFilm).getValue()) {
                topFilm = film;
            }
        }
        if(notWatchedRated.get(topFilm).getValue() < 3) {
            return null;
        }
        return topFilm;
    }
    
    
    private Map<Film, Rating> closestTasteNotWatchedBy(Person person1) {
        Person closestTaste = personWithClosestTaste(person1);
        if(closestTaste == null) {
            return null;
        }
        
        Map<Film, Rating> notShared = new HashMap<Film, Rating>();
        Set<Film> closestFilms = ratings.getPersonalRatings(closestTaste).keySet();
        Set<Film> p1Films = ratings.getPersonalRatings(person1).keySet();
        
        for(Film film : closestFilms) {
            if(!p1Films.contains(film)) {
                notShared.put(film, ratings.getPersonalRatings(closestTaste).get(film));
            }
        }
        
        if(notShared.isEmpty()) {
            return null;
        }
        
        return notShared;
    }
    
    
    private Person personWithClosestTaste(Person person) {
        Set<Person> similarViewingHistory = haveWatchedSimilarFilms(person);
        if(similarViewingHistory == null) {
            return null;
        }
        Map<Person, Integer> tasteComparison = compareTastes(person, similarViewingHistory);
        List<Person> people = new ArrayList<Person>();
        
        if(tasteComparison == null) {
            return null;
        }
        
        people.addAll(tasteComparison.keySet());
        people.sort(new PersonComparator(tasteComparison));
        
        return people.get(0);
    }
    
    
    private Set<Person> haveWatchedSimilarFilms(Person person1) {
        Set<Person> people = new HashSet<Person>();
        Map<Film, Rating> person1Ratings = ratings.getPersonalRatings(person1);
        
        List<Film> p1Films = new ArrayList<Film>();
        p1Films.addAll(person1Ratings.keySet());
        
        for(Person person : ratings.reviewers()) {
            if (person.equals(person1)){
                continue;
            }
            for(Film film : p1Films) {
                if(ratings.getPersonalRatings(person).containsKey(film)) {
                    people.add(person);
                }
            }
        }
        if(people.isEmpty()) {
            return null;
        }
        return people;
    }
    
    
    private Map<Person, Integer> compareTastes(Person person1, Set<Person> people) {
        Map<Film, Rating> p1Rated = ratings.getPersonalRatings(person1);
        if(p1Rated.isEmpty() || people == null) {
            return null;
        }
        
        Map<Person, Integer> tasteComparison = new HashMap<Person, Integer>();
        
        for(Person person : people) {
            int compRating = 0;
            for(Film film : ratings.getPersonalRatings(person).keySet()) {
                if(p1Rated.containsKey(film)) {
                    compRating += ratings.getRating(person, film).getValue() * ratings.getRating(person1, film).getValue();
                }
            }
            tasteComparison.put(person, compRating);
        }
        if(tasteComparison.isEmpty()) {
            return null;
        }
        return tasteComparison;
    }
    
    
}
