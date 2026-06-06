// Converted from C++ to Java
import java.util.*;

public class ArrangingArray {

    static class Solution {
        public static void rearrange(int[] arr, int n) {
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0)
                    ans.add(arr[i]);
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 0)
                    ans.add(arr[i]);
            }
            for (int i = 0; i < n; i++) {
                arr[i] = ans.get(i);   // replaced ans[i] with ans.get(i)
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];   // replaced C-style int arr[n] with new int[n]
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();

            Solution.rearrange(arr, n);

            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}
