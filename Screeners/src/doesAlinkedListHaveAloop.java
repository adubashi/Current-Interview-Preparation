
public class doesAlinkedListHaveAloop {
	
	public static boolean haveAcycle(LinkedListNode n){
		
		LinkedListNode fast = n;
		LinkedListNode slow = n;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;	
			//There is no way the nodes could've jumped over each other
			if(slow == fast){
				return true;
			}
		}
		return false;
	}
	
	public static LinkedListNode findBeginning(LinkedListNode head){
		LinkedListNode fast = head;
		LinkedListNode slow = head;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;	
			//There is no way the nodes could've jumped over each other
			if(slow == fast){
				break;
			}
		}
		
		if(fast == null || fast.next == null){
			return null;
		}
		
		slow = head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}

}
