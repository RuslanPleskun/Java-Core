package src.hw12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommonLettersCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();

        Map<Character, Integer> letterFrequency = calculateLetterFrequencies(input);
        displayLetterFrequency(letterFrequency);
    }

    public static Map<Character, Integer> calculateLetterFrequencies(String input) {
        Map<Character, Integer> letterFrequency = new HashMap<>();

        for (char letter : input.toCharArray()) {
            if (Character.isLetter(letter)) {
                letterFrequency.put(letter, letterFrequency.getOrDefault(letter, 0) + 1);
            }
        }
        return letterFrequency;
    }

    public static void displayLetterFrequency(Map<Character, Integer> letterFrequency) {
        int maxFrequency = letterFrequency.values().stream().mapToInt(Integer::intValue).max().orElse(0);
        int numDigits = (int) Math.log10(maxFrequency) + 1;

        letterFrequency.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> {
                    char letter = entry.getKey();
                    int frequency = entry.getValue();
                    String frequencyStr = String.valueOf(frequency);
                    String formattedFrequency = String.format("%" + numDigits + "s", frequencyStr);

                    System.out.print(letter + ": " + formattedFrequency + " ");
                    for (int i = 0; i < frequency; i++) {
                        System.out.print("#");
                    }
                    System.out.println();
                });
    }
}
