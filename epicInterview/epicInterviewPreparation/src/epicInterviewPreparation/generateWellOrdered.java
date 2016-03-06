package epicInterviewPreparation;

public class generateWellOrdered {
	
	public static void main(String Args[]){
		generateWellOrdered(0,0,4);

		
	}
	
	
	
	//Gradually build up each number
	//until the length has been reached
	public static void generateWellOrdered(int number, int prev, int length){
		if(length == 0){
			System.out.println(number);
		}  else {
			for(int i = prev + 1  ; i < 11 - length; i++){
				generateWellOrdered(number*10 + i,i,length-1);
			}
		}
	}

}
