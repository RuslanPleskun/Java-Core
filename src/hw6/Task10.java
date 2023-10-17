package src.hw6;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean result = containsLuckyCharacter(inputString);
        System.out.println("Output: " + result);
    }

    public static boolean containsLuckyCharacter(String str) {
        int length = str.length();

        if (length < 3) {
            return false;
        }

        for (int i = 1; i < length - 1; i++) {
            char currentChar = str.charAt(i);
            char leftChar = str.charAt(i - 1);
            char rightChar = str.charAt(i + 1);

            if (currentChar == leftChar || currentChar == rightChar) {
                return true;
            }
        }
        return false;
    }
}
