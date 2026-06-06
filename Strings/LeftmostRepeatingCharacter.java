public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(findLeftmostRepeating(s));
    }

    public static int findLeftmostRepeating(String s) {
        boolean[] visited = new boolean[256];
        int res = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (!visited[c]) {
                visited[c] = true;
            } else {
                res = i;
            }
        }
        return res;
    }
}
