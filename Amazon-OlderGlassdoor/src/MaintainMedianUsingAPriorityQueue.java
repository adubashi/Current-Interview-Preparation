import java.util.*;
public class MaintainMedianUsingAPriorityQueue {
	/*
	 * Use two priority heaps: a max heap for the values below the median, and a min heap for the values above
	 * the median. This will divide the elements roughly in half, with the middle two elements as the top of the two heaps.
	 */
	
	/*
	 * If max.size() > minHeap.size(), then maxHeap.top() will be the median
	 * If maxHeap.size() == minHeap.size(), then the average of maxHeap.top() and minHeap.top() will be the median
	 * 
	 * When a new value arrives, it is placed in the maxHeap if the value is less than  or equal to the median
	 * otherwise, it is placed into a min heap.
	 * 
	 * Heap sizes can be equal or the maxHeap can have one greater element 
	 * The constraint can easily be restored by shifting an element from one heap to the other.
	 *  The median is available in constant time, by looking at the top elements
	 *  
	 *  Updates take O(logn) time
	 * 
	 * 
	 */
	
	private Comparator<Integer> maxHeapComparator;
	private Comparator<Integer> minHeapComparator;
	private PriorityQueue<Integer> maxHeap, minHeap;
	
	
	public void addNewNumber(int randomNumber){
		//Maintains maxHeap.size() >= minHeap.size()
		if(maxHeap.size() == minHeap.size()){
			if((minHeap.peek() != null )&&(randomNumber> minHeap.peek())){
				maxHeap.offer(minHeap.poll());
				minHeap.offer(randomNumber); 
			} else {
				maxHeap.offer(randomNumber);
			}
		} else {
			if(randomNumber < maxHeap.peek()){
				minHeap.offer(maxHeap.poll());
				maxHeap.offer(randomNumber);
			} else {
				minHeap.offer(randomNumber);
			}
		}
	}
	
	public  double getMedian(){
		if(maxHeap.isEmpty()){
			return 0;
		}
		if(maxHeap.size() == minHeap.size()){
			return((double)minHeap.peek() + (double)maxHeap.peek())/2;
		} else {
			//If maxHeap and minHeap are of different sizes, then maxHeap must have one extra element. Return 
			//maxHeap's top element
			return maxHeap.peek();
		}
	}

}
