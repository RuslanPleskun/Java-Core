package src.hw1;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nTask 10");
        System.out.println("Please enter the number[0-24]:");
        int number = sc.nextInt();
        task10(number);
    }

    public static void task10(int num) {
        if ((num == 24) || ((num >= 0) && (num <= 5))) {
            System.out.println("Why aren't you sleeping?");
        } else if((num > 5) && (num <= 10)) {
            System.out.println("Good morning");
        } else if((num >= 11) && (num <= 18)) {
            System.out.println("Good day");
        } else if((num >= 19) && (num <= 23)) {
            System.out.println("Good evening");
        } else {
            System.out.println("Invalid number entered. Should be in the range [0-24]. Try again!");
        }
    }

}
