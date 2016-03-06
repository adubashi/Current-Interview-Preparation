
public class MostFrequentChar {

	public static void main(String[] args) {
		
		mostRepeated("aaaaattttttttttttt");

	}
	
	public static char mostRepeated(String s) {
	    int[] myChars = new int[128]; // assuming ascii
	   for(int i = 0; i < s.length(); i++) { // bucket sort
	       char c = s.charAt(i);
	       myChars[c]++; // increase number of this bucket
	   }
	  int indexWithHighest = 0;
	  for(int i = 0; i < s.length(); i++) {
	      if(myChars[i] > indexWithHighest) {
	    	  System.out.println(i);
	         indexWithHighest = i;
	     }
	  }
	  
	  System.out.println(indexWithHighest);
	  System.out.println((char)indexWithHighest);
	  return (char)indexWithHighest;
	}

}
