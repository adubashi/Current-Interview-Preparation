package epicInterviewPreparation;

public class saddlePoint {
	public static void main(String Args[]){
		int[][] array ={{1,2,3},{4,5,6}, {7,8,9}};
		
		printMaxes(array);
		
		
	}
	
	public static void printMaxes(int[][] array){
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < array.length;i++){
			max = Integer.MIN_VALUE;
			for(int j = 0; j < array.length;j++){
				if(array[i][j] > max){
				   max = array[i][j];
					
				}
				
			}
			System.out.println(max);
		}
		
		
		
		
		
		
	}

}
