package src.hw2;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        System.out.println("Task 13");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer N (10-300): ");
        int num = scanner.nextInt();
        task13(num);
    }

    public static void task13(int num) {
        System.out.println("All the numbers that are multiples of 7 and are smaller than N displayed in reverse order");
        for (int i = num - 1; i > 0; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

}
