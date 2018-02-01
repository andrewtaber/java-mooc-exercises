package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author andytaber
 */
public class Analysis {
    private File file;
    private List<String> linesArray;
    
    public Analysis(File file) throws FileNotFoundException {
        this.file = file;
        linesArray = new ArrayList<String>();
        
        Scanner scanner = new Scanner(file, "UTF-8");
        
        while(scanner.hasNextLine()) {
            linesArray.add(scanner.nextLine());
        }
    }
    
    public int lines() {
        return linesArray.size();
    }
    
    public int characters() {
        int characters = 0;
        
        for(String line : linesArray) {
            characters += line.length() + 1;
        }
        
        return characters;
    }
}
