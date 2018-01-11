
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        System.out.println("Type the password: ");
        String typedPassword = reader.nextLine();
        
        while(!password.equals(typedPassword)) {
            System.out.println("Wrong!");
            System.out.println("Type the password: ");
            typedPassword = reader.nextLine();           
        }
        
        System.out.println("Right!");
        System.out.println("The secret is: Free Real Estate!");
        
        
    }
}
