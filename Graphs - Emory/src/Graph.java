//Simple Graph with adjacency matrix implementation
//Taken from emory
import java.util.*;
public class Graph {
	int[][] adjMatrix;
	int rootnode = 0;
	int NNodes = 0;
	
	boolean[] visited;
	
	Graph(int n){
		NNodes = n;
		this.adjMatrix = new int[n][n];
		visited = new boolean[n];
	}
	
	 public void printNode(int n)
	 {
	    System.out.println(n);
	 }
	
	Graph(int[][] mat)
	{
	      int i, j;

	      NNodes = mat.length;
	      adjMatrix = new int[NNodes][NNodes];
	      visited = new boolean[NNodes];
	      for ( i=0; i < NNodes; i++){
	         for ( j=0; j < NNodes; j++){
	            adjMatrix[i][j] = mat[i][j];
	         }
	      }
	}
	
	public void dfs(int i)
	{
	      int j;
	      visited[i] = true;
	      printNode(i);

	      for(j = 0; j < NNodes; j++ ){
	    	  if (adjMatrix[i][j] > 0 && !visited[j] ){
	    		  dfs(j);
	    	  }
	      }
	}
	
	public void bfs(int rootNode){
	      // BFS uses Queue data structure
	      Queue<Integer> q = new LinkedList<Integer>();
	      q.add(rootNode);
	      visited[rootNode] = true;
	      printNode(rootNode);

	      //Iterate through the queue
	      while(!q.isEmpty()){
	         int n, child;
	         n = (q.peek()).intValue();
	         child = getUnvisitedChildNode(n);
	         if (child != -1)
	         {
	            visited[child] = true;
	            printNode(child);
	            q.add(child);
	         } else {
	            q.remove();
	         }
	      }
	      clearVisited();      //Clear visited property of nodes
	   }


	public int getUnvisitedChildNode(int n){
	      int j;
	      for(j = 0; j < NNodes; j++ )
	      {
	    	  	if(adjMatrix[n][j] > 0){
	    	  			if (!visited[j]){
	    	  				return(j);
	    	  			}
	    	  	}
	      }
	      return -1;
	}
	
	//DFS without recursion
	public void dfsStack(int rootNode)
	   {
	      //DFS using a stack/not recursion

	      Stack<Integer> s = new Stack<Integer>();

	      s.push(rootNode);
	      visited[rootNode] = true;

	      printNode(rootNode);

	      while( !s.isEmpty() )
	      {
	         int n, child;
	         n = (s.peek()).intValue();
	         child = getUnvisitedChildNode(n);

	         if (child != -1){
	            visited[child] = true;
	            printNode(child);
	            s.push(child);
	         } else {
	            s.pop();
	         }
	      }

	      clearVisited();      //Clear visited property of nodes
	   }
	
	public void clearVisited()
	{
	      int i;
	      for (i = 0; i < visited.length; i++){
	         visited[i] = false;
	      }
	}

}
