package epicInterviewPreparation;

import java.util.*;

public class evaluateAlgebraicExpressions {
	
	public static void main(String Args[]){
		
		evaluate("8*2");
		
	}
	
	public static void evaluate(String alg){
		Stack<Character> opStack = new Stack<Character>();
		Stack<Integer> numberStack = new Stack<Integer>();
		
		for(int i = alg.length() -1 ; i >= 0; i--){
			char ch = alg.charAt(i);
			if(Character.isDigit(ch)){
				int j = Character.getNumericValue(ch);
				numberStack.push(j);
			} else if(ch == '+'){
				opStack.push(ch);
			} else if(ch == '*'){
				opStack.push('*');
			} else if(ch == '-'){
				opStack.push('-');
			}
		}
		System.out.println(opStack.peek());
		/*
		 * With whatever operator is on top of the operator stack, 
		 * pop the top number, use the operator on the popped number
		 *  and the currently top of the number stack number, 
		 * then place this resulting number on top of the number stack.
		 *  Pop the operator from the operator stack. 
		 */
		
		while(numberStack.size() != 1){
			int operand = numberStack.pop();
			char ch = opStack.peek();
			if(ch == '+'){
				int k = operand + numberStack.pop();
				numberStack.push(k);
			} else if(ch == '*'){
				int k = operand * numberStack.pop();
				numberStack.push(k);
			} else if(ch == '-'){
				int k = operand - numberStack.pop();
				numberStack.push(k);
			}	
			opStack.pop();
		}
		
		System.out.println(numberStack.peek());
	}

}
