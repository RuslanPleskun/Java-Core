package src.hw3;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] array1 = {18, 19, 32, 1, 3, 4, 5, 6, 7, 8};
        int[] array2 = {1, 2, 3, 4, 5, 16, 17, 18, 27, 11};
        int[] smallerArray = compareAndCreateSmallerArray(array1, array2);

        System.out.println("The content of all 3 arrays");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(smallerArray));

        int sum1 = Arrays.stream(array1).sum();
        int sum2 = Arrays.stream(array2).sum();
        int sum3 = Arrays.stream(smallerArray).sum();

        int product = 1;
        for (int num : smallerArray) {
            product *= num;
        }
        System.out.println("The sum of the 3 arrays: " + sum1 + " + " + sum2 + " + " + sum3 + " = " + (sum1 + sum2 + sum3));
        System.out.println("The product of the elements of the third array: " + product);
    }

    public static int[] compareAndCreateSmallerArray(int[] array1, int[] array2) {
        int length = Math.min(array1.length, array2.length);
        int[] smallerArray = new int[length];

        for (int i = 0; i < length; i++) {
            smallerArray[i] = Math.min(array1[i], array2[i]);
        }
        return smallerArray;
    }
}
