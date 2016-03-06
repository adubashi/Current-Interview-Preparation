
public class inOrderSuccessorOfaBST {
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
	
	public Node leftMostChild(Node n){
		if(n == null){
			return null;
		}
		while(n.left != null){
			n = n.left;
		}
		return n;
	}
	//Time: O(n)
	//Space:O(1)
	public Node inorderSucc(Node n){
		if(n == null){
			return null;
		}
		if(n.right != null){
		   return leftMostChild(n.right);
		} else {
		   Node q = n;
		   Node x = q.parent;
		   while(x != null && x.left != q){
			   q = x;
			   x = x.parent;
		   }
		   return x;
		}
	}

}
