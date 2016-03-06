
public class LinkedListClassTest {
	
	public static void main(String args[]){
		LinkedList list = new LinkedList(1);
		
		list.addNode(2);
		list.addNode(3);
		
		list.deleteNode(3);
		
		list.print();
	}
}
