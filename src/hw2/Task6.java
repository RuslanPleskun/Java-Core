package src.hw2;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        System.out.println("Task 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two different integers separated by a comma: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(",");
        int start = Integer.parseInt(numbers[0].trim());
        int end = Integer.parseInt(numbers[1].trim());
        task6(start, end);
    }

    public static void task6(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }

}
