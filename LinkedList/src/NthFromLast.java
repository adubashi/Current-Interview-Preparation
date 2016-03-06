
public class NthFromLast {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		l1.printList();
		System.out.println(NthFromLast(l1,9));
		
		

	}
	
	public static int NthFromLast(LinkedList l1, int n){
		Node cur = l1.getHead();
		Node second = l1.getHead();
		
		for(int i = 0; i < n &&  second != null; i++){
			second = second.getNext();
		}
		
		while(second != null){
			second = second.getNext();
			cur = cur.getNext();
		}
		
		return cur.getData();
		
	}

}
