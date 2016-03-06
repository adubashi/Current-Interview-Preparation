package epic;

public class findWellOrderedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findWellOrderedNumber(0,0,4);

	}
	
	public static void findWellOrderedNumber(int number, int prev, int n){
		if(n == 0){
			System.out.println(number);
		} 
		
		for(int i = prev + 1; i < 10; i++ ){
			findWellOrderedNumber(number*10 + i, i, n - 1);
		}
		
	}

}
