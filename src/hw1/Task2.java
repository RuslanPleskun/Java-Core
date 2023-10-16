package src.hw1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nTask 2");
        System.out.println("Please enter the first decimal number:");
        int num1 = sc.nextInt();

        System.out.println("Please enter the second decimal number:");
        int num2 = sc.nextInt();
        task2_1(num1, num2);

        System.out.println("Please enter the first floating number:");
        float num3 = sc.nextFloat();

        System.out.println("Please enter the second floating number:");
        float num4 = sc.nextFloat();
        task2_2(num3, num4);
    }

    public static void task2_1(int a, int b) {
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int rem = a % b;
        int div = 0;
        try {
            div = a / b;
        } catch (Exception e) {
            System.out.println("Division by 0 is not possible");
        }
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
        System.out.println("Difference of " + a + " and " + b + " is " + diff);
        System.out.println("Product of " + a + " and " + b + " is " + prod);
        System.out.println("Remainder of division of " + a + " and " + b + " is " + rem);
        System.out.println("Integer division of " + a + " and " + b + " is " + div);
    }

    public static void task2_2(float a, float b) {
        float sum = a + b;
        float diff = a - b;
        float prod = a * b;
        float rem = a % b;
        int div = 0;
        try {
            div = (int) (a / b);
        } catch (Exception e) {
            System.out.println("Division by 0 is not possible");
        }
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
        System.out.println("Difference of " + a + " and " + b + " is " + diff);
        System.out.println("Product of " + a + " and " + b + " is " + prod);
        System.out.println("Remainder of division of " + a + " and " + b + " is " + rem);
        System.out.println("Integer division of " + a + " and " + b + " is " + div);
    }

}
