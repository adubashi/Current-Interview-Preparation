import java.util.*;
public class storeLevelOfaTreeInItsOwnList {
	
	public static void main(String[] args){
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
		
		ArrayList<LinkedList<Node>> lists = createLevelLinkedList(root);
		
		System.out.println(lists.toString());
		
		//Iterating through the ArrayList of LinkedList of nodes 
		for(int i = 0; i < lists.size(); i++){
			LinkedList<Node> li = lists.get(i);
			ListIterator<Node> listIterator = li.listIterator();
	        while (listIterator.hasNext()) {
	            System.out.print(listIterator.next().data + " ");
	        }
	        System.out.println();
		}
	}
	
	//Time: O(N)
	//Space: O(N + logn) logn from recursive calls in the stack == O(n) 
	public static void createLevelLinkedList(Node root, ArrayList<LinkedList<Node>> lists, int level){
		if(root == null){
			return;
		}
		LinkedList<Node> list = null;
		if(lists.size() == level){
			list = new LinkedList<Node>();
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		list.add(root);
		createLevelLinkedList(root.left,lists,level+1);
		createLevelLinkedList(root.right,lists,level+1);
	}
	
	public static ArrayList<LinkedList<Node>> createLevelLinkedList(Node root){
		ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
		
		createLevelLinkedList(root,lists,0);
		return lists;
	}
	
	//IN BFS
	//Time:O(n)
	//Space:O(n)
	//Iterate through the root first, then level 2, then level 3
	//With each level i, we will have already visited all the nodes on i-1. Thie means, that to get
	// which nodes are on level i, we can look at the children of level i-1
	public static ArrayList<LinkedList<Node>> createLevelLinkedListBFS(Node root){
		ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
		
		//Visit the root
		LinkedList<Node> current = new LinkedList<Node>();
		if(root != null){
			current.add(root);
		}
		//
		while(current.size() > 0){
			//Add previous level
			result.add(current);
			//Go to next level
			LinkedList<Node> parents = current;
			current = new LinkedList<Node>();
			for(Node parent: parents){
				if(parent.left != null){
					current.add(parent.left);
				}
				if(parent.right != null){
					current.add(parent.right);
				}
			}
		}
		return result;
	}
}
