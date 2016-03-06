import java.util.*;
public class minStack {
	private Stack<Integer> elementStack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();
	
	
	public void push(int x) {
        if(minStack.empty() || x <= getMin()){
            minStack.push(x);
        } 
        elementStack.push(x);
    }

    public void pop() {
        if(top() <= getMin()){
           minStack.pop();
        } 
        elementStack.pop();
    }

    public int top() {
        return elementStack.peek();
        
    }

    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }  
        return Integer.MAX_VALUE;
        
    }

}
