
public class bucketSort {
	
	
	//Operates in O(n) time 
	public static void bucketSort(int[] array, int maxVal){
		int[] bucket =  new int[maxVal + 1];
		
		//get counts
		for(int i = 0; i < bucket.length; i++){
			bucket[array[i]]++;
		}
		
		
		//O(n) * O(maxval) ~~ O(n) 
		int position = 0;
		for(int i = 0; i < bucket.length; i++){
			for(int j = 0; j < bucket[i]; i++){
				array[position]++;
				position = 0;
			}
		}
	}

}
