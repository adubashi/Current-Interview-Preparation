
public class createMinimalBSTfromSortedArray {
	public static void main(String args[]){
		
	}
	
	public static BinaryTreeNode createMinimalBST(int[] array){
		return createMinimalBST(array,0,array.length-1);
	}
	
	
	//Time O(n)
	//Space: O(H = logn)
	public static BinaryTreeNode createMinimalBST(int array[], int start, int end){
		
		if(start > end){
			return null;
		} 
		int mid = (start + end)/2;
		BinaryTreeNode n = new BinaryTreeNode(array[mid]);
		n.left = createMinimalBST(array,start,mid-1);
		n.right = createMinimalBST(array,mid+1,end);
		return n;
	}
	
	

}
