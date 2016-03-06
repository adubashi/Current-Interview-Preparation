import java.util.*;
public class inorderTraversal {
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
		
		//Inorder traversals
		System.out.print(" Tree- Inorder-Recursive: ");
		inOrder(root);
		System.out.println();
		
		System.out.print(" Tree- Inorder-Iterative: ");
		inorderIter(root);
		System.out.println();
		
		//Preorder traversal:
		System.out.print(" Tree- Preorder-Recursive: ");
		preOrder(root);
		System.out.println();
		
		System.out.print(" Tree- Preorder-Iterative: ");
		preorderIter(root);
		System.out.println();
		
		
		//Postorder traversal:
		System.out.print(" Tree- Postorder-Recursive: ");
		postOrder(root);
		System.out.println();
		
		System.out.print(" Tree- Postorder-Iterative: ");
		postorderIter(root);
		System.out.println();
		
	}
	
	//Inorder traversals
	public static void inOrder(Node root){
		if(root != null){
		   inOrder(root.left);
		   System.out.print(root.data + " ");
		   inOrder(root.right);
		}
	}
	
	public static void inorderIter(Node root){
		Stack<Node> s = new Stack<Node>();
		Node current = root;
		while(!s.isEmpty() || current != null){
			if(current != null){
				s.push(current);
				current = current.left;
			} else {
				current = s.peek();
				s.pop();
				System.out.print(current.data + " ");
				current = current.right;
			}		
		}
	}
	
	//Iterative preorder traversal
	public static void preOrder(Node root){
		if(root != null){
		   System.out.print(root.data + " ");
		   preOrder(root.left);
		   preOrder(root.right);
		}
	}
	
	//Preorder iterative
	public static void preorderIter(Node root){
        Stack<Node> stack = new Stack<Node>();
        Node cur = root;
        stack.push(cur);
 
        while(!stack.isEmpty()){
            Node n = stack.pop();
            System.out.print(n.data + " ");
 
            if(n.right != null){
                stack.push(n.right);
            }
            if(n.left != null){
                stack.push(n.left);
            }
 
        }
	}
	
	//Post order traversal
	public static void postOrder(Node root){
		if(root != null){
		   postOrder(root.left);
		   postOrder(root.right);
		   System.out.print(root.data + " ");
		}
	}

	
	public static void postorderIter(Node root){
		ArrayList<Integer> lst = new ArrayList<Integer>();
 
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
 
        Node prev = null;
        while(!stack.empty()){
            Node curr = stack.peek();
 
            // go down the tree.
            //check if current node is leaf, if so, process it and pop stack,
            //otherwise, keep going down
            if(prev == null || prev.left == curr || prev.right == curr){
                //prev == null is the situation for the root node
                if(curr.left != null){
                    stack.push(curr.left);
                }else if(curr.right != null){
                    stack.push(curr.right);
                }else{
                    stack.pop();
                    System.out.print(curr.data + " ");
                    lst.add(curr.data);
                }
 
            //go up the tree from left node    
            //need to check if there is a right child
            //if yes, push it to stack
            //otherwise, process parent and pop stack
            }else if(curr.left == prev){
                if(curr.right != null){
                    stack.push(curr.right);
                }else{
                    stack.pop();
                    System.out.print(curr.data + " ");
                    lst.add(curr.data);
                }
            //go up the tree from right node 
            //after coming back from right node, process parent node and pop stack. 
            }else if(curr.right == prev){
                stack.pop();
                System.out.print(curr.data + " ");
                lst.add(curr.data);
            }
 
            prev = curr;
        }		
	}
	
	
	
	

}
