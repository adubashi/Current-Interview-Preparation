import java.util.*;
public class countPrimesLessThanN {
	
	public static void main(String args[]){
		System.out.println("Prime Count" + countPrimes(4));
		
		//countPrimes(50);
	}
	
    public static int countPrimes(int n) {
        int primesCount = 0;
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        
       for (int p=2; p*p<=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true)
            {
                // Update all multiples of p
                for (int i=p*2; i<n; i += p){
                    prime[i] = false;
                }
            }
        }
 
        // Print all prime numbers
        for (int p=2; p<n; p++){
            if (prime[p]){
                primesCount++;
                System.out.print(p + " ");
            }
        }
        
        return primesCount;
    }

}
