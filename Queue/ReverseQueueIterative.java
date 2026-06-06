// Converted from C++ to Java
import java.util.*;

public class ReverseQueueIterative {





    public static void Print(Queue<Integer>& Queue) 
    { 
    	while (!Queue.isEmpty()) { 
    		System.out.print(String.valueOf(Queue.peek()) + " ");
    		Queue.pop(); 
    	} 
    } 


    public static void reverseQueue(Queue<Integer>& Queue) 
    { 
    	Stack<Integer> Stack; 
    	while (!Queue.isEmpty()) { 
    		Stack.push(Queue.peek()); 
    		Queue.pop(); 
    	} 
    	while (!Stack.isEmpty()) { 
    		Queue.push(Stack.peek()); 
    		Stack.pop(); 
    	} 
    } 


    public static void main(String[] args) 
    { 
    	Queue<Integer> q; 
    	q.push(12); 
    	q.push(5); 
    	q.push(15);
    	q.push(20); 

    	reverseQueue(q); 
    	Print(q); 
    } 

}
