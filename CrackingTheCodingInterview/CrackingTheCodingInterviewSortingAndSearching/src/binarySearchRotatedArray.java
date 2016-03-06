//O(logn) if distinct
//O(n) if not distinct elements
public class binarySearchRotatedArray {
	public static int search(int a[], int left, int right, int x){
		int mid = (left + right)/2;
		if(x == a[mid]){
			return mid;
		} 
		if(right < left){
			return -1;
		}
		
		//If left is normally ordered
		if(a[left] < a[mid]) {
			if(x >= a[left] && x <= a[mid]){
				return search(a,left,mid-1,x);
				//search left
			} else {
				return search(a,mid+1,right,x); 
				//Search right
			}
		} else if(a[mid] < a[left]){ //Right is normally ordered
			if(x >= a[mid] && x <= a[right]){
				return search(a,mid+1,right,x); //search right
			} else {
				return search(a,left,mid-1,x); //Search left
			}
			//Left half is all repeats
		} else if(a[left] == a[mid]) {		//If right is diff, search it 
			if(a[mid] != a[right]){
				return search(a,mid+1,right,x);		//Search right
			} else {
				int result  = search(a,left,mid-1,x); //Search left
				if(result == -1){
					return search(a,mid+1,right,x); //Search right
				} else{
					return result;
				}
			}
			
		}
		
		return -1;
	}
}
