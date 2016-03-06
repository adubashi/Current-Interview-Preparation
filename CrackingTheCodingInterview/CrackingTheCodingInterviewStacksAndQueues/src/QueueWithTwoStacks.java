import java.util.*;
public class QueueWithTwoStacks {
	Stack<Integer> stackNewest;
	Stack<Integer> stackOldest;
	
	public QueueWithTwoStacks() {
		this.stackNewest = new Stack<Integer>();
		this.stackOldest = new Stack<Integer>();
	}
	
	public int size() {
		return stackNewest.size() + stackOldest.size();
	}
	
	public void add(int value){
		stackNewest.push(value);
	}
	public void shiftStacks(){
		if(stackOldest.isEmpty()){
			while(!stackNewest.isEmpty()){
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	
	public int peek(){
		shiftStacks();
		return stackOldest.peek();
	}
	
	public int remove(){
		shiftStacks();
		return stackOldest.pop();
	}
	

}
