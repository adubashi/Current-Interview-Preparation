
public class countUnivalueSubtrees {
	private static int count = 0;
	
	public static void main(String args[]){
		Node root = new Node(10);
		root.left = new Node(5);
		root.left.parent = root;
		root.right = new Node(15);
		root.right.parent = root;
		root.left.left = new Node(5);
		root.left.left.parent = root.left;
		root.right.left = new Node(13);
		root.right.left.parent = root.right;
		Node a = new Node(5);
		root.left.right = a;
		root.left.right.parent = root.left;
		System.out.print(" Tree : ");
		root.display(root);
		System.out.println();
		
		
		countUnivalSubtrees(root);
		System.out.println(count);
	}
	
	//Integer.MIN_VALUE = Substree is not univalued
	//Integer.MAX_VALUE = MArk if the root is null
	
	public static int countUnivalSubtrees(Node root){
		if(root == null){
			return 0;
		}
		countUnivalSubtreesHelper(root);
		return count;
	}
	
	
	
	//O(nlogn)
	private static int countUnivalSubtreesHelper(Node root){
		
		if(root == null){
			return Integer.MAX_VALUE;
		}
		// Divide
        int left = countUnivalSubtreesHelper(root.left);
        int right = countUnivalSubtreesHelper(root.right);
         
        // left and right are all empty
        if (left == Integer.MAX_VALUE && right == Integer.MAX_VALUE) {
            count++;
            return root.data;
        } else if (left == Integer.MAX_VALUE || right == Integer.MAX_VALUE) {
            if (root.data == left || root.data == right) {
                count++;
                return root.data;
            } else {
                return Integer.MIN_VALUE;
            }
        } else {
            if (root.data == left && root.data == right) {
                count++;
                return root.data;
            } else {
                return Integer.MIN_VALUE;
            }
        }
		
	}

}
