package epicInterviewPreparation;

import java.util.*;


public class swapMostAndLeastCommonCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swap("aab");

	}
	
	public static void swap(String s){
		Hashtable<Character,Integer> table = new Hashtable<Character,Integer>();
		
		for(int i = 0; i < s.length(); i++){
			Character c = s.charAt(i);
			if(table.containsKey(c)){
				int freq = table.get(c);
				table.put(c, freq+1);
			} else {
				table.put(c, 1);
			}
			System.out.println(table.toString());
		}
		System.out.println(table.toString());
		
		int minFreq = Integer.MAX_VALUE;
		int maxFreq = Integer.MIN_VALUE;
		char minChar = 'a';
		char maxChar = 'a';
		
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			int freq = table.get(c);
			if(freq < minFreq){
			   minFreq = freq;
			   minChar = c;
			} else if(freq > maxFreq){
			   maxFreq = freq;
			   maxChar = c;	
			}
			
		}
		
		
		//Return String
		System.out.println(maxChar +" " + maxFreq);
		System.out.println(minChar +" " + minFreq);
		String returnString = "";
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(c == maxChar){
				c = minChar;
			} else if(c == minChar){
				c = maxChar;
			}
			returnString += c;
		}
		
		System.out.println(returnString);
		
	}

}
