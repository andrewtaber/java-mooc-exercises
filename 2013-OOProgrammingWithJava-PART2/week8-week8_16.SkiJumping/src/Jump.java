
import java.util.Random;

/**
 *
 * @author andytaber
 */
public class Jump {
    
    public int jumpDistance() {
        Random random = new Random();
        int jump = random.nextInt(60);
        return jump + 61;
    }
    
    public int[] judgeScores() {
        Random random = new Random();
        int[] scores = {0,0,0,0,0};
        for(int i = 0; i < 5; i++) {
            scores[i] = random.nextInt(11) + 10;
        }
        return scores;
    }
}
    
   
