
public class testAnagram {
	
	public static void main(String args[]){
		String s1 = "aaabbbccc";
		String s2 = "aaabbcccz";
		System.out.println(isAnagram(s1,s2));
		
	}



public static boolean isAnagram(String s1, String s2){
	if(s1.length() != s2.length()){
		return false;
	}
	
	int[] hashtable = new int[256];
	
	for(int i = 0; i < s1.length(); i++){
		hashtable[s1.charAt(i)]++;
	}
	for(int i = 0; i < s2.length(); i++){
		hashtable[s2.charAt(i)]--;
		if(hashtable[s2.charAt(i)] < 0 ){
			return false;
		}
	}
	
	return true;
}

}
