import java.util.ArrayList;
import java.util.Scanner;

public class TrueHangmanGame {
    public static void main(String[] args) {

        String wordToGuess = "PROGRAMMING".toUpperCase();
        int wrongGuess = 0;
        int maxWrongGuesses = 6;

        ArrayList<Character> displayedWord = new ArrayList<>();
        ArrayList<Character> guessedLetters = new ArrayList<>();

        // Initialize the hidden word with underscores
        for (int i = 0; i < wordToGuess.length(); i++) {
            displayedWord.add('_');
        }

        Scanner scanner = new Scanner(System.in);

        // Game loop: Continues while there are blanks AND wrong guesses are under the limit
        while (displayedWord.contains('_') && wrongGuess < maxWrongGuesses) {
            System.out.println("\n***********************************");
            printHangman(wrongGuess); // Draw the current state of the hangman
            
            System.out.println("Guessed letters: " + guessedLetters);
            System.out.print("Word to guess: ");
            for (char c : displayedWord) {
                System.out.print(c + " ");
            }
            System.out.println("\n");

            System.out.print("Enter a letter: ");
            String input = scanner.next();
            
            // Basic input validation to ensure they type at least one character
            if (input.isEmpty()) continue;
            
            char guess = Character.toUpperCase(input.charAt(0));

            // Check if they already guessed this letter
            if (guessedLetters.contains(guess)) {
                System.out.println("You already guessed '" + guess + "'! Try a different letter.");
                continue; 
            }

            // Add to our list of guessed letters
            guessedLetters.add(guess);

            // Check if the guess is in the word
            if (wordToGuess.indexOf(guess) >= 0) {
                System.out.println("Good guess!");
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guess) {
                        displayedWord.set(i, guess);
                    }
                }
            } else {
                System.out.println("Wrong guess!");
                wrongGuess++;
            }
            
            System.out.println("Wrong guesses: " + wrongGuess + " / " + maxWrongGuesses);
        }
       
        // --- GAME OVER SUMMARY ---
        System.out.println("\n-----------------------------------");
        printHangman(wrongGuess);
        
        // Check WHY the loop ended (Did they win or lose?)
        if (!displayedWord.contains('_')) {
            System.out.println("🎉 YOU WON! 🎉");
            System.out.println("You guessed the word: " + wordToGuess);
        } else {
            System.out.println("💀 GAME OVER! 💀");
            System.out.println("The word was: " + wordToGuess);
        }
        System.out.println("-----------------------------------");
        
        scanner.close();
    }

    /**
     * A helper method to print the ASCII art for the Hangman.
     */
    private static void printHangman(int wrongGuesses) {
        String[] stages = {
            // Stage 0: 0 wrong guesses
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
            // Stage 1: 1 wrong guess (Head)
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
            // Stage 2: 2 wrong guesses (Body)
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
            // Stage 3: 3 wrong guesses (One Arm)
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
            // Stage 4: 4 wrong guesses (Both Arms)
            "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
            // Stage 5: 5 wrong guesses (One Leg)
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
            // Stage 6: 6 wrong guesses (Both Legs - Game Over)
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="
        };
        
        System.out.println(stages[wrongGuesses]);
    }
}