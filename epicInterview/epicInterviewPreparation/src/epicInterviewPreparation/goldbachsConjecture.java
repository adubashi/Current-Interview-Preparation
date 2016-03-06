package epicInterviewPreparation;

import java.util.*;

public class goldbachsConjecture {
	
	
	
	
	public static void main(String args[]){
		isPrime(50);
		System.out.println("Printing primes of 50");
		
		goldbachConjecture(10);
	}
	
	
	// i <= N*N
	//j*i <= N
	public static boolean[] isPrime(int n){

		boolean[] primes = new boolean[n+1];
		
		Arrays.fill(primes, true);
		
		for(int i = 2; i <= n*n; i++){
			for(int j = i; i*j <= n; j++){
				primes[i*j] = false;
			}
		}
		
		for(int i = 2 ; i < n; i++){
			if(primes[i]){
				System.out.println(i);
			}
		}
	     
		return primes;
	}
	
	//i <= N/2
	public static void goldbachConjecture(int n){
		boolean[] primes = isPrime(n);
		
		if(n > 2 && n % 2 == 0){
			for(int i = 3; i <= n/2; i++ ){
				if(primes[i] && primes[n-i]){
					System.out.println(i + "----" + (n-i) + "");
				}
			}
		}
	}

}
