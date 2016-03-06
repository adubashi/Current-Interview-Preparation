
public class PrintAllRootToLeafPaths {
	
	public static void printPaths(Node node) {
        int path[] = new int[1000];
        printPathsRecur(node, path, 0);
    }
 
    /* Recursive helper function -- given a node, and an array containing
     the path from the root node up to but not including this node,
     print out all the root-leaf paths. */
	//O(nlogn)
    public static void printPathsRecur(Node node, int path[], int pathLen) {
        if (node == null) {
            return;
        }
 
        /* append this node to the path array */
        path[pathLen] = node.data;
        pathLen++;
 
        /* it's a leaf, so print the path that led to here */
        if (node.left == null && node.right == null) {
            printArray(path, pathLen);
        } else {
             
            /* otherwise try both subtrees */
            printPathsRecur(node.left, path, pathLen);
            printPathsRecur(node.right, path, pathLen);
        }
    }
 
    /* Utility that prints out an array on a line */
    public static void printArray(int ints[], int len) {
        int i;
        for (i = 0; i < len; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }
    
    public static void main(String args[]){
		//Make a BST 
		Node root = new Node(10);
		root.left = new Node(5);
		root.left.parent = root;
		root.right = new Node(15);
		root.right.parent = root;
		root.left.left = new Node(3);
		root.left.left.parent = root.left;
		root.right.left = new Node(13);
		root.right.left.parent = root.right;
		Node a = new Node(7);
		root.left.right = a;
		root.left.right.parent = root.left;
		System.out.print(" Tree : ");
		
		printPaths(root);
		
	}

}
