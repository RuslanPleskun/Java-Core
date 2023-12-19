package src.hw3;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 10};

        ArrayList<Integer> longestSequence = findLongestIdenticalSequence(array);

        if (!longestSequence.isEmpty()) {
            System.out.print("Output: ");
            for (int i = 0; i < longestSequence.size(); i++) {
                System.out.print(longestSequence.get(i));
                if (i < longestSequence.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("No identical sequence found.");
        }
    }

    public static ArrayList<Integer> findLongestIdenticalSequence(int[] array) {
        ArrayList<Integer> longestSequence = new ArrayList<>();
        ArrayList<Integer> currentSequence = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i] == array[i - 1]) {
                currentSequence.add(array[i]);
            } else {
                currentSequence = new ArrayList<>();
                currentSequence.add(array[i]);
            }
            if (currentSequence.size() > longestSequence.size()) {
                longestSequence = new ArrayList<>(currentSequence);
            }
        }
        return longestSequence;
    }
}
