
public class VerifyIdenticalTrees {
	
	public static boolean identicalTrees(BSTNode root1, BSTNode root2){
		if(root1 == null  && root2 == null){
			return true;
		}
		
		if(root1 != null && root2 != null){
			return identicalTrees(root1.right,root2.right) &&
			identicalTrees(root1.left, root2.left);
		}
		
		return false;
	}

}
