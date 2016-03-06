package LinkedLists;



public class removeDuplicatesFromASortedList {
	public static LinkedListNode deleteDuplicates(LinkedListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
 
        LinkedListNode p = head;
 
        while( p != null && p.next != null){
            if(p.data == p.next.data){
                p.next = p.next.next;
            }else{
                p = p.next; 
            }
        }
 
        return head;
        
    }

}
