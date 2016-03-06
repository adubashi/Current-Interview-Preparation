
public class top3maxValuesInArandomArray {
	
	public static void main(String args[]){
		int[] array = {1,100,1000,3,500};
		
		printTop3ValuesInAnArray(array);
	}
	
	public static void printTop3ValuesInAnArray(int[] array){
		int thirdMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int firstMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length; i++){
			int value = array[i];
			
			if(value > thirdMax){
				thirdMax = value;
			}
			if( value > secondMax){
				thirdMax = secondMax;
				secondMax = value;
			}
			if( value > firstMax){
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = value;
			}
		}
		
		System.out.println("First Max" + firstMax);
		System.out.println("Second Max" +  secondMax);
		System.out.println("Third Max" + thirdMax);
		
	}

}
