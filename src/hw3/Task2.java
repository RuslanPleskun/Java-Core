package src.hw3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = originalArray.length;
        int[] newArray = new int[n];

        for (int i = 0; i < n / 2; i++) {
            newArray[i] = originalArray[n / 2 + i];
        }

        for (int i = n / 2; i < n; i++) {
            newArray[i] = originalArray[i - n / 2];
        }

        for (int i = 0; i < n; i++) {
            if (i >= n / 2) {
                newArray[i] = newArray[n - i - 1];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
