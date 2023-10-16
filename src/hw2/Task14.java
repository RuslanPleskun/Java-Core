package src.hw2;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        System.out.println("Task 14");
        task14();
    }

    public static void task14() {
        System.out.println("The multiplication table till 10");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
        }
    }

}
