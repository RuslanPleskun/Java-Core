package src.hw6;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretWord = "hangman";
        int maxAttempts = 10;
        char[] guessedWord = new char[secretWord.length()];
        Arrays.fill(guessedWord, '_');

        int attempts = 0;
        boolean isGuessed = false;

        System.out.println("Welcome to Hangman!");

        while (attempts < maxAttempts) {
            System.out.println("Attempts left: " + (maxAttempts - attempts));
            System.out.println("Current state: " + String.valueOf(guessedWord));
            System.out.println("Enter a letter: ");
            char guess = scanner.next().charAt(0);

            boolean found = false;

            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                attempts++;
            }

            if (String.valueOf(guessedWord).equals(secretWord)) {
                isGuessed = true;
                break;
            }
        }

        if (isGuessed) {
            System.out.println("Congratulations! You guessed the word: " + secretWord);
        } else {
            System.out.println("Out of attempts. The word was: " + secretWord);
        }
    }
}
