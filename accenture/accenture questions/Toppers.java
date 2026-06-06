// Converted from C++ to Java
import java.util.*;

public class Toppers {

    // aug 2023
    // Problem Statement

    // There are a students in a class. You are given the marks of all the students 
    // represented by an array mares. You want to maintain the equity in each section of the class. 
    // For that you have to remove the students having marks equal to the marks of two toppers. 
    // For example if marks (1, 2, 3, 4, 3), here you have two toppers having marks 3 and 4. 
    // Then two students got same marks , so you have to remove this student and send him to another section. 
    // Your task is to find the number of students you need to remove to maintain the equality

    // Input Format

    // The input consists of two lines:

    // The first line contains a single integer n.
    // The second line contains a space-separated integers denoting the array marks.

    // The input will be read from the STDIN by the candidate

    // Output Format:

    // Print a number that represents the number of students to be removed to maintain the equality. The output will be matched to the candidate's output printed on the STDOUT

    // Constraints:

    // • 25 m≤ 105

    // 15marks[i] ≤ 100

    // Example:

    // Input:

    // 5

    // 90 80 90 80 70

    // Output:

    // 2

    // Explanation:

    // We have two toppers having marks 80 and 90. But there are two more students having the same marks. 
    // So, the answer is 2.



    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        List<Integer> marks(n);

        for (int i = 0; i < n; i++) {
            marks = scanner.nextInt()[i];
        }

        Collections.sort(marks); // Sort the marks in ascending order

        int maxCount = 0; 
        int currentCount = 1; 

        for (int i = 1; i < n; i++) {
            if (marks[i] == marks[i - 1]) {
                currentCount++; // Increment count for the current mark
                maxCount = Math.max(maxCount, currentCount); // Update maxCount
            } else {

                currentCount = 1; // Reset count for the new mark
            }
        }

        maxCount = Math.max(maxCount, currentCount); // Check the last group of marks

        int removals = maxCount; 
        System.out.println(removals);

        // (return 0 removed - Java main is void)
    }

}
