
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        
        System.out.println("Type a word: ");
        String tempWord = reader.nextLine();
        
        while(!words.contains(tempWord)) {
            words.add(tempWord);
            System.out.println("Type a word: ");
            tempWord = reader.nextLine();
        }
        
        System.out.println("You gave the word " + tempWord + " twice");
    }
}
