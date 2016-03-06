package Trees;




public class sortedListToBST {
	public static LinkedListNode h;
	
	public Node sortedListToBST(LinkedListNode head, int len) {
		if (head == null)
			return null;
 
		h = head;
		return sortedListToBST(0, len - 1);
	}
	public Node sortedListToBST(int start, int end) {
		if (start > end)
			return null;
 
		// mid
		int mid = (start + end) / 2;
 
		Node left = sortedListToBST(start, mid - 1);
		Node root = new Node(h.data);
		h = h.next;
		Node right = sortedListToBST(mid + 1, end);
 
		root.left = left;
		root.right = right;
 
		return root;
	}

}
