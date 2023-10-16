package src.hw2;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        System.out.println("Task 17");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num = scanner.nextInt();
        task17(num);
    }

    public static void task17(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }

}
