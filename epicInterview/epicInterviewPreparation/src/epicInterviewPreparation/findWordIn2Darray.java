package epicInterviewPreparation;

public class findWordIn2Darray {
	
	
	public static void main(String Args[]){
		
		char[][] matrix = {{'a','b','c'},{'d','e', 'f'}, {'g','h','i'}};

		
		boolean f =  findWord(matrix,"iea");
		
		System.out.println(f);
		
	}
	public static boolean findWord(char[][] matrix, String word) {
		char[] chars = word.toCharArray();

        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        if (word.length() > rowLen || word.length() > colLen) {
            return false;
        }

        int charPoint = 0;
        
        
        //Scan rows left to right
        for(int i = 0; i < rowLen; i++){
        	for(int j = 0; j < colLen; j++){
        		System.out.println(matrix[i][j]);
        		if(matrix[i][j] != chars[charPoint]){
        			charPoint = 0;
        			continue;
        		} else {
        			if(chars[charPoint] == chars[word.length()-1]){
        				return true;
        			}
        			charPoint++;
        		}
        	}
        }
        
        charPoint = 0;
        //Scan rows right to left;
        for(int i = rowLen-1; i >= 0; i--){
        	for(int j = colLen-1; j >= 0; j--){
        		System.out.println(matrix[i][j]);
        		if(matrix[i][j] != chars[charPoint]){
        			charPoint = 0;
        			continue;
        		} else {
        			if(chars[charPoint] == chars[word.length()-1]){
        				return true;
        			}
        			charPoint++;
        		}
        	}
        }
        
        charPoint = 0;
        
        //Scan columns bottom to top
        for(int j = 0; j < colLen; j++){
        	for(int i = 0; i < rowLen; i++){
        		System.out.println(matrix[i][j]);
        		if(matrix[i][j] != chars[charPoint]){
        			charPoint = 0;
        			continue;
        		} else {
        			if(chars[charPoint] == chars[word.length()-1]){
        				return true;
        			}
        			charPoint++;
        		}  		
        	} 	
        }
        
        
        charPoint = 0;
        
      //Scan columns top to bottom
        for(int j = colLen-1; j >= 0; j--){
        	for(int i = rowLen-1; i >= 0; i--){
        		System.out.println(matrix[i][j]);
        		if(matrix[i][j] != chars[charPoint]){
        			charPoint = 0;
        			continue;
        		} else {
        			if(chars[charPoint] == chars[word.length()-1]){
        				return true;
        			}
        			charPoint++;
        		}  		
        	} 	
        }
        
        
        
        charPoint = 0;
        //Scan Diagonal(Top left to bottom right)
        for(int i = 0; i  < rowLen; i++){
        	System.out.println(matrix[i][i]);
        		if(matrix[i][i] != chars[charPoint]){
        			charPoint = 0;
        			continue;
        		} else {
        			if(chars[charPoint] == chars[word.length()-1]){
        				return true;
        			}
        			charPoint++;
        		} 
        }
        
        charPoint = 0;
        //Scan Diagonal(Top Right to bottom left)
        for(int i = rowLen - 1; i >= 0; i--){
        	System.out.println(matrix[i][i]);
        		if(matrix[i][i] != chars[charPoint]){
        			charPoint = 0;
        			continue;
        		} else {
        			if(chars[charPoint] == chars[word.length()-1]){
        				return true;
        			}
        			charPoint++;
        		} 
        	
        }
        
       	
		return false;
	}

}
