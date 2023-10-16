package src.hw3;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] originalArray = new int[rows][columns];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                originalArray[i][j] = scanner.nextInt();
            }
        }

        int[][] rotatedArray = rotateArrayNegative90Degrees(originalArray);

        System.out.println("Rotated Array:");

        for (int[] i : rotatedArray) {
            for (int j : i) {
                String formattedValue = String.format("%3d", j);
                System.out.print(formattedValue + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateArrayNegative90Degrees(int[][] originalArray) {
        int rows = originalArray.length;
        int columns = originalArray[0].length;
        int[][] rotatedArray = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rotatedArray[j][i] = originalArray[i][columns - j - 1];
            }
        }
        return rotatedArray;
    }
}
