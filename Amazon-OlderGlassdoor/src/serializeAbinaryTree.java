import java.util.*;
public class serializeAbinaryTree {
	
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
		System.out.println(serialize(root));
		String test = serialize(root);
		Node root2 = deserialize(test);
		
		root2.display(root2);
	}
	
	
	
	public static String serialize(Node root){
	    StringBuilder sb = new StringBuilder();
	    serialize(root, sb);
	    return sb.toString();
	}

	private static void serialize(Node x, StringBuilder sb){
	    if (x == null) {
	        sb.append("# ");
	    } else {
	        sb.append(x.data + " ");
	        serialize(x.left, sb);
	        serialize(x.right, sb);
	    }
	}
	
	public static Node deserialize(String s){
	    if (s == null || s.length() == 0) return null;
	    StringTokenizer st = new StringTokenizer(s, " ");
	    return deserialize(st);
	}

	private static Node deserialize(StringTokenizer st){
	    if (!st.hasMoreTokens())
	        return null;
	    String val = st.nextToken();
	    if (val.equals("#"))
	        return null;
	    Node root = new Node(Integer.parseInt(val));
	    root.left = deserialize(st);
	    root.right = deserialize(st);
	    return root;
	}

}
