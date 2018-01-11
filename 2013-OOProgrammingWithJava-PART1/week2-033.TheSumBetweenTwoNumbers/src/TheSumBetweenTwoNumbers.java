
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
     
        int first = 0;
        int last = 0;
        int sum = 0;
        
        System.out.println("First: ");
        first = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last: ");
        last = Integer.parseInt(reader.nextLine());
        
        while(first <= last){
            sum += first;
            first++;
        }
        
        System.out.println("The sum is " + sum);
    }
}
