package src.hw4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String mergedString = mergeStrings(firstString, secondString);

        System.out.println("Merged String: " + mergedString);
        scanner.close();
    }

    public static String mergeStrings(String str1, String str2) {
        return str1 + " " + str2;
    }
}
