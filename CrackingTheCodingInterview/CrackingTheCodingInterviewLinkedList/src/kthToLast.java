
public class kthToLast {
	public static void main(String args[]){
		LinkedListNode n =  new LinkedListNode(1);
		LinkedListNode n1 =  new LinkedListNode(2);
		LinkedListNode n2 =  new LinkedListNode(3);
		LinkedListNode n3 =  new LinkedListNode(2);
		LinkedListNode n4 =  new LinkedListNode(1);
		n.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;		
		
		printList(n);
		System.out.println();
		kthToLast(n,2);
		
	}
	
	public static void printList(LinkedListNode n){
		while(n != null){
			System.out.print(n.data + "-->");
			n = n.next;
		}
		System.out.print("null");
	}
	
	public static LinkedListNode kthToLast(LinkedListNode n, int k){
		
		if(k <= 0){
			System.out.println("K is too small");
		}
		
		//Start the process 
		LinkedListNode runner = n;
		LinkedListNode runner2 = n;
		
		
		//Move runner by k spots
		int i = 1;
		while( i < k && runner != null){
			runner = runner.next;
			i++;
		}
		//return null
		if(runner == null){
			   System.out.println("K is too large");
			   return null;
		}
		
		//To get nth from last, not N - 1 from last, should be runner.next != null, not runner != null;
		while(runner.next != null){
			runner = runner.next;
			runner2 = runner2.next;
		}
		
		System.out.println(runner2.data);
		return runner2;
	}

}
