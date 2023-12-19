package src.hw3;

public class Task10 {
    public static void main(String[] args) {
        int[] sequence1 = {1, 6, 3, 7, 2, 9, -2, 12, 5};
        int[] sequence2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        printZigzagStatus(sequence1);
        printZigzagStatus(sequence2);
    }

    public static void printZigzagStatus(int[] sequence) {
        if (isZigzag(sequence)) {
            System.out.println("Zigzag");
        } else {
            System.out.println("Not a Zigzag");
        }
    }

    public static boolean isZigzag(int[] sequence) {
        if (sequence.length < 3) {
            return false;
        }

        for (int i = 1; i < sequence.length - 1; i++) {
            if (!((sequence[i - 1] < sequence[i] && sequence[i] > sequence[i + 1]) ||
                    (sequence[i - 1] > sequence[i] && sequence[i] < sequence[i + 1]))) {
                return false;
            }
        }

        return true;
    }
}
