
public class findTheNonrepeatedNumber {
    public static int singleNumber(int[] A) {
        int x = 0;
	    for (int a : A) {
		    x = x ^ a;
	    }
	    return x;
        
    }

}
