package src.hw2;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Task 4");
        task4();
    }

    public static void task4() {
        System.out.println("All even numbers from -30 to 30");
        for (int i = -30; i <= 30; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
