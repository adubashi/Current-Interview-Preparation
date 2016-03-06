
public class modifiedFizzBuzz {
	
	public static void main(String args[]){
		for(int i = -50; i <= 50; i++){
			int value = i;
			if( i < 0){
				value = Math.abs(i);
			}
			if(value % 3 == 0){
				System.out.print("Fizz");
			} else if(value % 5 == 0){
				System.out.print("Buzz");
			} else {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
