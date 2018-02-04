package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author andytaber
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dict;
    
    public PersonalMultipleEntryDictionary() {
        this.dict = new HashMap<String, Set<String>>();
    }
    
    @Override
    public void add(String word, String entry) {
        if(!this.dict.containsKey(word)) {
            this.dict.put(word, new HashSet<String>());
        }
        
        this.dict.get(word).add(entry);
    }
    
    @Override
    public Set<String> translate(String word) {
       Set<String> translation = this.dict.get(word);
       return translation;
    }

    @Override
    public void remove(String word) {
        if(this.dict.get(word) != null) {
            this.dict.get(word).clear();
            this.dict.remove(word);
        }
    }
    
}
