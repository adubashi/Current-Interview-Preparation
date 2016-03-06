package epicInterviewPreparation;

public class largestContinuousSubArrayAtleastTwo {
	
	
	public static void main(String Args[]){
		int[] array = {2,3,4,2,-11,4,6};
		
		System.out.println(getMaxSum(array));
		
	}
	
	
	
	
	
	
	public static int getMaxSum(int[] arr){
		
		int start=0;
		int end=0;
		int tempStart=0;
		int maxSum =0;
		int maxSumEnding =0;
		for(int i=0;i<arr.length;i++)
		{
			if((maxSumEnding<0 && arr[i]<0))
			{
				maxSumEnding =0;
				tempStart = i;
			}
			maxSumEnding += arr[i];
			if(maxSumEnding < arr[i])
			{
				maxSumEnding = arr[i];
				tempStart = i;
			}
			if(maxSumEnding > maxSum && i-tempStart >1)
			{
				maxSum = maxSumEnding;
				end = i;
				start = tempStart;
			}
		}
		System.out.println(start);
		System.out.println(end);
		return maxSum;
	}

}
