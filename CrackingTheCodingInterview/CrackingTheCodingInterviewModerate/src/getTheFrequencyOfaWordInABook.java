import java.util.*;
public class getTheFrequencyOfaWordInABook {
	
	public static Hashtable<String,Integer> setupDictionary(String[] book){
		Hashtable<String,Integer> table = new Hashtable<String,Integer>();
		
		for(int i = 0; i < book.length; i++){
			if(table.containsKey(book[i])){
				int freq = table.get(book[i]);
				table.put(book[i],freq + 1);
			} else {
				table.put(book[i],1);
			}
		}
		
		return table;
	}
	
	public static int getFrequency(Hashtable<String,Integer> table, String word){
		if(table == null || word == null){
			return -1;
		}
		word = word.toLowerCase();
		if(table.containsKey(word)){
		   return table.get(word);
		}
		return 0;
	}
	

}
