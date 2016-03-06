package epicInterviewPreparation;

public class splitWords {
	
	
	
	public static void main(String args[]){
		splitString("A person can't walk in this street");
	}
	
	public static void splitString(String s){
		String[] words = s.split(" ");
		String result = "";
		
		for(int i = 0; i< words.length; i++){
			words[i] = splitWord(words[i]);
			
			
		}
		
		for(int i = 0; i < words.length; i++){
			result = result + words[i] + " ";
		}
		
		System.out.println(result);
	}
	
	
	public static String splitWord(String s){
		int letterCount = countLetters(s);
		if(letterCount <= 3){
			return s;
		}
		
		
		String s1 = s.substring(0, letterCount/2);
		String s2 = s.substring(letterCount/2, s.length());
		
		return s1 + " " + s2;
		
	}
	
	public static int countLetters(String s){
		int count = 0;		
		for(int i = 0; i < s.length(); i++){
			if(Character.isAlphabetic(s.charAt(i))){
				count++;	
			}
			
		}
		
		return count;
	}

}
