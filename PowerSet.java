// Converted from C++ to Java
import java.util.*;

public class PowerSet {


    public static void printPowerSet(String str)
    {
    	int n = str.length();

    	int powSize = (int)Math.pow(2, n);

    	for(int counter = 0; counter < powSize; counter++)
    	{
    		for(int j = 0; j < n; j++)
    		{
    			if((counter & (1 << j)) != 0)
                    System.out.print(str[j]);
    		}

    		System.out.println();
    	}
    }



    public static void main(String[] args) {

    	String s = "abc";

        printPowerSet(s);  

    }
}
