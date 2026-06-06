// Converted from C++ to Java
import java.util.*;

public class NoOfIslandsInGraph {

    //Print number of islands in a graph (or number of connected components in a graph).

    public static void BFS(List<Integer> adj[],int s,boolean visited[])
    {

        Queue<Integer> q;
        visited[s]=true;
        q.push(s);

        while(q.isEmpty()!=true)
        {
            int u=q.peek();
            q.pop();
            //cout<<u<<" ";

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

    public static int BFSdis(List<Integer> adj[],int v)
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
                //visited[i]=true;
                BFS(adj,i,visited);
                count++;
            }
        }
        return count;
    }

    //adjacency list
    public static void addEdge(List<Integer> adj[],int u,int v)
    {
        adj[u].add(v);
        adj[v].add(u);
    }

    public static void main(String[] args)
    {
        	int V=7;
    	List<Integer> adj[V];
    	addEdge(adj,0,1); 
    	addEdge(adj,0,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,1,3); 
    	addEdge(adj,4,5);
    	addEdge(adj,5,6);
    	addEdge(adj,4,6);
        System.out.print("no. of islands: " + String.valueOf(BFSdis(adj,V)));
        // (return 0 removed - Java main is void)
    }
}
