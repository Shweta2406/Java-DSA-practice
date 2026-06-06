// Converted from C++ to Java
import java.util.*;

public class PalindromeString {



    public static void main(String[] args)
    {
    char str[10],flag=0;
    System.out.print("enter String: ");
    str = scanner.nextInt();
    int l=strlen(str);
    for(int i=0;i<l;i++)
    {

       if(str[i]!=str[l-i-1])
      { flag=1;
       break;
    }
    }
    if(flag==0)
    System.out.print("palindrome");
    else
    System.out.print("not palindrome");
    // (return 0 removed - Java main is void)
    }
}
