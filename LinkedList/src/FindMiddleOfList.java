
public class FindMiddleOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Node findMiddle(LinkedList l1){
		Node slow = l1.getHead();
		Node fast = l1.getHead();
		int i = 0;
		while(slow.getNext() != null){
			if(i % 2 == 0){
				slow = slow.getNext();
			} else if(i % 2 == 1){
				slow = slow.getNext();
				fast = fast.getNext();
			}
			i++;
		}
		
		return slow;
	}
}
