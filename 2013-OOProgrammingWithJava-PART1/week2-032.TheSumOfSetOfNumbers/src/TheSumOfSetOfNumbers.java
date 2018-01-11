
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int limit = 0;
        int i = 1;
        int sum = 0;
        
        System.out.println("Until what? ");
        limit = Integer.parseInt(reader.nextLine());
        
        while(i <= limit) {
            sum += i;
            i++;
        }
        
        System.out.println("Sum is " + sum);
    }
}
