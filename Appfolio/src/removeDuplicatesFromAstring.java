
public class removeDuplicatesFromAstring {
	
	public static void main(String args[]){
		String test = "aaabbbccc";
		String returnString = removeDuplicates2(test);
		
		System.out.println(returnString);
	}
	
	
	//Time: O(n) 
	//Space: O(256) = O(1) 
	//Uses an additional data structure(map, hashtable)
	public static String removeDuplicates(String str) {
	    boolean[] seen = new boolean[256];
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i = 0; i < str.length(); i++){
	    	char ch = str.charAt(i);
	    	if(!seen[ch]){
	    	   seen[ch] = true;
	    	   sb.append(ch);
	    	} 
	    }
	    return sb.toString();
	}
	
	//Time: O(n^2) 
	//Space: O(1)
	//No additional data structure
	public static String removeDuplicates2(String str){
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			boolean seen = false;
			for(int j = i + 1; j < str.length(); j++){
				if(ch == str.charAt(j)){
				   seen = true;
				}
			}
			if(!seen){
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}

}
