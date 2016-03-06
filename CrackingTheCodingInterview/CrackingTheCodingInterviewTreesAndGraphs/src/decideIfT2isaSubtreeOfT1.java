
public class decideIfT2isaSubtreeOfT1 {
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
	//Time: O(n * m )
	//Space: O(logn + logm)
	
	public static boolean matchTree(Node r1, Node r2){
		if(r1 == null && r2 == null){
			return true;
		}
		if(r1 == null || r2 == null){
			return false;
		}
		if(r1.data  != r2.data){
			return false;
		} else {
			return matchTree(r1.left,r2.left) && 
				   matchTree(r2.right,r2.right);
		}
	}
	
	public static boolean subTree(Node r1, Node r2){
		if(r1 == null){
			return false;
		} 
		if(r1.data == r2.data){
			if(matchTree(r1,r2)){
				return true;
			}
		} 
		return (subTree(r1.left,r2) || subTree(r1.right,r2)); 
	}
	public boolean containsTree(Node t1, Node t2){
		if(t2 == null){
			return true;
		} 
		return subTree(t1,t2);
	}
	
	

}
