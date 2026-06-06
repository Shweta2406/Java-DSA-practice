// Converted from C++ to Java
import java.util.*;

public class SecondLargest {


    public static int findSecondLargest(int[] arr, int size) {
        if (size < 2) {
            System.out.println("Array size is too small.");
            return -1; // Return an error value
        }

        int largest = Math.max(arr[0], arr[1]);
        int secondLargest = Math.min(arr[0], arr[1]);

        for (int i = 2; i < size; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();

        int arr[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr = scanner.nextInt()[i];
        }

        int secondLargest = findSecondLargest(arr, size);
        if (secondLargest != -1) {
            System.out.println("The second largest element is: " + String.valueOf(secondLargest));
        }

        // (return 0 removed - Java main is void)
    }

}
