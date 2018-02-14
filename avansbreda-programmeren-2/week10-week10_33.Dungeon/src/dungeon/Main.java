package dungeon;

import Movables.Movable;
import Movables.Player;
import Movables.Vampire;


public class Main {
    public static void main(String[] args) {
        //new Dungeon(10,10,5,14,true).run();
        Movable player = new Player(10);
        Movable vampire = new Vampire(0, 0, true);
        
        System.out.println(player.inSamePosition(vampire));
    }
}
