
public class reverseAlinkedList {
	
	public static LinkedListNode reverse(LinkedListNode head){
		LinkedListNode prev = null;
		LinkedListNode next;
		LinkedListNode cur = head;
		
		while(cur != null){
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = cur.next;
		}
		prev.next = null;
		return prev;
	}

}
