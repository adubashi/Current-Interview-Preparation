
public class findIntersectionPointLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public LinkedListNode getIntersectionNode(LinkedListNode headA, LinkedListNode headB) {
		
		LinkedListNode list1node = null;
		int firstLength = getLength(headA);
		LinkedListNode list2node = null;
		int secondLength = getLength(headB);
		
		int lengthDifference = 0;
		
		//Set the length difference to the right node 
		if(firstLength >= secondLength){
		   lengthDifference = firstLength - secondLength;
		   list1node = headA;
		   list2node = headB;
		} else {
			lengthDifference = secondLength - firstLength;
			list1node = headB;
			list2node = headA;
		}
		
		while(lengthDifference > 0){
			list1node = list1node.next;
			lengthDifference--;
		}
		
		while(list1node != null){
			if(list1node == list2node){
				return list1node;
			}
			list1node = list1node.next;
			list2node = list2node.next;
		}
		
		
		
		
		return null;
    }
	
	public static int getLength(LinkedListNode head){
		int count = 0;
		LinkedListNode n = head;
		while(n != null){
			count++;
			n = n.next;
		}
		return count;
	}

}
