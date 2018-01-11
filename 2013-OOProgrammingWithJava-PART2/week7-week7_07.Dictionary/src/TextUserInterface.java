
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start() {
        String statement = null;
        instructions();
        while(true) {
            System.out.println();
            System.out.print("Statement: ");
            statement = this.reader.nextLine();
            
            if(statement.contains("quit")){
                break;
            } else if(statement.contains("add")) {
                add();
            } else if(statement.contains("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
        
        System.out.println("Cheers!");
    }
    
    public void add() {
        System.out.print("In Finnish: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        dictionary.add(word, translation);
    }
    
    public void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        System.out.println(dictionary.translate(word));
    }
    
    private static void instructions() {
        System.out.println("Statement:");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the text user interface");
    }
    
}
