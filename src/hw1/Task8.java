package src.hw1;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nTask 8");
        System.out.println("Please enter the three digit number[111-999]:");
        int nmbr = sc.nextInt();
        task8(nmbr);
    }

    public static void task8(int num) {
        if (num >= 111 && num <= 999 && !containsZero(num)) {
            int hundredsDigit = (num % 1000) / 100;
            int tensDigit = (num % 100) / 10;
            int onesDigit = num % 10;

            if ((num % hundredsDigit == 0) && (num % tensDigit == 0) && (num % onesDigit == 0)) {
                System.out.println("Entered three digit number " + num + " is divisible by each of its digits.");
            } else {
                System.out.println("Entered three digit number " + num + " is NOT divisible by each of its digits.");
            }
        } else {
            System.out.println("Please enter a valid three-digit number within the specified range without the digit 0.");
        }
    }

    public static boolean containsZero(int number) {
        while (number > 0) {
            if (number % 10 == 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

}
