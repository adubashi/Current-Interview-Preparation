
public class checkIfstr1isInstr2 {
	public static void main(String args[]){
		String test1 = "STEVE";
		String test = "ABCSTEVE123";
		
		System.out.println(contains(test1,test,5,11));
		System.out.println(containsIter(test1,test,5,11));
	}
	
	//Recursive implementation
	//O(n) time
	//O(n) space
	public static boolean contains(String str1, String str2,int m,int n){
		if(m == 0){
			return true;
		}
		if(n == 0){
			return false;
		}
		if(str1.charAt(m-1) == str2.charAt(n-1)){
			return contains(str1,str2,m-1,n-1);
		}
		return contains(str1,str2,m,n-1);
	}
	
	//Iterative
	//O(n) time
	//O(1) space
	public static boolean containsIter(String str1, String str2,int m,int n){
		
		int j = 0;
		for(int i =0; i < n && j < m; i++){
			if(str1.charAt(j) == str2.charAt(i)){
				j++;
			}
		}
		return j == m;
		
	}
	

}
