package src.hw3;

public class Task12 {
    public static void main(String[] args) {
        int[][] array = {
                {48, 72, 13, 14, 15, 43, 19},
                {21, 22, 53, 24, 75, 48, 17},
                {31, 57, 33, 34, 35, 63, 12},
                {41, 95, 43, 44, 45, 91, 50},
                {59, 52, 53, 54, 55, 14, 32},
                {61, 69, 63, 64, 65, 81, 15},
                {42, 32, 12, 26, 59, 67, 97}
        };
        int smallest = findSmallestElement(array);
        int largest = findLargestElement(array);

        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }

    public static int findSmallestElement(int[][] array) {
        int smallest = Integer.MAX_VALUE;

        for (int[] row : array) {
            for (int num : row) {
                if (num < smallest) {
                    smallest = num;
                }
            }
        }
        return smallest;
    }

    public static int findLargestElement(int[][] array) {
        int largest = Integer.MIN_VALUE;

        for (int[] row : array) {
            for (int num : row) {
                if (num > largest) {
                    largest = num;
                }
            }
        }
        return largest;
    }
}
