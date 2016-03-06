
public class CheckIfaBinaryTreeBalanced {
		public static void main(String args[]){
			
		}
		
		
		//First method: O(nlogn) time
		public static int getHeight(BinaryTreeNode node){
			if(node == null){
				return 0;
			} else {
				return Math.max(getHeight(node.right),getHeight(node.left)) + 1;
			}
		}
		
		public static boolean isBalanced(BinaryTreeNode root){
			if(root == null) return true;
			
			int heightDiff = getHeight(root.right) - getHeight(root.left);
			if(Math.abs(heightDiff) > 1){
				return false;
			} else {
				return isBalanced(root.left) && isBalanced(root.right);
			}
		}
		
		//2nd Method: O(n) Time
		//O(H) space, H = Height of the Tree
		
		public static int checkHeight(BinaryTreeNode root){
			if(root == null){
				return 0;
			} 
			int leftHeight = checkHeight(root.left);
			//Not Balanced
			if(leftHeight == -1){
				return -1;
			}
			int rightHeight = checkHeight(root.right);
			//Not balanced
			if(rightHeight == -1){
				return -1;
			}
			
			int heightDiff = leftHeight - rightHeight;
			if(Math.abs(heightDiff) > 1){
			   return -1;
			} else {
				return Math.max(leftHeight, rightHeight) + 1;
			}
		}
		
		public static boolean isBalanced2nd(BinaryTreeNode root){
			if(checkHeight(root) == -1 ){
				return false;
			} else {
				return true;
			}
		}
		
		
}
