import java.util.*;
public class StackWithMin extends Stack<Integer> {
	private Stack<Integer> s2;
	
	public StackWithMin(){
		this.s2 = new Stack<Integer>();
	}

	public void push(int value){
		
		if(value < getMin()){
			s2.push(value);
		} 
		super.push(value);
		
	}
	
	public Integer pop(){
		int value = super.pop();
		if(value == getMin()){
			s2.pop();
		}
		return value;
		
	}
	
	public int getMin(){
		if(s2.isEmpty()){
			return Integer.MAX_VALUE;
		} else {
			return s2.peek();
		}
	}
}