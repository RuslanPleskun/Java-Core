package src.hw6;

import java.util.Scanner;

public class Task4 {
    public static String getInitials(String name) {
        String[] words = name.split(" ");
        StringBuilder initials = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                initials.append(word.charAt(0));
            }
        }
        return initials.toString().toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String fullName = scanner.nextLine();
        scanner.close();

        String initials = getInitials(fullName);
        System.out.println("Initials: " + initials);
    }
}
