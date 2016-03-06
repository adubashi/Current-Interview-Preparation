package epicInterviewPreparation;

public class continuousSequences {
	public static void main(String Args[]){
		printContiguousSequences("123459123");
	}
	
	
	
	
	public static void printContiguousSequences(String s){
		s = s.toLowerCase();
		char prevNumber = '1';
		char currentNumber = '1';
		int i = 1;
		boolean contiguous = false;
		
		while(i < s.length()){
			prevNumber = s.charAt(i - 1);
			currentNumber = s.charAt(i);
			
			if(prevNumber+1 == currentNumber){
				System.out.print(prevNumber);
				contiguous = true;
			} else {
				if(contiguous){
					System.out.print(prevNumber);
					System.out.print(";");	
				}
				contiguous = false;		
				
			}
			i++;
		}
		if(currentNumber==prevNumber+1) {
			System.out.print(currentNumber);	
		}
		
	}

}
