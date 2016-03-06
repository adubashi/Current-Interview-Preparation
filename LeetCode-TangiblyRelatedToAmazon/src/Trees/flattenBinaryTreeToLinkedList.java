package Trees;
import java.util.*;
public class flattenBinaryTreeToLinkedList {
    public void flatten(Node root) {
        Stack<Node> stack = new Stack<Node>();
        Node p = root;
 
        while(p != null || !stack.empty()){
 
            if(p.right != null){
                stack.push(p.right);
            }
 
            if(p.left != null){
                p.right = p.left;
                p.left = null;
            }else if(!stack.empty()){
                Node temp = stack.pop();
                p.right=temp;
            }
 
            p = p.right;
        }
    }

}
