import java.util.*;
public class TwoSum {
	//Time: O(n)
	//Space: O(1)
	public static void twoSum( int[] array, int sum){
		Hashtable<Integer,Integer> map = new Hashtable<Integer,Integer>();
		
		for(int i = 0; i < array.length; i++){
			int x = array[i];
			int k = sum - x;
			if(map.containsKey(k)){
				System.out.println(x + " " + k);
			} else {
				map.put(x, k);
			}
		}
	}
	
	//Time: O(nlogn)
	//Space: O(1); or O(logn) from quicksort space complexity
	
	public static void twoSumSorted(int[] array, int sum){
		Arrays.sort(array);
		int first = 0;
		int last = array.length - 1;
		
		while(first < last){
			int s = array[first] + array[last];
			if(s == sum){
				System.out.println(array[first] + " " + array[last]);
				first++;
				last--;
			} else {
				if( s < sum){
					first++;
				} else {
					last--;
				}
			}

		}
	}
	
	public static void main(String args[]){
		int[] array = {1,4,3,2,7,3};
		
		twoSum(array,5);
	}

}
