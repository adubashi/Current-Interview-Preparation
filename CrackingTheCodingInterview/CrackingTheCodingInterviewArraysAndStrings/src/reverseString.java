
import java.util.*;
public class reverseString {

	public static void main(String args[]){		
		char[] str = {'a','r','j','u','n','1'};
		System.out.println(Arrays.toString(str));
		reverseString(str);
		System.out.println(Arrays.toString(str));
		
		
		String rev = "reverse";
		System.out.println(rev);
		System.out.println(reverseString(rev));
		
	}
	
	
	public static String reverseString(String str){
		String rev = "";
		for(int i = 0; i < str.length(); i++){
			rev = str.charAt(i) + rev;
		}
		return rev;
	}
	
	//Reverse a string in place;
	public static void reverseString(char[] str){
		for(int i = 0; i < str.length/2; i++){
			int k = str.length - 1 - i;
			swap(i,k,str);
		}
		
	}
	
	public static void swap(int i, int j, char[] str){
		char tmp = str[i];
		str[i] = str[j];
		str[j] = tmp;
	}
}
