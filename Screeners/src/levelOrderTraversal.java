import java.util.*;
public class levelOrderTraversal {
	//O(n) time
	//O(n) space
	public static void printLevelOrder(BinaryTreeNode root){
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		
		queue.add(root);
		
		while(queue.size() > 0){
			BinaryTreeNode tmp = queue.poll();
			System.out.println(tmp.data + " ");
			
			if(tmp.left != null){
				queue.add(tmp.left);
			}
			if(tmp.right != null){
				queue.add(tmp.right);
			}
		}
		
	}

}
