// Converted from C++ to Java
// Note: Java has no reference parameters (&) for primitives.
// Swap is simulated with an int[] wrapper. Returning a reference is not
// possible in Java; swapAndGet returns the new value of 'a' instead.
import java.util.*;

public class Referencevariable {

    public static void main(String[] args) {
        int[] a = {4};
        int[] b = {5};
        System.out.println("value before swapping: a= " + a[0] + " and b= " + b[0]);
        swapValues(a, b);
        System.out.println("value after swapping: a= " + a[0] + " and b= " + b[0]);

        // In C++ `swapPointer1(a,b)=766` assigned 766 to the returned reference.
        // Java equivalent: swap then assign directly.
        swapValues(a, b);
        a[0] = 766;
        System.out.println("value after assignment: a= " + a[0] + " and b= " + b[0]);
    }

    public static void swapValues(int[] a, int[] b) {
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }
}
