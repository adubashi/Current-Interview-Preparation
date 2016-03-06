
public class checkIfanagram {
	
	public static void main(String args[]){
		System.out.println(isAnagram("catz","tcaf"));
	}
	
	public static boolean isAnagram(String s, String t) {
        if(s.equals("") && t.equals("")){
            return true;
        }
        if(s.length() != t.length()){
            return false;
        }
        int[] arrayS = new int[128];
        //int[] arrayT = new int[128];
        
        for(int i = 0; i < s.length(); i++){
        	arrayS[s.charAt(i)]++;
        }
        
        for(int i = 0; i < t.length(); i++){
        	arrayS[t.charAt(i)]--;
        	
        	if(arrayS[t.charAt(i)] < 0 ){
        		return false;
        	}
        }
        
        return true;
    }

}
