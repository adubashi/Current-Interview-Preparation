
public class deleteZeroSumSubtrees {
	public static int deleteZeroSumSubtreesRec(BSTNode root){
		if(root == null ){
			return 0;
		}
		
		int sum_left = deleteZeroSumSubtreesRec(root.left);
		int sum_right = deleteZeroSumSubtreesRec(root.right);
		
		if(sum_left == 0){
			root.left = null;
		}
		if(sum_right == 0){
			root.right = null;
		}
		
		return root.data + sum_left + sum_right;
	}
	
	public static void deleteZeroSumTrees(BST tree){
		if(tree == null || tree.root == null){
			return;
		}
		if(0 == deleteZeroSumSubtreesRec(tree.root)){
			tree.root = null;
		}
			
	}
}
