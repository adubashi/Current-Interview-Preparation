import java.util.Arrays;


public class FindTwoClosestNumbers {
	
	//Find the minimum distance between two numbers
	public static void main(String[] args) {
		int[] myIntArray = {7,2,5,17,61,52,90};
		
		System.out.println(FastMinDistance(myIntArray));
	}
	
	//Naive solution 
	public static int MinDistance(int [] ar){
        int [] a = ar;
        int aSize = a.length;
        int dMin = a[1] - a[0];//MaxInt
        for(int i=0; i< aSize; i++)
        {
            for(int j=i+1; j< aSize;j++)
            {   
                dMin = Math.min(dMin, Math.abs( a[i]-a[j]));
            }
        }
        return dMin;
    }
	
	//N log n solution
	//Array either needs to be sorted, or needs to be passed in
	// a sorted array
	public static int FastMinDistance(int [] arr){
		
		Arrays.sort(arr);
		int [] a = arr;
        int aSize = a.length;
        int dMin = Math.abs(a[1] - a[0]);//MaxInt
        
        for(int i=1; i< aSize; i++)
        { 
                dMin = Math.min(dMin, Math.abs(a[i-1] - a[i]));
        }
        return dMin;
		
	}

}
