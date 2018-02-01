
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author andytaber
 */
public class Printer {
    private File file;
    
    public Printer(String fileName) throws Exception {
        this.file = new File(fileName);
    }
    
    public void printLinesWhichContain(String word) throws FileNotFoundException {
        Scanner scanner = new Scanner(file, "UTF-8");
        
        if(word.isEmpty()) {
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            return;
        }
        
        
        String line = "";
        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            
            if(line.contains(word)) {
                System.out.println(line);
            }
        }
    }
    
}
