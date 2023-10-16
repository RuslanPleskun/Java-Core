package src.hw4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with words separated by spaces: ");
        String input = scanner.nextLine();

        String capitalizedString = capitalizeWords(input);

        System.out.println("Capitalized String: " + capitalizedString);
        scanner.close();
    }

    public static String capitalizeWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                result.append(" ");
            }
            if (!words[i].isEmpty()) {
                String firstLetter = words[i].substring(0, 1).toUpperCase();
                String restOfWord = words[i].substring(1).toLowerCase();
                result.append(firstLetter).append(restOfWord);
            }
        }
        return result.toString();
    }
}
