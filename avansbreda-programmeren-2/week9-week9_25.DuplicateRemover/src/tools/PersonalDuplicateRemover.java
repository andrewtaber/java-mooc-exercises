package tools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author andytaber
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Map<String, Integer> words = new HashMap<String, Integer>();
    
    
    @Override
    public void add(String characterString) {
        if(words.containsKey(characterString)) {
            int duplicates = words.get(characterString);
            words.put(characterString, duplicates + 1);
        } else {
            words.put(characterString, 0);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        int totalDuplicates = 0;
        for(int value : words.values()) {
            totalDuplicates += value;
        }
        return totalDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        Set<String> uniqueWords = words.keySet();
        return uniqueWords;
    }

    @Override
    public void empty() {
        words.clear();
    }

}
