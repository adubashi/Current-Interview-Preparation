
public class ReverseLinkedListPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Node reversePairRecur(Node head){
		Node temp;
		if(head == null || head.getNext() == null){
			return head;
		} else {
			temp = head.getNext();
			head.setNext(temp.getNext());
			temp.setNext(head);
			head = temp;
			
			head.next.next = reversePairRecur(head.next.next);
			return head;
		}
	}

}
