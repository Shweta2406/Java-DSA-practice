import java.util.*;

public class SumOfPrimeFactors {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfPrimeFactors(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = sumOfPrimeFactors(n);
        System.out.println(sum);
    }
}

