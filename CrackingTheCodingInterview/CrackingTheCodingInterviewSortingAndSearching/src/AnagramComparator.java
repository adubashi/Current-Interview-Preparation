import java.util.*;
public class AnagramComparator implements Comparator<String> {
	public String sortChars(String s){
		char[] s1 = s.toCharArray();
		Arrays.sort(s1);
		return new String(s1);
	}
	
	public int compare(String s1, String s2){
		return sortChars(s1).compareTo(sortChars(s2));
	}

}
