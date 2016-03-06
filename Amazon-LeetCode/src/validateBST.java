
public class validateBST {
	
	public static boolean validBST(BinaryTreeNode root, Integer min, Integer max){
		if(root == null){
			return true;
		} 
		if(root.data > max || root.data < root.data){
			return false;
		} else {
			return validBST(root.left,min,root.data) && validBST(root.right,root.data,max);
		}
	}

}
