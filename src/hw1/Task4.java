package src.hw1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nTask 4");
        System.out.println("Please enter the first number:");
        int numA = sc.nextInt();

        System.out.println("Please enter the second number:");
        int numB = sc.nextInt();

        System.out.println("Please enter the third number:");
        int numC = sc.nextInt();
        task4(numA, numB, numC);
    }

    public static void task4(int a, int b, int c) {
        System.out.println("Before swapping: a = " + a + ", b = " + b + ", c = " + c);
        int temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b + ", c = " + c);
    }

}
