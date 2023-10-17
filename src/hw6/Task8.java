package src.hw6;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        String result = processString(userInput);
        System.out.println("Processed string: " + result);
    }

    public static String processString(String input) {
        if (input.length() < 2) {
            return "";
        }
        char firstChar = input.charAt(0);
        char secondChar = input.charAt(1);
        String remainingString = input.substring(2);

        if (firstChar == 'g' && secondChar == 'h') {
            return "gh" + remainingString;
        } else if (firstChar == 'g') {
            return "g" + remainingString;
        } else if (secondChar == 'h') {
            return "h" + remainingString;
        } else {
            return remainingString;
        }
    }
}
