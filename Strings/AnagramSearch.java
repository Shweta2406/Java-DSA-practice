import java.util.*;


public class AnagramSearch {
    public static void main(String[] args) {
        String text = "cbaebabacd";
        String pattern = "abc";
        System.out.println(findAnagramIndices(text, pattern));
    }

    public static boolean areSame(int[] count1, int[] count2) {
        return Arrays.equals(count1, count2);
    }

    public static List<Integer> findAnagramIndices(String text, String pattern) {
        List<Integer> indices = new ArrayList<>();
        if (pattern.length() > text.length()) return indices;

        int[] count = new int[26];
        for (char c : pattern.toCharArray()) {
            count[c - 'a']++;
        }

        int window = pattern.length();
        int[] windowCount = new int[26];
        for (int i = 0; i < window; i++) {
            windowCount[text.charAt(i) - 'a']++;
        }
        if (areSame(count, windowCount)) {
            indices.add(0);
        }

        for (int i = window; i < text.length(); i++) {
            windowCount[text.charAt(i) - 'a']++;
            windowCount[text.charAt(i - window) - 'a']--;
            if (areSame(count, windowCount)) {
                indices.add(i - window + 1);
            }
        }
        return indices;
    }
}
