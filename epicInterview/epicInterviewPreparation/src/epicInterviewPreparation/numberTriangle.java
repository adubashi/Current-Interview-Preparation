package epicInterviewPreparation;

import java.util.Arrays;

public class numberTriangle {
	
	public static void main(String Args[]){
		int[] a = {4,7,3,6,7};
		printing(a,5);
	}

	public static void printing(int[] a, int len){
		if(len == 1){
			System.out.println(Arrays.toString(a));
			return;
		}
		int[] temp = new int[len-1];
		for(int i = 1; i < len; i++){
			temp[i-1] = a[i-1] + a[i];
		}
		//System.out.println(Arrays.toString(a));
		printing(temp, len-1);
		System.out.println(Arrays.toString(a));
		
		
	}
}
