// Converted from C++ to Java
import java.util.*;

public class MirrorCharactersInString {

    // C++ code to find the reverse alphabetical
    // order from a given position

    // Function which take the given String
    // and the position from which the reversing shall
    // be done and returns the modified String
    public static String compute(String str, int n)
    {
    	// Creating a String having reversed alphabetical order
    	String reverseAlphabet = "zyxwvutsrqponmlkjihgfedcba";
    	int l = str.length();

    	// The String up to the point specified in the question,
    	// the String remains unchanged and from the point up to
    	// the length of the String, we reverse the alphabetical
    	// order
    	for (int i = n; i < l; i++)
    		str[i] = reverseAlphabet[str[i] - 'a'];

    	return str;
    }

    // Driver function
    public static void main(String[] args)
    {
    	String str = "pneumonia";
    	int n = 4;
    	String answer = compute(str, n - 1);
    	System.out.print(answer);
    	// (return 0 removed - Java main is void)
    }

}
