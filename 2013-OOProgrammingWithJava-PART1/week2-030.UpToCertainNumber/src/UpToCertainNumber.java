
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int number = 0;
        int i = 0;
        System.out.println("Up to what number? ");
        number = Integer.parseInt(reader.nextLine());
        
        while(i < number) {
            i++;
            System.out.println(i);
        }
    }
}
