package epicInterviewPreparation;

public class LargestContiguousSum {
	
	
	public static void main(String Args[]){
		int[] array = {2,3,4,2,-11,4,6};
		int t = contigSum(array,7);
		//Answer should be 11
		
		System.out.println(t);
	}
	
	
	
	
	
	
	public static int contigSum(int[] arr, int length){
		if(length == 0){
			return 0;
		} 
		
		int maxSoFar = arr[0];
		int sumSoFar = arr[0];
		
		for(int i = 1; i < arr.length; i++){
			sumSoFar = Math.max(arr[i], arr[i] + sumSoFar);
			maxSoFar = Math.max(maxSoFar, sumSoFar);
		}
		
		
		
		
		
		return maxSoFar;
	}
	

}
