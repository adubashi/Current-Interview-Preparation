package Trees;
import java.util.*;
public class binaryTreeRightSideView {
	
	public List<Integer> rightSideView(Node root) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    if(root == null) return result;
	    LinkedList<Node> queue = new LinkedList<Node>();
	    queue.add(root);
	 
	    while(queue.size() > 0){
	        //get size here
	        int size = queue.size();
	        for(int i=0; i<size; i++){
	            Node top = queue.remove();
	            //the first element in the queue (right-most of the tree)
	            if(i==0){
	                result.add(top.data);
	            }
	            //add right first
	            if(top.right != null){
	                queue.add(top.right);
	            }
	            //add left
	            if(top.left != null){
	                queue.add(top.left);
	            }
	        }
	    }
	 
	    return result;
	}

}
