import java.util.Arrays;


public class BiDirectionalBubbleSort {
	
	public static void main(String args[]){
		int[] array = {10,9,8,7,6,5,4,3,2,1};
		
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(array));
		
		sort(array);
		
		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(array));
	}
	public static void sort(int a[]) {
		int j;
		int limit = a.length;
		int st = 0;
		while (st < limit) {
		    //Moves the data up
		    for (j = st; j < a.length -1  ; j++) {
			if (a[j] > a[j + 1]) {
				swap(a,j,j+1);
			    //flipped = true;
			}
		    }
		    
		    //Moves the data down 
		    for (j = a.length - 1; --j >= st;) {
		    	if (a[j] > a[j + 1]) {
		    		swap(a,j,j+1);
		    		//flipped = true;
		    	}
		    }
		    st++;
		}
	}
	
	public static void swap(int[] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
