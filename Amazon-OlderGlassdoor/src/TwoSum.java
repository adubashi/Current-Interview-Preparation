import java.util.*;
public class TwoSum {
	
	public static void main(String args[]){
		
		int[] array = {25,75,50,50,99,1};
		
		printPairs(array,100);
		
	}
	
	//Time: O(n)
	//Space: O(n)
	public static void printPairs(int[] array, int sum){
		HashSet<Integer> map = new HashSet<Integer>();
		
		for(int i = 0; i < array.length; i++){
			int val = array[i];
			if(map.contains(Math.abs(sum - val))){
			   System.out.print(val + " and " + (sum - val));
			   System.out.println();
			} else {
				map.add(val);
			}
		}	
	}
	//Time: O(nlogn)
	//Space:O(1)
	
	public static void printPairSums(int[] array, int sum){
		Arrays.sort(array);
		int first = 0;
		int last = array.length -1;
		while(first < last){
			int s = array[first] + array[last];
			if(s == sum){
				System.out.print(array[first] + "  " +  array[last]);
				first++;
				last--;
			} else {
				if(s < sum){
					first++;
				} else {
					last--;
				}
			}
		}
	}
}
