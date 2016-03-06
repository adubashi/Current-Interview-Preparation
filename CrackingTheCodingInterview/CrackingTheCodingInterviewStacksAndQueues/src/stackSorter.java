import java.util.*;
public class stackSorter {
	
	public static void main(String args[]){
		
	}
	
	//Time: O(n^2) , Space: O(N)
	public static Stack<Integer> sort(Stack<Integer> s){
		Stack<Integer> temporaryStk = new Stack<Integer>();
		while(!s.isEmpty()){
			int tmp  = s.pop();
			while(!temporaryStk.isEmpty() && temporaryStk.peek() > tmp){
				s.push(temporaryStk.pop());
			}
			temporaryStk.push(tmp);
		}
		return temporaryStk;
	}

}
