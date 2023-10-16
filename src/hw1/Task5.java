package src.hw1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nTask 5");
        System.out.println("Please enter current time:");
        int time = sc.nextInt();

        System.out.println("Please enter amount of money you have:");
        float money = sc.nextFloat();

        System.out.println("Please enter whether you're working right now:");
        boolean work = sc.nextBoolean();
        task5(time, money, work);
    }

    public static void task5(int time, float money, boolean work) {
        if(time >= 10 && time < 19) {
            if(work) {
                System.out.println("I'm at work, I'll be working and won't be able to go out.");
            } else if(money > 10) {
                System.out.println("I will go to the cinema.");
            } else if(money <= 10 && money >= 0) {
                System.out.println("I'll go for a walk.");
            } else {
                System.out.println("Incorrectly entered amount of money value");
            }
        } else if(time >= 19 && time <= 24) {
            if(money > 20) {
                System.out.println("I will go to a disco.");
            }else if(money <= 20 && money >= 0) {
                System.out.println("I will go to sleep.");
            } else {
                System.out.println("Incorrectly entered amount of money value");
            }
        } else if(time > 0 && time < 10) {
            System.out.println("I'm sleeping.");
        } else {
            System.out.println("Incorrect time value is entered");
        }
    }

}
