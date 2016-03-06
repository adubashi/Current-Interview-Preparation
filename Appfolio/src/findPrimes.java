import java.util.*;
public class findPrimes {
	
	public static void main(String args[]){
		findPrimeNumbersInRange(50);
		
		System.out.println(checkIfPrime(1));
		System.out.println(checkIfPrime(2));
		System.out.println(checkIfPrime(3));
		System.out.println(checkIfPrime(4));
	}
	
	public static boolean checkIfPrime(int n){
		if(n <= 1){
		   return false;
		}
		
		int k = 2;
		while(k <= n/2){
			if(n % k == 0){
				return false;
			}
			k++;	
		}
		return true;
	}
	
	
	
	
	public static boolean[] findPrimeNumbersInRange(int n){
		boolean[] primes = new boolean[n+1];
		
		Arrays.fill(primes, true);
		
		for(int i = 2; i*i <= n; i++){
			for(int j = i; j*i <= n; j++){
				primes[j*i] = false;
			}
		}
		
		
		for(int i = 2; i < primes.length; i++){
			if(primes[i]){
				System.out.print(i + " ");
			}
		}	
		return primes;
	}

}
