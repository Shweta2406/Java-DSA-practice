public class LeftmostNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "swiss";
        System.out.println(findLeftmostNonRepeating(s));
    }

    public static int findLeftmostNonRepeating(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) return i;
        }
        return -1;
    }
}
