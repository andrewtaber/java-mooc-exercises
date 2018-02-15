package dungeon;

import Movables.Movable;
import Movables.Player;
import Movables.Vampire;
import Movables.VampireGenerator;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        new Dungeon(10,10,5,14,true).run();
        
        
    }
}
