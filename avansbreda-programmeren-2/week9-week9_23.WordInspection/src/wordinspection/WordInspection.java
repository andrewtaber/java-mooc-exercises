package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author andytaber
 */
public class WordInspection {
    private File file;
    
    public WordInspection(File file) throws Exception {
        this.file = file;
    }
    
    public int wordCount() throws Exception {
        List<String> wordsList = this.read();
        return wordsList.size();
    }
    
    public List<String> wordsContainingZ() throws Exception {
        List<String> initialWordsList = this.read();
        List<String> zWordsList = new ArrayList<String>();
        
        for(String word : initialWordsList) {
            if (word.contains("z")) {
                zWordsList.add(word);
            }
        }
        return zWordsList;
    }
    
    public List<String> wordsEndingInL() throws Exception {
        List<String> initialWordsList = this.read();
        List<String> lWordsList = new ArrayList<String>();
        
        for(String word : initialWordsList) {
            if(word.endsWith("l")) {
                lWordsList.add(word);
            }
        }
        
        return lWordsList;
    }
    
    public List<String> palindromes() throws Exception {
        List<String> initialWordsList = this.read();
        List<String> palindromes = new ArrayList<String>();
        
        for(String word : initialWordsList) {
            if(isPalindrome(word)) {
                palindromes.add(word);
            }
        }
        
        return palindromes;
    }
    
    public List<String> wordsWhichContainAllVowels() throws Exception {
        List<String> initialWordList = this.read();
        List<String> allVowelsWords = new ArrayList<String>();
        
        for(String word : initialWordList) {
            if(containsAllVowels(word)) {
                allVowelsWords.add(word);
            }
        }
        return allVowelsWords;
    }
    
    //looking back, I made this harder than it needed to be. For some reason
    //I was thinking about the word bein mirrored in the middle rather than 
    //The more simple solution of just reading the word backwards
    private boolean isPalindrome(String word) {
        String firstHalf = "";
        String secondHalf = "";
        
        firstHalf = word.substring(0, word.length()/2);
        
        if(word.length() % 2 == 0) {
            secondHalf = word.substring(word.length()/2);
        } else {
            secondHalf = word.substring((word.length()/2) + 1);
        }
        
        secondHalf = new StringBuffer(secondHalf).reverse().toString();
        
        return firstHalf.compareTo(secondHalf) == 0;
    }
    
    private boolean containsAllVowels(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'ä', 'ö'};
        
        for(int i = 0; i < vowels.length; i++) {
            if(word.indexOf(vowels[i]) == -1) {
                return false;
            }
        }
        return true;
    }
    
    private List<String> read() throws Exception {
        Scanner scanner = new Scanner(file, "UTF-8");
        List<String> words = new ArrayList<String>();
        
        while(scanner.hasNextLine()) {
            words.add(scanner.nextLine());
        }
        
        return words;
    }
}
