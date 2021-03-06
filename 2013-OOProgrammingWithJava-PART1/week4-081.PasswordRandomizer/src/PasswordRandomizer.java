import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private int number;
    private Random random = new Random();
    

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        int i = 0;
        
        while (i < this.length) {
            password += (char)(random.nextInt(26) + 'a');
            i++;
        }
        
        return password;
    }
}
