package epicInterviewPreparation;

public class permutationsOfNumber {
	
	public static void main(String args[]){
		printAllNumbers("","0123456789", 4);
		
		//generateWellOrdered(0,0,4);
	}

	public static void printAllNumbers(String prefix, String str, int level){
		int n = str.length();
		if(level == 0){
			System.out.println(prefix);
		} else{
			for(int i = 0; i < n; i++){
				printAllNumbers(prefix + str.charAt(i),str.substring(0, i) + str.substring(i+1,n), level - 1);
			}
		}
	}
	

}
