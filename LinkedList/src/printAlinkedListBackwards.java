
public class printAlinkedListBackwards {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		
		l1.printList();
		printRev(l1);

	}
	
	public static void printRev(LinkedList l1){
		Node cur = l1.getHead();
		printReverse(cur);
	}
	
	public static void printReverse(Node head){
		if(head == null){
			return;
		}
		printReverse(head.getNext());
		System.out.print(head.getData());
		
	}

}
