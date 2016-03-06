
public class shortestDistanceBetweenTwoWords {
	
	//O(n) time
	public int shortest(String[] words, String word1, String word2){
		int min = Integer.MAX_VALUE;
		int lastPosWord1 = -1;
		int lastPosWord2 = -1;
		for(int i = 0; i < words.length; i++){
			String currentWord = words[i];
			if(currentWord.equals(word1)){
				lastPosWord1 = i;
				int distance = lastPosWord1 - lastPosWord2;
				if(lastPosWord2 >= 0 && min > distance){
					min = distance;
				} 
			} else if(currentWord.equals(word2)){
				lastPosWord2 = i;
				int distance = lastPosWord2 - lastPosWord1;
				if(lastPosWord1 >= 0 && min > distance){
					min = distance;
				}
			}
		}
		return min;
	}
}
