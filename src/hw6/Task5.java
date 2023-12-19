package src.hw6;

public class Task5 {
    public static void countLetters(String input) {
        int[] letterCount = new int[26];

        for (char character : input.toCharArray()) {
            if (Character.isLetter(character)) {
                char lowercaseChar = Character.toLowerCase(character);
                int index = lowercaseChar - 'a';
                letterCount[index]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i);
            System.out.println(letter + "-" + letterCount[i]);
        }
    }

    public static void main(String[] args) {
        String inputString = "AaaEbBCc deD";
        countLetters(inputString);
    }
}
