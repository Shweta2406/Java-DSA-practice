// Converted from C++ to Java
import java.util.*;

public class StandardDeviation {


    public static void main(String[] args)
    {
    int n;
    n = scanner.nextInt();
    int a[n];
    for(int i=0;i<n;i++)
    {
        a = scanner.nextInt()[i];
    }
    double mean,sum=0,sd;
    for(int i=0;i<n;i++)
    {
       sum+=a[i];
    }
    mean=sum/n;
    for(int i=0;i<n;i++)
    {
       sd+=(int)Math.pow((a[i]-mean),2);

    }
    System.out.print(Math.sqrt(sd/n));

    // (return 0 removed - Java main is void)
    }
}
