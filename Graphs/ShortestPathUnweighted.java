// Converted from C++ to Java
import java.util.*;

public class ShortestPathUnweighted {




    public static void BFS(List<Integer> adj[], int V, int s,int[] dist) 
    { 
    	boolean visited[V];
        for(int i=0;i<V;i++)
        {
            visited[i]=false;
        }
        Queue<Integer> q;
        q.push(s);
        visited[s]=true;
        while(q.isEmpty()==false)
        {
            int u=q.peek();
            q.pop();
            for(int x:adj[u])
            {
                if(visited[x]==false)
                {
                    dist[x]=dist[u]+1;
                         visited[x]=true;

                    q.push(x);
                }
            }
        }
    } 

    public static void addEdge(List<Integer> adj[], int u, int v){
        adj[u].add(v);
        adj[v].add(u);
    }

    public static void main(String[] args) 
    { 
    	int V=4;
    	List<Integer> adj[V];
    	addEdge(adj,0,1); 
    	addEdge(adj,1,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,3);
        int dist[V];
        for(int i=0;i<V;i++){
            dist[i]=Integer.MAX_VALUE;
        }
    	dist[0]=0;
    	BFS(adj,V,0,dist); 

        for(int i=0;i<V;i++){
            System.out.print(String.valueOf(dist[i]) + " ");
        }

    	// (return 0 removed - Java main is void) 
    } 

}
