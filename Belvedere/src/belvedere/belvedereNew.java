package belvedere;

import java.io.*;
import java.util.Arrays;

public class belvedereNew  {
	public static void main(String[] args) throws IOException {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    s = in.readLine();
	    //System.out.println(s);
	    
	    System.out.println(returnString(s));
	    System.out.println(returnInteger(s));
	    System.out.println(returnBulkString(s));
	    System.out.println(returnArray(s));
	    
	}
	
	public static String returnString(String s){
		String test = "";
		if(s.substring(0,1).equals("+") && s.charAt(s.length() -1 ) == '|'){
	    	test = s.substring(1,s.length() - 1);
	    }	
		
	
		
		return test;
	}
	
	public static String returnInteger(String s){
		String test = "";
		if(s.substring(0,1).equals(":") && s.charAt(s.length() -1 ) == '|'){
	    	test = s.substring(1,s.length() - 1);
	    }	
		
		return test;
	}
	
	public static String returnBulkString(String s){
		String test = "";
		String test2 = "";
		char array[] = null;
		if(s.substring(0,1).equals("$") && s.charAt(s.length() -1 ) == '|'){
	    	test = s.substring(1,s.length() - 1);
	    	
	    	
	    	array = new char[Character.getNumericValue(test.charAt(0))];
	    	
	    	test = s.substring(3);
	    	
	    	test2 = "";
	    	
	    	for(int i = 0; i < array.length; i++){
	    		array[i] = test.charAt(i);
	    		test2 = test2 + array[i];
	    	}
	    	
	    	//System.out.println(Arrays.toString(array));
	    	
	    	
	    }
		return test2;
		
		
	}
	
	public static String returnArray(String s){
		
		if(s.substring(0,1).equals("*") && s.charAt(s.length() -1 ) == '|'){
			
			
		}
		
		String[] parts = s.split("\\|");
		
		String[] array = new String[1000];
		
		System.out.println(Arrays.toString(parts));

		for(int i = 0; i < parts.length; i++){
			if(i % 2 == 1){
				String test = parts[i].substring(1, s.length() - 1);
				array[i] = test;
			}
			
		}
		
		
		
		return "";
		
		
		
	}
}
