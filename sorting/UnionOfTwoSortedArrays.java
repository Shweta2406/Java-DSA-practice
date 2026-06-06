public class UnionOfTwoSortedArrays {

    public static void printUnion(int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        while (i < a.length) {
            if (i == 0 || a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
            }
            i++;
        }
        while (j < b.length) {
            if (j == 0 || b[j] != b[j - 1]) {
                System.out.print(b[j] + " ");
            }
            j++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {3, 8, 8};
        int[] b = {2, 8, 8, 10, 15};
        printUnion(a, b);
    }
}
