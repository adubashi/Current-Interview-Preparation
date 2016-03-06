
import java.util.*;

public class BNYMellon {
	public static void main(String args[]){
		int[] array = {1,3,2,5,4};
		
		System.out.println(countPairs(3,5,array));
		
	}
	
	//5 2
	// 1 3 2 5 4 
	
	public static int countPairs(int difference, int count, int[] array){
		HashSet h = new HashSet();
		int resultCount = 0;
		
		for(int i = 0; i < array.length; i++){
			h.add(array[i]);
		}
		for(int i = 0; i < array.length; i++){
			int dif1 = array[i] + difference;
			int dif2 = array[i] - difference;
			System.out.println(dif1);
			System.out.println(dif2);
			if(h.contains(dif1) || h.contains(dif2)){
				h.remove(array[i]);
				resultCount++;  
			}
		}
		
		
		
		
		
		
		return resultCount++;	
	}

}
