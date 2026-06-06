// Converted from C++ to Java
import java.util.*;

public class LengthNo {


    public static void main(String[] args)
    {
    int g,count=0;
    System.out.print("enter no. ");
    g = scanner.nextInt();
    while(g>0)
    {
      g=g/10;
      count++;
    }
    System.out.print(count);
    //cout<<(log10(g)+1 );
    // (return 0 removed - Java main is void)
    }
}
