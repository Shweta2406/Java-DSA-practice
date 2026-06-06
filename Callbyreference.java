// Converted from C++ to Java
// Note: Java is always call-by-value. To simulate call-by-reference for primitives,
// we use an int[] wrapper so changes are visible to the caller.
import java.util.*;

public class Callbyreference {

    public static void main(String[] args) {
        int[] a = {4};
        int[] b = {5};
        System.out.println("value before swapping: a= " + a[0] + " and b= " + b[0]);
        swapByRef(a, b);
        System.out.println("value after swapping: a= " + a[0] + " and b= " + b[0]);
    }

    public static void swapByRef(int[] a, int[] b) {
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }
}
