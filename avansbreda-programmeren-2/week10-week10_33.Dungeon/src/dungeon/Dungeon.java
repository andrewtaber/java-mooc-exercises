package dungeon;

import Movables.Movable;
import Movables.Mover;
import Movables.Player;
import Movables.Vampire;
import Movables.VampireGenerator;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andytaber
 */
public class Dungeon {
    private int length;
    private int height;
    private int vampires;
    private int moves;
    boolean vampiresMove;
    Scanner scanner = new Scanner(System.in);
    Player player;
    ArrayList<Vampire> vampiresList;
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
    }
    
    public void run() {
        initializeDungeon();
        Mover mover = new Mover(vampiresList, player, vampiresMove);
        while(player.getMovesLeft() > 0 && !vampiresList.isEmpty()) {
            printMovesLeft();
            printPositions();
            printDungeon();
            String playerInput = scanner.nextLine();
            mover.movePlayerAndVampires(playerInput);
            player.moveUsed();
        }   
        if(vampiresList.isEmpty()) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("YOU LOSE");
        }
    }
    
    private void initializeDungeon() {
        player = new Player(moves);
        player.setLimits(height, length);
        generateVampires();
    }
    
    private void printMovesLeft() {
        System.out.println(player.getMovesLeft());
    }
    
    private void generateVampires() {
        VampireGenerator vampGen = new VampireGenerator(vampires, length, height, vampiresMove);
        vampiresList = new ArrayList<Vampire>();
        vampiresList = vampGen.newVampires();
    }
    
    private void printPositions() {
        System.out.println();
        System.out.println(player);
        for(Vampire vampire : vampiresList) {
            System.out.println(vampire);
        }
        System.out.println();
    }
     
    private void printDungeon() {
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < length; j++) {
                if(player.getX() == j && player.getY() == i) {
                    System.out.print("@");
                } else if(vampiresList.contains(new Vampire(j, i))) {
                    System.out.print("v");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

