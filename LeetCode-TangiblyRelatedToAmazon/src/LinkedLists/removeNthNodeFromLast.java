package LinkedLists;


public class removeNthNodeFromLast {
	public LinkedListNode removeNthFromEnd(LinkedListNode head, int n) {
        if(head == null)
        return null;
 
        LinkedListNode fast = head;
        LinkedListNode slow = head;
 
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
 
        //if remove the first node
        if(fast == null){
            head = head.next;
            return head;
        }
 
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
 
        slow.next = slow.next.next;
 
        return head;
        
    }

}
