
public class GraphTest {
	public static void main(String args[]){
					//  0  1  2  3  4  5  6  7  8
					//===================================================
	int[][] conn = {  { 0, 1, 0, 1, 0, 0, 0 },  // 0
					  { 1, 0, 0, 0, 0, 0, 0 },  // 1
					  { 0, 0, 0, 1, 0, 1, 0 },  // 2
					  { 1, 0, 1, 0, 1, 0, 0 },  // 3
					  { 0, 0, 0, 1, 0, 0, 0 },  // 4
					  { 0, 0, 1, 0, 0, 0, 1 },  // 5
					  { 0, 0, 0, 0, 0, 1, 0 }};// 8


	      Graph G = new Graph(conn);
	      System.out.println("DFS traversal  - recursive:");
	      G.dfs(0);
	      G.clearVisited();
	      System.out.println("DFS traversal - stack:");
	      G.dfsStack(0);
	}
}
