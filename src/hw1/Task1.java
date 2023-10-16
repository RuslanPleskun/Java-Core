package src.hw1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1
        System.out.println("Task 1");
        System.out.println("Please enter the first floating number:");
        double a = sc.nextDouble();

        System.out.println("Please enter the second floating number:");
        double b = sc.nextDouble();

        System.out.println("Please enter the third floating number:");
        double c = sc.nextDouble();
        task1(a, b, c);

        // Task 2
        System.out.println("\nTask 2");
        System.out.println("Please enter the first decimal number:");
        int num1 = sc.nextInt();

        System.out.println("Please enter the second decimal number:");
        int num2 = sc.nextInt();
        task2_1(num1, num2);

        System.out.println("Please enter the first floating number:");
        float num3 = sc.nextFloat();

        System.out.println("Please enter the second floating number:");
        float num4 = sc.nextFloat();
        task2_2(num3, num4);

        // Task 3
        System.out.println("\nTask 3");
        System.out.println("Please enter the first decimal number:");
        int var1 = sc.nextInt();

        System.out.println("Please enter the second decimal number:");
        int var2 = sc.nextInt();
        task3(var1, var2);

        // Task 4
        System.out.println("\nTask 4");
        System.out.println("Please enter the first number:");
        int numA = sc.nextInt();

        System.out.println("Please enter the second number:");
        int numB = sc.nextInt();

        System.out.println("Please enter the third number:");
        int numC = sc.nextInt();
        task4(numA, numB, numC);

        // Task 5
        System.out.println("\nTask 5");
        System.out.println("Please enter current time:");
        int time = sc.nextInt();

        System.out.println("Please enter amount of money you have:");
        float money = sc.nextFloat();

        System.out.println("Please enter whether you're working right now:");
        boolean work = sc.nextBoolean();
        task5(time, money, work);

        // Task 6
        System.out.println("\nTask 6");
        System.out.println("Please enter four-digit natural number:");
        int num = sc.nextInt();
        task6(num);

        // Task 7
        System.out.println("\nTask 7");
        System.out.println("Please enter the first natural number:");
        int numb1 = sc.nextInt();

        System.out.println("Please enter the second natural number:");
        int numb2 = sc.nextInt();
        task7(numb1, numb2);

        // Task 8
        System.out.println("\nTask 8");
        System.out.println("Please enter the three digit number[111-999]:");
        int nmbr = sc.nextInt();
        task8(nmbr);

        // Task 9
        System.out.println("\nTask 9");
        System.out.println("Please enter the number[0-100]:");
        int numbr = sc.nextInt();
        task9(numbr);

        // Task 10
        System.out.println("\nTask 10");
        System.out.println("Please enter the number[0-24]:");
        int number = sc.nextInt();
        task10(number);

        // Task 11
        System.out.println("\nTask 11");
        System.out.println("Please enter the number[100-999]:");
        int digit = sc.nextInt();
        task11(digit);
    }

    public static void task1(double a, double b, double c) {
        String message = ((c > a) && (c < b)) || ((c > b) && (c < a))
                ? "Number " + c + " is between " + a + " and " + b
                : "Number " + c + " is not between " + a + " and " + b;
        System.out.println(message);
    }

    public static void task2_1(int a, int b) {
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int rem = a % b;
        int div = 0;
        try {
            div = a / b;
        } catch (Exception e) {
            System.out.println("Division by 0 is not possible");
        }
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
        System.out.println("Difference of " + a + " and " + b + " is " + diff);
        System.out.println("Product of " + a + " and " + b + " is " + prod);
        System.out.println("Remainder of division of " + a + " and " + b + " is " + rem);
        System.out.println("Integer division of " + a + " and " + b + " is " + div);
    }

    public static void task2_2(float a, float b) {
        float sum = a + b;
        float diff = a - b;
        float prod = a * b;
        float rem = a % b;
        int div = 0;
        try {
            div = (int) (a / b);
        } catch (Exception e) {
            System.out.println("Division by 0 is not possible");
        }
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
        System.out.println("Difference of " + a + " and " + b + " is " + diff);
        System.out.println("Product of " + a + " and " + b + " is " + prod);
        System.out.println("Remainder of division of " + a + " and " + b + " is " + rem);
        System.out.println("Integer division of " + a + " and " + b + " is " + div);
    }

    public static void task3(int a, int b) {
        int min = a;
        int max = b;
        if(a >= b) {
            min = b;
            max = a;
        }
        System.out.println("Ascending order: " + min + ", " + max);
        System.out.println("Descending order: " + max + ", " + min);
    }

    public static void task4(int a, int b, int c) {
        System.out.println("Before swapping: a = " + a + ", b = " + b + ", c = " + c);
        int temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b + ", c = " + c);
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
