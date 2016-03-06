
public class ValidateBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean validateBST(BSTNode root, int min_value, int max_value){
		if(root == null){
			return true;
		}
		if(root.data < min_value || root.data > max_value){
			return false;
		}
		
		return validateBST(root.left,min_value, root.data) &&
			   validateBST(root.right,root.data, max_value);
	
	}

}
