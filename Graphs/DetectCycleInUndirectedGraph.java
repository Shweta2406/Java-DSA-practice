// Converted from C++ to Java
import java.util.*;

public class DetectCycleInUndirectedGraph {

    //Detect cycle in an undirected graph




    public static boolean DFSRec(List<Integer> adj[], int s,boolean visited[], int parent) 
    { 	
        visited[s]=true;

        for(int u:adj[s]){
            if(visited[u]==false){
                if(DFSRec(adj,u,visited,s)==true)
                    {return true;}}
            else if(u!=parent)
                {return true;}
        }
        return false;
    }

    public static boolean DFS(List<Integer> adj[], int V){
        boolean visited[V]; 
    	for(int i=0;i<V; i++) 
    		visited[i] = false;

        for(int i=0;i<V;i++){
            if(visited[i]==false)
                if(DFSRec(adj,i,visited,-1)==true)
                    return true;
        }
        return false;
    }

    public static void addEdge(List<Integer> adj[], int u, int v){
        adj[u].add(v);
        adj[v].add(u);
    }

    public static void main(String[] args) 
    { 
    	int V=6;
    	List<Integer> adj[V];
    	addEdge(adj,0,1); 
    	addEdge(adj,1,2); 
    	addEdge(adj,2,4); 
    	addEdge(adj,4,5); 
    	addEdge(adj,1,3);
    	addEdge(adj,2,3);

    	if(DFS(adj,V))
    	    System.out.print("Cycle found");
    	else
    	    System.out.print("No cycle found");

    	// (return 0 removed - Java main is void) 
    } 

}
