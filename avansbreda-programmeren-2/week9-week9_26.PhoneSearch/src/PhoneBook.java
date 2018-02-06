
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author andytaber
 */
public class PhoneBook {
    private Map<String, Set<String>> phoneBook = new HashMap<String, Set<String>>();
    private Map<String, String> addressBook = new HashMap<String, String>();
    
    public void addPhone(String name, String phone) {
        if(this.phoneBook.containsKey(name)) {
            this.phoneBook.get(name).add(phone);
        } else {
            this.phoneBook.put(name, new HashSet<String>());
            this.phoneBook.get(name).add(phone);
        }
    }
    
    public Set<String> searchPhoneByName(String name) {
        Set<String> phones = this.phoneBook.get(name);
        return phones;
    }
    
    public String searchByNumber(String number) {
        for(String name : phoneBook.keySet()) {
            if(phoneBook.get(name).contains(number)) {
                return name;
            }
        }
        return null;
    }
    
    public void addAddress(String name, String address) {
        this.addressBook.put(name, address);
    }
    
    public String searchAddressByName(String name) {
        return this.addressBook.get(name);
    }
    
    public void removeInfo(String name) {
        this.phoneBook.remove(name);
        this.addressBook.remove(name);
    }
    
    public Set<String> keywordSearch(String keyword) {
        Set<String> names = new TreeSet<String>();

        kwSearchPhoneBookNames(keyword, names);
        kwSearchAddressBookNames(keyword, names);
        kwSearchAddressBookAddress(keyword, names);
        
        return names;
    }
    
    private void kwSearchPhoneBookNames(String keyword, Set<String> names) {
        for(String name : phoneBook.keySet()) {
            if(name.contains(keyword)) {
                names.add(name);
            }
        }
    }
    
    private void kwSearchAddressBookNames(String keyword, Set<String> names) {
        for(String name : addressBook.keySet()) {
            if(addressBook.get(name).contains(keyword)) {
                names.add(name);
            }            
        }
    }
    
    private void kwSearchAddressBookAddress(String keyword, Set<String> names)  {
        for(String name : addressBook.keySet()) {
            if(name.contains(keyword)) {
                names.add(name);
            }
        }
    }
}
