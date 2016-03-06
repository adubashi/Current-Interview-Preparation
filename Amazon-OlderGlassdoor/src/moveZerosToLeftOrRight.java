import java.util.*;
public class moveZerosToLeftOrRight {
	
	public static void main(String args[]){
		int[] array = {1,0,2,0,3,0,4,5};
		moveZerosToLeft(array);
		System.out.println(Arrays.toString(array));
		
		int[] array2 = {1,0,2,0,3,0,4,5};
		moveZerosToRight(array2);
		System.out.println(Arrays.toString(array2));
		
	}
	
	public static void moveZerosToLeft(int[] arr){
		int source = arr.length - 1;
		int dest = arr.length - 1;
		while(source >= 0){
			if(arr[source] != 0){
				arr[dest] = arr[source];
				dest--;
			}
			source--;
		}
		
		while(dest >= 0){
			arr[dest] = 0;
			dest--;
		}
	}
	
	public static void moveZerosToRight(int[] arr){
		int count = 0;
		for(int i =0; i < arr.length; i++){
			if(arr[i] != 0){
				arr[count] = arr[i];
				count++;
			}
		}
		
		while(count < arr.length){
			arr[count] = 0;
			count++;
		}
		
	}

}
