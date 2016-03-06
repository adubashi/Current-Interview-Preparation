package belvedere;

import java.io.*;
import java.util.Arrays;

public class belvedereTrading {
	
	public static void main(String Args[]) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    String[] splited = null;
	      s = in.readLine();
	      splited = s.split("\\s+");
	      System.out.println(s);
	      System.out.println(Arrays.toString(splited));
	      String[] splited2 = null;
	    
	    
	    for(int i = 0; i < splited.length; i++){	
	    		//System.out.println("running");
	    		
	    		if(i % 2 == 0){
	    		
	    		if(splited[i].charAt(0) == '-'){
		    		   int power = Character.getNumericValue((splited[i].charAt(5)));
		    		   
		    		   int coefficient = power * Character.getNumericValue(splited[i].charAt(1));
		    		   
		    		   power = power - 1;
		    		   System.out.println(power);
		    		   
		    		   String test = coefficient + "*x^" + power;
		    		   
		    		   splited[i] = test;
		    	}
	    	
	    		if(Character.isDigit(splited[i].charAt(0))){
	    		   int power2 = Character.getNumericValue((splited[i].charAt(4)));
	    		   int coefficient = power2 * Character.getNumericValue(splited[i].charAt(0));
	    		  
	    		   power2 = power2 - 1;

	    		   
	    		   String test = coefficient + "*x^" + power2;
	    		   
	    		   splited[i] = test;
	    		}	
	    		
	    		}
	    }
	    
	    System.out.println(Arrays.toString(splited));
	    
	    String retur = "";
	    
	    for(int i = 0; i < splited.length; i++){
	    	retur = retur + splited[i] + " ";
	    }
	    
	    System.out.println(retur);
	    
	    
	    
    }
	

}
