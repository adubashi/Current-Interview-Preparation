package epicInterviewPreparation;

import java.util.*;

public class replaceWordWithLetter {
	
	public static void main(String Args[]){
		String s = "A boy is playing in a garden";
		replace(s);
		
	}
	
	public static void replace(String s){
		String []stringArray = {""};
		String result = "";
		if(s != ""){
		   stringArray = s.split(" ");
		}
		
		System.out.println(Arrays.toString(stringArray));
		
		for(int i = 0; i < stringArray.length;i++){
			String r = stringArray[i];
			
			if(r.equals("a")){
				r = "one";
			}
			if(r.equals("A")){
				r = "ONE";
			}
			result += r  + " ";		
		}
		
		System.out.println(result);
	}

}
