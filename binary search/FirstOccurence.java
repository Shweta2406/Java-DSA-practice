public class FirstOccurence {

    public static int firstOcc(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x > arr[mid]) {
                low = mid + 1;
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 10, 10, 20};
        int x = 10;
        System.out.println(firstOcc(arr, x));
    }
}
