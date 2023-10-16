package src.hw12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConcordanceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        HashMap<Character, StringBuilder> concordance = generateConcordance(input);

        System.out.println("Concordance of characters in the string:");
        printConcordance(concordance);
    }

    public static HashMap<Character, StringBuilder> generateConcordance(String input) {
        HashMap<Character, StringBuilder> concordance = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (concordance.containsKey(character)) {
                concordance.get(character).append(", ").append(i);
            } else {
                StringBuilder positions = new StringBuilder(String.valueOf(i));
                concordance.put(character, positions);
            }
        }
        return concordance;
    }

    public static void printConcordance(HashMap<Character, StringBuilder> concordance) {
        System.out.print("{");
        boolean first = true;
        for (Map.Entry<Character, StringBuilder> entry : concordance.entrySet()) {
            if (entry.getKey() == ' ') {
                continue;
            }
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(entry.getKey() + "=[" + entry.getValue() + "]");
            first = false;
        }
        System.out.println("}");
    }
}
