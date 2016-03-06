
public class firstCommonAncestorOfTwoNodesInABinaryTree {
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
		root.display(root);
		
	}
	
	//O(n) time 
	//O(n = H) space
	public static boolean covers(Node root, Node p){
		if(root == null){
			return false;
		}
		if(root == p){
			return true;
		}
		return covers(root.left,p) || covers(root.right,p);
	}
	
	public static Node commonAncestorHelper(Node root, Node p, Node q){
		if(root == null){
			return null;
		}
		if(root == p || root == q){
			return root;
		}
		
		boolean isPonLeft = covers(root.left,p);
		boolean isQonLeft = covers(root.left,q);
		
		if(isPonLeft != isQonLeft){
			return root;
		}
		
		Node childSide = null;
		if(isPonLeft){
		   childSide = root.left;
		} else {
			childSide = root.right;
		}
		return commonAncestorHelper(childSide,p,q);	
	}
	
	Node commonAncestor(Node root, Node p, Node q){
		if(!covers(root,p) || !covers(root,q)){
			return null;
		}
		return commonAncestorHelper(root,p,q);
	}

}
