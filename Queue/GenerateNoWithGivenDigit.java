// Converted from C++ to Java
import java.util.*;

public class GenerateNoWithGivenDigit {




    //Given a number n, print first n number(in increasing order) such that all these numbers have digits in set {5, 6}

    public static void printFirstN(int n) 
    { 
        Queue<String> q;

        q.push("5");
        q.push("6");

        for(int i = 0; i < n; i++)
        {
            String curr = q.peek();

            System.out.print(String.valueOf(curr) + " ");

            q.pop();

            q.push(curr + "5");
            q.push(curr + "6");
        }

    } 


    public static void main(String[] args) 
    { 
    	int n = 5;

    	printFirstN(n);
    } 

}
