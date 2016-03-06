package epicInterviewPreparation;

public class fibonacciSequence {
	
	public static void main(String Args[]){
		//printFib(5);
		
		//System.out.println(fib(5));
		String test = "test";
		String r = "";
		
		for(int i = 1; i <= 15; i++){
			System.out.println(fibLoop(i));
		}
		
		for(int i = test.length() -1; i >=0; i--){
			r = test.charAt(i) + r;
			
		}
		System.out.println(r);
	}
	
	
	public static void printFib(int n){
		if(n > 1){
			System.out.println(1);
		} else if(n > 2){
			System.out.println(1);
		}
		
		int b = 1;
		int a = 1;
		int fib = 0;
		for(int i = 3; i< n; i++){
			fib = a + b;
			System.out.println(fib);
			a = b;
			b= fib;
		}
	}
	
	
	
	
	
	public static int fibLoop(int n){
		if(n == 1 || n == 2){
			return 1;
		} else {
			int a = 1;
			int b = 1;
			int fib = 0;
			for(int i = 3; i <= n; i++){
				fib = a + b;
				a = b;
				b = fib;
			}
			
			return fib;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public static int fib(int n){
		if(n == 1 || n == 2){
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
		
	}

}
