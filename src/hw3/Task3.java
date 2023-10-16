package src.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstInt = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondInt = scanner.nextInt();

        int[] array = generateArrayWithRules(firstInt, secondInt);

        System.out.println("Output: " + Arrays.toString(array));
    }

    public static int[] generateArrayWithRules(int firstInt, int secondInt) {
        int[] array = new int[10];
        array[0] = firstInt;
        array[1] = secondInt;

        for (int i = 2; i < 10; i++) {
            int sum = array[i - 1] + array[i - 2];
            if (i % 2 == 0) {
                array[i] = sum * 3;
            } else {
                array[i] = sum / 2;
            }
        }
        return array;
    }
}
