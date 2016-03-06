
public class Node {
	int data;
	Node left;
	Node right;
	Node parent;
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
	
	public void display(Node root){
		if(root !=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
}
