import java.util.Arrays;


public class mergeTwoSortedArrays {
	
	public static void main(String args[]){
		int[] array = {0,1,3,5,7};
		int[] array1 = new int[10];
		
		array1[0] = -2;
		array1[1] = 4;
		array1[2] = 8;
		array1[3] = 11;
		array1[4] = 12;
		
		merge(array1,array,5,5);
		
		System.out.println(Arrays.toString(array1));
		
	}
	
	public static void merge(int[] a, int[] b, int lastA, int lastB){
		int indexA = lastA - 1;
		int indexB = lastB - 1;
		int indexMerged = lastB + lastA - 1;
		
		while(indexB >= 0){
			if(indexA >= 0 && a[indexA] > b[indexB]){
				a[indexMerged] = a[indexA];
				indexA--;
			} else {
				a[indexMerged] = b[indexB];
				indexB--;
			}
			indexMerged--;
		}
	}

}
