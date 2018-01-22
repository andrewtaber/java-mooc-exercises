
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class Participant implements Comparable<Participant>{
    private String name;
    private int points;
    private ArrayList<Integer> jumps;
    
    public Participant(String name) {
        this.name = name;
        this.points = 0;
        this.jumps = new ArrayList<Integer>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return name + " (" + points + " points)";
    }
    
    public void addJudgePoints(int[] judgeScores) {
        Arrays.sort(judgeScores);
        int score = 0;
        for(int i = 1; i < 4; i++) {
            score += judgeScores[i];
        }
        this.points += score;
    }
    
    public void addJump(int jump) {
        this.points += jump;
        jumps.add(jump);
    }
    
    public int getPoints() {
        return this.points;
    }
    
    @Override
    public int compareTo(Participant participant) {
        return this.getPoints() - participant.getPoints();
    }
}
