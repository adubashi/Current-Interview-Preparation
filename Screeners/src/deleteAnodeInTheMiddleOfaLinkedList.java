
public class deleteAnodeInTheMiddleOfaLinkedList {

	public static void deleteAnode(LinkedListNode n){
		if( n == null || n.next == null){
			n = null;
		}
		LinkedListNode next = n.next;
		n.data = next.data;
		n.next = next.next;
		return;
	}
}
