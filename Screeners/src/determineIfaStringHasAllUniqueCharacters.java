
public class determineIfaStringHasAllUniqueCharacters {
	
	
	public static boolean allUniqueCharacters(String s){
		boolean[] charString = new boolean[128];
		for(int i = 0; i < s.length(); i++){
			charString[s.charAt(i)] = true;
			if(charString[s.charAt(i)]){
				return false;
			}
		}
		return true;
	}
	
	

}
