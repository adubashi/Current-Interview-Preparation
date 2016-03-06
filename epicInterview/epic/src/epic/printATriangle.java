package epic;

import java.util.Arrays;

public class printATriangle {
	
	public static void main(String Args[]){
		
		int[] a = {1,2,3};
		
		
		int[] b = combineArray(a);
		
		//System.out.println(Arrays.toString(b));
		
		printArrays(a);
		
		
		
	}
	
	
	public static int[] combineArray(int[] a){
		
		int[] array = new int[a.length - 1];
		
		for(int i = 1; i < a.length; i++){
			array[i-1] = a[i-1] + a[i];
		}
		
		return array;
	}
	
	public static void printArrays(int[] a){
		
		System.out.println(Arrays.toString(a));
		for(int i = 0; i < a.length; i++){
			System.out.println(Arrays.toString(combineArray(a)));
			a = combineArray(a);
			
		}
	}

}
