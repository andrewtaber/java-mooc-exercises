
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class Dictionary {
    private HashMap<String, String> dictionary;
    
    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }
    
    public String translate(String word) {
        return this.dictionary.get(word);
    }
    
    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.dictionary.size();
    }
    
    public ArrayList<String> translationList() {
        String keyValue;
        ArrayList<String> translations = new ArrayList<String>();
        for( String key : dictionary.keySet() ) {
            keyValue = key;
            keyValue += " = " + translate(key);
            translations.add(keyValue);
        }
        return translations;
    }

}
