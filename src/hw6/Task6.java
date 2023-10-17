package src.hw6;

public class Task6 {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[26];
        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            charCount[c - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "aaangmr";
        boolean areAnagrams = areAnagrams(str1, str2);
        System.out.println(areAnagrams);
    }
}
