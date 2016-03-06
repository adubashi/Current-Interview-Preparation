import java.util.Arrays;
public class merge {
	
	public static void main(String Args[]){
		int a[] = {1,3,5,9,50,100,200,11111};
		int b[] = {-1,6};
		
		merge(a,b);
		
	}
	
	public static void merge(int a[], int b[]){
		int[] c = new int[a.length + b.length];
		int m = a.length;
		int n = b.length;
		
		while(m >0 && n > 0){
			if(a[m-1] > b[n-1]){
				c[m+n-1] = a[m-1];
				m--;
			} else {
				c[m + n -1] = b[n-1];
				n--;
			}
		}
		
		while( n > 0){
			c[m + n -1] = b[n-1];
			n--;
		}
		
		while( m > 0){
			c[m + n -1] = a[m-1];
			m--;
		}
		
		System.out.println(Arrays.toString(c));
	}

}
