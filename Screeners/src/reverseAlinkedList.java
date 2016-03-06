
public class reverseAlinkedList {
	
	
	//O(n) - Time 
	public static LinkedListNode reverseLinkedList(LinkedListNode head){
		LinkedListNode cur = head;
		LinkedListNode prev = null;
		LinkedListNode next = null;
		
		while(cur != null){
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		
		head = prev;
		print(prev);
		return next;
	}
	
	public static void print(LinkedListNode n){
		while(n != null){
			System.out.print(n.data + "-->");
			n = n.next;
		}
		System.out.print("NULL");
	}
	
	public static void main(String args[]){
		LinkedListNode n = new LinkedListNode(1);
		LinkedListNode n1 = new LinkedListNode(2);
		LinkedListNode n2 = new LinkedListNode(3);
		n.next = n1;
		n1.next = n2;
		n2.next = null;
		
		LinkedListNode reversed = reverseLinkedList(n);
	}
	
	//Reverse - Recursive;
	//Space: O(n)
	//Time: O(n)
	public static LinkedListNode reverseRecursive(LinkedListNode head){
		if(head == null || head.next == null){
			return head;
		}
		
		LinkedListNode reversed = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return reversed;
	}
	

}
