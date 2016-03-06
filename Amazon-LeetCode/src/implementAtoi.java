
public class implementAtoi {
	
	public static int myAtoi(String str) {
    	if (str == null || str.length() < 1){
    			return 0;
    	}
    	int flag = 0;
    	str = str.trim();
    	int i = 0;
    	if(str.charAt(i) == '-'){
    		flag =  -1;
    		i++;
    	} else {
    		flag = 1;
    		i++;
    	}
    	double result = 0;
    	
    	while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
    		result = result * 10 + (str.charAt(i) - '0');
    		i++;
    	}
    	result = result * flag;
    	//Handle min and max
    	if (result > Integer.MAX_VALUE)
    		return Integer.MAX_VALUE;
     
    	if (result < Integer.MIN_VALUE)
    		return Integer.MIN_VALUE;
     
    	return (int) result;

    	
	}

}
