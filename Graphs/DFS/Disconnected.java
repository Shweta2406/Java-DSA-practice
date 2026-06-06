// Converted from C++ to Java
import java.util.*;

public class Disconnected {

    //disconnected graph

    public static void DFS_rec(List<Integer> adj[],int s,boolean visited[])
    {
        visited[s]=true;
        System.out.print(String.valueOf(s) + " ");
        for(int x:adj[s])
        {
            if(visited[x]==false)
            DFS_rec(adj,x,visited);
        }
    }

    public static void DFS(List<Integer> adj[],int v)
    {
        boolean visited[v];
        for(int i=0;i<v;i++)
        {
            visited[i]=false;
        }
        for(int i=0;i<v;i++)
        {
            if(visited[i]==false)
                DFS_rec(adj,i,visited);

        }
    }

    public static void addEdge(List<Integer> adj[], int u, int v){
        adj[u].add(v);
        adj[v].add(u);
    }


    public static void main(String[] args) 
    { 
    	int V=5;
    	List<Integer> adj[V];
    	addEdge(adj,0,1); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,2);
    	addEdge(adj,3,4);

    	System.out.println("Following is Depth First Traversal for disconnected graphs: ");
    	DFS(adj,V); 

    	// (return 0 removed - Java main is void) 
    } 
}
