package epicInterviewPreparation;

import java.util.ArrayList;
import java.util.HashSet;

public class colorfulNumber {
	
	public static void main(String Args[]){
		System.out.println(colorfulNumber(263));
		
	}
	
	
	
	
	public static boolean colorfulNumber(int n){
		//Use a list and a hashset
		 
				ArrayList<Integer> number = new ArrayList<Integer>();	
				
				int index = 0;
				//Get digits
				while(n != 0){
					int r = n % 10;
					n = n / 10;
					int length = number.size();
					
					for(int i = index; i < length; i++){
						number.add(r * number.get(i));
						System.out.println(number.toString());
					}
					number.add(r);
					index = length;
				}
				
				HashSet<Integer> setOfCombinations = new HashSet<Integer>();
				
				System.out.println(number.toString());
				for(int i = 0; i < number.size(); i++){
					if(setOfCombinations.contains(number.get(i))){
						return false;
					} else {
						setOfCombinations.add(number.get(i));
					}
				}	
				return true;
	}

}
