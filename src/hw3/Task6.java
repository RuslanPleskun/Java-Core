package src.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements of the first array (comma-separated): ");
        String input1 = scanner.nextLine();
        int[] array1 = Arrays.stream(input1.split(", ")).mapToInt(Integer::parseInt).toArray();

        System.out.print("Enter the elements of the second array (comma-separated): ");
        String input2 = scanner.nextLine();
        int[] array2 = Arrays.stream(input2.split(", ")).mapToInt(Integer::parseInt).toArray();

        if (areArraysIdentical(array1, array2)) {
            System.out.println("Identical");
        } else {
            System.out.println("Not identical");
        }
    }

    public static boolean areArraysIdentical(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }
}
