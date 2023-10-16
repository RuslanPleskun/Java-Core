package src.hw2;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
        System.out.println("Task 19");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci numbers to generate: ");
        int num = scanner.nextInt();
        task19(num);
    }

    public static void task19(int num) {
        int first = 0, second = 1;
        System.out.print(first + ", " + second + ", ");
        for (int i = 2; i < num; i++) {
            int next = first + second;
            System.out.print(next + ", ");
            first = second;
            second = next;
        }
    }

}
