// Converted from C++ to Java
import java.util.*;

public class ReverseQueueRecursive {





    public static void Print(Queue<Integer>& Queue) 
    { 
    	while (!Queue.isEmpty()) { 
    		System.out.print(String.valueOf(Queue.peek()) + " ");
    		Queue.pop(); 
    	} 
    } 


    public static void reverse(Queue<Integer>& q) 
    { 
    	if(q.isEmpty())
    	   return;

    	int x = q.peek();
    	 q.pop();

       reverse(q);
       q.push(x);
    } 


    public static void main(String[] args) 
    { 
    	Queue<Integer> q; 
    	q.push(12); 
    	q.push(5); 
    	q.push(15);
    	q.push(20); 

    	reverse(q); 
    	Print(q); 
    } 

}
