package epic;

public class additiveNumber {
	
	public static void main(String Args[]){
		int startRange = 123000, endRange = 900000;
	    //additive(startRange, endRange, 0);
	    
	    generator(123, 12412);
	
	}
	
	public static void additive(int start, int end, int num){
		if(num > end){
			return;
		}
		if( num > 0 && num > start){
		   System.out.println(num);
		}
		
		for(int i = 1; i < 9; i++){
			for(int j = 0; j < 9; j++){
				int test = i + j;
				if(test <= 9){
					additive(start,end,num*1000 + i*100 + j*10 + test);
				}
			}
			
		}
			
	}
	

	public static void generator(int start, int end) {
		
		int halflength = (end + "").length() / 2;
		int maxgenerator = (int) Math.pow(10, halflength);

		for (int i = 1; i < maxgenerator; i++) {
			for (int j = 1; j < maxgenerator; j++) {
				fibonacci(start, end, i, j);
			}
		}
	}

	public static void fibonacci(int start, int end, int f, int s) {
		// f = 1;
		// s = 2;
		String res = Integer.toString(f) + Integer.toString(s);

		while (Integer.parseInt(res) < start) {
			int temp = f + s;
			res += temp;
			f = temp;
		}

		while (Integer.parseInt(res) < end) {
			int temp = f + s;
			res += temp;
			if (Integer.parseInt(res) < end)
				System.out.println(res);
			f = temp;
		}
	}
	


}
