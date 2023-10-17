package src.hw6;

import java.util.Scanner;

public class Task2 {
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        scanner.close();

        if (userInput < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = calculateFactorial(userInput);
            System.out.println("Factorial of " + userInput + " is: " + factorial);
        }
    }
}
