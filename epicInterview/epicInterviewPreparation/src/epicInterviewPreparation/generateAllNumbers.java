package epicInterviewPreparation;

public class generateAllNumbers {
	
	
	public static void main(String args[]){
		printAllNumbers("","012345679", 4);
		
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
	
	
	//Permutations of numbers 
	public static void generateWellOrdered(int number, int prev, int length){
		if(length == 0){
			System.out.println(number);
		} else {
			for(int i = 0; i < 10; i++){
				if( i == prev){
					continue;
				}
				generateWellOrdered(number*10 + i,i,length-1);
			}
		}
	}
}
