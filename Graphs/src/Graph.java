import java.util.*;

//Simple Undirected graph
public class Graph {
	public int V;   // No. of vertices
    public LinkedList<Integer> adj[]; //Adjacency Lists
 
    // Constructor
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
    	//Direction one
        adj[v].add(w);
        //Direction two
        adj[w].add(v);
    }

}
