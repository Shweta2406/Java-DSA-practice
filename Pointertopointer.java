public class Pointertopointer {

    public static void main(String[] args) {
        int a = 1;
        Integer b = a;
        Integer c = b;

        System.out.println("value of a");
        System.out.println(a);
        System.out.println("value of b (reference to a):");
        System.out.println(b);
        System.out.println("value of c (another reference to b):");
        System.out.println(c);
    }
}

