import java.util.*;
public class MinStack {
	private Stack<Integer> elementStack;
	private Stack<Integer> minStack;
	
	
	public MinStack(){
		elementStack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}
	
	
	
	public Integer getMin(){
		if(minStack.isEmpty()){
			return Integer.MAX_VALUE;
		} else {
			return minStack.peek();
		}
	}
	
	public void push(Integer elem){
		elementStack.push(elem);
		if(elem < getMin()){
			minStack.push(elem);
		}
	}
	public void pop(){
		if(elementStack.peek() == getMin()){
			minStack.pop();
		} 
		elementStack.pop();
	}
	
	public Integer peek(){
		if(elementStack.isEmpty()){
			//Should throw an exception
			return Integer.MAX_VALUE;
		} else {
			return elementStack.peek();
		}
	}
	
	public boolean isEmpty(){
		return elementStack.isEmpty();
	}
	

}
