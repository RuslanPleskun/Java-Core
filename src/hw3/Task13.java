package src.hw3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimension of the square array: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        System.out.println("Enter the values of the array, row by row(without comma):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int mainDiagonalSum = calculateMainDiagonalSum(array);
        int secondDiagonalSum = calculateSecondDiagonalSum(array);

        System.out.println("The main diagonal sum is: " + mainDiagonalSum);
        System.out.println("The second diagonal sum is: " + secondDiagonalSum);
    }

    public static int calculateMainDiagonalSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    public static int calculateSecondDiagonalSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][array.length - i - 1];
        }
        return sum;
    }
}
