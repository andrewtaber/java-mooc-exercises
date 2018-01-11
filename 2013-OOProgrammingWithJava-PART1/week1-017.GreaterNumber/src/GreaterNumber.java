import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first number: ");
        int first = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the second number: ");
        int second = Integer.parseInt(reader.nextLine());
        
        if (first > second) {
            System.out.println("Greater number: " + first);
        }
        else if (second > first) {
            System.out.println("Greater number: " + second);
        }
        else {
            System.out.println("The numbers are equal!");
        }
    }
}
