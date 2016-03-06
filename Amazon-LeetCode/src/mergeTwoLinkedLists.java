
public class mergeTwoLinkedLists {
	public static LinkedListNode mergeLinkedLists(LinkedListNode h1, LinkedListNode h2){
		LinkedListNode p1 = h1;
		LinkedListNode p2 = h2;
		
		LinkedListNode dummy = new LinkedListNode(0);
		LinkedListNode p = dummy;
		
		while(p1 != null && p2 != null){
			if(p1.data <= p2.data){
	              p.next = p1;
	              p1 = p1.next;
	        }else{
	              p.next = p2;
	              p2 = p2.next;
	        }
	        p = p.next;
		}
		
		//What if p1 still has nodes left;
		if(p1 != null){
			p.next = p1;
		}
		//What if p2 still has nodes left;
		if(p2 != null){
			p.next = p2;
		}
		
		return dummy.next;
	}

}
