package src.hw1;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nTask 11");
        System.out.println("Please enter the number[100-999]:");
        int digit = sc.nextInt();
        task11(digit);
    }

    public static void task11(int num) {
        if (num >= 100 && num <= 999) {
            int hundredsDigit = num / 100;
            int tensDigit = (num / 10) % 10;
            int onesDigit = num % 10;

            if ((hundredsDigit == tensDigit) && (tensDigit == onesDigit)) {
                System.out.println("The numbers are equal.");
            } else if ((hundredsDigit < tensDigit) && (tensDigit < onesDigit)) {
                System.out.println("Ascending order.");
            } else if ((hundredsDigit > tensDigit) && (tensDigit > onesDigit)) {
                System.out.println("Descending order.");
            } else {
                System.out.println("Try with another number.");
            }
        } else {
            System.out.println("Please enter a valid three-digit number within the specified range without the digit 0.");
        }
    }

}
