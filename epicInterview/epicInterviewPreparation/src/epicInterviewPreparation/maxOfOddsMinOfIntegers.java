package epicInterviewPreparation;

import java.util.*;
public class maxOfOddsMinOfIntegers {
	
	
	public static void main(String Args[]){
		getSeries();
	}
	
	
	public static void getSeries(){
		Scanner in = new Scanner(System.in);
		
		int oddMin = Integer.MAX_VALUE;
		
		int evenMax = Integer.MIN_VALUE;
		
		while(in.hasNext()){
			int token = in.nextInt();
			if(token  == 0){
				break;
			}
			
			System.out.println(token);
			
			
			if(token % 2 == 0){
				if(token > evenMax){
					evenMax = token;
				}
			}
			
			if(token % 2 == 1){
				if(token < oddMin){
					oddMin = token;
				}
			}
				
		}
		
		System.out.println("Even max" + evenMax);
		System.out.println("Odd min" + oddMin);
		
		
	}

}
