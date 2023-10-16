package src.hw2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Task 1");
        System.out.println("Please enter either Y/y or N/n character:");
        char a = sc.next().charAt(0);
        task1(a);
    }

    public static void task1(char input) {
        char letter = Character.toUpperCase(input);
        switch (letter) {
            case 'Y' -> System.out.println("Yes");
            case 'N' -> System.out.println("No");
            default -> System.out.println("Try again! Please enter either Y/y or N/n character!!!");
        }
    }

}
