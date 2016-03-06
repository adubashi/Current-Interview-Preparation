package epicInterviewPreparation;

public class steppingNumbers {
	
	public static void main(String Args[]){
		long s = 1;
		long e = 1000;
		int sLength = (int)(Math.log10(s) + 1);
		int eLength = (int)(Math.log10(e) + 1);
		
		
		System.out.println(sLength);
		System.out.println(eLength);
		
		
		for(long i = sLength; i <= eLength; ++i){
			for(long j = 1; j < 10; ++j){
				dfs(s,e,i,j);
			}
		}
		
	}
	
	public static void dfs(long s, long e, long length, long num){
		if(length-1 == 0){
			if(s <= num && num <= e){
				System.out.println(num);
				//return;
			}
			return;
		}
		
		long lastDigit = num % 10;	
		if(lastDigit == 0){
			dfs(s,e, length-1,num*10 + 1);
		} else if(lastDigit == 9){
			dfs(s,e,length-1,num*10+8);
		} else {
			dfs(s,e,length-1,num*10+lastDigit-1);
			dfs(s,e,length-1,num*10+lastDigit+1);
		}
		
	}

}
