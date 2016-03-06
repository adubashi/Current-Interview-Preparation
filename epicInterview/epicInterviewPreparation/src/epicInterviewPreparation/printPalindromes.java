package epicInterviewPreparation;

import java.util.*;

public class printPalindromes {
	
	public static  final int PALINDROMELENGTH = 3;
	
	public static void main(String Args[]){
		//printPalindrome("bbbbaaabbbb");
		
		
		
		//System.out.println(s);
		
		Set<String> s = palindromes("bbbbaaabbbb");
		
		System.out.println(s.toString());
	}
	
	
	
	public static void printPalindrome(String str)
	{   
		//Base case 
		if(str.length() < 1){
			return;
		}
		
		for(int i = PALINDROMELENGTH; i < str.length();i++){
			String s = str.substring(0, i);
			
			if(checkPalindrome(s)){
				System.out.println(s);
			}
		}
		
		printPalindrome(str.substring(1));
		  
		
	}//printPalindrome
	
	
	public static boolean checkPalindrome(String s){
		String st = "";
		for(int i = s.length()-1; i >=0; i--){
			st = st + s.charAt(i);
		}
		
		return st.equals(s);
	}
	
	 public static void expandPalindromes(final HashSet<String> result, final String s, int i, int j) {
	      while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
	    	  	if( s.substring(i,j+1).length() >=  PALINDROMELENGTH){
	    	  		result.add(s.substring(i,j+1));
	    	  		System.out.println(s.substring(i,j+1));
	    	  	}
	            i--; 
	            j++;
	      }
	  }
	 
	 public static Set<String> palindromes(final String input) {

	     final HashSet<String> result = new HashSet<>();

	     for (int i = 0; i < input.length(); i++) {
	         // expanding even length palindromes:
	         expandPalindromes(result,input,i,i+1);
	         // expanding odd length palindromes:
	         expandPalindromes(result,input,i,i);
	     } 
	     return result;
	  }

}