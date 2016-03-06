package epicInterviewPreparation;

import java.util.*;

public class printAllIncreasingsubsequences {
	
	public static void main(String Args[]){
		int[] a = {5,4,7,8,2,3,6,9,8,6,2,3,4,5}; 
		
		printAllSubsequences(a);
	}
	
	public static void printAllSubsequences(int[] a){
		  for(int i = 0; i < a.length; i++){
			  int max = a[i];
			  String result = "";
			  result = result + max;
			  for(int j = i;  j < a.length; j++){
				  if(a[j] > max){
					  max = a[j];
					  result = result + max;
				  }
			  }
			  System.out.println(result);
		  }
	}

}
