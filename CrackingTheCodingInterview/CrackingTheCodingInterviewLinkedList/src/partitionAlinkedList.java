
public class partitionAlinkedList {
	public static void main(String args[]){
		LinkedListNode n =  new LinkedListNode(5);
		LinkedListNode n1 =  new LinkedListNode(4);
		LinkedListNode n2 =  new LinkedListNode(3);
		LinkedListNode n3 =  new LinkedListNode(1);
		LinkedListNode n4 =  new LinkedListNode(2);
		n.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;		
		
		printList(n);
		System.out.println("\nPartitioning");
		LinkedListNode result = partition(n,3);
		printList(result);
	}
	
	public static void printList(LinkedListNode n){
		while(n != null){
			System.out.print(n.data + "-->");
			n = n.next;
		}
		System.out.print("null");
	}
	
	public static LinkedListNode partition(LinkedListNode n,int x){
		LinkedListNode head = n;
		LinkedListNode tail = n;
		
		while(n != null){
			LinkedListNode next = n.next;
			if(n.data < x){
				n.next = head;
				head = n;	
			} else {
				tail.next = n;
				tail = n;
			}
			n = next;
			
		}
		
		tail.next = null;
		return head;
	}

}
