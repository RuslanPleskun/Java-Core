package src.hw6;

public class Task1 {
    public static int reverse(int number) {
        if (number < 10) {
            return number;
        } else {
            int lastDigit = number % 10;
            int remainingDigits = number / 10;
            int reversed = reverse(remainingDigits);
            int numDigits = (int)Math.log10(remainingDigits) + 1;
            return lastDigit * (int)Math.pow(10, numDigits) + reversed;
        }
    }

    public static void main(String[] args) {
        int inputNumber = 2854;
        int reversedNumber = reverse(inputNumber);
        System.out.println("Input: " + inputNumber);
        System.out.println("Output: " + reversedNumber);
    }
}
