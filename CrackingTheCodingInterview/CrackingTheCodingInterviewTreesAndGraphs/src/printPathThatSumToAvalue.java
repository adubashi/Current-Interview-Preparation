
public class printPathThatSumToAvalue {
	public static void main(String args[]){
		//Make a BST 
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
		
	}
	//Time: O(nlogn)
	//Space:O(logn)
	public static void print(int[] path, int start, int end){
		for(int i  = start; i <= end; i++){
			System.out.println(path[i] + " ");
		}
		System.out.println();
	}
	
	public static int depth(Node node){
		if(node == null){
			return 0;
		} else {
			return 1 + Math.max(depth(node.left),depth(node.right));
		}
	}
	
	public static void findSum(Node node, int sum, int[] path, int level){
		if(node == null){
			return;
		}
		//Insert current node into path
		path[level] = node.data;
		
		//Look for paths with a sum that ends at this node 
		int t = 0;
		for(int i = level; i >= 0; i--){
			t += path[i];
			if(t == sum){
				print(path,i,level);
			}
		}
		
		findSum(node.left, sum,path,level+1);
		findSum(node.right,sum,path,level+1);
	}
	
	public static void findSum(Node root, int sum){
		int depth = depth(root);
		int[] path = new int[depth];
		findSum(root,sum,path,0);
		
	}

}
