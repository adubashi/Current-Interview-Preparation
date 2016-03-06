import java.util.Arrays;


public class quickSort {
	/*
	 * Time: Worst: O(n^2) --> for a perfectly sorted array
	 * 		 Average: O(nlogn)
	 * 		 Best: O(nlogn)
	 * Space: O(logn)  - from the recursive call stack
	 * 
	 * Stability? No, the keys have the potential to get moved into disorder 
	 * 
	 * 
	 * Can avoid common worst case scenarios O(n^2) by shuffling the array prior to sorting or selecting a pivot randomly
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] x = { 9, 2, 4, 7, 3, 5, 10 };
		System.out.println(Arrays.toString(x));
 
		int low = 0;
		int high = x.length - 1;
		System.out.println("Before Sort:");
		System.out.println(Arrays.toString(x));
		System.out.println("After Sort:");
		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
	}
	
	public static void quickSort(int[] arr, int low, int high){
		if(arr.length == 0){
			return;
		}
		
		if(low >= high){
			return;
		}
		
		int middle = low + (high-low)/2;
		int pivot = arr[middle];
		int i = low;
		int j = high;
		while(i <= j){
			while(arr[i] < pivot){
				i++;
			}
			while(arr[j] > pivot){
				j--;
			}
			if(i <= j){
				swap(arr,i,j);
				i++;
				j--;	
			}
		}
		
		
		//Recurse in the subparts
		if(low < j){
			quickSort(arr,low,j);
		}
		if(high > i){
			quickSort(arr,i,high);
		}
		
	}
	
	public static void swap(int[] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
