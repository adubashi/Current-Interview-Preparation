

package epicInterviewPreparation;

import java.util.ArrayList;
import java.util.Vector;

public class employeePhoneNumber {
	
	public static final int LENGTH = 3;
	/*
	 * Conditions:
	 * 1. No two digits are consecutive
	2. If there is a 4 in the number, the first number should also be 4
	3. There are 3 excluded numbers but the company has not decided which ones they are going to be 
	 */
	
	/*
	 * 
	 * 
	 */
	
	
	public static void main(String args[]) {
		
		ArrayList<Integer> exclusion = new ArrayList<>();
		//exclusion.add(3);
		//exclusion.add(6);
		//exclusion.add(9);
        permute("", exclusion, 4);
    }
	
	/*
	 * Base case: if the level is equal to the LENGTH, then print out temp(the string that is being built)
	 * 
	 * Else: loop through the digits: 0 - 9
	 * 
	 * If a digit is in the exclusion list then continue the loop
	 * Check if temp has an end value of the digit(to check for consecutive digits)
	 *  	if not and  if the digit is not equal to 4  --> permute
	 *  	if not and the digit is equal to 4 --> check if the new temp+i starts with 4 --> permute 
	 * 
	 * 
	 */

	public static void permute(String temp, ArrayList<Integer> exclusionList, int level) {
    	if(level == 0) {
    		System.out.println(temp);
    	} else {
    		for(int i = 0; i < 10; i++) {
    			if(exclusionList != null && exclusionList.contains(i)) {
    				continue;
    			}

    			//Check for consecutives
    			if(!temp.endsWith(String.valueOf(i))) {
    				if(i != 4) {
    					permute(temp + i, exclusionList, level - 1);
    				} else {
    					//Check for if it starts with 4(takes into account initial(temp+i)
    					if((temp + i).startsWith(String.valueOf(i))) {
    						permute(temp + i, exclusionList, level - 1);                                
    					}
    				}
    			}
    		}
    	}
    }
	
	

}