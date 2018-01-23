
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author andytaber
 */
public class UserInterface {
    Scanner scanner;
    ParticipantList jumpers;
    
    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.jumpers = new ParticipantList();
    }
    
    public void run() {
        intro();
        requestParticipants();
        runTournament();
        printResults();
    }
    
    private static void intro() {
        System.out.println("Kumpula ski jumping week");
        System.out.println();
    }
    
    private void requestParticipants() {
        instructions();        
        System.out.print("    Participant name: ");
        String name = scanner.nextLine();
        while(!name.isEmpty()) {
            jumpers.add(new Participant(name));
            System.out.print("    Participant name: ");
            name = scanner.nextLine();
        }
        System.out.println();
        System.out.println("The tournament begins!");
        System.out.println();
    }
    
    private void runTournament() {
        int round = 1;
        while(jumpOrQuit().equals("jump")) {
            System.out.println();
            System.out.println("Round " + round);
            System.out.println();
            System.out.println("Jumping order:");
            printJumpingOrder();
            roundResults(round);
            round++;
        }
    }
    
    private void roundResults(int round) {
        Jump jump = new Jump();
        System.out.println("Results of round " + round);
        ArrayList<Participant> jumpOrder = jumpers.getJumpers();
        for(Participant jumper : jumpOrder) {
            int jumpDistance = jump.jumpDistance();
            int[] judgesScores = jump.judgeScores();            
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jumpDistance);
            System.out.println("    judge votes: " + Arrays.toString(judgesScores));
            jumper.addJump(jumpDistance);
            jumper.addJudgePoints(judgesScores);
        }
        System.out.println();
    }
    
    private void printJumpingOrder() {
        jumpers.setJumpOrder();
        ArrayList<Participant> jumpOrder = jumpers.getJumpers();
        int order = 1;
        for(Participant jumper : jumpOrder) {
            System.out.println("  " + order + ". " + jumper);
            order++;
        }   
        System.out.println();
    }

    private void printResults() {
        printResultsHeading();
        jumpers.setWinningOrder();
        ArrayList<Participant> winningOrder = jumpers.getJumpers();
        int order = 1;
        for(Participant participant : winningOrder) {
            System.out.println(order + "           " + participant);
            System.out.println("            jump lengths: " + participant.getJumpList());
            order++;
        }    
    }
    
    private void printResultsHeading() {
        System.out.println();
        System.out.println("Thanks!");
        System.out.println();
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
    }
    
    private String jumpOrQuit() {
        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        return scanner.nextLine();
    }
    
    private static void instructions() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
    }
}
