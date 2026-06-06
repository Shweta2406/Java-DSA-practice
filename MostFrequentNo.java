import java.util.*;

public class MostFrequentNo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int value : a) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }

        int mostFrequent = a[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most frequent number: " + mostFrequent);
    }
}
