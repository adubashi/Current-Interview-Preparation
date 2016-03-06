
public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean HasCycle(LinkedList l1){
		if(l1 == null){
			return false;
		}
		
		Node fast = l1.getHead();
		Node slow = l1.getHead();
		
		while(fast.getNext() != null && fast.getNext().getNext() == null){
			  slow = slow.getNext();
			  fast = fast.getNext().getNext();
			  if(slow == fast){
				  return true;
			  }
		}	
		return false;	
	}

}
