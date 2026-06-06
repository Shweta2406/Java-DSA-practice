// Converted from C++ to Java
import java.util.*;

public class DequeUsingCirculararray {

    // Implementation of Deque using a circular array
    static final int MAX = 100;

    static class Deque {
        int[] arr;
        int front;
        int rear;
        int size;

        Deque(int s) {
            arr = new int[MAX];
            front = -1;
            rear = 0;
            size = s;
        }

        boolean isFull() {
            return (front == 0 && rear == size - 1) || (front == rear + 1);
        }

        boolean isEmpty() {
            return (front == -1);
        }

        void insertfront(int key) {
            if (isFull()) {
                System.out.println("Overflow");
            } else if (front == -1) {
                front = 0;
                rear = 0;
            } else if (front == 0) {
                front = size - 1;
            } else {
                front = front - 1;
            }
            arr[front] = key;
        }

        void insertrear(int key) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }
            if (front == -1) {
                System.out.println("Underflow");
                return;
            } else if (rear == size - 1) {
                rear = 0;
            } else {
                rear = rear + 1;
            }
            arr[rear] = key;
        }

        void deletefront() {
            if (isEmpty()) {
                System.out.println("Underflow");
                return;
            }
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == size - 1) {
                front = 0;
            } else {
                front = front + 1;
            }
        }

        void deleterear() {
            if (isEmpty()) {
                System.out.println("Underflow");
                return;
            }
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (rear == 0) {
                rear = size - 1;
            } else {
                rear = rear - 1;
            }
        }

        int getFront() {
            if (isEmpty()) {
                System.out.println("Underflow");
                return -1;
            }
            return arr[front];
        }

        int getRear() {
            if (isEmpty()) {
                System.out.println("Underflow");
                return -1;
            }
            return arr[rear];
        }
    }

    public static void main(String[] args) {
        Deque dq = new Deque(5);   // replaced C++ Deque dq(5) with new Deque(5)

        System.out.print("Insert element at rear end : 5 \n");
        dq.insertrear(5);

        System.out.print("Insert element at rear end : 10 \n");
        dq.insertrear(10);

        System.out.println("Get rear element: " + dq.getRear());

        dq.deleterear();
        System.out.println("After deleting rear element, new rear becomes: " + dq.getRear());

        System.out.print("Inserting element at front end \n");
        dq.insertfront(15);

        System.out.println("Get front element: " + dq.getFront());

        dq.deletefront();

        System.out.println("After deleting front element, new front becomes: " + dq.getFront());
    }
}
