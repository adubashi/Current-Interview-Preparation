
public class ReverseStringWords {
	
	public static void main(String Args[]){
		
		char[] just = {'r', 'e', ' ', 'd', 'a', '\0'};
		
		reverseSentenceWords(just);
		
		for(int i = 0; i < just.length; i++){
			System.out.print(just[i]);
		}
		
	}
	
	public static void reverseString(char[] str, int start, int end){
		if(str == null || str.length < 2){
			return;
		}
		
		while(start < end){
			char j = str[start];
			str[start] = str[end];
			str[end] = j;
			
			//System.out.print("cout");
			start++;
			end--;
		}
		
	}
	
	//Not null terminated string
	public static void reverseSentenceWords(char[] sentence){
		if(sentence == null || sentence.length == 0){
			return;
		}
		
		int len = sentence.length;
		int end = 0;
		reverseString(sentence, 0, len -2);
		System.out.println(sentence);
		int start = 0;
		
		
		
		while(true){
			//System.out.print("cout");
			while(sentence[start] == ' '){
				//System.out.print("cout");
				start++;
			}
			
			//System.out.print("cout");
			if(sentence[start] == '\0'){
				break;
			}
			
			end = start+1;
			//System.out.print("cout");
			while( sentence[end] != '\0'&& sentence[end] != ' '){
				//System.out.print("cout");
				end++;
			}
			
			reverseString(sentence, start, end-1);
			start = end;
			
		}
		
	}

}
