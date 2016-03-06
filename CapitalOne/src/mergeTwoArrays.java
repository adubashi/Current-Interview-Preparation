import java.util.Arrays;


public class mergeTwoArrays {

	public static void main(String[] args) {
		int[] a = {1,2,4};
		int[] b = new int[7];
		b[0] = 3;
		b[1] = 5;
		b[2] = 6;
		b[3] = 7;
		
		merge(a,b,3,4);
		
		System.out.println(Arrays.toString(b));
		

	}
	
	
	public static void merge(int[] a, int[] b, int n, int m) {
		int k = m + n - 1; // Index of last location of array b
		int i = n - 1; // Index of last element in array b
		int j = m - 1; // Index of last element in array a
		
		// Start comparing from the last element and merge a and b
		 while (i >= 0 && j >= 0) {
			if (a[i] > b[j]) {
				a[k--] = a[i--];
			} else {
				a[k--] = b[j--];
			}
		 }
		 while (j >= 0) {
			 a[k--] = b[j--];
		 }
	}

}
