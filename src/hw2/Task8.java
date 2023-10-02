package src.hw2;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        System.out.println("Task 8");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = scanner.nextInt();
        task8(num);
    }

    public static void task8(int num) {
        System.out.println("the first " + num + " of numbers that are divisible by 3.");
        for (int i = 1; i <= num; i++) {
            int number = 3 * i;
            System.out.print(number + " ");
        }
    }

}
