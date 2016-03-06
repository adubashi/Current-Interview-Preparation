package epicInterviewPreparation;

public class seedNumber {
	
	
	public static void main(String Args[]){
		findSeed(111);
	}
	
	public static void findSeed(int n){
		
		//All ones 
		if(digitProduct(n) == n){
			System.out.println("Seed " + n);
			
		}
		
		int i = n/2;
		
		while(i> 0){
			if(n % i == 0){
				if(digitProduct(i) == n){
					System.out.println("Seed " + i);
				}
			}
			
			
			
			
			i--;
		}
		
	}
	
	
	public static int digitProduct(int n){
		int product = n;
		while(n != 0){
			int digit = n % 10;
			product = product * digit;
			//System.out.println(product);
	
			n = n /10;
		}
		
		return product;
		
	}

}
