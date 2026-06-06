import java.util.*;

public class AbsoluteDiff {

    public static int reverse(int original) {
        int reversed = 0;
        while (original != 0) {
            reversed = reversed * 10 + original % 10;
            original /= 10;
        }
        return reversed;
    }

    public static int absDiff(int original) {
        int reversed = reverse(original);
        return Math.abs(original - reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int original = scanner.nextInt();
        int dif = absDiff(original);
        System.out.println("Absolute difference between original and reversed number is " + dif);
    }
}

