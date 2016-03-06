import java.util.Arrays;


public class setRowAndColumnEqualToZero {
	public static void main(String args[]){
		int[][] matrix = {{1,0,2,2},{1,1,2,2},{4,4,3,3},{4,4,3,0}};
		
		//System.out.println(Arrays.deepToString(matrix));
		print2D(matrix);
		
		System.out.println("Nullified");
		setZeros(matrix);
		print2D(matrix);
		//System.out.println(Arrays.deepToString(matrix));
		
	}
	
	//O(N*N)
	public static void setZeros(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix.length];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] == 0){
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for(int i = 0; i < row.length; i++){
			if(row[i]){
				nullifyRow(matrix,i);
			}
		}
		
		for(int i = 0; i < column.length; i++){
			if(column[i]){
				nullifyColumn(matrix,i);
			}
		}
		
	}
	
	
	
	public static void nullifyRow(int[][] matrix, int row){
		for(int i = 0; i < matrix.length; i++){
			matrix[row][i] = 0;
		}
	}
	public static void nullifyColumn(int[][] matrix, int col){
		for(int i = 0; i < matrix[0].length; i++){
			matrix[i][col] = 0;
		}
	}
	
	public static void print2D(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
	
	

}
