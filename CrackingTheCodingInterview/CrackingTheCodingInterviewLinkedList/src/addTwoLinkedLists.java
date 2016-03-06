
public class addTwoLinkedLists {
	public static void main(String args[]){
		LinkedListNode n =  new LinkedListNode(8);
		LinkedListNode n1 =  new LinkedListNode(1);
		LinkedListNode n2 =  new LinkedListNode(8);
		LinkedListNode n3 =  new LinkedListNode(1);

		n.next = n1;
		n1.next = null;
		
		n2.next = n3;
		n3.next = null;	
		
		printList(n);
		System.out.println();
		printList(n2);
		
		LinkedListNode result = addLinkedLists(n,n2,0);
		System.out.println();
		printList(result);
		System.out.println();
		
	}
	
	public static void printList(LinkedListNode n){
		while(n != null){
			System.out.print(n.data + "-->");
			n = n.next;
		}
		System.out.print("null");
	}
	
	public static LinkedListNode addLinkedLists(LinkedListNode n, LinkedListNode n1, int carry){
		if(n == null && n1 == null && carry == 0){
			return null;
		}
		LinkedListNode result = new LinkedListNode(0);
		int value = carry;
		if(n != null){
			value += n.data;
		}
		if(n1 != null){
			value += n1.data;
		}
		
		result.data = value % 10;
		
		if(n != null || n1 != null){
		   LinkedListNode more = addLinkedLists(n == null ? null : n.next,n1 == null ? null : n1.next,value >= 10 ? 1 : 0);
		   result.next = more;
		}
		return result;
		
	}
	

}
