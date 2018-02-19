package Movables;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author andytaber
 */
public class Mover {
    private ArrayList<Vampire> vampires;
    private Player player;
    boolean vampiresMove;
    
    public Mover(ArrayList<Vampire> vampires, Player player, boolean vampiresMove) {
        this.vampires = vampires;
        this.player = player;
        this.vampiresMove = vampiresMove;
    }
    
    public void movePlayerAndVampires(String moveList) {
        for(int i = 0; i < moveList.length(); i++) {
            if(player.movesLeft > 0 && !vampires.isEmpty()) {
                processCommand(moveList.charAt(i));
                checkPlayerCollision();
                if(vampiresMove) {
                    moveVampires();
                    checkPlayerCollision();
                } 
            } else {
                break;
            }
        }
    }
    
    private void processCommand(char move) {
        switch(move) {
            case 'a': player.moveX(-1);
                break;
            case 's': player.moveY(1);
                break;
            case 'd': player.moveX(1);
                break;
            case 'w': player.moveY(-1);
                break;
        } 
    }
    
    private void checkPlayerCollision() {
        ArrayList<Vampire> slainVampires = new ArrayList<Vampire>();
        for(Vampire vampire : vampires) {
            if(vampire.getX() == player.getX() && vampire.getY() == player.getY()) {
                slainVampires.add(vampire);
            }
        }
        vampires.removeAll(slainVampires);
    }
    
    private void moveVampires() {
        Vampire tempVampire;
        for(Vampire vampire : vampires) {
            tempVampire = vampire;
            moveRandom(tempVampire);
            if(!vampires.contains(tempVampire)) { 
                vampire = tempVampire;
            }
        }
    }
    
    private void moveRandom(Vampire vampire) {
        Random random = new Random();
        boolean moveInX = random.nextBoolean();
        if(moveInX) {
            boolean moveXPositive = random.nextBoolean();
            if(moveXPositive) {
                vampire.moveX(1);
            } else {
                vampire.moveX(-1);
            }
        } else {
            boolean moveYPositive = random.nextBoolean();
            if(moveYPositive) {
                vampire.moveY(1);
            } else {
                vampire.moveY(-1);
            }
        }
    }
    
}
