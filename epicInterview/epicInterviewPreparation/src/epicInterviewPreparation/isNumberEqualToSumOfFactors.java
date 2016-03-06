package epicInterviewPreparation;

public class isNumberEqualToSumOfFactors {
	
	public static void main(String Args[]){
		isEqual(28);
	}
	
	
	
	public static void isEqual(int n){
		int sum = 0;
		for(int i  = 1; i < n; i++){
			if(n % i == 0){
				sum+= i;
			}
		}
		
		if(n == sum){
			System.out.println("Is equal to factors");
		} else {
			System.out.println("Is not equal to factors");
		}
		
	}

}
