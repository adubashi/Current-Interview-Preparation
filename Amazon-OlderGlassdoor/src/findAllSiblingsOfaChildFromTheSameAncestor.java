
public class findAllSiblingsOfaChildFromTheSameAncestor {
	
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
		System.out.println();	
		
		findAll(root,a);
	}
	
	//With links to parents
	public static void findAll(Node ancestor, Node child){
		if(ancestor != null){
		   findAll(ancestor.left,child);
		   if(ancestor == child){
			   Node parent = child.parent;
			   if(parent.right != null){
				   System.out.println(parent.right.data);
			   } 
			   if(parent.left != null){
				   System.out.println(parent.left.data);
			   }
		   }
		   
		   findAll(ancestor.right,child);
		}
	}
	
	//W/O links to parents 
	public static void findAll2(Node ancestor, Node child){
		if(ancestor != null){
		   findAll2(ancestor.left,child);
		   if(ancestor.right == child ){
			   Node parent = ancestor;
			   if(parent.right != null){
				   System.out.println(parent.right.data);
			   } 
			   if(parent.left != null){
				   System.out.println(parent.left.data);
			   }
		   }
		   
		   findAll2(ancestor.right,child);
		}
	}

}
