


public class Node {
		int data;
		Node next;
		
		//Constructor 
		public Node(int data){
			this.data = data;
			this.next = null;
		}
		
		public Node(Node nextVal){
			this.next = nextVal;
		}
		
		public Node(int data, Node nextVal){
			next =  nextVal;
			this.data = data;
		}
		
		//Getters
		public int getData(){
			return this.data;
		}
		
		public Node getNext(){
			return this.next;
		}
		
		//Setters
		public void setData(int data){
			this.data = data;
		}
		
		public void setNext(Node newNode){
			this.next = newNode;
		}
			
}


