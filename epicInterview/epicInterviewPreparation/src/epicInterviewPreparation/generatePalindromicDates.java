package epicInterviewPreparation;

import java.util.*;

public class generatePalindromicDates {
	// Generate all palindrome date in the form of MMDDYYYY  --> YYYYMMDD
	// 
	
	public void printPalindrome(int year1, int year2){ 

		int[] month={31,28,31,30,31,30,31,31,30,31,30,31}; 


		String mm=""; 
		String dd=""; 
		String yy=""; 
		int m=0; 
		int d=0; 
		for(int currentYear=year1; currentYear<=year2; currentYear++){ 

		if(currentYear % 400 == 0 ||((currentYear % 4 == 0) && (currentYear % 100 != 0))){
			month[1] = 29;
		}
		
		
		yy = Integer.toString(currentYear);
		mm = Integer.toString(currentYear % 10) + Integer.toString(currentYear/10 % 10);
		dd = Integer.toString(currentYear/100 % 10) + Integer.toString(currentYear/1000 % 10);
		
		m = Integer.parseInt(mm);
		d = Integer.parseInt(dd);
		
		if((m >= 1 && m <= 12) && (month[m-1] >=  d) && d >= 1 ){
			System.out.println(mm + dd + yy);
		}
		
		} 



	} 


}
