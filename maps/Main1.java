// Converted from C++ to Java
import java.util.*;

public class Main1 {


    public static void main(String[] args)
    {
        TreeMap<String,Integer> mymap;
        mymap["a"] = 1;
        mymap["b"] = 2;
            mymap["d"] = 4;
        mymap["c"] = 3;
        mymap.insert({"e", 5});

        TreeMap<String,Integer>::iterator iter;
        for (iter = mymap.begin(); iter != mymap.end(); iter++)
        {
            System.out.println(String.valueOf((*iter).first) + " " + String.valueOf((*iter).second));
        }

        // Erase the element inside the loop
        iter = mymap.indexOf("e");
        if (iter != mymap.end())
        {
            mymap.remove(iter);
        }

        // Print the updated size after erasing
        System.out.println(mymap.size());
        System.out.println(mymap.isEmpty());

        // (return 0 removed - Java main is void)
    }

}
