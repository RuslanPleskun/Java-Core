package src.hw2;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        System.out.println("Task 12");
        task12();
    }

    public static void task12() {
        System.out.println("All natural three-digit numbers that do not have the same digits");
        for (int i = 100; i <= 999; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int ones = i % 10;

            if (hundreds != tens && tens != ones && hundreds != ones) {
                System.out.println(i);
            }
        }
    }

}
