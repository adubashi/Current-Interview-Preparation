package epicInterviewPreparation;

public class encryptUpperCase {
	
	public static void main(String args[]){
		
		encrypt("ABC",4);
		
		
		
	}
	
	public static void encrypt(String text, int n){
		
		text = text.toUpperCase();
		
		for(int i = 0; i < text.length(); i++){
			char k = text.charAt(i);
			int temp = (((int)k - 64) * n) % 26;
			System.out.println((char)(temp+64));
			
			
		}
	}

}
