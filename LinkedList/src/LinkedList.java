
public class LinkedList {
	
	private Node head;
	public LinkedList() {
		this.head = new Node(null);
	}
	
	public Node getHead(){
		return this.head;
	}
	
	//Insert 
	public void add(int data){
		Node newNode = new Node(data);
		
		Node current = head;
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(newNode);
	}
	
	public void addIndex(int data, int index){
		Node newNode = new Node(data);
		Node current = head;
		int i = 0;
		
		while(current.getNext() != null && i < index){
			current = current.getNext();
			i++;
		}
		newNode.setNext(current.getNext());
		current.setNext(newNode);	
	}
	//Delete 
	public void delete(int target){
		Node current = head;
		int i = 0;
		
		while(current.getNext() != null && current.getNext().getData() != target){
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());	
	}
	
	public void deleteIndex(int index){
		Node current = head;
		Node prev = null;
		int i = 0;
		
		while(current != null && i <= index){
			prev = current;
			current = current.getNext();
			i++;
		}
		prev.setNext(current.getNext());
		
		
	}
	
	//Print 
	public void printList(){
		System.out.print("head");
		Node cur = head;
		while(cur != null){
			System.out.print(cur.getData());
			cur = cur.next;
		}
		System.out.print("null");
	}
	
	//Reverse linked list
	
	public void reverseListIter(){
		Node prev = null;
		Node cur = head;
		Node next = null;
		while(cur != null){
			next = cur.getNext();
			cur.setNext(prev);
			prev = cur;
			cur = next;
		}
		head = prev;
	}
	
	public void reverseListRecur(){
		reverseListRecurHelper(this.head);
	}
	
	private void reverseListRecurHelper(Node c){
		
		if(c == null){
			return;
		}
		if( c.next == null){
			head = c;
			return;
		}
		
		reverseListRecurHelper(c.next);
		c.next.next = c;
		c.next = null;	
	}

}
