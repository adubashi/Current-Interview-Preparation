
public class LinkedList {
	
	private Node head;
	
	public LinkedList(int data){
		head = new Node(data);
	}
	
	public Node getHead(){
		return head;
	}
	
	
	//Add node to front
	public void addNode(int data){
		Node tmp = new Node(data);
		tmp.next = head;
		head = tmp;
	}
	
	public void addNodeToTail(int data){
		
	}
	
	public void deleteNode(int data){
		Node cur = head;
		Node prev = null;
		
		if(cur.data == data){
			head = head.next;
			return;
		}
		
		
		while(cur != null){
			if(cur.data == data){
				prev.next = cur.next;
			}
			prev = cur;
			cur = cur.next;
		}
	}
	
	public void print(){
		Node cur = head;
		while(cur != null){
			System.out.print(cur.data + " -->");
			cur = cur.next;
		}
		
		System.out.print("NULL");
	}

}
