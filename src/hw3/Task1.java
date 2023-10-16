package src.hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int largestMultipleOf5 = findLargestMultipleOf5(array);

        if (largestMultipleOf5 != Integer.MIN_VALUE) {
            System.out.println("The largest multiple of 5 in the array is: " + largestMultipleOf5);
        } else {
            System.out.println("No multiple of 5 found in the array.");
        }
    }

    public static int findLargestMultipleOf5(int[] array) {
        int largestMultipleOf5 = Integer.MIN_VALUE;

        for (int i : array) {
            if (i % 5 == 0 && i > largestMultipleOf5) {
                largestMultipleOf5 = i;
            }
        }
        return largestMultipleOf5;
    }
}
