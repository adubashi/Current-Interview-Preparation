package epicInterviewPreparation;

public class checkIfNumberIsEqualToSumOfFactors {
	
	public static void main(String args[]){
		
		int n = 6;
		
		System.out.println(sumOfFactors(n));
		if(sumOfFactors(n) == n){
			System.out.println("Perfect Number");
		}
		
	}
	
	public static int sumOfFactors(int n){
		int sum = 1;
		
		for(int i = 2; i <= Math.pow(n,.5); i++){
			if(n % i == 0){
				int factor1 = i;
				int factor2 = n/i;
				sum += factor1 + factor2;
			}
			
		}
		return sum;
	}

}
