
public class findAmagicIndex {
	
	//Magic Index - Fast - works with distinct elements - O(logn)
	public static int magicFast(int[] array, int start, int end){
		if(end < start ||  start < 0 || end >= array.length){
			return -1;
		}
		int mid = (start + end)/2;
		if(array[mid] == mid){
			return mid;
		} else if(array[mid] > mid){
			return magicFast(array,start,mid-1);
		} else {
			return magicFast(array,mid+1,end);
		}
	}
	
	//Magic index - fast - works with non-distinct elements - O(n)
	public static int magicFast2(int[] array,int start,int end){
		if(end < start || start < 0 || end >= array.length){
			return -1;
		}
		int midIndex = (start + end)/2;
		int midValue = array[midIndex];
		if(midValue == midIndex){
			return midIndex;
		}
		
		//Search left
		int leftIndex = Math.min(midIndex -1, midValue);
		int left = magicFast2(array,start,leftIndex);
		if(left >= 0){
			return left;
		}
		
		//Search right
		int rightIndex = Math.max(midIndex+1, midValue);
		int right = magicFast(array,rightIndex,end);
		
		if(right < array.length){
			return right;
		}
		return -1;
	}
	

}
