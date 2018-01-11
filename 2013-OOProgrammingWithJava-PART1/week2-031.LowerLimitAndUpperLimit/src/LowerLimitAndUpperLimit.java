
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here

        int lower = 0;
        int upper = 0;
        
        System.out.println("First: ");
        lower = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last: ");
        upper = Integer.parseInt(reader.nextLine());
        
        if(lower > upper) {
            System.out.println("");
        }
        else {
            while (lower <= upper) {
                System.out.println(lower);
                lower++;
            }
        }
        
    }
}
