package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andytaber
 */
public class MindfulDictionary {
    private Map<String, String> dictionary = new HashMap<String, String>();
    private Map<String, String> reverseDictionary = new HashMap<String, String>();
    private File file;
    private Scanner fileReader;
    private FileWriter writer;
    
    public MindfulDictionary() {
    }
    
    public MindfulDictionary(String file){
        this.file = new File(file);

    }
    
    public boolean load() {   
        try { 
            this.fileReader = new Scanner(this.file);
            while(fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] parts = line.split(":");
            
            this.add(parts[0], parts[1]);
            }
            return true;
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            return false;
        }
    }
    
    public boolean save() {
        try {
            this.writer = new FileWriter(file);
            for(String key : dictionary.keySet()) {
                writer.write(key + ":" + dictionary.get(key) + "\n");
            }
            writer.close();
            return true;
        } catch (IOException ex) {
            System.out.println("Could not write to file");
            return false;
        }
    }
     
    public void add(String word, String translation) {
        if(dictionary.containsKey(word) || reverseDictionary.containsKey(word)) {
            return;
        } 
        dictionary.put(word, translation);
        reverseDictionary.put(translation, word);
    }
    
    public String translate(String word) {
        if(dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else if (reverseDictionary.containsKey(word)) {
            return reverseDictionary.get(word);
        }
        return null;
    }
    
    public void remove(String word) {
        if(dictionary.containsKey(word)) {
            reverseDictionary.remove(dictionary.get(word));
            dictionary.remove(word);
        } else if(reverseDictionary.containsKey(word)) {
            dictionary.remove(reverseDictionary.get(word));
            reverseDictionary.remove(word);
        }
    }
    
    
}
