// Converted from C++ to Java
import java.util.*;

public class DetectCycleInDirected {




    public static boolean DFSRec(List<Integer> adj[], int s,boolean visited[], boolean recSt[]) 
    { 	
        visited[s]=true;
        recSt[s]=true;

        for(int u:adj[s]){
            if(visited[u]==false && DFSRec(adj,u,visited,recSt)==true)
                    {return true;}
            else if(recSt[u]==true)
                {return true;}
        }
        recSt[s]=false;
        return false;
    }

    public static boolean DFS(List<Integer> adj[], int V){
        boolean visited[V]; 
    	for(int i=0;i<V; i++) 
    		visited[i] = false;
    	boolean recSt[V]; 
    	for(int i=0;i<V; i++) 
    		recSt[i] = false;

        for(int i=0;i<V;i++){
            if(visited[i]==false)
                if(DFSRec(adj,i,visited,recSt)==true)
                    return true;
        }
        return false;
    }

    public static void addEdge(List<Integer> adj[], int u, int v){
        adj[u].add(v);
    }

    public static void main(String[] args) 
    { 
    	int V=6;
    	List<Integer> adj[V];
    	addEdge(adj,0,1); 
    	addEdge(adj,2,1); 
    	addEdge(adj,2,3); 
    	addEdge(adj,3,4); 
    	addEdge(adj,4,5);
    	addEdge(adj,5,3);

    	if(DFS(adj,V))
    	    System.out.print("Cycle found");
    	else
    	    System.out.print("No cycle found");

    	// (return 0 removed - Java main is void) 
    } 

}
