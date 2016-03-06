import java.util.*;
public class mergeSort {
	//Time complexity: Worst: O(nlogn) 
    //				   Average: O(nlogn) 
	//				   Best: O(nlogn)
	//Space complexity: O(n)
	//Stability? Stable. It does preserve the order of keys 
	public  static void main(String args[]){
		int[] array = {10,9,8,7,6,5,4,3,2,1};
		int[] tmpArray = new int[array.length];
		System.out.println("Before Sort:");
		System.out.println(Arrays.toString(array));
		System.out.println("After Sort:");
		mergeSort(array,0,array.length-1,tmpArray);
		System.out.println(Arrays.toString(array));	
	}
	
	public static void mergeSort(int[] array, int lowIndex, int highIndex, int[] tmpArray){
		if(lowIndex < highIndex){
			int midPoint = lowIndex + (highIndex - lowIndex)/2;
			mergeSort(array,lowIndex,midPoint,tmpArray);
			mergeSort(array,midPoint+1,highIndex,tmpArray);
			merge(lowIndex,midPoint,highIndex,tmpArray,array);
		}
	}
	
	public static void merge(int lowIndex,int middle, int highIndex, int[] tmpArray, int[] array){
		//Copy everything over to the merge array
		for (int i = lowIndex; i <= highIndex; i++) {
            tmpArray[i] = array[i];
        }
		
		int i = lowIndex;
		int j = middle+1;
		int k = lowIndex;
		
		//Merge the arrays
		while(i <= middle && j <= highIndex){
			if(tmpArray[i] <= tmpArray[j]){
				array[k]  = tmpArray[i];
				i++;
			} else {
				array[k] = tmpArray[j];
				j++;
			}
			k++;
		}
		while(i <= middle){
			array[k] = tmpArray[i];
			k++;
			i++;
		}

	}

}
