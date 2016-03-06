
public class contiguousSequenceWithTheLargestSum {
	public static int getMaxSum(int[] array){
		int maxSum = 0;
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
			if(maxSum < sum){
				maxSum = sum;
			} else if(sum < 0){
				sum = 0;
			}
		}
	
		return maxSum;
	}

}
