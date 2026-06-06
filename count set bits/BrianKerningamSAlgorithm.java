// Converted from C++ to Java
import java.util.*;

public class BrianKerningamSAlgorithm {

    // C++ program to Count set 
    // bits in an integer 



    unsigned int countSetBits(int n) 
    { 
           unsigned int count = 0; 
           while (n) { 
              n &= (n - 1); 
              count++; 
           } 
          return count; 
    } 

    /* Program to test function countSetBits */
    public static void main(String[] args) 
    { 
    	int i = 9; 
    	System.out.print(countSetBits(i));
    	// (return 0 removed - Java main is void) 
    } 

}
