// Converted from C++ to Java
import java.util.*;

public class Main2dvectors {

    // C++ code to demonstrate 2D vector 

     // for 2D vector 


    public static void main(String[] args) 
    { 
        // Initializing 2D vector "vect" with 
        // values 
        List<List<Integer>> vect{ { 1, 2, 3 }, 
                                   { 4, 5, 6 }, 
                                   { 7, 8, 9 } }; 

        // Displaying the 2D vector 
        for (int i = 0; i < vect.size(); i++) { 
            for (int j = 0; j < vect[i].size(); j++) 
                System.out.print(String.valueOf(vect[i][j]) + " ");
            System.out.println();
        } 

        // (return 0 removed - Java main is void) 
    } 
}
