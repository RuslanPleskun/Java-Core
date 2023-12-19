package src.hw4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        String userInput = scanner.nextLine();

        try {
            int number = Integer.parseInt(userInput);

            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long result = factorial(number);
                System.out.println("The factorial of " + number + " is: " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        scanner.close();
    }

    public static long factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
