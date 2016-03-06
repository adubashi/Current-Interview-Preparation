import java.util.*;
public class reverseWordsInAstring {

	public static void main(String args[]){
		String test = "steve johnson";
		String[] words = test.split(" ");
		reverseArr(words);
		
		String r = convertToString(words);
		
		
		System.out.println(Arrays.toString(words));
		System.out.println(r);
		
		
	}
	
	public static void reverseArr(String[] words){
		for(int i = 0; i < words.length/2; i++){
			String tmp = words[i];
			words[i] = words[words.length-i-1];
			words[words.length-i-1] = tmp;
		}
	}
	public static String convertToString(String[] words){
		String result  = words[0];
		for(int i = 1; i < words.length; i++){
			result = result + " " + words[i];
		}
		
		return result;
	}
	/*
	 * Reverse the words of a string in place
	 */
	
	public static void reverseWords(char[] s) {
        reverse(s, 0, s.length);
        for (int i=0, j=0; j<=s.length; j++) {
            if (j==s.length || s[j]==' ') {
                reverse(s, i, j);
                i =  j + 1;
            }
        }
    }
 
    private static void reverse(char [] s, int begin, int end) {
        for (int i=0; i<(end-begin)/2; i++) {
            char temp = s[begin+i];
            s[begin+i] = s[end-i-1];
            s[end-i-1] = temp;
        }
    }
	
}
