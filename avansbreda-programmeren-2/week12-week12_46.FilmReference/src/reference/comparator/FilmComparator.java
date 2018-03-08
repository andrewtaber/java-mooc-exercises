package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author andytaber
 */
public class FilmComparator implements Comparator<Film>{
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        double o1Avg = avgRating(ratings.get(o1));
        double o2Avg = avgRating(ratings.get(o2));
        
        return o1Avg > o2Avg ? -1 : o1Avg == o2Avg ? 0 : 1;
    }
    
    private double avgRating(List<Rating> filmRatings) {
        int sum = 0;
        for(Rating rating : filmRatings) {
            sum += rating.getValue();
        }
        return (double)sum/filmRatings.size();
    }
    
}
