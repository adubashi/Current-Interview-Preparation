
public class computesTheNumberOfTrailingZeros {
	
	public static int countFactZeros(int num){
		int count = 0;
		if(num < 0){
			return -1;
		}
		for(int i = 5; num / i > 0; i *= 5){
			count += num / i;
		}
		return count;
	}

}
