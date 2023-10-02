package src.hw1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nTask 3");
        System.out.println("Please enter the first decimal number:");
        int var1 = sc.nextInt();

        System.out.println("Please enter the second decimal number:");
        int var2 = sc.nextInt();
        task3(var1, var2);
    }

    public static void task3(int a, int b) {
        int min = a;
        int max = b;
        if(a >= b) {
            min = b;
            max = a;
        }
        System.out.println("Ascending order: " + min + ", " + max);
        System.out.println("Descending order: " + max + ", " + min);
    }

}
