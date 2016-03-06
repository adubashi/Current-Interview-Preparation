import java.util.*;
public class validParentheses {
	
	public static void main(String args[]){
		String test = "{}{}{}";
		String test1 = "{()}";
		String test2 = "[{()}]";
		
		System.out.println(isValid(test));
		System.out.println(isValid(test1));
		System.out.println(isValid(test2));
	}
	
	
	
	
	public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '(' || ch == '[' || ch == '{'){
              stk.push(ch);  
            } else if(ch == ')' || ch == ']' || ch == '}'){
                if(ch == ')') {
                    if(stk.isEmpty() || stk.pop() != '('){
                       return false;
                    } 
                } else if( ch == ']'){
                    if(stk.isEmpty() || stk.pop() != '['){
                       return false;
                    } 
                } else if( ch == '}'){
                    if(stk.isEmpty() || stk.pop() != '{'){
                       return false;
                    } 
                }
            }
        }
        
        return stk.isEmpty();
        
        
    }

}
