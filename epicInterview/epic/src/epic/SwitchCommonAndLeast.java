package epic;

import java.util.*;

public class SwitchCommonAndLeast {
	
	public static void main(String Args[]){
		
		switchCommon("catsdogssssss");
		
	}
	
	public static void switchCommon(String s){
		int[] hashtable = new int[256];
		
		//Maxchar
		char maxchar = ' ';
		int maxcnt = 0;	
		for(int i = 0; i < s.length(); i++){
			char c= s.charAt(i);
				hashtable[c]++;				
				if(hashtable[c]> maxcnt){
					maxcnt = hashtable[c];
					maxchar = c;
				}
		}
	
		
		
		//Least char
		char leastchar = ' ';
		int leastcnt = Integer.MAX_VALUE;
		for(int i = 0; i < hashtable.length; i++){
			if(hashtable[i] < leastcnt && hashtable[i]  != 0){
			   leastcnt = hashtable[i];
			   leastchar = (char)i;
			}
		}
		System.out.println(maxchar + " " + maxcnt);
		System.out.println(leastchar + " " + leastcnt);
		
		
		String returnString = "";
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			
			if(c == leastchar){
				returnString = returnString + maxchar;
			} else if(c == maxchar){
				returnString = returnString + leastchar;
			} else {
				returnString = returnString + c;
			}

			
		}
		
		System.out.println(returnString);
		
		
	}

}
