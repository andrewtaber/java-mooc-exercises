import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        GradeList gradeList = new GradeList();
        int scoreEntered;
        
        System.out.println("Type exam scores, -1 completes:");
        scoreEntered = Integer.parseInt(scanner.nextLine());
        while(scoreEntered != -1) {
            gradeList.add(scoreEntered);
            scoreEntered = Integer.parseInt(scanner.nextLine());
        }
        
        gradeList.printDistribution();
        System.out.println("Acceptance percentage:" + gradeList.percentageAccepted());
        
    }
    
    
}
