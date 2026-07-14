import java.util.ArrayList;
import java.util.Scanner;

public class HangmanLogic {
    public static void main(String[] args) {

        String wordToGuess = "Heart".toUpperCase();
        int wrongGuess = 0;

       ArrayList<Character> displayedWord = new ArrayList<>();

        // Initialize once
        for (int i = 0; i < wordToGuess.length(); i++) {
            displayedWord.add('_');
        }

        Scanner scanner = new Scanner(System.in);

        // Game loop
        while (displayedWord.contains('_') ) {
            System.out.println("***********************************");
            System.out.print("Word to guess: ");
            for (char c : displayedWord) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Enter a letter: ");
            char guess = Character.toUpperCase(scanner.next().charAt(0));
            if (wordToGuess.indexOf(guess) >= 0) {
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guess) {
                        displayedWord.set(i, guess);
                    }
                }
            } else {
                wrongGuess++;
            }
            System.out.println("Wrong guesses: " + wrongGuess);
        }
       
        System.out.println("-----------------------------------\n");
        System.out.println(" The word: " + wordToGuess.toUpperCase());
        System.out.println("Total wrong guesses: " + wrongGuess);
        System.out.println("You guessed the word!");
        System.out.println("\n-----------------------------------");
        scanner.close();
    }
}