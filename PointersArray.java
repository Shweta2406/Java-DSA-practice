// Converted from C++ to Java
import java.util.*;

public class PointersArray {


    public static void main(String[] args)
    {
     int[] marks={23,45,56,89};

     int p= marks;
    System.out.println("the marks of student 1 :" + String.valueOf(*p));
    System.out.println("the marks of student 2 :" + String.valueOf(*(p+1)));
    System.out.println("the marks of student 3 :" + String.valueOf(*(p+2)));
    System.out.println("the marks of student 4 :" + String.valueOf(*(p+3)));
    // (return 0 removed - Java main is void)
    }
}

