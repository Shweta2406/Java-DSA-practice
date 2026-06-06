// Converted from C++ to Java
import java.util.*;

public class KthBit {

    // CPP program to check if k-th bit 
    // of a given number is set or not 



    public static void isKthBitSet(int n, int k) 
    { 
        int x= (1 << (k - 1));
    	if (n & x ) 
    		System.out.print("SET");
    	else
    		System.out.print("NOT SET");
    } 

    // Driver code 
    public static void main(String[] args) 
    { 
    	int n = 5, k = 1; 
    	isKthBitSet(n, k); 
        	// (return 0 removed - Java main is void) 
    } 

}
