// Converted from C++ to Java
import java.util.*;

public class Simple {

    // C++ program to Count set 
    // bits in an integer 



    /* Function to get no of set bits in binary 
    representation of positive integer n */
    unsigned int countSetBits(unsigned int n) 
    { 
    	unsigned int count = 0; 
    	while (n != 0) {
    	    if (n % 2 != 0)
    	       count++;
    	    n = n/2;      
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
