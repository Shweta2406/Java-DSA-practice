// Converted from C++ to Java
import java.util.*;

public class UnitDigitXPowerY {

    // Efficient C++ program to
    // find unit digit of x^y.

    // Returns unit digit of x
    // raised to power y
    public static int unitDigitXRaisedY(int x, int y)
    {
    	int res=(int)Math.pow(x,y);

    	return res%10;
    }

    // Driver program
    public static void main(String[] args)
    { 
    System.out.print(unitDigitXRaisedY(16, 2));
    // (return 0 removed - Java main is void)
    }

}
