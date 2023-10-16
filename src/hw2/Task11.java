package src.hw2;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        System.out.println("Task 11");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the triangle: ");
        int num = scanner.nextInt();
        task11(num);
    }

    public static void task11(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
