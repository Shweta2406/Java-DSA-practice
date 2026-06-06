import java.util.*;

public class RemoveEvenAndDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Set<Integer> oddUnique = new LinkedHashSet<>();
        for (int value : a) {
            if (value % 2 != 0) {
                oddUnique.add(value);
            }
        }

        System.out.println("Size of array after removal of even numbers and duplicates: " + oddUnique.size());
        System.out.println("Resulting values: " + oddUnique);
    }
}
