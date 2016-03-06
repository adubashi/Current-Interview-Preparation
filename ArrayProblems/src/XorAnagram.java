
public class XorAnagram {

	public static void main(String[] args) {
		char[] s1 = {'t', 'c', 'a' };
		char[] s2 = {'c', 'a', 't' };
		
		System.out.println(isAnagram(s1,s2));
		

	}
	
	public static boolean isAnagram(char[] s1, char[] s2){
	    int xors1=1;
	    for(int i=0; i<s1.length; i++){
	      xors1 = xors1 ^ s1[i]; 
	    }
	    int xors2=1;
	    for(int i=0; i<s2.length; i++){
	      xors2 = xors2 ^ s2[i]; 
	    }
	    return (xors1 == 0) && (xors2 == 0);
	}

}
