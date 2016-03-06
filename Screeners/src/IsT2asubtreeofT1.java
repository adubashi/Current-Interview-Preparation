
public class IsT2asubtreeofT1 {
	
	
	//O(n*m) time 
	//O(logn + logm) space 
	public static boolean containsTree(BinaryTreeNode n1, BinaryTreeNode n2){
		if(n2 == null){
			return true;
		} 
		return subtree(n1,n2);
	}
	
	
	public static boolean subtree(BinaryTreeNode n1, BinaryTreeNode n2){
		if(n1 == null){
			return false;
		}
		if(n1.data == n2.data){
		   return matchTree(n1,n2);
		} 
		return subtree(n1.left,n2.left) || subtree(n1.right, n2.right);
	}
	
	public static boolean matchTree(BinaryTreeNode n1, BinaryTreeNode n2){
		if(n1 == null && n2 == null){
			return true;
		}
		if(n1 == null || n2 == null){
			return false;
		}
		if(n1.data != n2.data){
			return false;
		} else {
			return matchTree(n1.left,n2.left) && matchTree(n1.right,n2.right);
		}
	}

}
