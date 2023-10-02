package src.hw2;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        System.out.println("Task 7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = scanner.nextInt();
        task7(num);
    }

    public static void task7(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("The sum of all numbers up to " + number + " is = " + sum);
    }

}
