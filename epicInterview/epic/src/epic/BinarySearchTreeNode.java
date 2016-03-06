package epic;



public class BinarySearchTreeNode {
	char character;
	BinarySearchTreeNode left;
	BinarySearchTreeNode right;
	
	public BinarySearchTreeNode(char s){
		character = s;
	}
	
	public void setLeft(BinarySearchTreeNode n){
		this.left = n;
	}
	
	public void setRight(BinarySearchTreeNode n){
		this.right = n;
	}

}
