import java.util.*;
public class kthLargestElementInAnArray {
	
	public static void main(String args[]){
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(kthLargestElement(array,1));
	}
	
	public static int kthLargestElement(int[] array, int k){
		PriorityQueue<Integer> maxheap=new PriorityQueue<Integer>(100,new Comparator<Integer>() {
	        @Override
	        public int compare(Integer o1, Integer o2) {
	            return o2-o1;
	        }
	    });
		
		for(int i = 0; i < array.length; i++){
			maxheap.offer(array[i]);
		}
		
		int result = 0;
		for(int i = 0; i < k; i++){
			result = maxheap.poll();
		}
		
		return result;	
	}

}
