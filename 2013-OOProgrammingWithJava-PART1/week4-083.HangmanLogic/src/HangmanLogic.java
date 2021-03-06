
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;
    

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens
        if (this.guessedLetters.contains(letter)) {
            return;
        } 
        // it the word does not contains the guessed letter, number of faults increase
        if (!this.word.contains(letter)) {
            this.numberOfFaults++;
        }
        // the letter is added among the already guessed letters
        this.guessedLetters += letter;
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        int i = 0;
        String displayWord = "";
        String letter;
        boolean correctGuess;
        // create the hidden word by interating through this.word letter by letter
        while (i < this.word.length()) {
            letter = this.word.charAt(i) + "";
            correctGuess = this.guessedLetters.contains(letter);
            if (correctGuess) {
                displayWord += letter;
            } else {
                displayWord += "_";
            }
            i++;
        }
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        return displayWord;
    }
}
