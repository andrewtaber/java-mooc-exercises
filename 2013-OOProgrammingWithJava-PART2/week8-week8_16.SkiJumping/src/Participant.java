
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
    
    public String getJumpList() {
        String[] jumpArray = makeJumpArray();
        int arrLen = jumpArray.length;
        String jumpList = "";
        for(int i = 0; i < arrLen - 1; i++) {
            jumpList += jumpArray[i] + ", ";
        }
        jumpList += jumpArray[arrLen - 1];
        return jumpList;
    }
    
    private String[] makeJumpArray() {
        String[] jumpArray = new String[jumps.size()];
        int i = 0;
        for(Integer jump : jumps) {
            jumpArray[i] = jump.toString() + " m";
            i++;
        }
        return jumpArray;
    }
    
    @Override
    public int compareTo(Participant participant) {
        return this.getPoints() - participant.getPoints();
    }
}
