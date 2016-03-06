
public class excelNumberToColumnTitle {
	
	public String convertToTitle(int n) {
	    if(n <= 0){
	        throw new IllegalArgumentException("Input is not valid!");
	    }
	 
	    StringBuilder sb = new StringBuilder();
	 
	    while(n > 0){
	    	n--;
	    	char ch = (char)(n % 26  + 'A');
	    	n = n / 26;
	    	sb.append(ch);
	    }
	 
	    sb.reverse();
	    return sb.toString();
	}
	
	public int titleToNumber(String s) {
	    if(s==null || s.length() == 0){
	        throw new IllegalArgumentException("Input is not valid!");
	    }
	 
	    int result = 0;
	    int i = s.length()-1;
	    int t = 0;
	    while(i >= 0){
	        char curr = s.charAt(i);
	        result = result + (int) Math.pow(26, t) * (curr-'A'+1);
	        t++;
	        i--;
	    }
	 
	    return result;
	}

}
