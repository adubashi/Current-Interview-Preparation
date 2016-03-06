package epicInterviewPreparation;

import java.util.*;

public class printSentencesVertically {
	public static void main(String[] args) {
		String[][] string={{"a","b","c"},{"d","e"}};
		printVertical(string);
		}
	public static void printVertical(String[][] input){
		//Find new dimensions
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < input.length; i++){
			int arrLength = input[i].length;
			if(arrLength > max){
				max = arrLength;
			}
		}
		
		String[][] newArray = new String[max][input.length];
		
		System.out.println(Arrays.deepToString(input));
		System.out.println(Arrays.deepToString(newArray));
		
		for (int i = 0; i < input.length; i++) {
            String[] temp = input[i];
            for (int string = 0; string < max; string++){
            	if(string < temp.length){
            		newArray[string][i] = temp[string];
            	} else {
            		newArray[string][i] = "";
            	}
            } 
        }
		System.out.println(Arrays.deepToString(newArray));
	}

}
