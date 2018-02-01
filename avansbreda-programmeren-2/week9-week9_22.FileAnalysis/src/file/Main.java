package file;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here

        File file = new File("src/testfile.txt");
        
        Analysis fileAnalysis = new Analysis(file);
        
        System.out.println(fileAnalysis.lines());
        System.out.println(fileAnalysis.characters());
    }
}
