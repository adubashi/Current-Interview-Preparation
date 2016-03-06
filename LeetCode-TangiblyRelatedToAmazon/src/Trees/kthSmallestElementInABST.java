package Trees;


import java.util.*;
public class kthSmallestElementInABST {
    public int kthSmallest(Node root, int k) {
        Stack<Node> stack = new Stack<Node>();

        Node p = root;
        int result = 0;
        
        while(!stack.isEmpty()|| p != null){
            if(p != null){
                stack.push(p);
                p = p.left;
            } else {
                Node t = stack.pop();
                k--;
                if(k == 0){
                    result = t.data;
                }
                p = t.right;
            }
        }
        return result;
}

}
