// Converted from C++ to Java
import java.util.*;

public class Callbyvalue {

    void { int _t = int x; int x =  int y;  int y = _t; };
    public static void main(String[] args)
    {
        int a=4,b=5;
        { int _t = a; a = b; b = _t; };
       System.out.println("a= " + String.valueOf(a) + " and b= " + String.valueOf(b));
    }
    void { int _t = int x; int x =  int y;  int y = _t; }
    {
        int temp=x;
        x=y;
        y=temp;
        System.out.println("a= " + String.valueOf(x) + " and b= " + String.valueOf(y));
    }
}
