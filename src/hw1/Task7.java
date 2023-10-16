package src.hw1;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nTask 7");
        System.out.println("Please enter the first natural number:");
        int numb1 = sc.nextInt();

        System.out.println("Please enter the second natural number:");
        int numb2 = sc.nextInt();
        task7(numb1, numb2);
    }

    public static void task7(int a, int b) {
        int mul = a * b;
        if(mul % 2 == 0) {
            System.out.println(mul + " - even");
        } else {
            System.out.println(mul + " - odd");
        }
        int lastDigit = mul % 10;
        if(lastDigit % 3 == 0) {
            System.out.println(lastDigit + " is divisible by 3");
        } else {
            System.out.println(lastDigit + " is not divisible by 3");
        }
    }

}
