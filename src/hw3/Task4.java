package src.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        if (isMirrored(array)) {
            System.out.println("The array is mirrored.");
        } else {
            System.out.println("The array is not mirrored.");
        }
    }

    public static boolean isMirrored(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
