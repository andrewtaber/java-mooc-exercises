
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner scanner = new Scanner(System.in);
        
        //Just used to test user inputs
        while(true) {
            System.out.print("Give a string:");
            String string = scanner.nextLine();
            
            if(clockTime(string)) {
                System.out.println("The form is fine");
            } else {
                System.out.println("The form is wrong");
            }
        }
        

    }
    
    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public static boolean allVowels(String string) {
        return string.matches("[aeiouäö]*");
    }
    
    public static boolean clockTime(String string) {
        if(string.matches("([0-9]{2}:){2}([0-9]{2})")) {
            String[] hhmmss = string.split(":");
            String hh = hhmmss[0];
            String mm = hhmmss[1];
            String ss = hhmmss[2];
            
            if(Integer.parseInt(hh) < 24 && Integer.parseInt(mm) < 60 && Integer.parseInt(ss) < 60) {
                return true;
            }
        }
        return false;
    }
}
