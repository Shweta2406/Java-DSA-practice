// Converted from C++ to Java
import java.util.*;

public class Vectors {

    // C++ program to illustrate the above functions






    public static void main(String[] args) 
    { 
        List<Integer> v = new ArrayList<>(); 

        // Push elements 
        for (int i = 1; i <= 5; i++) 
            v.add(i); 

        System.out.print("Size : " + String.valueOf(v.size()));

        // checks if the vector is empty or not 
        if (v.isEmpty() == false) 
            System.out.print("\nVector is not empty");
        else
            System.out.print("\nVector is empty");

        System.out.print("\nOutput of begin and end: ");
        for (Integer i = v.begin(); i != v.end(); ++i) 
            System.out.print(String.valueOf(*i) + " ");

        // inserts at the beginning 
        v.emplace(v.begin(), 5); 
        System.out.print("\nThe first element is: " + String.valueOf(v[0]));

        // Inserts 20 at the end 
        v.emplace_back(20); 
        int n = v.size(); 
        System.out.print("\nThe last element is: " + String.valueOf(v[n - 1]));

        // erases the vector 
        v.clear(); 
        System.out.print("\nVector size after erase(): " + String.valueOf(v.size()));

        // (return 0 removed - Java main is void) 
    } 
}

