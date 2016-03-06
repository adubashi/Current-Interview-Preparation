import java.util.*;
public class levelOrderTraversal {
	
	public static void main(String args[]){
		Node root = new Node(10);
		root.left = new Node(5);
		root.left.parent = root;
		root.right = new Node(15);
		root.right.parent = root;
		root.left.left = new Node(3);
		root.left.left.parent = root.left;
		root.right.left = new Node(13);
		root.right.left.parent = root.right;
		Node a = new Node(7);
		root.left.right = a;
		root.left.right.parent = root.left;
		System.out.print(" Tree : ");
		root.display(root);
		
		
		System.out.println("Level Order Traversal: ");
		levelOrder(root);
	}
	
	
	//O(n) Time 
	
	public static void levelOrder(Node root){
		if(root == null){
			return;
		}
		Queue<Node> currentQueue = new LinkedList<Node>(); 
		currentQueue.add(root);
		while(!currentQueue.isEmpty()){
			Node temp = currentQueue.poll();
			System.out.print(temp.data + ",");
			if(temp.left != null){
				currentQueue.add(temp.left);
			}
			if(temp.right != null){
				currentQueue.add(temp.right);
			}
		}
		System.out.println();
		
		
	}

}
