
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number;
        int i = 0;
        int sum = 0;
        
        System.out.println("Type a number: ");
        number = Integer.parseInt(reader.nextLine());
        
        while(i <= number) {
            sum += (int)Math.pow(2,i);
            i++;
        }
        
        System.out.println("The result is " + sum);
    }
}
