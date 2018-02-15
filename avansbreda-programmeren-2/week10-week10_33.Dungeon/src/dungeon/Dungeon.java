package dungeon;

import Movables.Movable;
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
        printMovesLeft();
        printPositions();
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
        VampireGenerator vampGen = new VampireGenerator(vampires, length, height);
        vampiresList = new ArrayList<Vampire>();
        vampiresList = vampGen.newVampires();
    }
    
    private void printPositions() {
        System.out.println();
        System.out.println(player);
        for(Vampire vampire : vampiresList) {
            System.out.println(vampire);
        }
    }
     
}

