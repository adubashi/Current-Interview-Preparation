
public class findUnsortedSequenceToBeSorted {
	
	public static int findEndOfLeftSubsequence(int[] array){
		for(int i = 1; i < array.length; i++){
			if(array[i] < array[i - 1]){
				return i - 1;
			}
		}
		return array.length  - 1;
	}

	public static int findEndOfRightSubsequence(int[] array){
		for(int i = array.length - 2; i >= 0; i--){
			if(array[i] > array[i + 1]){
			   return i + 1;
				
			}
		}
		return 0;
	}
	
	public static int shrinkLeft(int[] array,int minIndex, int start){
		int comp = array[minIndex];
		for(int i = start - 1; i >= 0; i--){
			if(array[i] <= comp){
				return i + 1;
			}
		}
		return 0;
	}
	
	public static int shrinkRight(int[] array, int maxIndex, int start){
		int comp = array[maxIndex];
		for(int i = start; i < array.length; i++){
			if(array[i] >= comp){
				return i - 1;
			}
		}
		return array.length - 1;
	}
	
	//O(n) time 
	public static void findUnsortedSequence(int[] array){
		//find left subsequence
		int endLeft = findEndOfLeftSubsequence(array);
		if (endLeft >= array.length - 1){
			return;
		}
		//find right subsequence
		int startRight = findEndOfRightSubsequence(array);
		
		
		//get min and max
		int maxIndex = endLeft;
		int minIndex = startRight;
		for(int i = endLeft + 1; i < startRight; i++){
			if(array[i] < array[minIndex]){
				minIndex = i;
			}
			if(array[i] > array[maxIndex]){
				maxIndex = i;
			}
		}
		
		//slide left until less than array[minIndex]
		int leftIndex = shrinkLeft(array,minIndex,endLeft);
		int rightIndex = shrinkRight(array,maxIndex,startRight);
		
		System.out.println(leftIndex + " " + rightIndex);
	}
}
