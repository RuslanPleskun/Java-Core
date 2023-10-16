package src.hw4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing letters and numbers: ");
        String input = scanner.nextLine();

        extractAndSumNumbers(input);
        scanner.close();
    }

    public static void extractAndSumNumbers(String input) {
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(input);

        int sum = 0;

        while (matcher.find()) {
            String numberStr = matcher.group();
            int number = Integer.parseInt(numberStr);
            System.out.println(number);
            sum += number;
        }
        System.out.println("The sum of all numbers is: " + sum);
    }
}
