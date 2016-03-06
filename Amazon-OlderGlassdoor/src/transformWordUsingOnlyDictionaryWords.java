import java.util.*;
public class transformWordUsingOnlyDictionaryWords {
	
	//Get a set of words that are only edited by one character
	public static Set<String> getOneEditWords(String word){
		Set<String> words = new TreeSet<String>();
		
		for(int i = 0; i < word.length(); i++){
			char[] wordArray = word.toCharArray();
			for(char c = 'A'; c <= 'Z'; c++){
				if(c != word.charAt(i)){
					wordArray[i] = c;
					words.add(new String(wordArray));
				}
			}
		}
		return words;
	}
	
	
	//Transform function
	//Modification of BFS
	//Each word in the graph branches to all words in the dictionary that are one edit away.
	
	//Key point: Using a backtrack map. In this backtrack map, if B[w] = v, then you know that you edited v to get w.
	//Simply repeated use the map to get the path in the form of a linked list 
	public static LinkedList<String> transform(String startWord, String stopWord, Set<String> dictionary){
		startWord = startWord.toUpperCase();
		stopWord = stopWord.toUpperCase();
		
		Queue<String> actionQueue = new LinkedList<String>();
		Set<String> visitedSet = new HashSet<String>();
		
		Map<String,String> backtrackMap = new TreeMap<String,String>();
		
		actionQueue.add(startWord);
		visitedSet.add(startWord);
		
		while(!actionQueue.isEmpty()){
			String w = actionQueue.poll();
			for(String v : getOneEditWords(w)){
				//End condition
				if(v.equals(stopWord)){
					//Found the word --> Now backtrack
					LinkedList<String> list = new LinkedList<String>();
					//Append v to list
					list.add(v);
					while(w != null){
						list.add(0,w);
						w = backtrackMap.get(w);
					}
					return list;
				}
				
				if(dictionary.contains(v)){
					if(!visitedSet.contains(v)){
						actionQueue.add(v);
						visitedSet.add(v);
						backtrackMap.put(v,w);
					}
				}
			}
		}
		
		return null;
	}

}
