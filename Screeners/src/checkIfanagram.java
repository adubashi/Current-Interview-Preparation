
public class checkIfanagram {
	
	public static boolean checkIfanagram(String s, String t){
		
		if(s.length() != t.length()){
			return false;
		}
		int[] hash = new int[128];
		
		for(int i = 0; i < s.length(); i++){
			hash[s.charAt(i)]++;
		}
		for(int i = 0; i < t.length(); i++){
			hash[s.charAt(i)]--;
			
			if(hash[s.charAt(i)] < 0){
				return false;
			}
		}
		
		return true;
	}

}
