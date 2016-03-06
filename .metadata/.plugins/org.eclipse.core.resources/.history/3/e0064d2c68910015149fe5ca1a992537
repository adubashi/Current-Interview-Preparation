package epicInterviewPreparation;
import java.util.*;

public class balancedString {
	public static void main(String Args[]){
		
		System.out.println(isBalanced("(("));
		System.out.println(isBalanced("((}}"));
		System.out.println(isBalanced(")))))"));
		System.out.println(isBalanced("(({9}))"));
	}
	
	public static boolean isBalanced(String s){
		
		Stack<Character> stk = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			
			if(ch == '(' || ch == '{' || ch == '['){
				stk.push(ch);
			} else if(ch == ')' || ch == '}' || ch == ']'){
				if(ch == ')'){
					if(stk.isEmpty() || stk.pop() != '('){
					   return false;
					}
				}
				if(ch == '}'){
					if(stk.isEmpty() || stk.pop() != '{'){
					   return false;
					}
				}
				if(ch == ']'){
					if(stk.isEmpty() || stk.pop() != '['){
					   return false;
					}
				}
			}
		}
		return stk.isEmpty();
	}

}
