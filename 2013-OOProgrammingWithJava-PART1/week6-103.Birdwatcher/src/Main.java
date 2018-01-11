
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner input = new Scanner(System.in);
        String enteredCommand;
        boolean running = true;
        BirdList birdList = new BirdList();
    
        while(running) {
            System.out.print("? ");
            enteredCommand = normalize(input.nextLine());            
            running = processCommand(enteredCommand, input, birdList);            
        }
    }
    
    public static String normalize(String command) {
        String norm;
        norm = command.trim().toLowerCase();
        return norm; 
    }
    
    public static boolean processCommand(String command, Scanner input, BirdList birdList) {
        if(command.contains("add")) {
            add(input, birdList);
        } else if(command.contains("observation")) {
            observation(input, birdList);
        } else if(command.contains("statistics")) {
            stats(birdList);
        } else if(command.contains("show")) {
            show(input, birdList);
        } else if(command.contains("quit")) {
            return false;
        }
        return true;
    }
    
    public static void add(Scanner input, BirdList birdList){
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Latin Name: ");
        String latinName = input.nextLine();
        birdList.add(name, latinName);
    }
    
    public static void observation(Scanner input, BirdList birdList){
        System.out.print("What was observed? ");
        String birdObvserved = input.nextLine();
        if(!birdList.observation(birdObvserved)) {
            invalidBird(); 
        }
    }
    
    public static void stats(BirdList birdList) {
        birdList.statistics();
    }
    
    public static void show(Scanner input, BirdList birdList) {
        System.out.print("What? ");
        String bird = input.nextLine();
        if(!birdList.show(bird)) {
            invalidBird();
        }
    }
        
    public static void invalidBird() {
        System.out.println("Is not a bird!");
    }
}
