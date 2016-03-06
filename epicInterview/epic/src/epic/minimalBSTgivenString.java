package epic;

import java.util.Arrays;

public class minimalBSTgivenString {
	
	

	public static void main(String[] args) {
		
		createBinarySearchTree("epic");

	}
	
	public static void createBinarySearchTree(String s) {
		// TODO Auto-generated method stub
		char[] content=s.toCharArray();
		Arrays.sort(content);
		BinarySearchTreeNode minimalBST=createMinimalBSTree(new String(content),0,s.length()-1);
		
		inorder(minimalBST);
		
	}
	
	public static BinarySearchTreeNode createMinimalBSTree(String s,
			int start, int end) {
		// TODO Auto-generated method stub
		if(end<start)
			return null;
		int mid=(start+end)/2;
		BinarySearchTreeNode bstNode=new BinarySearchTreeNode(s.charAt(mid));
		bstNode.setLeft(createMinimalBSTree(s,start,mid-1));
		bstNode.setRight(createMinimalBSTree(s,mid+1,end));
		
		return bstNode;
	}
	
	public static void inorder(BinarySearchTreeNode n){
		if(n == null){
			return;
		}
		inorder(n.left);
		System.out.println(n.character);
		inorder(n.right);
	}

}
