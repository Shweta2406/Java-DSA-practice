import java.util.*;

public class DecimalToBinary {

    public static String decimalToBinary(int number) {
        return String.format("%4s", Integer.toBinaryString(number)).replace(' ', '0');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctCount = 0;
        int incorrectCount = 0;

        System.out.println("Welcome to decimal to binary practice");
        for (int questionNo = 1; questionNo <= 5; questionNo++) {
            int decimal = random.nextInt(16);
            String correctAns = decimalToBinary(decimal);

            System.out.printf("\nQuestion %d: convert %d to binary:%n", questionNo, decimal);
            System.out.print("Ans: ");
            String ans = scanner.nextLine().trim();

            if (ans.equals(correctAns)) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.printf("Incorrect! Correct ans is %s.%n", correctAns);
                incorrectCount++;
            }
        }

        System.out.printf("\nYour final score: %d correct, %d incorrect%n", correctCount, incorrectCount);
    }
}
