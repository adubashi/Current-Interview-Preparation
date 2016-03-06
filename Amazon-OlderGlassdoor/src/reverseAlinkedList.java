
public class reverseAlinkedList {
	public static void main(String args[]){
		LinkedListNode n =  new LinkedListNode(1);
		LinkedListNode n1 =  new LinkedListNode(2);
		LinkedListNode n2 =  new LinkedListNode(3);
		LinkedListNode n3 =  new LinkedListNode(4);
		LinkedListNode n4 =  new LinkedListNode(5);
		n.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;		
		
		printList(n);
		LinkedListNode h = reverseLinkedListIterative(n);
		System.out.println();
		printList(h);
	}
	public static void printList(LinkedListNode n){
		while(n != null){
			System.out.print(n.data + "-->");
			n = n.next;
		}
		System.out.print("null");
	}
	
	//Iterative solution
	public static LinkedListNode reverseLinkedListIterative(LinkedListNode head){
		LinkedListNode cur = head;
		LinkedListNode prev = null;
		LinkedListNode next;
		
		while(cur != null){
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		head = prev;
		return prev;	
	}
	
	//Recursive implementation 
	//Time: O(n)
	//Space:O(n)
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
