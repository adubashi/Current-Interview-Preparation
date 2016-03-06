
public class validBST {
	
	//O(logn) - Space
	//O(n) - Time
	public static boolean checkBST(BinaryTreeNode root, Integer min, Integer max){
		if(root == null){
			return true;
		}
		if(root.data > max || root.data < min){
			return false;
		} else {
			return checkBST(root.left,min,root.data) && checkBST(root.right,root.data,max);
		}
	}

}
