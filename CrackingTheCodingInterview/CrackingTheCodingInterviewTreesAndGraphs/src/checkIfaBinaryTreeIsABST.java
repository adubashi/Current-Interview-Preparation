
//Time: O(n)
//Space: O(H)
public class checkIfaBinaryTreeIsABST {
	public static boolean validateBST(BinaryTreeNode head, Double min, Double max){
		if(head == null){
			return true;
		} 
		if(head.data > max || head.data < min){
			return false;
		} 
		
		return validateBST(head.left,min,(double)head.data) || validateBST(head.right,(double)head.data,max);
	}

}
