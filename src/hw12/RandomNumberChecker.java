package src.hw12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberChecker {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = generateRandomNumbers(20, 0, 5000);
        System.out.printf("All elements in the list: %s%n", numberList);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int searchNumber = scanner.nextInt();

        int index = findNumberIndex(numberList, searchNumber);
        if (index != -1) {
            System.out.printf("The list contains the number %d at index %d%n", searchNumber, index);
        } else {
            System.out.printf("The list does not contain the number %d%n", searchNumber);
        }

        int min = Collections.min(numberList);
        int max = Collections.max(numberList);

        System.out.printf("Minimum number in the list: %d%n", min);
        System.out.printf("Maximum number in the list: %d%n", max);
    }

    public static ArrayList<Integer> generateRandomNumbers(int count, int min, int max) {
        ArrayList<Integer> numberList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            numberList.add(randomNumber);
        }
        return numberList;
    }

    public static int findNumberIndex(ArrayList<Integer> list, int searchNumber) {
        return list.indexOf(searchNumber);
    }
}
