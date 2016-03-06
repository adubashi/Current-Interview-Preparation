import java.util.*;
public class checkIfaLinkedListIsACycle {
	public static void main(String args[]){
		LinkedListNode n =  new LinkedListNode(1);
		LinkedListNode n1 =  new LinkedListNode(2);
		LinkedListNode n2 =  new LinkedListNode(3);
		LinkedListNode n3 =  new LinkedListNode(2);
		LinkedListNode n4 =  new LinkedListNode(1);
		n.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n1;		
		/*
		 * n --> n1 --> n2 --> n3 --> n4 --> n1 ...
		 */
		//printList(n);
		
		System.out.println(hasAcycle(n));
	}
	
	public static void printList(LinkedListNode n){
		while(n != null){
			System.out.print(n.data + "-->");
			n = n.next;
		}
		System.out.print("null");
	}
	
	public static boolean hasAcycle(LinkedListNode n){
		//Tortoise and the hare method
		LinkedListNode slow = n;
		LinkedListNode fast = n;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast){
				return true;
			}
		}
		
		return false;
	}
	
	public LinkedListNode findBeginning(LinkedListNode head){
		//Tortoise and the hare method - to find the start of the list
		LinkedListNode slow = head;
		LinkedListNode fast = head;
				
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
					
			if(slow == fast){
				break;
			}
		}
		
		//no meeting point -- no loop
		if(fast == null || fast.next == null){
			return null;
		}
		
		/*
		 * Move slow to Head. Keep fast at meeting point
		 */
		slow = head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		
		return fast;
		
		
	}
}
