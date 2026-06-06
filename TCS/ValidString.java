// Converted from C++ to Java
import java.util.*;

public class ValidString {

    /*Problem Statement – Given a String S(input consisting) of ‘*’ and ‘#’. The length of the String is
     variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid String. The String 
     is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in 
     the String.
    Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input 
    String.

    (*>#): positive integer
    (#>*): negative integer
    (#=*): 0
    Example 1:
    Input 1:

    ###***   . Value of S
    Output :

    0   → number of and # are equal/


    public static void main(String[] args)
    {
        String s;
        int a=0,b=0;
        s = scanner.nextLine();
        for(int i:s)
        {
            if(i=='*')
            a++;

            else if(i=='#')
            b++;
        }
        System.out.print(a-b);
        // (return 0 removed - Java main is void)
    }
}

