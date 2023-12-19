package src.hw4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isOdd = isOdd(number);

        if (isOdd) {
            System.out.println(number + " is an odd number.");
        } else {
            System.out.println(number + " is an even number.");
        }
        scanner.close();
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
