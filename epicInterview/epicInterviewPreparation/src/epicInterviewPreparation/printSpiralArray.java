package epicInterviewPreparation;

public class printSpiralArray {

	
	
	public static void main(String Args[]){
		char[][] matrix = { { 'i', 'l', 'o', 'v', 'e' },
				{ 'd', 'i', 'n', 't', 'e' }, { 'n', 'e', 'w', 'e', 'p' },
				{ 'a', 'i', 'v', 'r', 'i' }, { 'm', 'a', 'x', 'e', 'c' } };
		
		char[][] matrix1 = {{'1','2'},{'4','3'}};
		
		char[][] alpha = {{'A','B','C'},{'H','I','D'},{'G','F','E'}};
		
		spiral(alpha);
		
	}
	
	public static void spiral(char[][] matrix) {
        int line=0;
        int coordinate =0;
 
        
        int iterationlength = matrix.length;
        int iterationCount = 0;
        
        
        while( iterationCount < matrix.length/2 +1){
        	line = iterationCount;
        	coordinate = iterationCount;
        	//System.out.println( "["  + line + " " + coordinate + "]");
        	while(coordinate <  iterationlength){
        		System.out.print(matrix[line][coordinate]);
        		coordinate++;
        	}
        	coordinate--;
        	
        	//System.out.println( "["  + line + " " + coordinate + "]");
        	while(line < iterationlength- 1){
        		line++;
        		System.out.print(matrix[line][coordinate]);
        	}
        	//System.out.println( "["  + line + " " + coordinate + "]");
        	while(coordinate > iterationCount){
        		coordinate--;
        		System.out.print(matrix[line][coordinate]);
        	}
        	//System.out.println("[" + line + " " + coordinate + "]" );
        	
        	while(line > iterationCount + 1){
        		line--;
        		System.out.print(matrix[line][coordinate]);
        	}
        	//System.out.println( "["  + line + " " + coordinate + "]");
        		
        	
        	
        	iterationCount++;
        	iterationlength--;
        	/*
        	System.out.println();
        	System.out.println("coordinate:" + coordinate);
        	System.out.println("line: " + line);
        	*/
        	//break;
        	
        	
        }
        
    
    }

}
