package epic;

import java.util.Arrays;

public class reverseTheWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The Cat Jumped.");
		
		System.out.println(reverseWords("The Cat Jumped."));

	}
	
	public static String reverseWords(String s){
		String[] words = s.split(" ");
		reverseArray(words);
		return Arrays.toString(words);
	}

	
	public static void  reverseArray(String[] s){
		for(int i = 0; i < s.length / 2; i++)
		{
		    String temp = s[i];
		    s[i] = s[s.length - i - 1];
		    s[s.length - i - 1] = temp;
		}
	}
	

}
