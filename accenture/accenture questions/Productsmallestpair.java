import java.util.*;

public class Productsmallestpair {

    public static int productSmallestPair(int[] arr, int sum) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        Arrays.sort(arr);
        if (arr[0] + arr[1] <= sum) {
            return arr[0] * arr[1];
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter target sum: ");
        int sum = scanner.nextInt();
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = productSmallestPair(arr, sum);
        System.out.println(result);
    }
}

