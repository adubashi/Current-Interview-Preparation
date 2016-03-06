package epicInterviewPreparation;

import java.util.*;

public class isPasswordValid {
	
	
	public static void main(String Args[]){
		String s = "123tl123";
		
		boolean f1 = length(s);
		boolean f2 = correctCharacters(s);
		boolean f3 = noContSubstrings(s);
		
		System.out.println(f1 && f2 && f3);
	}
	
	
	public static boolean length(String s){
		return s.length() >= 5 && s.length() <= 12;
	}
	
	public static boolean correctCharacters(String s){
		boolean lowercaseFlag = false;
		boolean numberFlag = false;
		
		for(int i = 0; i < s.length(); i++){
			if(Character.isDigit(s.charAt(i))){
				numberFlag = true;
			}
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
				lowercaseFlag = true;
			}
		}
		return numberFlag && lowercaseFlag;	
	}
	/**
	 * HashMap store the substring as a key and its ending index as a value.
	 * Before putting value into the hashmap, it checks if the substring already exists.
	 * If yes, retrieve the value and compare value + 1 with the starting index of the new substring.
	 * If they are equal, it means there are consecutive substrings.
	 */
	
	public static boolean noContSubstrings(String s){
		
		HashMap<String,Integer> stringindexMap = null;
		
		//Checking all lengths of substrings
		for(int i = 1; i < s.length(); i++){
			stringindexMap = new HashMap<String,Integer>();
			//Checking all start points of substrings
			for(int j = 0; j+i <= s.length(); j++){
				String sub = s.substring(j,j+i);
				if(stringindexMap.get(sub) == null){
					//Get the end index of the substring
					stringindexMap.put(sub, j + i -1);
				} else {
					//If the start index of the substring matches the end index of the prev subsring 
					int prevLastIndex = stringindexMap.get(sub);
					if(prevLastIndex == j - 1){
						return false;
					}
				}
				
			}
		}
		return true;
	}

}
