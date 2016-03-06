import java.util.*;
public class shuffleAdeckOfcards {
	
	public static void main(String args[]){
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		
		shuffle(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static int rand(int lower, int higher){
		return lower + (int)(Math.random() * (higher - lower + 1));
	}
	
	//O(n) time
	public static void shuffle(int[] array){
		for(int i = 0; i < array.length; i++){
			int k = rand(0,i);
			int temp = array[k];
			array[k] = array[i];
			array[i] = temp;	
		}
	}

}
