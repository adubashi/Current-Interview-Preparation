package epic;

import java.util.*;

public class transformAnagram {
	
	public static void main(String Args[]){
		
		char a[] = {'G','U','M'};
		char b[] = {'M','U','G'};
		
		int n = b.length;
		int i = 0;
		int j = 0;
		
		System.out.println(Arrays.toString(a));
		while(n > i){
			j = i;
			
			while(a[j] != b[i]){
				j++;
			}
			
			while(j > i){
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
