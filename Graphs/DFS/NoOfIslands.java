// Converted from C++ to Java
import java.util.*;

public class NoOfIslands {

    //disconnected graph

    public static void DFS_rec(List<Integer> adj[],int s,boolean visited[])
    {
        visited[s]=true;
        //cout<<s<<" ";
        for(int x:adj[s])
        {
            if(visited[x]==false)
            DFS_rec(adj,x,visited);
        }
    }

    public static int DFS(List<Integer> adj[],int v)
    {
       int count=0;
        boolean visited[v];
        for(int i=0;i<v;i++)
        {
            visited[i]=false;
        }
        for(int i=0;i<v;i++)
        {
            if(visited[i]==false)
            {
                DFS_rec(adj,i,visited);
                count++;
            }

        }
        return count;
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
    	System.out.print("Number of connected components: " + String.valueOf(DFS(adj,V)));

    	// (return 0 removed - Java main is void) 
    } 
}
