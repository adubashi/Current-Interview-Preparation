import java.util.Arrays;
public class bubbleSort {
	/*
	 * Worst Case: O(n^2)
	 * Average Case:O(n^2)
	 * Best case:O(n)
	 */
	public static int swaps = 0;
	
	public static void main(String[] args) {
		 
        int arrayList[] = {2,3,4,5,6,7,8,9,10,1};
        System.out.println("\nFinal result:"+ Arrays.toString(bubbleSort(arrayList)));
	}
 
    public static int[] bubbleSort(int[] arr){
        int temp;
        for(int i=0; i < arr.length-1; i++){
 
            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swaps++;
                }
            }
            System.out.println((i+1)+"th iteration result: "+Arrays.toString(arr));
            //System.out.println((i+1)+"th iteration result: "+Arrays.toString(arr));
        }
        System.out.println("Swaps: "+ swaps);
        return arr;
    }

}
