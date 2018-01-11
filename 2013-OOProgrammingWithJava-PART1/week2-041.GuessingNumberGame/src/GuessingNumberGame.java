
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = 1;//drawNumber();

        // program your solution here. Do not touch the above lines!
        int guess;
        int guessNumber = 0;
        
        
        while(true) {
            System.out.println("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());

            if (guess == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            else if (guess < numberDrawn) {
                guessNumber++;
                System.out.println("The number is greater, guesses made: " + guessNumber);
            }
            else {
                guessNumber++;
                System.out.println("The number is lesser, guesses made: " + guessNumber);
            }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
