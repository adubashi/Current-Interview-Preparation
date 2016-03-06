package epic;

public class wellOrderedPassword {
	
	
	public static void main(String[] Args){
		//printWellOrdered(0,0,4); // 4 digit numbers 
		char c = 'a'-1;
		printWellOrderedAlpha("",c,4);
	}
	
	private static void printWellOrdered(int number, int prev, int n) { 

		if(n == 0){
			System.out.println(number);
		} else {
			for(int i = prev + 1; i < 10; i++){
				printWellOrdered(number*10 + i,i,n-1);
			}
		}
	} 
	
	public static void printWellOrderedAlpha(String s, char prev, int n){
		if( n == 0){
			System.out.println(s);
		} else {
			for(int i = prev+1; i <= 'z'; i++){
				char prevC = (char)i;
				printWellOrderedAlpha(s + prevC,prevC,n-1);
			}	
		}
	}
	/*
	Need to use recursion
	
	
	
	*/

}
