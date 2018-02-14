package dungeon;

import Movables.Movable;
import Movables.Player;
import Movables.Vampire;
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
    ArrayList<Movable> movables;
    
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
    }
    
    public void run() {
        printMovesLeft();
        
    }
    
    private void initializeDungeon() {
        movables.add(new Player(moves));
        
    }
    
    private void printMovesLeft() {
        System.out.println(player.getMovesLeft());
    }
     
}
