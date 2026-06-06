public class LongestDistinctSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestDistinct(s));
    }

    public static int longestDistinct(String s) {
        int[] lastIndex = new int[256];
        java.util.Arrays.fill(lastIndex, -1);
        int maxLen = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            start = Math.max(start, lastIndex[s.charAt(i)] + 1);
            maxLen = Math.max(maxLen, i - start + 1);
            lastIndex[s.charAt(i)] = i;
        }
        return maxLen;
    }
}
