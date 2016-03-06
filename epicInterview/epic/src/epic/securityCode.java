package epic;

import java.util.ArrayList;

public class securityCode {

	public static void main(String[] args) {
		
		allowed("1470");

	}
	
	public static void allowed(String a){
		
		String code = "147";
				
		String number = "0123456789";
		
		for(int i = 0; i < number.length(); i++){
			if(code.equals(removeNumber(a,number.charAt(i)))){
			   System.out.println("Allowed");
			   break;
			}
		}
		
		
		
	}
	
	public static String removeNumber(String a, char n){
		String newString = "";
		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) != n){
			   newString += a.charAt(i);
			}
		}
		
		//System.out.println(newString);
		return newString;
		
		
	}

}
