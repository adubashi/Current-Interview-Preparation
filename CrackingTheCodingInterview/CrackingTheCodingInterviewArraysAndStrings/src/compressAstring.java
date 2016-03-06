
public class compressAstring {
	
	public static void main(String args[]){
		
	}
	
	public static String compressBetter(String str){
		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) == last){
			  count++;
			} else {
			  mystr.append(last);
			  mystr.append(count);
			  last = str.charAt(i);
			  count = 1;
				
			}
		}
		mystr.append(last);
		mystr.append(count);
		return mystr.toString();
	}

}
