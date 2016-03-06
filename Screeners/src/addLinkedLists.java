
public class addLinkedLists {
	
	
	public static LinkedListNode add(LinkedListNode n1, LinkedListNode n2, int carry){
		
		if(n1 == null && n2 == null & carry == 0){
			return null;
		}
		int value  = carry;
		if(n1 != null){
			value += n1.data;
		}
		if(n2 != null){
			value += n2.data;
		}
		
		
		//Get new carry
		int newCarry = 0;
		if(value > 9){
			newCarry = 1;
		} else {
			newCarry = 0;
		}
		value = value % 10;
		LinkedListNode result = new LinkedListNode(value);
		if(n1 != null || n2 != null){
			LinkedListNode more = add(n1.next,n2.next,newCarry);
			result.next = more;
		}
		return null;
	}

}
