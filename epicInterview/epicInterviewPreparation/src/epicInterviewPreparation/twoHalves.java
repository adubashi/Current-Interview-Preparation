package epicInterviewPreparation;

public class twoHalves {
	
	
	
	public static void main(String Args[]){
		int i = 19967;
		int j = 1000;
		
		maxHalves(i,j);
		
		splits("19967","1000");
		
		
	}
	
	
	
	public static void maxHalves(int i, int j) {
		int firstValue, secondValue;

		int iLength = String.valueOf(i).length();
		int jLength = String.valueOf(j).length();

		if (iLength - jLength == 1) {
			firstValue = i / j;
			secondValue = i - firstValue * j;
			System.out.println("First Value:- " + firstValue
					+ " second Value:- " + secondValue);
		} else {
			System.out.println("Invalid Input");
		}

	}
	
	public static void printHalves(int number, int number2){
		
		int n1 = 0;
		int n2 = 0;
		int minDifference = Integer.MAX_VALUE;
		
		int halve1 = 0;
		int halve2 = 0;
		
		
		String numberString = String.valueOf(number);
		for(int i = 1; i < numberString.length(); i++){
			for(int j = i; j < numberString.length(); j++){
				System.out.println(numberString.substring(i, j));
				System.out.println(numberString.substring(j+1, numberString.length()));
				
				n1 = Integer.parseInt(numberString.substring(i, j));
				n2 = Integer.parseInt(numberString.substring(j+1, numberString.length()));
				
				int currentDif = number2 - n1 - n2;
				if(currentDif < minDifference){
					minDifference = currentDif;
					halve1 = n1;
					halve2 = n2;
				}
				
			}
		}
		System.out.println("First Value:- " + halve1
				+ " second Value:- " + halve2 + "Min: " + minDifference);
		
	}
	
	public static void splits(String number1, String number2) {
        int num = Integer.parseInt(number2);
        String half1, half2;
        for (int index = 1; index < number1.length(); index++) {
            half1 = number1.substring(0, index);
            half2 = number1.substring(index);
            if ((Integer.parseInt(half1) + Integer.parseInt(half2)) <= num) {
                // could be easily changed here to track the halves that sum 
		// closest to 2nd Number
                System.out.println(half1 + "--" + half2);
            }
        }

    }

}
