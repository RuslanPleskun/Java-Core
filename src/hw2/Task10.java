package src.hw2;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        System.out.println("Task 10");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num = scanner.nextInt();
        task10(num);
    }

    public static void task10(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

}
