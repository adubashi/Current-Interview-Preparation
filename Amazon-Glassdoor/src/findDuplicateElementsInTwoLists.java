import java.util.*;
public class findDuplicateElementsInTwoLists {
	
	
	public static void main(String args[]){
		int[] array = {1,125,23,-7,10};
		int[] array2 = {2,23,100,10,34};
		
		findDups3(array,array2);
		
	}

	//O(n) time 
	public static void findDups(int[] array, int array2[]){
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < array.length; i++){
			set.add(array[i]);
		}
		
		for(int i = 0; i < array2.length; i++){
			if(set.contains(array2[i])){
				System.out.println(array2[i]);
			}
		}
		
	}
	
	//O(nlogn + mlogm) = O(nlogn)
	public static void findDups2(int[] sorted1, int sorted2[]){
		Arrays.sort(sorted1);
		Arrays.sort(sorted2);
		int index1 = 0, index2 = 0;
		while(index1 < sorted1.length && index2 < sorted2.length){
				    if(sorted1[index1] < sorted2[index2]){
				        index1++;
				    }else if(sorted1[index1] > sorted2[index2]){
				        index2++;
				    }else{
				        System.out.println(sorted1[index1]);
				        index1++;
				        index2++;
				    }
		}
	}
	
	//O(m + nlogn) = O(nlogn)
	public static void findDups3(int[] array1, int array2[]){
		Arrays.sort(array1);
		for(int i = 0; i < array2.length; i++){
			int k = Arrays.binarySearch(array1,array2[i]);
			if(!(k < 0)){
			  System.out.println(array2[i]);
			}
		}
		
	}
}
