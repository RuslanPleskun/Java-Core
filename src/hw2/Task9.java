package src.hw2;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        System.out.println("Task 9");
        task9();
    }

    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        System.out.println("Enter natural numbers (enter 0 to stop):");
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

}
