// Converted from C++ to Java
import java.util.*;

public class StringOrdering {

    //aug 2023 question
    // you are given a String of only lower case alphabets and integer k. 
    //Your task is to arrange first k alphabets in increasing order and then k alphabets in decrising order.  
    //input:
    // tocmat
    // 2
    // output:
    // tomcat
    // consider alphabet order as abcdefghstuvwxyzijklmnopqr

    public static int customCompare(char a, char b) {
        String customOrder = "abcdefghstuvwxyzijklmnopqr";
        return customOrder.indexOf(a) <= customOrder.indexOf(b);
    }

    public static int customCompare_decreasing(char a, char b) {
        String customOrder = "abcdefghstuvwxyzijklmnopqr";
        return customOrder.indexOf(a) > customOrder.indexOf(b);
    }

    public static String arrangeString(String s, int k) {
       int n=s.length();
       int cnt=0;
       for(int i=0;i<n-k;i+=k)
       {
         if(cnt%2==0)
         {
             sort(s.begin()+i,s.begin()+i+k,customCompare);
         }
         else
         {
             sort(s.begin()+i,s.begin()+i+k,customCompare_decreasing);
         }
    cnt++;
       }


        return s;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        String input_string;
        input_string = scanner.nextInt();

        int k;
        k = scanner.nextInt();

        String result = arrangeString(input_string, k);
        System.out.println(result);

        // (return 0 removed - Java main is void)
    }

    // // // // // 
    // int customCompare(char a, char b) {
    //     String customOrder = "abcdefghstuvwxyzijklmnopqr";
    //     return customOrder.indexOf(a) < customOrder.indexOf(b);
    // }

    // void arrangeString(String s, int k) {
    //     List<String> v1 = new ArrayList<>();
    //     List<String> v2 = new ArrayList<>();
    //     int n = s.length();

    //     for (int i = 0; i <= k; i++) {
    //         v1.add(String(1, s[i])); // Convert character to String and push
    //     }
    //     sort(v1.begin(), v1.end(), customCompare);

    //     for (int i = k + 1; i < n; i++) {
    //         v2.add(String(1, s[i])); // Convert character to String and push
    //     }
    //     sort(v2.begin(), v2.end(), customCompare);

    //     Collections.reverse(v2); // Reversed v2 to make it descending

    //     // Append elements of v2 to v1
    //     for (int i = 0; i < v2.size(); i++) {
    //         v1.add(v2[i]);
    //     }

    //     // Print the arranged characters
    //     for (int i = 0; i < v1.size(); i++) {
    //         cout << v1[i];
    //     }
    //     cout << endl;
    // }

    // public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    //     String input_string;
    //     input_string = scanner.nextInt();

    //     int k;
    //     k = scanner.nextInt();

    //     arrangeString(input_string, k);

    //     return 0;
    // }

}
