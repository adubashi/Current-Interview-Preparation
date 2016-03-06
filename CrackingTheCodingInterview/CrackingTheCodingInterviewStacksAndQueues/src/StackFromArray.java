
public class StackFromArray {
	private int stackSize = 100;
	int[] buffer = new int[stackSize * 3];
	int[] stackPointer = {-1, -1, -1};
	
	public void push(int stackNum, int value) throws Exception {
		if(stackPointer[stackNum] + 1 >= stackSize ){
			System.out.println("Full Stack");
			return;
		}
		stackPointer[stackNum]++;
		buffer[absTopOfStack(stackNum)] = value;
	}
	
	public int pop(int stackNum){
		if(isEmpty(stackNum)){
			System.out.println("Empty Stack");
			return 0;
		} else {
			int value = buffer[absTopOfStack(stackNum)];
			buffer[absTopOfStack(stackNum)] = 0;
			stackPointer[stackNum]--;
			return value;	
		}
	}
	
	public int peek(int stackNum){
		if(isEmpty(stackNum)){
			System.out.println("Empty Stack");
			return 0;
		} else {
			int value = buffer[absTopOfStack(stackNum)];
			return value;	
		}
		
	}
	
	public boolean isEmpty(int stackNum){
		return stackPointer[stackNum] == -1;
	}
	
	public int absTopOfStack(int stackNum){
		return stackNum * stackSize + stackPointer[stackNum];
	}
}
