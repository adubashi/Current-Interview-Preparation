package epicInterviewPreparation;

import java.util.*;

public class bigRowSmallColumn {
	
	public static void main(String Args[]){
		int[][] array ={{1,2,3},{4,5,6}, {7,8,9}};
		
		bigRowSmallCol(array);
		
		
	}
	
	
	//Max in row
	//Min in column
	public static void bigRowSmallCol(int[][] array){
		int length = array.length;
		int resultMin = 0;
		
		String result = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++){
			max = Integer.MIN_VALUE;
			for(int j = 0; j < array.length; j++){
				if(array[i][j] > max){
					max = array[i][j];
				}			
			}
			list.add(max);
		}
		//Remember to store saddle point 
		int saddlerow = 0;
		int saddlecolumn = 0;
		int min = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for(i = array.length -1; i >= 0; i--){
			min = Integer.MAX_VALUE;
			//Just to iterate the coordinate plan the correct way
			for(j = 0; j < array.length; j++){
				if(array[j][i] < min){
					min = array[j][i];
					saddlerow = j;
					saddlecolumn = i;
				}			
			}
			if(list.contains(min)){
				System.out.println("row");
				System.out.println(saddlerow);
				System.out.println("column");
				System.out.println(saddlecolumn);
				System.out.println("value");
				System.out.println(min);
			}
		}
		System.out.println(list.toString());
		//System.out.println(resultMin);
		//System.out.println(result);
	}

}
