public class DistinctPatternSearch {
    public static void main(String[] args) {
        String text = "geeksforgeeks";
        String pattern = "geek";
        System.out.println(searchDistinctPattern(text, pattern));
    }

    public static boolean searchDistinctPattern(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        if (m > n) return false;

        boolean[] seen = new boolean[256];
        for (char c : pattern.toCharArray()) {
            if (seen[c]) return false; // pattern must contain distinct characters
            seen[c] = true;
        }

        int i = 0;
        while (i <= n - m) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return true;
            }
            if (j == 0) {
                i++;
            } else {
                i += j; // skip over matched prefix because pattern chars are distinct
            }
        }
        return false;
    }
}