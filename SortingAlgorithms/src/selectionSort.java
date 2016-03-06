import java.util.Arrays;
public class selectionSort {
	/*
	 * Worst Case: O(N^2)
	 * Average Case: O(N^2)
	 * Best Case: O(N^2)
	 */
	
	public static void main(String args[]){
		
		int[] array = {3,7,1,20,-2,4,65};
		System.out.println("Before Sorting: ");
		System.out.println(Arrays.toString(array));
		selectionSort(array);
		System.out.println("After Sorting: ");
		System.out.println(Arrays.toString(array));
		
		
	}

	public static void swap(int i, int j, int[] array){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
	public static void selectionSort(int[] array){
		int minPos = 0;
		for(int i = 0; i < array.length-1; i++){
			minPos = i;
			for(int j = i +1; j < array.length; j++){
				if(array[j] < array[minPos]){
					minPos = j;
				}
			}
			swap(i,minPos,array);
		}
		
	}
}
