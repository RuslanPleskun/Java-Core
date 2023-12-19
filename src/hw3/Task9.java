package src.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 10 numbers in the array (comma-separated): ");
        String input = scanner.nextLine();
        int[] array = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        swapElements(array, 0, 1);
        swapElements(array, 8, 9);
        swapElements(array, 2, 3);
        swapElements(array, 4, 5);
        swapElements(array, 6, 7);

        System.out.println("Output: " + Arrays.toString(array));
    }

    public static void swapElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
