package epic;

public class goldbachsConjecture {
	
	public static void main(String Args[]){
		
		getGoldbach(10);
		
	}
	
	public static boolean isPrime(int number){

        for(int i=2;i<number;i++){
                if(number%i == 0)
                        return false;
        }

        return true;
	}
	
	public static void getGoldbach(int n){
		if( !(n % 2 == 0 && n > 2)){
			System.out.println("Not a goldbach");
		}
		
		System.out.println("goldbach");
		for(int i = 1; i < n/2; i++){
			if(isPrime(i) && isPrime(n-i)){
				System.out.println(i + " Golbach pairs " + (n-i));
				break;
			}
		}
	}

}
