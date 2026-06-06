import java.util.*;

public class Getpaircount {

    public static int getpaircount(int[] arr, int target) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter target: ");
        int target = scanner.nextInt();

        int result = getpaircount(arr, target);
        System.out.println("No of pairs = " + result);
    }
}
