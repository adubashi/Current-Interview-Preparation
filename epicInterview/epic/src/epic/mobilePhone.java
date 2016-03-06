package epic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class mobilePhone {
	

	
	
	public static String inputToText(String input)
	{
		char [][] map = {{'A','B','C'}, {'D','E','F'}, {'G','H','I'}, {'J','K','L'}, {'M','N','O'},
						 {'P','Q','R','S'}, {'T','U','V'}, {'W','X','Y','Z'}};

		String result = "";
		for (int i=0;i<input.length();i++)
		{
			System.out.println("Made it in loop");
			if(input.charAt(i) == '#') {
				result += " ";
			} else if (Character.getNumericValue(input.charAt(i)) >1 && Character.getNumericValue(input.charAt(i)) <= 9) {
				System.out.println("Made it to else ");
				int count=0;
				int pos = i;
				while (pos+1 <input.length()  && input.charAt(pos) == input.charAt(pos+1) )
				{
					count++;
					pos++;
					System.out.println("Finished while, with count and pos: " + count + pos);
				}
				result += map[Character.getNumericValue(input.charAt(i)) -2][count];
				i = pos;
			}
		}

		return result;
}
	

	public static void main(String[] args) {
	        
	        System.out.println(inputToText("768#756"));
	}
	
	
	
	
}
