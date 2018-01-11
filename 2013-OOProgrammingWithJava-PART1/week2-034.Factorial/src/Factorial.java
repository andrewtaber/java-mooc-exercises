import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = 0;
        int i = 1;
        int factorial = 1;
        
        System.out.println("Type a number: ");
        number = Integer.parseInt(reader.nextLine());
        
        if(number == 0) {
            factorial = 1;
            System.out.println("Factorial is " + factorial);
        }
        else {
            while(i <= number) {
                factorial *= i;
                i++;
            }
            
            System.out.println("Factorial is " + factorial);
        }
        
    }
}
