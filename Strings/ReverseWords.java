public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Hello world from Java";
        System.out.println(reverseWords(sentence));
    }

    public static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }

    public static String reverseWords(String s) {
        int start = 0;
        char[] ch = s.toCharArray();
        for (int end = 0; end < ch.length; end++) {
            if (ch[end] == ' ') {
                reverse(ch, start, end - 1);
                start = end + 1;
            }
        }
        reverse(ch, start, ch.length - 1);
        reverse(ch, 0, ch.length - 1);
        return new String(ch);
    }
}
