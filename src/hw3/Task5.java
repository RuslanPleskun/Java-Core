package src.hw3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 4;
        }
        System.out.println("Output: " + Arrays.toString(array));
    }
}
