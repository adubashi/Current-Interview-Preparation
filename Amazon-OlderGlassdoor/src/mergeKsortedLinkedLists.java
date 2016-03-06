import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class mergeKsortedLinkedLists {
	public static void main(String args[]){
		
	}
	
	public LinkedListNode mergeKlists(ArrayList<LinkedListNode> lists  ){
		
		//Make a comparator(for sorting)
		Comparator<LinkedListNode> sort =  new Comparator<LinkedListNode>() {
			public int compare(LinkedListNode a, LinkedListNode b) {
				if (a.data > b.data)
					return 1;
				else if(a.data == b.data)
					return 0;
				else 
					return -1;
			}
		};
		
		//Create a priority queue
		PriorityQueue<LinkedListNode> q = new PriorityQueue<LinkedListNode>(lists.size(),sort);
		
		//add first node of each list to the queue
		for (LinkedListNode list : lists) {
			if (list != null){
				q.add(list);
			}
		}
		
		LinkedListNode  head  = new LinkedListNode(0);
		LinkedListNode  p = head; //Serves as a pointer/cursor
		
		while (q.size() > 0) {
			LinkedListNode temp = q.poll();
			//poll() retrieves and removes the head of the queue - q. 
			p.next = temp;
 
			//keep adding next element of each list
			if (temp.next != null){
				q.add(temp.next);
			}
			p = p.next;
		}
 
		return head.next;
	}

}
