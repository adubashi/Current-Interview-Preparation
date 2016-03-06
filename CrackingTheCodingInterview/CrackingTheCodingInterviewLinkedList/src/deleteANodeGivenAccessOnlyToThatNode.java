
public class deleteANodeGivenAccessOnlyToThatNode {
	
	
	
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
		deleteNode(n2);
		printList(n);
		System.out.println();
		
	}
	
	public static void printList(LinkedListNode n){
		while(n != null){
			System.out.print(n.data + "-->");
			n = n.next;
		}
		System.out.print("null");
	}
	
	public static boolean deleteNode(LinkedListNode nonHead){
		if(nonHead == null || nonHead.next == null){
			return false;
		} else {
			LinkedListNode next = nonHead.next;
			nonHead.data = next.data;
			nonHead.next = next.next;
			return true;
		}
	}
	
}
