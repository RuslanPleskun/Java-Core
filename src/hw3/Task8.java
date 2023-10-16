package src.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements of the array (comma-separated): ");
        String input = scanner.nextLine();
        int[] array1 = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] array2 = Arrays.copyOf(array1, array1.length);

        reverseArrayWithAdditionalArray(array1);
        reverseArrayInPlace(array2);

        System.out.println("Reversed array (with additional array): " + Arrays.toString(array1));
        System.out.println("Reversed array (no additional array): " + Arrays.toString(array2));
    }

    public static void reverseArrayWithAdditionalArray(int[] array) {
        int n = array.length;
        int[] reversedArray = new int[n];

        for (int i = 0; i < n; i++) {
            reversedArray[i] = array[n - i - 1];
        }
        for (int i = 0; i < n; i++) {
            array[i] = reversedArray[i];
        }
    }

    public static void reverseArrayInPlace(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
