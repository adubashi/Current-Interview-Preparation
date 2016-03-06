
public class DFSvsBFScomparison {
	/*
	 * BFS:									DFS:
	 * BFS starts traversal from the root   Starts the traversal from root node and explores the search
	 * node and looks at all neighbors      as far as possible from the root node
	 * before moving on to the 
	 * neighbors of neighbors
	 * 
	 * Done with a Queue: FIFO				Can be done with a Stack(LIFO) or with recursion
	 * 
	 * 
	 * Works in a single stage:             DFS is faster than BFS
	 * Visited vertices are removed			
	 * from the queue and then are
	 * displaced at once
	 * 
	 * 
	 * BFS is slower than DFS:				DFS is faster than BFS
	 * 
	 * 
	 * BFS requires more memory				DFS requires less memory
	 * compared to DFS
	 * 
	 * Applications of BFS:							Applications of DFS:
	 * Shortest path								Cycle detection
	 * Single source and all pairs shortest path    In connectivity testing
	 * spanning tree								finding a path between v and w in a graph
	 * connectivity									spanning trees
	 * 
	 * 
	 * Running time for both:
	 * O(V+E) where V = number of vertices and E = number of edges(assuming using a adjacency list representation)
	 * 
	 */

}
