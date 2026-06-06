import java.util.*;

public class AbsDiffBetMaxMin {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean foundPrime = false;
        for (int value : a) {
            if (isPrime(value)) {
                foundPrime = true;
                min = Math.min(min, value);
                max = Math.max(max, value);
            }
        }

        if (!foundPrime) {
            System.out.println("No prime numbers found");
        } else {
            System.out.println(Math.abs(max - min));
        }
    }
}

