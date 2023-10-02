package src.hw2;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        System.out.println("Task 18");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        task18(num);
    }

    public static void task18(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }

}
