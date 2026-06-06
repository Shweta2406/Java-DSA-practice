// Converted from C++ to Java
import java.util.*;

public class AdjacencyList {

    public static void add_edges(List<Integer>a[],int u,int v)
    {
        a[u].add(v);
        a[v].add(u);
    }

    public static void print(List<Integer> a[],int v)
    {
        for(int i=0;i<v;i++)
        {
        for(int x:a[i])
        System.out.print(String.valueOf(x) + " ");
        System.out.println();
        }
    }


    public static void main(String[] args)
    {
        int v=4;
        List<Integer> a[v];
        add_edges(a,0,1);
        add_edges(a,0,2);
        add_edges(a,1,2);
        add_edges(a,1,3);
        print(a,v);
    }
}
