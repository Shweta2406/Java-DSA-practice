// Converted from C++ to Java
import java.util.*;

public class LookupTableMethod {

    // C++ program to Count set 
    // bits in an integer 



        int table[256];

    	// recursive function to count set bits 
    	public static void initialize() { 

          // To initially generate the table algorithmically:
          table[0] = 0;
          for (int i = 0; i < 256; i++)
          {
              table[i] = (i & 1) + table[i / 2];
          }
    	} 

    	public static int countSetBits(int n)
    	{
    	    return table[n & 0xff] + 
            table[(n >> 8) & 0xff] + 
            table[(n >> 16) & 0xff] + 
            table[n >> 24]; 
    	}

    /* Program to test function countSetBits */
    public static void main(String[] args) 
    { 
    	    initialize();
    		int n = 9; 
    	System.out.print(countSetBits(n));
    	// (return 0 removed - Java main is void) 
    } 

}
