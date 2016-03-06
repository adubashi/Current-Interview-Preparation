import java.util.Arrays;


public class rotate2DMatrix {
	////Given an image that is represented by a 2D matrix, rotate it by 90 degrees
	
	public static void main(String args[]){
		int[][] matrix = {{1,1,2,2},{1,1,2,2},{4,4,3,3},{4,4,3,3}};
		
		//System.out.println(Arrays.deepToString(matrix));
		print2D(matrix);
		rotate(matrix,4);
		System.out.println("ROTATED");
		print2D(matrix);
		//System.out.println(Arrays.deepToString(matrix));
		
	}
	
	public static void print2D(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
	
	//O(n*n)  time
	public static void rotate(int[][] matrix,int n){
		for(int layer = 0; layer < n/2; layer++){
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++){
				//save top
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last-offset][last];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = top;
				
			}
			
		}
	}
}