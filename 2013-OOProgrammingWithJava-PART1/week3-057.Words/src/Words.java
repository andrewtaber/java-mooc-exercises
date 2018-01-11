import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        String tempWord;
        System.out.println("Type a word: ");
        tempWord = reader.nextLine();
        
        while(!tempWord.isEmpty()) {
            words.add(tempWord);
            System.out.println("Type a word: ");
            tempWord = reader.nextLine();
        }
        
        System.out.println("You typed the following words: ");
        for(String word : words) {
            System.out.println(word);
        }
    }
}
