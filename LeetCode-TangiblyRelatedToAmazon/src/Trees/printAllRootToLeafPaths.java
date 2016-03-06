package Trees;

public class printAllRootToLeafPaths {
	void printPaths(Node node) {
        int path[] = new int[1000];
        printPathsRecur(node, path, 0);
    }
 
	//O(n)
    /* Recursive helper function -- given a node, and an array containing
     the path from the root node up to but not including this node,
     print out all the root-leaf paths.*/
    void printPathsRecur(Node node, int path[], int pathLen) {
        if (node == null) {
            return;
        }
 
        /* append this node to the path array */
        path[pathLen] = node.data;
        pathLen++;
 
        /* it's a leaf, so print the path that led to here  */
        if (node.left == null && node.right == null) {
            printArray(path, pathLen);
        } else {
             
            /* otherwise try both subtrees */
            printPathsRecur(node.left, path, pathLen);
            printPathsRecur(node.right, path, pathLen);
        }
    }
 
    /* Utility function that prints out an array on a line. */
    void printArray(int ints[], int len) {
        int i;
        for (i = 0; i < len; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }

}
