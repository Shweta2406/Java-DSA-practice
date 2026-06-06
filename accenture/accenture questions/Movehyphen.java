// Converted from C++ to Java
import java.util.*;

public class Movehyphen {

    // Implement the following functions.a

    // char MoveHyphen(char[] str,int n);

    // The function accepts a String “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(-) in the String to the front of the given String.

    // NOTE:- Return null if str is null.

    // Example :-

    // Input:
    // str.Move-Hyphens-to-Front
    // Output:
    // —MoveHyphenstoFront
    // Explanation:-

    // The String “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the String, this output is “— MoveHyphen”

    // Sample Input

    // Str: String-Compare
    // Sample Output-

    // -StringCompare

    public static String MoveHyphen (String s, int n)
    {
      int count = 0;
      for (int i = 0; i < n;)
        {
          if (s[i] == '-')
    	{
    	  count++;
    	  s.remove(i, 1);
    	}
          else
    	i++;
        }
      while (count--)
        {
          s = '-' + s;
        }
      return s;
    }
    public static void main(String[] args)
    {
      String s;
      s = scanner.nextInt();
      int n = s.size();
      System.out.print(MoveHyphen (s, n));
      // (return 0 removed - Java main is void)
    }
}

