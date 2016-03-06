
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		l1.addIndex(5, 4);
		
		l1.printList();
		
		
		l1.reverseListIter();
		
		l1.reverseListRecur();
		
		l1.printList();
	}

}
