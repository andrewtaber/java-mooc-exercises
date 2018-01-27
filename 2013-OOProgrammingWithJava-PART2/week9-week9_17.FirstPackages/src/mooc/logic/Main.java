package mooc.logic;


import mooc.ui.TextUserInterface;
import mooc.ui.UserInterface;
/**
 *
 * @author andytaber
 */
public class Main {
    
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
    
}
