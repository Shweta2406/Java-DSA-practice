import java.util.*;

public class MostFrequentString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] items = new String[n];
        for (int i = 0; i < n; i++) {
            items[i] = scanner.nextLine();
        }

        Map<String, Integer> frequency = new HashMap<>();
        for (String item : items) {
            frequency.put(item, frequency.getOrDefault(item, 0) + 1);
        }

        String mostFrequent = items[0];
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most frequent item: " + mostFrequent);
    }
}
