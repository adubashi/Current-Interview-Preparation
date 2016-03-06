
public class kthToLastElementOfaLinkedList {
	
	public static LinkedListNode kthToLast(LinkedListNode head, int k){
		LinkedListNode first = head;
		LinkedListNode second = head;
		
		int i = 0;
		while(first != null && i < k - 1 ){
			first = first.next;
			i++;
		}
		
		if(first == null){
			return null;
		}
		
		while(first.next != null){
			first = first.next;
			second = second.next;
		}
		
		return second;
	}

}
