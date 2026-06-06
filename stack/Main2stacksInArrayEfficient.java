// Converted from C++ to Java
import java.util.*;

public class Main2stacksInArrayEfficient {


    class twostack {
        int arr;
        int cap;
        int top1;
        int top2;

        twostack(int c) {
            cap = c;
            arr = new int[c];
            top1 = -1;
            top2 = cap;
        }

        public static void push1(int x) {
            if (top1 < top2 - 1) {
                top1++;
                arr[top1] = x;
            } else {
                System.out.println("Stack 1 overflow");
                return;
            }
        }

        public static void push2(int x) {
            if (top1 < top2 - 1) {
                top2--;
                arr[top2] = x;
            } else {
                System.out.println("Stack 2 overflow");
                return;
            }
        }

        public static int pop1() {
            if (top1 >= 0) {
                int res = arr[top1];
                top1--;
                return res;
            } else {
                System.out.println("Stack 1 underflow");
                exit(1);
            }
        }

        public static int pop2() {
            if (top2 < cap) {
                int res = arr[top2];
                top2++;
                return res;
            } else {
                System.out.println("Stack 2 underflow");
                exit(1);
            }
        }
    };

    public static void main(String[] args) {
        twostack ts(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from stack 1 is " + String.valueOf(ts.pop1()));
        ts.push2(40);
        System.out.println("Popped element from stack 2 is " + String.valueOf(ts.pop2()));
        // (return 0 removed - Java main is void)
    }

}

