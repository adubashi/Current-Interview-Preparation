
public class allUniqueCharacters {
	
	public static void main(String Args[]){
		
		System.out.println(allUniqueCharacters("abcd"));
		//System.out.println(allUniqueConstantSpace("abcd"));
	}
	
	
	public static boolean allUniqueCharacters(String s){
		boolean[] hash = new boolean[256]; 
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(hash[c]){
			   return false;
			} else {
			   hash[c] = true;
			}
		}
		return true;
	}
	
	public static boolean allUniqueON2(String s){
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			for(int j = i + 1; j < s.length(); j++){
				if(c == s.charAt(j)){
				   return false;
				}
			}
		}
		return true;
	}

}
