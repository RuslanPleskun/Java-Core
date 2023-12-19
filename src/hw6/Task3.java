package src.hw6;

public class Task3 {
    public static String reverse(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        } else {
            char lastChar = input.charAt(input.length() - 1);
            String reversed = reverse(input.substring(0, input.length() - 1));
            return lastChar + reversed;
        }
    }

    public static void main(String[] args) {
        String inputString = "word";
        String reversedString = reverse(inputString);
        System.out.println("Input: " + inputString);
        System.out.println("Output: " + reversedString);
    }
}
