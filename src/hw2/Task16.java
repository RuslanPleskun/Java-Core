package src.hw2;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        System.out.println("Task 16");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (10-30000): ");
        int num = scanner.nextInt();
        task16(num);
    }

    public static void task16(int num) {
        int original = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

}
