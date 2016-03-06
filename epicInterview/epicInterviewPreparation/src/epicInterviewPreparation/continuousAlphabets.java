package epicInterviewPreparation;

public class continuousAlphabets {
	
	
	public static void main(String Args[]){
		printAlphabets("abcdefzplmnop");
	}
	
	
	
	
	public static void printAlphabets(String s){
		s = s.toLowerCase();
		char prevChar = 'a';
		char currentChar = 'a';
		int i = 1;
		boolean contiguous = false;
		
		while(i < s.length()){
			prevChar = s.charAt(i - 1);
			currentChar = s.charAt(i);
			
			if(prevChar+1 == currentChar){
				System.out.print(prevChar);
				contiguous = true;
			} else {
				if(contiguous){
					System.out.print(prevChar);
					System.out.print(";");	
				}
				contiguous = false;		
				
			}
			i++;
		}
		
		if(currentChar==prevChar+1) {
			System.out.print(currentChar);	
		}
		
		
	}

}
