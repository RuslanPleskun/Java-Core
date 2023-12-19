package src.hw4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string (max 50 characters): ");
        String input = scanner.nextLine();

        if (input.length() <= 50) {
            convertAndPrintString(input);
        } else {
            System.out.println("The input string is too long. It should be 50 characters or less.");
        }
        scanner.close();
    }

    public static void convertAndPrintString(String input) {
        String uppercase = input.toUpperCase();
        String lowercase = input.toLowerCase();

        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
    }
}
