import java.util.*;
public class ModeStack<T>  {
	 private final Deque<T> stack = new ArrayDeque<>(), modeStack = new ArrayDeque<>();
	 private final Map<T, Integer> count = new HashMap<>();
	 public ModeStack() {}
	 
	 public void push(T t){
		 //Push value
		 stack.push(t);
		 
		 int freq = 0;
		 //Put key into map
		 if(count.containsKey(t)){
			 freq = count.get(t);
			 count.put(t, freq+1);
			 freq++;
		 } else {
			 count.put(t, freq);
		 }
		 
		 //Put value into mode stack
		 if(modeStack.isEmpty()){
			 modeStack.push(t);
		 } else {
			 modeStack.push(freq > count.get(modeStack.peek()) ? t : modeStack.peek());
		 }	 
	 }
	 
	 public T pop(){
		 int newCount = count.get(stack.peek())-1;
		 if(newCount == 0){
			 count.remove(stack.peek());
		 } else {
			 count.put(stack.peek(), newCount);
		 }
		 modeStack.pop();
		 return stack.pop();
	 }
	 
	 public T mode() {
	        return modeStack.peek();
	   }
	
	
	
	
}
