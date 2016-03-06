package epic;

public class seedSum {
	
	public static void main(String Args[]){
		seedSum(123);
		
	}

	public static void seedSum(int n){
		for(int i = 0; i < n; i++){
			if((i + getDigitSum(i) == n)){
			   System.out.println(i);
			}
			
		}
	}
	
	public static int getDigitSum(int n){
		int sum = 0;
		while( n > 0){
			int digit = n % 10;
			n = n / 10;
			sum = sum + digit;	
		}
		
		return sum;
	}
}
