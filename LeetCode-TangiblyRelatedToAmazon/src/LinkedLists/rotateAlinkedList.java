package LinkedLists;



public class rotateAlinkedList {
    public LinkedListNode rotateRight(LinkedListNode head, int n) {
        if (head==null|| n==0){
            return head;
        }
        
        int len=1;
        LinkedListNode last=head;
        
        // calculate the lenght of given list
        while(last.next!=null){
            last=last.next;
            len++;
        }
        
        last.next=head;
        
        // Should considered the situtation that n larger than given list's length
        int k=len-n%len;
        LinkedListNode preHead=last;
        
        // find the point which are previuse for our target head
        while(k>0){
            preHead=preHead.next;
            k--;
        }
        
        head=preHead.next;
        preHead.next=null;
        
        return head;
        
    }

}
