// Converted from C++ to Java
import java.util.*;

public class Subarray {



    // Function to find all subarrays with sum equal to targetSum
    List<List<Integer>> findSubarraysWithSum(List<Integer>  nums, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();

        // Loop through all possible subarrays
        for (int start = 0; start < nums.size(); ++start) {
            int sum = 0;
            for (int end = start; end < nums.size(); ++end) {
                sum += nums[end];
                if (sum == targetSum) {
                    // Found a subarray with the target sum
                    List<Integer> subarray(nums.begin() + start, nums.begin() + end + 1);
                    result.add(subarray);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements in the array: ");
        n = scanner.nextInt();

        List<Integer> nums(n);
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; ++i) {
            nums = scanner.nextInt()[i];
        }

        int targetSum;
        System.out.print("Enter the target sum: ");
        targetSum = scanner.nextInt();

        List<List<Integer>> subarrays = findSubarraysWithSum(nums, targetSum);

        if (subarrays.isEmpty()) {
            System.out.println("No subarray found with sum equal to " + String.valueOf(targetSum));
        } else {
            System.out.println("Subarrays with sum equal to " + String.valueOf(targetSum) + ":");
            for (const Integer& subarray : subarrays) {
                for (int num : subarray) {
                    System.out.print(String.valueOf(num) + " ");
                }
                System.out.println();
            }
        }

        // (return 0 removed - Java main is void)
    }

}

