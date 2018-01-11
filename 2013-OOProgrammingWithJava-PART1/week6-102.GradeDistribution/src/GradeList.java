
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class GradeList {
    private ArrayList<Grade> grades;
    private int gradeOptions;
    private int[] distribution;
    
    public GradeList() {
        this.grades = new ArrayList<Grade>();
        this.gradeOptions = 6;
        this.distribution = new int[gradeOptions]; //number of grades possible
        DistributionHelper.initialize(this.distribution);
    }
    
    public void add(int score){
        if(isValid(score)) {
            grades.add(new Grade(score));
        }
    }
    
    public boolean isValid(int score) {
        return score >= 0 && score <= 60;
    }

    private void recordGradeDistribution() {
        for(Grade grade : grades) {
            distribution[grade.numberGrade()]++;
        }
    }
    
    public void printDistribution() {
        recordGradeDistribution();
        DistributionHelper.printDistribution(distribution);
    }
    
    public double percentageAccepted() {
        int numberAccepted = 0;
        double percentage = 0.0;
        
        for(Grade grade : grades) {
            if(grade.numberGrade() != 0){
                numberAccepted++;
            }
        }
        
        percentage = (double)(100 * numberAccepted)/(grades.size());
        return (double)Math.round(percentage * 10)/10;
    }
    
}
