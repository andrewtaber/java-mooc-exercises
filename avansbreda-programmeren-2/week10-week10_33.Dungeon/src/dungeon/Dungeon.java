package dungeon;

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
    
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
    }
    
    public void run() {
        
    }
    
    
}
