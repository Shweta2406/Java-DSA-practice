public class QueueUsingLinkedlist {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static class Queue {
        Node front;
        Node rear;

        Queue() {
            front = rear = null;
        }

        void enqueue(int x) {
            Node temp = new Node(x);
            if (rear == null) {
                front = rear = temp;
                return;
            }
            rear.next = temp;
            rear = temp;
        }

        void dequeue() {
            if (front == null) {
                return;
            }
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }

        void display() {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        if (q.front != null) {
            System.out.println("front: " + q.front.data);
        }
        if (q.rear != null) {
            System.out.println("rear: " + q.rear.data);
        }
        q.display();
    }
}

