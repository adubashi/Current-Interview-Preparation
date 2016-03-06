package epicInterviewPreparation;

import java.util.Arrays;

public class letterFlip {
	
	public static void main(String Args[]){
		char[] a = {'B','A','T'};
		char[] b = {'B','T','A'};
		
		transpose(a,b);
		
		
	}
	
	public static void transpose(char[] a, char[] b){
		int blength = b.length;
		int i = 0;
		int j = 0;
		
		System.out.println(Arrays.toString(a));
		while(blength > i){
			j = i;
			
			while(a[j] != b[i]){
				j++;
			}
			
			System.out.println(Arrays.toString(a));
			while( j > i){
				swap(j,j-1,a);
				System.out.println(Arrays.toString(a));
				j--;
			}		
			i++;
		}
	}
	
	public static void swap(int i, int j, char[] a){
		char temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}

}
