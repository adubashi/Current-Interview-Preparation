package epic;

import java.util.Arrays;

public class permuteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] b = {'M','U','G'};
		char[] a = {'G','U','M'};
		
		permuteString(a,b);

	}
	
	
	public static void permuteString(char[] a, char[] b){
		int lengthOfb = b.length;
		
		int startOfb = 0;
		int startOfa = 0;
		
		
		System.out.println(Arrays.toString(a));
		while(lengthOfb > startOfb){
			 startOfa = startOfb;
			 //System.out.println(Arrays.toString(a));
			 
			 while(a[startOfa] != b[startOfb]){
				 startOfa++;
			 }
			 
			 while(startOfa > startOfb){
				 swap(startOfa, startOfa -1, a);
				 System.out.println(Arrays.toString(a));
				 startOfa--;
			 }
			 startOfb++;
		}
	}
	
	
	public static void swap(int i, int j, char[] a){
		char temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}

}
