
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        System.out.println("Type a word: ");
        String tempWord = reader.nextLine();
        
        while(!tempWord.isEmpty()){
            words.add(tempWord);
            System.out.println("Type a word: ");
            tempWord = reader.nextLine();
        }
        
        Collections.sort(words);
        System.out.println("You typed the following words:");
        for(String word : words) {
            System.out.println(word);
        }
    }
}
