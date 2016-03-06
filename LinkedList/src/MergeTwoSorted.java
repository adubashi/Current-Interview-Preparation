
public class MergeTwoSorted {

	public static void main(String[] args) {
		Node head1 = null;
		Node head2 = null;
		
		Node a = new Node(1);
		Node b = new Node(6);
		Node c = new Node(9);
		
		head1 = a;
		a.next = b;
		b.next = c;
		c.next = null;
		
		Node d = new Node(3);
		Node e = new Node(5);
		
		head2 = d;
		d.next = e;
		e.next = null;
		
		Node merge = mergeSorted(head1, head2);
		
		System.out.println(merge.getData());
		merge = merge.getNext();
		System.out.println(merge.getData());
		merge = merge.getNext();
		System.out.println(merge.getData());
		merge = merge.getNext();
		System.out.println(merge.getData());
		merge = merge.getNext();
		System.out.println(merge.getData());
		merge = merge.getNext();

	}
	
	public static Node mergeSorted(Node l1, Node l2){
		Node MergeHead = null;
		
		//Empty list
		if(l1 == null){
		   return l2;
		} else if(l2 == null){
			return l1;
		}
		
		//Setting first Node;
		
		if(l1.getData() >= l2.getData()){
			MergeHead = l2;
			l2 = l2.next;
		} else {
			MergeHead = l1;
			l1 = l1.next;
		}
		
		Node mergedTail = MergeHead;
		
		while(l1 != null && l2 != null){
			Node temp = null;
			if(l1.data <= l2.data){
				temp = l1;
				l1 = l1.next;
			} else {
				temp = l2;
				l2 = l2.next;
			}
			
			mergedTail.next = temp;
			mergedTail = temp;	
		}
		
		//One of lists is not null
		if(l1 != null){
			mergedTail.next = l1;
		} else if(l2 != null){
			mergedTail.next = l2;
		}
		
		return MergeHead;
		
		
		
		
		
		
	}

}
