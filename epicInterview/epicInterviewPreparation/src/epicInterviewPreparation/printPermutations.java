package epicInterviewPreparation;

public class printPermutations {
	
	public static void main(String args[]){
		printPermutation("","ca1t");
		
	}

	//Try each of the letters as the first letter
	//Gradually move each character from the string to the prefix
	//When the string is zero, print the prefix
	public static void printPermutation(String prefix, String str){
		int n = str.length();
		if(n == 0){
			System.out.println(prefix);
		} else{
			for(int i = 0; i < n; i++){
					printPermutation(prefix + str.charAt(i),str.substring(0, i) + str.substring(i+1,n));
			}
		}
	}
}
