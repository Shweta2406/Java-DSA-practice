// Converted from C++ to Java
import java.util.*;

public class UndirectedWithSource {

    //Given an undirected graph and a source vertex 's' ,print B.F.S. from given source.

    public static void BFS(List<Integer> adj[],int v,int s)
    {
        boolean visited[v];
        for(int i=0;i<v;i++)
        {
            visited[i]=false;
        }
        Queue<Integer> q;
        visited[s]=true;
        q.push(s);

        while(q.isEmpty()!=true)
        {
            int u=q.peek();
            q.pop();
            System.out.print(String.valueOf(u) + " ");

            for(int x:adj[u])
            {
                if(visited[x]==false)
                {
                    visited[x]=true;
                    q.push(x);
                }
            }
        }
    }

    //adjacency list
    public static void add_edge(List<Integer> adj[],int u,int v)
    {
        adj[u].add(v);
        adj[v].add(u);
    }

    public static void main(String[] args)
    {
        int V=5;
    	List<Integer> adj[V];
    	add_edge(adj,0,1); 
    	add_edge(adj,0,2); 
    	add_edge(adj,1,2); 
    	add_edge(adj,2,3); 
    	add_edge(adj,1,3);
    	add_edge(adj,3,4);
    	add_edge(adj,2,4);
        System.out.print("BFS : ");
        BFS(adj,V,0);
        // (return 0 removed - Java main is void)
    }
}
