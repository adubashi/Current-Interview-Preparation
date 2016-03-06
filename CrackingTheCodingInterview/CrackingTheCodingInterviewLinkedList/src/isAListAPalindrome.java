import java.util.*;
public class isAListAPalindrome {
	
	public static void main(String args[]){
		
	}
	
	public static boolean isPalindrome(LinkedListNode head){
		
		LinkedListNode fast = head;
		LinkedListNode slow = head;
		
		Stack<Integer> stk = new Stack<Integer>();
		
		//Find middle point 
		while(fast != null && fast.next != null){
			stk.push(slow.data);
			fast = fast.next.next;
			slow = slow.next;
		}
		//If odd(skip middle element)
		if(fast != null){
			slow = slow.next;
		}
		
		while(slow != null){
			int value = stk.pop();
			
			if(slow.data != value){
				return false;
			}
			slow = slow.next;
		}
		
		return true;
	}

}
