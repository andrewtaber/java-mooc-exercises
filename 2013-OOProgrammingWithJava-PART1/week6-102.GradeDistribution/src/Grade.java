/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class Grade {
    private int score;
    private int grade;
    
    public Grade(int score) {
        this.score = score;
        this.grade = numberGradeEval(score);
    }
    
    public int numberGradeEval(int score) {
        if(score >= 50) {
            return 5;
        } else if(score >= 45) {
            return 4;
        } else if(score >= 40) {
            return 3;
        } else if(score >= 35) {
            return 2;
        } else if(score >= 30) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public int numberGrade() {
        return this.grade;
    }
    
}
