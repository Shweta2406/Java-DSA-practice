// Converted from C++ to Java
import java.util.*;

public class MinMaxOperations {

    static class mydeque {
        Deque<Integer> dq;

        mydeque() {
            dq = new LinkedList<>();
        }

        public void insertmin(int x) {
            dq.addFirst(x);
        }

        public void insertmax(int x) {
            dq.addLast(x);
        }

        public void getmax() {
            System.out.print(dq.peekLast());
        }

        public void getmin() {
            System.out.print(dq.peekFirst());
        }

        public int extractmin() {
            int x = dq.peekFirst();
            dq.removeFirst();
            return x;
        }

        public int extractmax() {
            int x = dq.peekLast();
            dq.removeLast();
            return x;
        }
    }

    public static void main(String[] args) {
        mydeque deq = new mydeque();
        deq.insertmin(3);
        deq.insertmax(6);
        deq.insertmin(2);
        deq.insertmax(7);

        int extractedMin = deq.extractmin();
        int extractedMax = deq.extractmax();

        System.out.println(extractedMin);
        System.out.println(extractedMax);

        deq.getmin();
        System.out.println();
        deq.getmax();
    }
}

