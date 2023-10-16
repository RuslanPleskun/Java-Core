package src.hw2;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        System.out.println("Task 15");
        task15();
    }

    public static void task15() {
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print(i + " * " + j + "; ");
            }
            System.out.println();
        }
    }

}
