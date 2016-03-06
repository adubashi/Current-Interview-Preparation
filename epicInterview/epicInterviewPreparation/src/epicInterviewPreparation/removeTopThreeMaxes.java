package epicInterviewPreparation;

import java.util.*;;

public class removeTopThreeMaxes {
	
	public static void main(String Args[]){
		Scanner input = new Scanner(System.in);
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int sum = 0;
		int count = 0;
		
		
		while(input.hasNextInt()){
			int token = input.nextInt();
			if(token == 0){
				break;
			}
			sum += token;
			count++;
			
			//If greater than the third max
			if(token  > max1 && token < max2){
				max1 = token;
			} 
			//If grater than the third max and less than the top max
			if(token > max1 && token < max3){
				max1 = max2;
				max2 = token;
			}
			//If greater than the third max;
			if(token > max3){
				max1 = max2;
				max2 = max3;
				max3 = token;
			}
		    System.out.println("Max 1:" + max1);
		    System.out.println("Max 2:" + max2);
		    System.out.println("Max 3:" + max3);
			
		}
		
		int average = (sum-(max1) - (max2) - (max3))/(count - 3);
		
		System.out.println("Sum:" + sum);
		System.out.println("Count: " + count);
		System.out.println("Average: "+ average);
	}

}
