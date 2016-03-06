package epic;

public class wellOrderedString {

	
	public static void main(String Args[]){
		
	}
	
	public static boolean wellOrder(String s){
		String s1 = s.toLowerCase();
		for(int i=0;i<s1.length()-1;i++){
			if(s1.charAt(i)>s1.charAt(i+1)){
				return false;
			}
		}
		return true;
	}
}
