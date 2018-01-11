
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name: ");
        String firstName = reader.nextLine();
        System.out.println("Type your age: ");
        int firstAge = Integer.parseInt(reader.nextLine());
        
        System.out.println("\nType your Name: ");
        String secondName =  reader.nextLine();
        System.out.println("Type your age: ");
        int secondAge = Integer.parseInt(reader.nextLine());
        
        int total = firstAge + secondAge;
        
        System.out.println("\n" + firstName + " and " + secondName
        + " are " + total + " years old in total.");
   }
}
