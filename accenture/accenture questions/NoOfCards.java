// Converted from C++ to Java
import java.util.*;

public class NoOfCards {


    public static int totalcards(int level)
    {
        if(level==0)
        // (return 0 removed - Java main is void)

        if(level==1)
        return 2;

        return (2*level+(level-1)+totalcards(level-1))%1000007;;
    }

    public static void main(String[] args)
    {
    int level;
    level = scanner.nextInt();
    System.out.print(totalcards(level));
    // (return 0 removed - Java main is void)
    }
}
