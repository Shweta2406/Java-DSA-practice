public class StringsBasics {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        StringBuilder builder = new StringBuilder();
        builder.append("Java");
        builder.append(" ");
        builder.append("Builder");
        System.out.println(builder.toString());

        StringBuffer buffer = new StringBuffer();
        buffer.append("Java");
        buffer.append(" ");
        buffer.append("Buffer");
        System.out.println(buffer.toString());

        System.out.println("Length: " + s1.length());
        System.out.println("Substring: " + s1.substring(1, 4));
        System.out.println("IndexOf: " + s1.indexOf('l'));
        System.out.println("Replace: " + s1.replace('l', 'p'));
        System.out.println("ToUpperCase: " + s1.toUpperCase());
        System.out.println("Split: " + java.util.Arrays.toString("a,b,c".split(",")));
    }
}
