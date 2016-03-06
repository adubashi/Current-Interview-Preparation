import java.util.HashSet;


public class RemoveDuplicates {
	
	public static void main(String Args[]){
		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(4);
		l1.add(4);
		l1.add(4);
		l1.add(4);
		l1.add(5);
		
		l1.printList();
		removeDuplicates(l1);
		l1.printList();
	}
	
	public static void removeDuplicates(LinkedList l1){
		Node cur = l1.getHead();
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(cur.data);
		
		while(cur.next != null){
			if(!set.contains(cur.next.data)){
				set.add(cur.next.data);
				cur = cur.next;
			} else {
				cur.next = cur.next.next;
			}
			
		}
	}

}
