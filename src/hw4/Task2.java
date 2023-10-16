package src.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        printLongestStringAndLengths(firstString, secondString);
        scanner.close();
    }

    public static void printLongestStringAndLengths(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();

        String longest = (length1 >= length2) ? str1 : str2;

        System.out.println("The longest string is: " + longest);
        System.out.println(str1 + " - " + length1 + ", " + str2 + " - " + length2);
    }
}
