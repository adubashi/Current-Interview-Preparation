import java.util.*;
public class groupAnagramsinAstring {
	
	
	public static void main(String args){
		
	}
	
	public static void sort(String[] array){
		Hashtable<String, LinkedList<String>> hash = new Hashtable<String, LinkedList<String>>();
		/* group words by anagram */
		for(String s : array){
			String key = sortChars(s);
			if(!hash.containsKey(key)){
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> anagrams = hash.get(key);
			anagrams.push(s);
			
		}
		
		/* convert hash table to array */
		int index = 0;
		for(String key: hash.keySet()){
			LinkedList<String> list = hash.get(key);
			for(String t : list){
				array[index] = t;
				index++;
			}
		}
		
	}
	
	public static String sortChars(String s){
		char[] s1 = s.toCharArray();
		Arrays.sort(s1);
		return new String(s1);
	}

}
