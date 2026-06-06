// Converted from C++ to Java
import java.util.*;

public class MerryString {

    //29 aug 2023 question
    // A String is called a "merry String" if the frequency of each letter 42 in that String 1.
    // You are provided with a String S of length N. Find and print the number 
    // of merry substrings of length four that can be formed from the given  
    // String if no such String found then print '0'

    // Input format:

    // The input consists of two lines:

    // The first line contains N which represents the length of the String S
    // The second line contains the String S.
    // Input will be read from the STDIN by the candidate.

    // Output Format:

    // Find and print the number of merry substrings of length four that can be formed from 
    // the given String. if no such String found then print '0', Output will be matched to 
    // the candidate's output printed on the STDOUT.

    // Constraints: 4≤ N ≤ 104.
    // The input String should only consist of lower case English alphabets.

    // Example:
    // Input:
    // 9
    // abcdefggh
    // Output:
    // 4


    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt(); // Read the length of the String
        String s;
        s = scanner.nextInt(); // Read the input String
        int count = 0; // Initialize a count to keep track of merry substrings

        if (n < 4) {
            // (return 0 removed - Java main is void) // If the length is less than 4, exit the program
        }

        // Iterate through all possible starting positions of substrings of length 4
        for (int i = 0; i < n - 3; i++) {
            int freq[26] = {0}; // Initialize an array to store frequency of each letter (a to z)
            boolean ismerry = true; // Flag to determine if the current substring is "merry"

            // Iterate through the characters of the current substring
            for (int j = i; j < i + 4; j++) {
                freq[s[j] - 'a']++; // Increment the frequency of the current character
                if (freq[s[j] - 'a'] > 1) {
                    // If the frequency becomes greater than 1, the substring is not "merry"
                    ismerry = false;
                    break; // No need to check further for this substring
                }
            }

            // If the current substring is "merry", increment the count
            if (ismerry) {
                count++;
            }
        }

        // Print the total count of "merry substrings"
        System.out.println(count);

        // (return 0 removed - Java main is void)
    }

}
