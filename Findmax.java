import java.util.*;

public class Findmax {

    public static int findMax(int num) {
        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        int minIndex = 0;
        for (int i = 1; i < 4; i++) {
            if (digits[i] < digits[minIndex]) {
                minIndex = i;
            }
        }

        int result = 0;
        for (int i = 0; i < 4; i++) {
            if (i != minIndex) {
                result = result * 10 + digits[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 4 digit number: ");
        int n = scanner.nextInt();
        int maxNo = findMax(n);
        System.out.println("Max number is: " + maxNo);
    }
}

