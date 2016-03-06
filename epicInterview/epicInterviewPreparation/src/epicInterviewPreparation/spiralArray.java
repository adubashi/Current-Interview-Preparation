package epicInterviewPreparation;

public class spiralArray {
	public static void main(String Args[]){
		char[][] matrix = { { 'i', 'l', 'o', 'v', 'e' },
				{ 'd', 'i', 'n', 't', 'e' }, { 'n', 'e', 'w', 'e', 'p' },
				{ 'a', 'i', 'v', 'r', 'i' }, { 'm', 'a', 'x', 'e', 'c' } };
		
		char[][] alpha = {{'A','B','C'},{'H','I','D'},{'G','F','E'}};
		
		spiral(matrix, 5);
		
	}
	
	public static void spiral(char[][] matrix, int N) {
		int iterator = 0;
		int startRowIndex = 0;
		int endRowIndex = N;
		int startColumnIndex = 0;
		int endColumnIndex = N;
		
		
		while(startRowIndex < endRowIndex && startColumnIndex < endColumnIndex){
			//0,0
			//First Row
			for(int i = startColumnIndex ; i < endColumnIndex; ++i ){
				System.out.println(matrix[startRowIndex][i]);
			}
			startRowIndex++;
			//0,4
			
			//Last Column
			for(int i = startRowIndex; i < endRowIndex; ++i){
				System.out.println(matrix[i][endColumnIndex-1]);
			}
			endColumnIndex--;
			//4,4
			if(startRowIndex < endRowIndex){
				for(int i = endColumnIndex-1; i >= startColumnIndex; --i ){
					System.out.println(matrix[endRowIndex-1][i]);
				}
			    endRowIndex--;
			}
			
			if(startColumnIndex < endColumnIndex){
				for(int i = endRowIndex-1; i >= startRowIndex; --i){
					System.out.println(matrix[endRowIndex-1][i]);
				}
				startColumnIndex++;
			}
			
			
		}
		
		
        
        
	}

}
