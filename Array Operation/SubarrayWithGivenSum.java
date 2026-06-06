public class SubarrayWithGivenSum {

    public static boolean subArraySum(int[] arr, int sum) {
        int currSum = arr[0], start = 0;

        for (int i = 1; i <= arr.length; i++) {
            while (currSum > sum && start < i - 1) {
                currSum -= arr[start];
                start++;
            }

            if (currSum == sum) {
                System.out.printf("Sum found between indexes %d and %d%n", start, i - 1);
                return true;
            }

            if (i < arr.length) {
                currSum += arr[i];
            }
        }

        System.out.println("No subarray found");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;
        subArraySum(arr, sum);
    }
}
