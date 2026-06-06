public class StackUsingLinkedlist {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static class Stack {
        private Node head;
        private int size;

        Stack() {
            head = null;
            size = 0;
        }

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("empty");
                return Integer.MIN_VALUE;
            }
            int res = head.data;
            head = head.next;
            size--;
            return res;
        }

        int stackSize() {
            return size;
        }

        int peek() {
            if (head == null) {
                System.out.println("empty");
                return Integer.MIN_VALUE;
            }
            return head.data;
        }

        boolean isEmpty() {
            return head == null;
        }

        void display() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(11);
        s.push(12);
        s.push(13);
        System.out.println(s.pop());
        System.out.println(s.stackSize());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        s.display();
    }
}

