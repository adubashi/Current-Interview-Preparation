import java.util.*;
public class PathSum {
	public static void main(String args[]){
		/*
		 * 		10
		 *     /  \
		 *     5  15
		 *     /\  /\
		 *    3 7 13 null
		 * 
		 * 
		 */
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
		root.display(root);
		System.out.println();
		
	}
	
	//BFS problem 
	/*
	 * Add all node to a queue and store sum value of each node to another queue.
	 *  When it is a leaf node, check the stored sum value.
	 */
	
	
	//O(nlogn)
	public static boolean hasPathSum2(Node root, int sum) {
		if(root == null) return false;
		 
        Queue<Node> nodes = new LinkedList<Node>();
        Queue<Integer> values = new LinkedList<Integer>();
        
        nodes.add(root);
        values.add(root.data);
        
        while(!nodes.isEmpty()){
        	Node curr = nodes.poll();
            int sumValue = values.poll();
            
            if(curr.left == null && curr.right == null && sumValue==sum){
                return true;
            }
            if(curr.left != null){
            	nodes.add(curr.left);
                values.add(sumValue+curr.left.data);
            }
            if(curr.right != null){
            	nodes.add(curr.right);
            	values.add(sumValue+curr.right.data);
            }
        }
		return false;
	}
	
	
	//O(nlogn)
	public static boolean hasPathSum(Node root, int sum) {
		if (root == null)
			return false;
		if (root.data == sum && (root.left == null && root.right == null))
			return true;
	 
		return hasPathSum(root.left, sum - root.data) || hasPathSum(root.right, sum - root.data);
	}

}
