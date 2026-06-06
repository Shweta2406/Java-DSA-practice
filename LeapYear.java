// Converted from C++ to Java
import java.util.*;

public class LeapYear {



    public static void main(String[] args)
    {
        int year;
        System.out.print("enter year: ");
        year = scanner.nextInt();
        if(year % 4 == 0 and year % 100 != 0)
        {
            System.out.print("Leap Year");
        }
        else if(year % 400 == 0)
        {
            System.out.print("Leap Year");
        }
        else
        {
            System.out.print("Not a Leap Year");
        }
        // (return 0 removed - Java main is void)
    }
}
