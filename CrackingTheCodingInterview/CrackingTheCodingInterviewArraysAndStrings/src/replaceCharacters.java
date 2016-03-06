import java.util.*;
public class replaceCharacters {
	//Replace all spaces in a character array  with %20
	
	public static void main(String args[]){
		
	}
	
	
	public static void replaceCharacters(char[] str, int length){
		int spaceCount = 0;
		int newLength = 0;
		int i = 0;
		for(i = 0; i < length; i++){
			if(str[i] == ' '){
			   spaceCount++;
			}
		}
		
		newLength = length  + 2*spaceCount;
		for(i = length - 1; i >= 0; i--){
			if(str[i] == ' '){
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength-1] = str[i];
				newLength = newLength - 1;
			}
		}
		
		System.out.println(Arrays.toString(str));		
	}

}
