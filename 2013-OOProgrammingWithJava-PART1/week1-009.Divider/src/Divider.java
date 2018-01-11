
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int first = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int second = Integer.parseInt(reader.nextLine());
        
        double division = (double)first/second;
       
        System.out.println("\n5Division: " + first + " / " + second + " = " + division);
        // Implement your program here. Remember to ask the input from user.
    }
}
