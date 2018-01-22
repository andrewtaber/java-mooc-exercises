
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
   
