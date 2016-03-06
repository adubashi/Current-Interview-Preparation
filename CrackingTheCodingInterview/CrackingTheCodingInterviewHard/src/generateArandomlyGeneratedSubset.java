import java.util.*;
class generateArandomlyGeneratedSubset {
	
	public static void main(String args[]){
		int[] original = {1,2,3,4,5,6,7,8,9,10};
		int m = 3;
		
		int[] result = pickMIter(original,m);
		
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] pickMIter(int[] original, int m){
		Random rand = new Random();
		int[] subset = new int[m];
		for(int i = 0; i < m; i++){
			subset[i] = original[i];
		}
		for(int i = m; i < original.length; i++){
			int k = rand.nextInt(i);
			if( k < m){
				subset[k] = original[i];
			}
		}
		
		return subset;
		
	}

}
