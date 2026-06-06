public class ReturnArrayFromFunction {

    public static int[] func() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public static void main(String[] args) {
        int[] array = func();
        System.out.print("Array Elements: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

