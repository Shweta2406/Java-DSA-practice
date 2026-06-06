import java.util.Arrays;

public class Anagram {
    static final int CHAR=256;
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println("Naive: " + areAnagramsNaive(s1, s2));
        System.out.println("Efficient: " + areAnagramsEfficient(s1, s2));
    }

    public static boolean areAnagramsNaive(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static boolean areAnagramsEfficient(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[CHAR];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
