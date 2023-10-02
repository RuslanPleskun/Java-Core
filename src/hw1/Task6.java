package src.hw1;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nTask 6");
        System.out.println("Please enter four-digit natural number:");
        int num = sc.nextInt();
        task6(num);
    }

    public static void task6(int num) {
        if (num >= 1000 && num <= 9999) {
            int thousandsDigit = num / 1000;
            int hundredsDigit = (num % 1000) / 100;
            int tensDigit = (num % 100) / 10;
            int onesDigit = num % 10;

            int firstTwoDigitNumber = (thousandsDigit * 10) + onesDigit;
            int secondTwoDigitNumber = (hundredsDigit * 10) + tensDigit;

            if (firstTwoDigitNumber > secondTwoDigitNumber) {
                System.out.println("Output: " + firstTwoDigitNumber + " > " + secondTwoDigitNumber);
            } else if (firstTwoDigitNumber < secondTwoDigitNumber) {
                System.out.println("Output: " + firstTwoDigitNumber + " < " + secondTwoDigitNumber);
            } else {
                System.out.println("Output: " + firstTwoDigitNumber + " = " + secondTwoDigitNumber);
            }
        } else {
            System.out.println("Please enter a valid four-digit natural number within the specified range.");
        }
    }

}
