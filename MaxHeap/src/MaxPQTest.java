
public class MaxPQTest {
	
	public static void main(String args[]){
		int[] array = {0,1,2,3,4,5,9,10};
		
		
		MaxPQ<Integer> maxHeap = new MaxPQ<Integer>();
		
		for(Integer i: array){
			maxHeap.insert(i);
		}
		
		System.out.println(maxHeap.max());
		maxHeap.delMax();
		System.out.println(maxHeap.max());
		maxHeap.delMax();
		System.out.println(maxHeap.max());
		maxHeap.delMax();
		
	}

}
