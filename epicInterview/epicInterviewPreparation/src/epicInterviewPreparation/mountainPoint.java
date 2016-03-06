package epicInterviewPreparation;

public class mountainPoint {
	
	public static void main(String Args[]){
		
		int[][] array  = {{1,2,3},{5,17,6},{4,3,2}};
		
		mountainPoint(array);
		
		
		
	}
	
	public static void mountainPoint(int[][] array){
		
		for(int i = 1; i < array.length - 1; i++){
			for(int j = i; j < array[i].length - 1;j++){
				int value = array[i][j];
				
				if(value > array[i-1][j-1] &&
				   value > array[i-1][j] &&
				   value > array[i-1][j+1] &&
				   value > array[i][j-1] &&
				   value > array[i][j+1] &&
				   value > array[i-1][j-1]&&
				   value > array[i+1][j] &&
				   value > array[i+1][j+1]){
					System.out.println("Value:" + value + " Coordinates i: " + i + " j: "+ j);
				}
					
					
					
					
				
			}
		}
		
	}
	
	

}
