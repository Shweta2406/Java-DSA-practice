public class PrintCharFrequencies {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printFrequencies(s);
    }

    public static void printFrequencies(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }
}
