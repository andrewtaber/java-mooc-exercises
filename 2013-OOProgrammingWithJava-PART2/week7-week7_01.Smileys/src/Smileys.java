
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        printRowOfSmileys(numberOfSmileys(length));
        printInternalRow(characterString);
        printRowOfSmileys(numberOfSmileys(length));
    }
    
    private static void printRowOfSmileys(int numberOfSmileys) {
        for(int i = 0; i < numberOfSmileys; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }
    
    private static int numberOfSmileys(int stringLength) {
        if(stringLength % 2 == 0) {
            return ((stringLength + 2) / 2) + 2 ;
        } else {
            return ((stringLength + 3) / 2) + 2;
        }
    }
    
    private static void printInternalRow(String characterString) {
        if(characterString.length() % 2 == 0) {
            System.out.println(":) " + characterString + " :)");
        } else {
            System.out.println(":) " + characterString + "  :)");
        }
    }

}
