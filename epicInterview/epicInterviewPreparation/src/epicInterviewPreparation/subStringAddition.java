package epicInterviewPreparation;

public class subStringAddition {
	
	public static void main(String Args[]){
		
		int[] array = {1,2,3,4,2};
		int sum = 6;
		
		checkIfInSubstring(array,3);
		
	}
	
	public static void checkIfInSubstring(int[] arr, int sum){
		
		String result = "";
		int total = 0;
		
		for(int i = 0; i < arr.length; i++){
			total = 0;
			for(int j = i; j < arr.length; j++){
				
				total += arr[j];
				if(sum == total){
					result += i + " to " + j + " | ";
				}
			}
		}
		
		System.out.println(result);
	}

}
