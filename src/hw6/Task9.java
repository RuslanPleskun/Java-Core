package src.hw6;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String secondString = scanner.nextLine();

        boolean result = checkStringEnd(firstString, secondString);
        System.out.println("Output: " + result);
    }

    public static boolean checkStringEnd(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        return str1.endsWith(str2) || str2.endsWith(str1);
    }
}
