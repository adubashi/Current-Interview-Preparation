import java.util.*;
public class removeDuplicatesFromAlinkedList {
	
	public static void removeDuplicates(LinkedListNode head){
		HashSet<Integer> set = new HashSet<Integer>();
		
		LinkedListNode cur = head;
		LinkedListNode prev = null;
		while(cur != null){
			if(set.contains(cur.data)){
				prev.next = cur.next;
			} else {
				set.add(cur.data);
				prev = cur;
			}
			cur = cur.next;
		}
	}

}
