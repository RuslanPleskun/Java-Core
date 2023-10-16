package src.hw4;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeLetters(input);

        System.out.println("New string after removing 'p', 'q', and 'r': " + result);
        scanner.close();
    }

    public static String removeLetters(String input) {
        return input.replaceAll("[pqrPQR]", "");
    }
}
