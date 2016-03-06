import java.util.*;
public class removeDuplicates {
	
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
		n4.next = null;		
		
		printList(n);
		System.out.println("\nDeleting Duplicates");
		deleteDups(n);
		printList(n);
	}
	
	public static void printList(LinkedListNode n){
		while(n != null){
			System.out.print(n.data + "-->");
			n = n.next;
		}
		System.out.print("null");
	}
	
	
	
	public static void deleteDuplicates(LinkedListNode n){
		Set<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		
		while(n != null){
			if(set.contains(n.data)){
				previous.next = n.next;
			} else {
				set.add(n.data);
				previous = n;
			
			}
			n = n.next;
		}	
		
	}
	
	public static void deleteDups(LinkedListNode n){
		LinkedListNode current = n;
		while(current != null){
			LinkedListNode runner = current;
			while(runner.next != null){
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}		
			}
			current = current.next;
		}
		
		
		
	}

}
