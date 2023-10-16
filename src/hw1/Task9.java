package src.hw1;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nTask 9");
        System.out.println("Please enter the number[0-100]:");
        int numbr = sc.nextInt();
        task9(numbr);
    }

    public static void task9(int num) {
        if (num == 0) {
            System.out.println("It will not rain");
        } else if((num > 0) && (num <= 5)) {
            System.out.println("Minimal chance of precipitation");
        } else if((num > 5) && (num <= 20)) {
            System.out.println("A small chance of precipitation");
        } else if((num > 20) && (num <= 50)) {
            System.out.println("There is a chance of precipitation");
        } else if((num > 50) && (num <= 80)) {
            System.out.println("High chance of precipitation");
        } else if((num > 80) && (num <= 100)) {
            System.out.println("It will rain");
        } else {
            System.out.println("Invalid number entered. Should be in the range [0-100]. Try again!");
        }
    }

}
