// Converted from C++ to Java
import java.util.*;

public class StackUsingVector {

    static class StackWrapper {
        List<Integer> v = new ArrayList<>();

        public void push(int x) {
            v.add(x);
        }

        public int pop() {
            int res = v.get(v.size() - 1);
            v.remove(v.size() - 1);
            return res;
        }

        public int size() {
            return v.size();
        }

        public int peek() {
            return v.get(v.size() - 1);
        }

        public boolean isEmpty() {
            return v.isEmpty();
        }

        public void display() {
            for (int i = v.size() - 1; i >= 0; i--) {
                System.out.print(String.valueOf(v.get(i)) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackWrapper s = new StackWrapper();
        s.push(3);
        System.out.println(String.valueOf(s.pop()) + " is popped");
        System.out.println("Empty: " + String.valueOf(s.isEmpty()));
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("size: " + String.valueOf(s.size()));
        System.out.println("peek: " + String.valueOf(s.peek()));
        s.display();
    }
}

