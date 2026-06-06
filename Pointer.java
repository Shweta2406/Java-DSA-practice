// Converted from C++ to Java
// Note: Java has no raw pointers. Variables are references to objects.
// For primitives, references are simulated with single-element arrays.
import java.util.*;

public class Pointer {

    public static void main(String[] args) {
        int[] a = {10};
        // In Java there is no address-of operator (&) or dereference (*).
        // The reference 'p' simply points to the same array as 'a'.
        int[] p = a;

        System.out.println("Address simulation not available in Java");
        System.out.println("p[0] = " + p[0]);   // equivalent to *p in C++
        System.out.println("a[0] = " + a[0]);
        System.out.print("p[0] = " + p[0]);     // equivalent to *p in C++
    }
}
