public class LexicographicRank {
    public static void main(String[] args) {
        System.out.println(findRank("STRING"));
    }

    public static int findRank(String s) {
        int rank = 1;
        int n = s.length();
        int[] factorial = new int[n + 1];
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) factorial[i] = factorial[i - 1] * i;

        for (int i = 0; i < n; i++) {
            int smaller = 0;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) < s.charAt(i)) smaller++;
            }
            rank += smaller factorial[n - i - 1];
        }
        return rank;
    }
}

