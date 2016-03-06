import java.util.*;
public class rotateArray {
	
	public static void rotateArray(int[] arr, int k){
		k = k % arr.length;
		 
	 
		//length of first part
		int a = arr.length - k; 
	 
		reverse(arr, 0, a-1);
		reverse(arr, a, arr.length-1);
		reverse(arr, 0, arr.length-1);
		
		
		
	}
	
	public static void reverse(int[] arr, int left, int right){
		if(arr == null || arr.length == 1) 
			return;
	 
		while(left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}	
	}
	

}
