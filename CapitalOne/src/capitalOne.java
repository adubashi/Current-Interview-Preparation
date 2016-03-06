

import java.util.*;
public class capitalOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"adzbdcab" 
		
		System.out.println(firstNonRepeatedCharacter("adzbdcab"));
		
		

	}
	
	
	public static char firstNonRepeatedCharacter(String s){
		
		Hashtable<Character,Integer> characters = new Hashtable<Character,Integer>();
		
		for(int i = 0; i < s.length(); i++){
			if(characters.get(s.charAt(i)) == null){
				characters.put(s.charAt(i), 1);
			} else {
				int freq = characters.get(s.charAt(i));
				characters.put(s.charAt(i), freq + 1);
			}	
		}
		
		for(int i = 0; i < s.length(); i++){
			int count = characters.get(s.charAt(i));
			
			if(count == 1){
				return s.charAt(i);
			}
		}
		
		
		
		return 'f';
	}

}
